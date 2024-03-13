package ast.type;

import ast.RecordField;
import ast.Type;
import visitor.Visitor;

import java.util.List;

public class StructType extends AbstractType implements Type {
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
}
