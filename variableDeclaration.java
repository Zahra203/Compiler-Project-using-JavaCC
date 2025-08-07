void variableDeclaration() :
{
    Token id;
    Object value;
}
{
    id = <IDENTIFIER>
    <ASSIGN>
    ( value = <INTEGER> {
        symbolTable.addVariable(id.image, SymbolTable.Type.INTEGER, Integer.parseInt(value.image));
        appendToParseTree("variableDeclaration -> IDENTIFIER (" + id.image + ") ASSIGN (=) INTEGER (" + value.image + ")");
    }
    | value = <FLOAT> {
        symbolTable.addVariable(id.image, SymbolTable.Type.FLOAT, Float.parseFloat(value.image));
        appendToParseTree("variableDeclaration -> IDENTIFIER (" + id.image + ") ASSIGN (=) FLOAT (" + value.image + ")");
    }
    | value = <STRING> {
        symbolTable.addVariable(id.image, SymbolTable.Type.STRING, value.image);
        appendToParseTree("variableDeclaration -> IDENTIFIER (" + id.image + ") ASSIGN (=) STRING (" + value.image + ")");
    }
    | value = <CHAR> {
        symbolTable.addVariable(id.image, SymbolTable.Type.CHAR, value.image.charAt(1)); // Assuming single quotes for char
        appendToParseTree("variableDeclaration -> IDENTIFIER (" + id.image + ") ASSIGN (=) CHAR (" + value.image + ")");
    }
    )
    <SEMICOLON>
}
