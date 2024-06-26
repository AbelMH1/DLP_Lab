package parser;

public class LexerHelper {

    public static int lexemeToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        return -1;
    }

    public static double lexemeToReal(String str) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        return -1;
    }

    public static char lexemeToChar(String str) {
        try {
            if (str.length() == 3) {
                return str.charAt(1);
            } else if (str.charAt(2) == 'n') {
                return '\n';
            } else if (str.charAt(2) == 't') {
                return '\t';
            } else {
                int ascii_code = Integer.parseInt(str.substring(2, str.length() - 1));
                return (char) ascii_code;
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        return (char) -1;
    }
}
