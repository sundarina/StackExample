import java.util.Stack;

/**
 * Created by sun on 02.03.17.
 */
public class MyStack extends Stack<Vagon> {
    public void randFillTrain() {
        for (int i = 0; i < 10; i++) {
            push(new Vagon((int) (Math.random() * 2)));
        }
    }
}
