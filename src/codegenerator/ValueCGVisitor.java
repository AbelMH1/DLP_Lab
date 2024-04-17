package codegenerator;

public class ValueCGVisitor extends AbstractCGVisitor<Void, Void> {
    private CodeGenerator cg;
    private AddressCGVisitor address;

    public ValueCGVisitor(CodeGenerator codeGenerator) {
        this.cg = codeGenerator;
    }

    public void setAddress(AddressCGVisitor address) {
        this.address = address;
    }
}
