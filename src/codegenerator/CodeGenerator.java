package codegenerator;

import ast.Type;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CodeGenerator {

    PrintWriter out;

    public CodeGenerator(String inputFilename, String outputFilename) {
        try {
            this.out = new PrintWriter(outputFilename);
        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
        }
    }

    public void push(int value) {
        out.println("pushi " + value);
        out.flush();
    }

    public void push(char value) {
        out.println("pushb " + value);
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

    public void conversion(Type type1, Type type2) {
        if (type1)
        out.println("i2b");
        out.flush();
    }

    public void label(String label) {
        out.println(label + ":");
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

}
