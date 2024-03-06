import ast.ASTNode;
import ast.definition.VariableDefinition;
import ast.type.ErrorType;
import errorhandler.ErrorHandler;
import parser.*;

import org.antlr.v4.runtime.*;

import ast.Program;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
	
	public static void main(String... args) throws Exception {
		   if (args.length<1) {
		        System.err.println("Please, pass me the input file.");
		        return;
		    }
		   		 			
		 // create a lexer that feeds off of input CharStream
		CharStream input = CharStreams.fromFileName(args[0]);
		PmmLexer lexer = new PmmLexer(input);

		// create a parser that feeds off the tokens buffer
		CommonTokenStream tokens = new CommonTokenStream(lexer); 
		PmmParser parser = new PmmParser(tokens);	
		Program ast = parser.program().ast;
		
		// * Check errors
		if(ErrorHandler.getInstance().anyError()){
			// * Show errors
			ErrorHandler.getInstance().showErrors(System.err);
		}
		else{
			// * The AST is shown
			IntrospectorModel model=new IntrospectorModel("Program", ast);
			new IntrospectorView("Introspector", model);
		}


		List<String> idents = new ArrayList<>();
		List<VariableDefinition> list = new ArrayList<>();
		HashSet<String> e = new HashSet<>();
//		for(String name : idents) {
//			if(e.contains(name)){
//				list.add(new VariableDefinition($OP.getLine(), $OP.getCharPositionInLine()+1, new ErrorType(), name));
//			}
//			else {
//				e.add(name);
//				list.add(new VariableDefinition($OP.getLine(), $OP.getCharPositionInLine()+1, $type.ast, name));
//			}
//		}
		List<VariableDefinition> recordFields = new ArrayList<>();
		List<VariableDefinition> recordFields = new ArrayList<>();
		for(VariableDefinition var : recordFields) {
			if(e.contains(var.getName())){
				list.add(new VariableDefinition($OP.getLine(), $OP.getCharPositionInLine()+1, new ErrorType($OP.getLine(), $OP.getCharPositionInLine()+1, "No se pueden definir dos variables con el mismo nombre en el mismo ámbito"), name));
				new StructType($recordFields.stream().map(varDef -> new RecordField(varDef.getLine(), varDef.getColumn(), varDef.getName(),varDef.getType())).toList()); }
			}
			else {
				e.add(var.getName());
				list.add(new VariableDefinition($OP.getLine(), $OP.getCharPositionInLine()+1, $type.ast, name));
			}
		}
	}
}
