/**
 * Created by sun on 02.03.17.
 */
public class Vagon {
    private int id;

    public Vagon(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        //return "Vagon{" + "id=" + id + '}';
        return id == 0 ? "Pass" : "Cargo";
    }
}
