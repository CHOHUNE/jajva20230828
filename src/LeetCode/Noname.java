package LeetCode;

import java.util.Stack;

public class Noname {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stackS.isEmpty()) {
                if (c == '#') {
                    stackS.pop();
                } else {
                    stackS.push(c);
                }
            }

            for (char z : t.toCharArray()) {
                if (!stackS.isEmpty()) {
                    if (z == '#') {
                        stackT.pop();
                    }
                } else {
                    stackT.push(z);
                }
            }

            }
        return stackS.equals(stackT);
    }
}