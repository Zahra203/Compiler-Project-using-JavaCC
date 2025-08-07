import java.util.Map;

public class SemanticAnalyzer {
    private SymbolTable symbolTable;

    public SemanticAnalyzer(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public void analyzeAssignment(String variable, Object expressionValue, int lineNumber) throws Exception {
        if (!symbolTable.isDeclared(variable)) {
            throw new Exception("Error: Variable '" + variable + "' not declared. Line " + lineNumber);
        }

        SymbolTable.Type varType = symbolTable.getVariableType(variable);
        SymbolTable.Type exprType = determineExpressionType(expressionValue);

        if (varType != exprType) {
            throw new Exception("Error: Type mismatch in assignment to '" + variable + "'. Expected " 
                                + varType + " but got " + exprType + ". Line " + lineNumber);
        }
    }

    private SymbolTable.Type determineExpressionType(Object value) {
        if (value instanceof Integer) return SymbolTable.Type.INTEGER;
        if (value instanceof Float) return SymbolTable.Type.FLOAT;
        if (value instanceof String) return SymbolTable.Type.STRING;
        if (value instanceof Character) return SymbolTable.Type.CHAR;
        return null; // Handle undefined types
    }
}

