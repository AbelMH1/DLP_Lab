// Generated from C:/Users/Abel/OneDrive/Documents/UniOvi/Asignaturas/Cuarto/Cuatrimestre 2/DLP/Laboratorio/DLP_Lab/src/parser/Pmm.g4 by ANTLR 4.13.1
package parser;

    import ast.*;
    import ast.definition.*;
    import ast.expression.*;
    import ast.statement.*;
    import ast.type.*;
    import java.util.HashSet;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PmmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PmmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PmmParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PmmParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(PmmParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(PmmParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#varDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefinition(PmmParser.VarDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#idents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdents(PmmParser.IdentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#funcDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDefinition(PmmParser.FuncDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#paramDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamDefinition(PmmParser.ParamDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PmmParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(PmmParser.SimpleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PmmParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(PmmParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PmmParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(PmmParser.ParamsContext ctx);
}