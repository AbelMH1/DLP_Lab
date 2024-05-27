package codegenerator;

import ast.Type;
import ast.type.IntType;

import java.io.IOException;
import java.io.PrintWriter;

public class CodeGenerator {

    private PrintWriter out;
    private int labelCounter;

    public CodeGenerator(String outputFilename, String inputFilename) {
        try {
            this.out = new PrintWriter(outputFilename);
            this.labelCounter = -1;
        } catch (IOException e) {
            System.err.println("Error oppening the file " + outputFilename + ".");
            System.exit(-1);
        }
        this.source(inputFilename);
    }

    private void source(String inputFilename) {
        out.println("\n#source\t\"" + inputFilename + "\"\n");
        out.flush();
    }

    private void indentLine(int indent) {
        out.print("\t".repeat(indent));
    }

    public void line(int line) {
        out.println("\n#line\t" + line);
        out.flush();
    }

    public String getNextLabel(){
        this.labelCounter++;
        return "label" + this.labelCounter;
    }

    public void commentOL(String comment, int indent) {
        indentLine(indent);
        out.println("' " + comment);
        out.flush();
    }

    public void push(int value) {
        indentLine(1);
        out.println("pushi\t" + value);
        out.flush();
    }

    public void push(char value) {
        indentLine(1);
        out.println("pushb\t" + (int)value);
        out.flush();
    }

    public void push(double value) {
        indentLine(1);
        out.println("pushf\t" + value);
        out.flush();
    }

    public void pusha(int address) {
        indentLine(1);
        out.println("pusha\t"  + address);
        out.flush();
    }

    public void push() {
        indentLine(1);
        out.println("push\tbp");
        out.flush();
    }

    public void load(Type type) {
        indentLine(1);
        out.println("load" + type.suffix());
        out.flush();
    }

    public void store(Type type) {
        indentLine(1);
        out.println("store" + type.suffix());
        out.flush();
    }

    public void pop(Type type) {
        indentLine(1);
        out.println("pop" + type.suffix());
        out.flush();
    }

    public void dup(Type type) {
        indentLine(1);
        out.println("dup" + type.suffix());
        out.flush();
    }

    public void add(Type type) {
        indentLine(1);
        out.println("add" + type.suffix());
        out.flush();
    }

    public void sub(Type type) {
        indentLine(1);
        out.println("sub" + type.suffix());
        out.flush();
    }

    public void mul(Type type) {
        indentLine(1);
        out.println("mul" + type.suffix());
        out.flush();
    }

    public void div(Type type) {
        indentLine(1);
        out.println("div" + type.suffix());
        out.flush();
    }

    public void mod(Type type) {
        indentLine(1);
        out.println("mod" + type.suffix());
        out.flush();
    }

    public void gt(Type type) {
        indentLine(1);
        out.println("gt" + type.suffix());
        out.flush();
    }

    public void lt(Type type) {
        indentLine(1);
        out.println("lt" + type.suffix());
        out.flush();
    }

    public void ge(Type type) {
        indentLine(1);
        out.println("ge" + type.suffix());
        out.flush();
    }

    public void le(Type type) {
        indentLine(1);
        out.println("le" + type.suffix());
        out.flush();
    }

    public void eq(Type type) {
        indentLine(1);
        out.println("eq" + type.suffix());
        out.flush();
    }

    public void ne(Type type) {
        indentLine(1);
        out.println("ne" + type.suffix());
        out.flush();
    }

    public void and() {
        indentLine(1);
        out.println("and");
        out.flush();
    }

    public void or() {
        indentLine(1);
        out.println("or");
        out.flush();
    }

    public void not() {
        indentLine(1);
        out.println("not");
        out.flush();
    }

    public void out(Type type) {
        indentLine(1);
        out.println("out" + type.suffix());
        out.flush();
    }

    public void in(Type type) {
        indentLine(1);
        out.println("in" + type.suffix());
        out.flush();
    }

    public void convert(Type type1, Type type2) {
        if (type1.canPromoteTo(type2) || (type1.suffix() == type2.suffix())) return;
        indentLine(1);
        if (type1 instanceof IntType || type2 instanceof IntType) {
            out.println(type1.suffix() + "2" + type2.suffix());
        } else {
            out.println(type1.suffix() + "2i");
            indentLine(1);
            out.println("i2" + type2.suffix());
        }
        out.flush();
    }

    public void label(String id) {
        out.println(" " + id + ":");
        out.flush();
    }

    public void jmp(String label) {
        indentLine(1);
        out.println("jmp\t" + label);
        out.flush();
    }

    public void jz(String label) {
        indentLine(1);
        out.println("jz\t" + label);
        out.flush();
    }

    public void jnz(String label) {
        indentLine(1);
        out.println("jnz\t" + label);
        out.flush();
    }

    public void call(String id, int indent) {
        indentLine(indent);
        out.println("call\t" + id);
        out.flush();
    }

    public void enter(int int_constant) {
        indentLine(1);
        out.println("enter\t" + int_constant);
        out.flush();
    }

    public void ret(int bytesToReturn, int bytesLocalVariables, int bytesArguments) {
        indentLine(1);
        out.println("ret\t" + bytesToReturn + ", " + bytesLocalVariables + ", " + bytesArguments);
        out.flush();
    }

    public void halt() {
        out.println("halt\n");
        out.flush();
    }

    public void arithmetic(String operator, Type type) {
        switch (operator) {
            case "+" -> add(type);
            case "-" -> sub(type);
            case "*" -> mul(type);
            case "/" -> div(type);
            case "%" -> mod(type);
        }
    }

    public void comparison(String operator, Type type) {
        switch (operator) {
            case ">" -> gt(type);
            case ">=" -> ge(type);
            case "<" -> lt(type);
            case "<=" -> le(type);
            case "!=" -> ne(type);
            case "==" -> eq(type);
        }
    }

    public void logical(String operator) {
        switch (operator) {
            case "&&" -> and();
            case "||" -> or();
        }
    }

}
