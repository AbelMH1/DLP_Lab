package semantic;

import ast.Definition;
import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.expression.Variable;
import ast.type.ErrorType;
import symboltable.SymbolTable;
import visitor.AbstractVisitor;
import visitor.Visitor;

public class IdentificationVisitor extends AbstractVisitor<Void, Void> {

    private SymbolTable st;
    public IdentificationVisitor() {
        st = new SymbolTable();
    }

    @Override
    public Void visit(FunctionDefinition e, Void param) {
        if (!st.insert(e)) {
            new ErrorType(e.getLine(), e.getColumn(), "Ya existe una definición con este nombre en el mismo ámbito (" + e.getName() + ")");
        }
        st.set();
        e.getType().accept(this, param);
        e.getBody().forEach(statement -> statement.accept(this, param));
        st.reset();
        return null;
    }

    @Override
    public Void visit(VariableDefinition e, Void param) {
        if (!st.insert(e)) {
            new ErrorType(e.getLine(), e.getColumn(), "Ya existe una definición con este nombre en el mismo ámbito (" + e.getName() + ")");
        }
        e.getType().accept(this, param);
        return null;
    }

    @Override
    public Void visit(Variable e, Void param) {


        Definition def = st.find(e.getName());
        if (def == null) {
            new ErrorType(e.getLine(), e.getColumn(), "La variable \"" + e.getName() + "\" no está definida");
        } else {
            e.setVarDef(def);
        }
        return null;
    }
}
