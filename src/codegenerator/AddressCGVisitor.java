package codegenerator;

public class AddressCGVisitor extends AbstractCGVisitor<Void, Void> {
    private CodeGenerator cg;
    private ValueCGVisitor value;

    public AddressCGVisitor(CodeGenerator codeGenerator) {
        this.cg = codeGenerator;
    }

    public void setValue(ValueCGVisitor value) {
        this.value = value;
    }
}
