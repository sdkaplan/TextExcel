/**
 * Created by bal_Sdkaplan on 1/27/2016.
 */
public class DoubleCell extends Cell {
    private double contents;

    /*
     * Creates a new cell and sets it contents to something
     */
    public DoubleCell(String contents) {
        super(contents);
        this.contents = Double.parseDouble(contents);
    }

    /*
     * Overrides the toString() method, returns contents as a string
     */
    public String toString() {
        return ("" + contents);
    }
}
