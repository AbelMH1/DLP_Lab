package ast.model.type;

import ast.model.RecordField;
import ast.model.Type;

import java.util.List;

public class Struct implements Type {
    private List<RecordField> fields;

    public Struct(List<RecordField> fields) {
        this.fields = fields;
    }

    public List<RecordField> getFields() {
        return fields;
    }

    public void setFields(List<RecordField> fields) {
        this.fields = fields;
    }
}