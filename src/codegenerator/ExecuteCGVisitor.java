package codegenerator;

public class ExecuteCGVisitor extends AbstractCGVisitor<Void, Void> {

    private CodeGenerator cg;
    private AddressCGVisitor address;
    private ValueCGVisitor value;

    public ExecuteCGVisitor(CodeGenerator codeGenerator) {
        this.cg = codeGenerator;
        this.address = new AddressCGVisitor(codeGenerator);
        this.value = new ValueCGVisitor(codeGenerator);
        this.address.setValue(value);
        this.value.setAddress(address);
    }


}
