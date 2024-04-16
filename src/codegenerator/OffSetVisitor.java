package codegenerator;

import ast.RecordField;
import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.type.FunctionType;
import ast.type.StructType;
import visitor.AbstractVisitor;

public class OffSetVisitor extends AbstractVisitor<Void, Void> {

    private int totalGlobalOffset = 0;
    private int totalLocalOffset = 0;

    @Override
    public Void visit(FunctionDefinition e, Void param) {
        e.getType().accept(this, param);
        totalLocalOffset = 0;
        e.getBody().forEach(statement -> statement.accept(this, param));
        return null;
    }

    @Override
    public Void visit(FunctionType e, Void param) {
        e.getReturnType().accept(this, param);
        int totalOffset = 4;
        for (int i = e.getParams().size()-1; i >= 0; i--) {
            VariableDefinition varDef = e.getParams().get(i);
            varDef.setOffset(totalOffset);
            totalOffset += varDef.getType().numberOfBytes();
        }
        return null;
    }

    @Override
    public Void visit(VariableDefinition e, Void param) {
        e.getType().accept(this, param);
        if (e.getScope() == 0) {
            e.setOffset(totalGlobalOffset);
            totalGlobalOffset += e.getType().numberOfBytes();
        } else {
            totalLocalOffset += e.getType().numberOfBytes();
            e.setOffset(-totalLocalOffset);
        }
        return null;
    }

    @Override
    public Void visit(StructType e, Void param) {
        int totalOffset = 0;
        for (RecordField field : e.getFields()) {
            field.accept(this, param);
            field.setOffset(totalOffset);
            totalOffset += field.getType().numberOfBytes();
        }
        return null;
    }

}