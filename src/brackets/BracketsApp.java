package brackets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sun on 06.03.17.
 */
public class BracketsApp {

    public static String getString() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }


    public static void main(String[] args) throws IOException {
        String input;
        while (true) {
            System.out.println("Enter string contains delimiters: ");
            System.out.flush();
            input = getString(); //чтение строки с клавиатуры
            if (input.equals("")){  //завершение, если ентер
                break;
            }

            BracketChecker theChecker = new BracketChecker(input);
            theChecker.check(); //проверка парных скобок
        }
    }
}