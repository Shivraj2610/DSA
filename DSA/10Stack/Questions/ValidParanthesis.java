import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {

    public static boolean checkParenthises(String str) {
        char[] arr = str.toCharArray();

        Stack<Character> st = new Stack<>();

        for (char para : arr) {
            if (para == '(' || para == '{' || para == '[') {
                st.push(para);
                continue;
            } else if (st.isEmpty()) {
                return false;
            }

            char top = st.pop();
            if (top == '(' && para != ')')
                return false;
            else if (top == '{' && para != '}')
                return false;
            else if (top == '[' && para != ']')
                return false;
        }

        return (st.empty() == true);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Valid Parenthises");
        String str = sc.nextLine();

        if (checkParenthises(str))
            System.out.println("This is valid....!");
        else
            System.out.println("This is not valid..");

    }
}
