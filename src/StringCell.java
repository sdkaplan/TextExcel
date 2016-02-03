/**
 * Created by bal_Sdkaplan on 1/27/2016.
 */
public class StringCell extends Cell {
    private String contents;

    /*
     * Creates a new cell and sets it contents to something
     */
    public StringCell(String contents){
        super(contents);
        this.contents = contents;
    }

    /*
     * Overrides the toString() method, returns contents as a string with quotation marks around it
     */
    public String toString() {
        return ("\"" + contents +  "\"");
    }
}
