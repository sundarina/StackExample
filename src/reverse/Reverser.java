package reverse;

/**
 * Created by sun on 06.03.17.
 */
public class Reverser {
    private String input; //входная строка
    private String output; //выходная строка

    public Reverser(String in) {
        this.input = in;
    }

    public String doRev() { //Перестановка символов
        int stackSize = input.length(); //определение размера стэка
        StackX theStack = new StackX(stackSize);  //создание стэка

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i); //чтение символа из выходного потока
            theStack.push(ch); //занесение в стэк
            output = "";
        }


        while (!theStack.isEmpty()){
            char ch = theStack.pop(); //извлеченине исмвола из cтэка
            output = output+ch; //присоединение к выходной строке
        }
        return output;
    }
}
