import java.util.Arrays;
import java.util.Vector;

/**
 * Created by sun on 02.03.17.
 */
public class StackTrain implements iStackTrain {
    private Vagon[] masVagon;
    private int top;

    //контейнерный класс


    public StackTrain(int size) {
        masVagon = new Vagon[size];
        top = -1; //индекс, которого нет в массиве
    }

    //отображение верхнего вагона
    @Override
    public Vagon peek() {
        return masVagon[top]; //топ вагон
    }

    //заталкивать вагоны в поезд
    //нельзя пушить когда вагон полный
    @Override
    public void push(Vagon v) {
        if (!isFull())
            masVagon[++top] = v; //увеличиваем на 1 и получает доступ. при первом пуше будет 0 и пошли заполнять
    }

    //нельзя выталкивать когда, поезд пустой
    //выталкивать вагон из стека
    @Override
    public Vagon pop() {
        return !isEmpty() ? masVagon[top--] : null; //последним будет тот,что перед вытолкнутым
    }

    @Override
    public boolean isEmpty() {
        return top < 0;
    }

    @Override
    public boolean isFull() {
        return top == masVagon.length - 1;
    }


    //отображение внутренней структуры - публичные методы - делегирование
    //мощность, колич элем, что мы можем записать - сумарное количесвто
    @Override
    public int capacity() {
        return masVagon.length - 1;
    }

    //количество элементов
    @Override
    public int size() {
        return top + 1;
    }

    //заполнение поезда вагонами рандомно
    public void randFillTrain() {
        while (!this.isFull()) { // пока не полный
            this.push(new Vagon((int) (Math.random() * 2))); //Либо 1 либо 0
        }
    }

    @Override
    public String toString() {

        StringBuilder allStr = new StringBuilder("Train: ");  //записывает в конец строки для одного потока
        //StringBuffer - для нескольких потоков . блокируется от других потоков, пока туда не дозаписано
        for (Vagon item : masVagon) {
            if (item != null) allStr.append(item.toString() + " ");
        }
        return allStr.toString();


       // String allStr = "Train: ";
//        for (Vagon item : masVagon) {
//            if (item != null) allStr = allStr + item.toString() + ", ";
//        }
//        return allStr;


//        return "Train: " + Arrays.toString(masVagon) +
//                ", top=" + top;


    }
}
