/**
 * Created by bal_SDkaplan on 2/3/2016.
 */
public class FormulaCell extends Cell{
    private String contents;

    /*
     * Creates a new cell and sets it contents to something
     */
    public FormulaCell(String contents) {
        super(contents);
        this.contents = contents;
    }

    /*
     * Overrides the toString() method, returns contents as a string
     */
    public String toString() {
        return ("" + contents);
    }
}
