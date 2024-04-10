package ast.type;

import ast.ASTNode;
import ast.RecordField;
import ast.Type;
import visitor.Visitor;

import java.util.List;

public class StructType extends AbstractType {
    private List<RecordField> fields;

    public StructType(List<RecordField> fields) {
        super(0, 0);
        this.fields = fields;
    }

    public List<RecordField> getFields() {
        return fields;
    }

    public void setFields(List<RecordField> fields) {
        this.fields = fields;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public Type dot(String field, ASTNode ast) {
        var rf = fields.stream()
                .filter(recordField -> recordField.getName().equals(field))
                .findFirst();
        if (rf.isPresent()) return rf.get().getType();
        return new ErrorType(ast.getLine(), ast.getColumn(), "El campo \"" + field + "\" no se encuentra definido en el struct");
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("StructType{");
        fields.forEach(recordField -> str.append(recordField.toString()).append(", "));
        str.replace(str.length()-2, str.length(), "}");
        return str.toString();
    }
}
