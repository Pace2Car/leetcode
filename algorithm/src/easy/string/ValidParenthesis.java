package easy.string;

import java.util.Stack;

/**
 * 20. 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *     1.左括号必须用相同类型的右括号闭合。
 *     2.左括号必须以正确的顺序闭合。
 *
 * @author Pace2Car
 * @date 2019/8/23 17:53
 */
public class ValidParenthesis {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

//        String s = "([)]";
        String s = "()[]{}{{}}(-  -)";
//        String s = "{[]}";
//        String s = "]";
        System.out.println(isValid(s));

        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            switch (c) {
                case '(' :
                case '{' :
                case '[' :
                    stack.push(c);
                    break;
                case ')' :
                    if (stack.empty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case '}' :
                    if (stack.empty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ']' :
                    if (stack.empty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                default  :
                    break;
            }
        }
        return stack.empty();
    }
}
