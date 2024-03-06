package errorhandler;

import ast.type.ErrorType;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ErrorHandler {
    private static ErrorHandler instance;
    private List<ErrorType> errors;
    private ErrorHandler() {
        errors = new ArrayList<>();
    }

    public static ErrorHandler getInstance() {
        if (instance == null) {
            instance = new ErrorHandler();
        }
        return instance;
    }

    public void addError(ErrorType err) {
        errors.add(err);
    }

    public boolean anyError() {
        return !errors.isEmpty();
    }

    public void showErrors(PrintStream stream) {
        errors.forEach(errorType -> stream.println(errorType.toString()));
    }
}
