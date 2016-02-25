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

    /*
     * Creates a new cell and sets its contents to something
     */
    public Cell(String contents) {
        this.contents = contents;
    }

    /*
    * Prepares the stored values for spreadsheet printing.
    * if cell is empty will return spaces
    * adds or removes the correct number of spaces so that the cell is 12 characters wide
    * @return: the 12 character string for printing the spreadsheet
    */
    public String toStringInSpreadsheet() {
        String returnValue = this.contents;
        if (contents.equals("empty")){
            returnValue = "            ";
        } else if (contents.length() < LENGTH) {
            int spaces = (LENGTH - contents.length()) / 2; //gets the number of spaces to be on the left side of contents
            returnValue = ""; //creates an empty string

            for (int i = 0; i < spaces; i++) {
                returnValue += " "; //adds the correct number of spaces on the left side
            }
            returnValue += contents; //adds contents
            if (contents.length() % 2 == 1){ //if the legnth of contents is odd
                spaces += 1; //add an extra space on the right
            }
            for (int i = 0; i < spaces; i++) {
                returnValue += " "; //adds the right side spaces
            }
        } else if (contents.length() > LENGTH) {
            returnValue = returnValue.substring(0, LENGTH - 1) + "<"; //shortens contents to be 11 char long with a <
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
