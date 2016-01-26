/**
 * Created by bal_Sdkaplan on 1/21/2016.
 */
public class Cell {
    private String contents;

    /*
     * Creates a new cell and sets its contents to empty
     */
    public Cell() {
        contents = "empty";
    }

    /*
    * Prepares the stored values for spreadsheet printing.
    * if cell is empty will return spaces
    * adds or removes the correct number of spaces so that the cell is 12 characters wide
    * @return: the 12 character string for printing the spreadsheet
    */
    public String toStringinSpreadsheet() {
        String returnValue = this.contents;
        if (contents.equals("empty")){
            returnValue = "            ";
        }
        return returnValue;
    }
    /*
     * Converts the cell to a string.
     * @return: the contents of the cell
     */
    public String toString() {
        return contents;
    }
}
