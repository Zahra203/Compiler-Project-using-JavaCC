import java.util.ArrayList;
import java.util.List;

public class CodeGenerator {
    private List<String[]> instructions = new ArrayList<>();
    private int tempCounter = 0;

    public String generateTemp() {
        return "t" + (tempCounter++);
    }

    public void generateQuadruple(String op, String arg1, String arg2, String result) {
        instructions.add(new String[] { op, arg1, arg2, result });
    }

    public void printInstructions() {
        System.out.println("Three-Address Code:");
        for (String[] instr : instructions) {
            System.out.println(String.join(" ", instr));
        }
    }
}
