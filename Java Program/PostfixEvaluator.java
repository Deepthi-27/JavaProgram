import java.util.Stack;

public class PostfixEvaluator {
	public static int evaluatePostfix(String expression) {
		Stack < Integer > stack = new Stack <> ();
		for(int i=0; i<expression.length(); i++){
			char ch = expression.charAt(i);
			if(Character.isDigit (ch) ) {
				stack.push(ch-'0');
			} else if(isOperator(ch)) {
				int operand2 = stack.pop();
				int operand1 = stack.pop();
				int result = performOperation(operand1,operand2,ch);
				stack.push(result);
			}
		}
		return stack.pop();
	}	
	public static Boolean isOperator(char ch) {
		return ch == '+' || ch == '-' || ch == '*' || ch == '/';
	}
	public static int performOperation(int operand1,int operand2,char Operator) {
		switch (Operator) {
			case '+': return operand1 + operand2;
			case '-': return operand1 - operand2;
			case '*': return operand1 * operand2;
			case '/': return operand1 / operand2;
			default: throw new IllegalArgumentException("Invalid operator");
		}
	}
	public static void main(String[] args) {
		String expression = " 23 * 5+ ";
		System.out.println("Postfix Expression:" + expression);
		int result = evaluatePostfix (expression);
		System.out.println("Evaluation Result: " + result);
	}
}