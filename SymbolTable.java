import java.util.HashMap;

public class SymbolTable {
    public enum Type {
        INTEGER, FLOAT, STRING, CHAR // Added FLOAT and CHAR
    }

    private static class Variable {
        Type type;
        Object value;

        Variable(Type type, Object value) {
            this.type = type;
            this.value = value;
        }
    }

    private final HashMap<String, Variable> table = new HashMap<>();

    public void addVariable(String name, Type type, Object value) {
        if (table.containsKey(name)) {
            throw new RuntimeException("Variable '" + name + "' is already declared.");
        }
        table.put(name, new Variable(type, value));
    }

    public boolean isDeclared(String name) {
        return table.containsKey(name);
    }

    public Object getVariable(String name) {
        if (!table.containsKey(name)) {
            throw new RuntimeException("Variable '" + name + "' is not declared.");
        }
        return table.get(name).value;
    }

    public void updateVariable(String name, Object value) {
        if (!table.containsKey(name)) {
            throw new RuntimeException("Variable '" + name + "' is not declared.");
        }
        Variable variable = table.get(name);
        if (value instanceof Integer && variable.type == Type.INTEGER) {
            variable.value = value;
        } else if (value instanceof Float && variable.type == Type.FLOAT) {
            variable.value = value;
        } else if (value instanceof String && variable.type == Type.STRING) {
            variable.value = value;
        } else if (value instanceof Character && variable.type == Type.CHAR) {
            variable.value = value;
        } else {
            throw new RuntimeException("Type mismatch: Cannot assign value of type " +
                    value.getClass().getSimpleName() + " to variable of type " + variable.type);
        }
    }
}
