import javax.script.*;

public class CodeInjection {
    public static void main(String[] args) {
        try {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("JavaScript");
            System.out.println(args[0]);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}