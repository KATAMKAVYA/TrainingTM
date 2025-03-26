//Evaluate a Mathematical Expression
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class EvaluateExpression {
    public static void main(String[] args) throws ScriptException {
        String expression = "100 * (2 + 12) / 14";
        
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
        System.out.println("Result: " + engine.eval(expression));
    }
}