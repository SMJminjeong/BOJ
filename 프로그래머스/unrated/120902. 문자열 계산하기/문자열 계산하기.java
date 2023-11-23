import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        String expression = my_string;

        try {
            Object result = engine.eval(expression);
            if (result instanceof Integer) {
                answer = (Integer) result;
            } else if (result instanceof Double) {
                answer = ((Double) result).intValue();
            }
        } catch (ScriptException e) {
            e.printStackTrace();
        }

        return answer;
    }
}