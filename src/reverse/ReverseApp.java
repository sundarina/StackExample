package reverse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamCorruptedException;

/**
 * Created by sun on 06.03.17.
 */
public class ReverseApp {

    public static String getString() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static void main(String[] args) throws IOException{
        String input, output;
        while (true){
            System.out.println("Enter a string: ");
            System.out.flush();
            input = getString(); //чтение строки с клавиатуры
            if(input.equals("")) {
                break;
            }

            Reverser theReverser = new Reverser(input);
            output = theReverser.doRev(); //использование
            System.out.println("Reversed: " + output);
        }
    }
}
