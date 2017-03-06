import java.util.Stack;

/**
 * Created by sun on 02.03.17.
 */
public class MainRailWay {
    public static void manualStack() {
        StackTrain fullTrain = new StackTrain(10);
        fullTrain.randFillTrain();
        StackTrain passTrain = new StackTrain(10);
        StackTrain cargoTrain = new StackTrain(10);
        System.out.println(fullTrain);
        while (!fullTrain.isEmpty()) {
            //если верхний вагон имеет id=0
            if (fullTrain.peek().getId() == 0) {
                passTrain.push(fullTrain.pop()); //вытянули и запушили в пассажирский
            } else cargoTrain.push(fullTrain.pop()); //если 1 - то запихиваем в грузовой
        }
        System.out.println(passTrain);
        System.out.println(cargoTrain);
    }

    public static void classicStack() {
        Stack<Vagon> fullTrain = new Stack<>();

        // int size = 10;
//        while (fullTrain.size() > 0) { // пока не полный
//            fullTrain.push(new Vagon((int) (Math.random() * 2))); //Либо 1 либо 0
//        }
        for (int i = 0; i < 10; i++) {
            fullTrain.push(new Vagon((int) (Math.random() * 2)));
        }
        System.out.println(fullTrain);
        Stack<Vagon> passTrain = new Stack<>();
        Stack<Vagon> cargoTrain = new Stack<>();
        while (!fullTrain.isEmpty()) {
            //если верхний вагон имеет id=0
            if (fullTrain.peek().getId() == 0) {
                passTrain.push(fullTrain.pop()); //вытянули и запушили в пассажирский
            } else cargoTrain.push(fullTrain.pop()); //если 1 - то запихиваем в грузовой
        }

        System.out.println(passTrain);
        System.out.println(cargoTrain);
    }

    public static void main(String[] arg) {
       // MyStack fullTrain = new MyStack();
        Stack<Vagon> fullTrain = new MyStack();
        ((MyStack)fullTrain).randFillTrain();
        System.out.println(fullTrain);
        Stack<Vagon> passTrain = new MyStack();
        Stack<Vagon> cargoTrain = new MyStack();
        while (!fullTrain.isEmpty()) {
            //если верхний вагон имеет id=0
            if (fullTrain.peek().getId() == 0) {
                passTrain.push(fullTrain.pop()); //вытянули и запушили в пассажирский
            } else cargoTrain.push(fullTrain.pop()); //если 1 - то запихиваем в грузовой
        }

        System.out.println(passTrain);
        System.out.println(cargoTrain);
    }
}
