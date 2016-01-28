/**
 * Created by bal_Sdkaplan on 1/21/2016.
 */
public class Cell {
    private String contents;
    final int LENGTH = 12;

    /*
     * Creates a new cell and sets its contents to empty
     */
    public Cell() {
        contents = "empty";
    }

    public Cell(String contents) {
        this.contents = contents;
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
        if (contents.length() < LENGTH) {
            //get the length
            //LENGTH - length
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

    public void setContentsOfCell(String contents) {

    }
}
