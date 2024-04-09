package ast.type;

import ast.RecordField;
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
    public String toString() {
        StringBuilder str = new StringBuilder("StructType{");
        fields.forEach(recordField -> str.append(recordField.toString()).append(", "));
        str.replace(str.length()-2, str.length(), "}");
        return str.toString();
    }
}
