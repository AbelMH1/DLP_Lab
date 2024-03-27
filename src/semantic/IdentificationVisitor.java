package semantic;

import ast.Definition;
import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.expression.Variable;
import ast.type.ErrorType;
import symboltable.SymbolTable;
import visitor.AbstractVisitor;

public class IdentificationVisitor extends AbstractVisitor<Void, Void> {

    private final SymbolTable st;

    public IdentificationVisitor() {
        st = new SymbolTable();
    }

    @Override
    public Void visit(FunctionDefinition e, Void param) {
        if (!st.insert(e)) {
            new ErrorType(e.getLine(), e.getColumn(), "\"" + e.getName() + "\" ya ha sido definido en el mismo ámbito");
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
            new ErrorType(e.getLine(), e.getColumn(), "\"" + e.getName() + "\" ya ha sido definido en el mismo ámbito");
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
