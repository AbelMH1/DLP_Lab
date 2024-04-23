package codegenerator;

import ast.Type;
import ast.type.IntType;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CodeGenerator {

    PrintWriter out;
    int labelCounter;

    public CodeGenerator(String outputFilename, String inputFilename) {
        try {
            this.out = new PrintWriter(outputFilename);
            this.labelCounter = 0;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public String getNextLabel(){
        this.labelCounter++;
        return "label" + this.labelCounter;
    }

    public void commentOL(String comment) {
        out.println("' " + comment);
        out.flush();
    }

    public void push(int value) {
        out.println("pushi " + value);
        out.flush();
    }

    public void push(char value) {
        out.println("pushb " + (int)value);
        out.flush();
    }

    public void push(double value) {
        out.println("pushf " + value);
        out.flush();
    }

    public void pusha(int address) {
        out.println("pusha"  + address);
        out.flush();
    }

    public void pusha() {
        out.println("pusha bp");
        out.flush();
    }

    public void load(Type type) {
        out.println("load" + type.suffix());
        out.flush();
    }

    public void store(Type type) {
        out.println("store" + type.suffix());
        out.flush();
    }

    public void pop(Type type) {
        out.println("pop" + type.suffix());
        out.flush();
    }

    public void dup(Type type) {
        out.println("dup" + type.suffix());
        out.flush();
    }

    public void add(Type type) {
        out.println("add" + type.suffix());
        out.flush();
    }

    public void sub(Type type) {
        out.println("sub" + type.suffix());
        out.flush();
    }

    public void mul(Type type) {
        out.println("mul" + type.suffix());
        out.flush();
    }

    public void div(Type type) {
        out.println("div" + type.suffix());
        out.flush();
    }

    public void mod(Type type) {
        out.println("mod" + type.suffix());
        out.flush();
    }

    public void gt(Type type) {
        out.println("gt" + type.suffix());
        out.flush();
    }

    public void lt(Type type) {
        out.println("lt" + type.suffix());
        out.flush();
    }

    public void ge(Type type) {
        out.println("ge" + type.suffix());
        out.flush();
    }

    public void le(Type type) {
        out.println("le" + type.suffix());
        out.flush();
    }

    public void eq(Type type) {
        out.println("eq" + type.suffix());
        out.flush();
    }

    public void ne(Type type) {
        out.println("ne" + type.suffix());
        out.flush();
    }

    public void and() {
        out.println("and");
        out.flush();
    }

    public void or() {
        out.println("or");
        out.flush();
    }

    public void not() {
        out.println("not");
        out.flush();
    }

    public void out(Type type) {
        out.println("out" + type.suffix());
        out.flush();
    }

    public void in(Type type) {
        out.println("in" + type.suffix());
        out.flush();
    }

    public void convert(Type type1, Type type2) {
        if (type1.canPromoteTo(type2)) return;
        if (type1 instanceof IntType || type2 instanceof IntType) {
            out.println(type1.suffix() + "2" + type2.suffix());
        } else {
            out.println(type1.suffix() + "2i");
            out.println("i2" + type2.suffix());
        }
        out.flush();
    }

    public void label(String id) {
        out.println(id + ":");
        out.flush();
    }

    public void jmp(String label) {
        out.println("jmp " + label);
        out.flush();
    }

    public void jz(String label) {
        out.println("jz " + label);
        out.flush();
    }

    public void jnz(String label) {
        out.println("jnz " + label);
        out.flush();
    }

    public void call(String id) {
        out.println("call " + id);
        out.flush();
    }

    public void enter(int int_constant) {
        out.println("enter " + int_constant);
        out.flush();
    }

    public void ret(int bytesToReturn, int bytesLocalVariables, int bytesArguments) {
        out.println("ret " + bytesToReturn + ", " + bytesLocalVariables + ", " + bytesArguments);
        out.flush();
    }

    public void halt() {
        out.println("halt");
        out.flush();
    }

    public void arithmetic(String operator, Type type) {
        switch (operator) {
            case "+": add(type); break;
            case "-": sub(type); break;
            case "*": div(type); break;
            case "/": mul(type); break;
            case "%": mod(type); break;
        }
    }

    public void comparison(String operator, Type type) {
        switch (operator) {
            case ">": gt(type); break;
            case ">=": ge(type); break;
            case "<": lt(type); break;
            case "<=": le(type); break;
            case "!=": ne(type); break;
            case "==": eq(type); break;
        }
    }

    public void logical(String operator) {
        switch (operator) {
            case "&&": and(); break;
            case "||": or(); break;
        }
    }

}
