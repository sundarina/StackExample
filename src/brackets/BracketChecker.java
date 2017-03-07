package brackets;

import reverse.*;

import java.io.BufferedReader;

/**
 * Created by sun on 06.03.17.
 */
public class BracketChecker {
    private String input;

    public BracketChecker(String in) {
        this.input = in;
    }

    public void check() {
        int stackSize = input.length();

        StackX theStack = new StackX(stackSize);

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            switch (ch) {
                case '{':  //открівающие скобки
                case '[':
                case '(':
                    theStack.push(ch); //занести в стэк
                    break;
                case '}':
                case ']':
                case ')':
                    if (!theStack.isEmpty()) {
                        char chx = theStack.pop();
                        if ((ch == '}' && chx != '{') || (ch == ']' && chx != '[') || (ch == ')' && chx != '('))
                            System.out.println("Error: " + ch + " at " + i);
                    } else {//преждевременна проверка
                        System.out.println("Error: " + ch + " at " + i);
                        break;
                    }
                default:  //для других символов действия не выполняются
                    break;
            }
        }

        //в этой точке обработаны все символы
        if(!theStack.isEmpty()){
            System.out.println("Error: missing right delimiter");
        }
    }
}
