/**
 * Created by bal_Sdkaplan on 1/21/2016.
 */
public class Cell {
    private String contents;

    public Cell() {
        contents = "empty";
    }

    //used when printing in the spreadsheet. It will prepare the files to have the right
    //number of spaces, and if the cell is empty it will print spaces instead of empty
    public String toStringinSpreadsheet() {
        String returnValue = this.contents;
        if (contents.equals("empty")){
            returnValue = "            ";
        }
        return returnValue;
    }
    //regular ol' toString method, can be used when directly giving the user the value of a cell
    public String toString() {
        return contents;
    }
}
