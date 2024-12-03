package part_1;

import java.util.*;

public class ValidParenthesis{
    public static void main(String[] args){
        String str = "(()){}{";
        System.out.println(validParenthesis(str));
    }

    public static boolean validParenthesis(String s){
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(st.size() == 0){
                st.push(s.charAt(i));
                continue;
            }

            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            } else {
                if(s.charAt(i) == ')'){
                    if(st.peek() == '('){
                        st.pop();
                    } else {
                        return false;
                    }
                } else if(s.charAt(i) == '}'){
                    if(st.peek() == '{'){
                        st.pop();
                    } else {
                        return false;
                    }
                } else {
                    if(s.charAt(i) == ']'){
                        if(st.peek() == '['){
                            st.pop();
                        } else {
                            return false;
                        }
                    }
                }
            }

        }

        if(st.size() == 0){
            return true;
        } else {
            return false;
        }
    }
}
