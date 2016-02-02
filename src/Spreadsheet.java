/**
 * Created by bal_Sdkaplan on 1/21/2016.
 */
public class Spreadsheet {
    private Cell[][] cellArray;
    final int ROWS = 7;
    final int COLUMNS = 10;

    /*
     *Creates a new 2d Array of cells and sets each cell to be empty
     */
    public Spreadsheet() {
        Cell[][] cellArray = new Cell[ROWS][COLUMNS]; //creates a new 2d array of cells
        for (int i = 0; i < COLUMNS; i++) {
            for (int j = 0; j < ROWS; j++) {
                cellArray[j][i] = new Cell("empty"); //puts an empty cell in each cell
            }
        }
        this.cellArray = cellArray;
    }

    /*
     * Prints the spreadsheet with the  correct number of spaces
     */
    public void printSpreadsheet() {

        String ABC = ("            |     A      |     B      |     C      |     D      |     E      |     F      |     G      |");
        String betweenColumns = ("------------+------------+------------+------------+------------+------------+------------+------------+");

        System.out.println(ABC);
        System.out.println(betweenColumns);
        for (int i = 0; i < COLUMNS; i++) {
            if (i < 9) {
                System.out.print("     " + (i + 1) + "      |");
            } else {
                System.out.print("     " + (i + 1) + "     |");
            }

            for (int j = 0; j < ROWS; j++) {
                System.out.print(cellArray[j][i].toStringinSpreadsheet());
                System.out.print("|");
            }
            System.out.println();
            System.out.println(betweenColumns);
        }
    }

    /*
     * Takes a cell name and converts it to be the correct number for the array
     * @param: the cell name
     * @return: the cell name = the value of the cell
     */
    public String getCellValue(String cellName){
        //should these next 4 lines be in a method?
        String letter = cellName.substring(0, 1); //The letter is the first thing in cellName
        int letterInt = convertToNumber(letter); //converts the letter to an int
        String numberString = cellName.substring(1, cellName.length()); //The int is the last part of the cellName
        int number = Integer.parseInt(numberString); //Changes the String int into an int int

        System.out.println(letterInt);
        System.out.println(number);
        return (cellName + " = " + cellArray[letterInt][number]); //gets the value of the cellArray
    }

    /*
     * Converts the letter to a number corresponding with the array
     * @param: the letter to be converted
     * @return: the corresponding number to that letter, 9 if the letter is not in the spreadsheet
     */
    private int convertToNumber(String cellName){
        String letter = cellName.substring(0, 1); //The letter is the first thing in cellName
        if (letter.equals("A")){
            return 0;
        } else if (letter.equals("B")) {
            return 1;
        } else if (letter.equals("C")){
            return 2;
        } else if (letter.equals("D")) {
            return 3;
        } else if (letter.equals("E")) {
            return 4;
        } else if (letter.equals("F")) {
            return 5;
        } else if (letter.equals("G")) {
            return 6;
        }


        return 9; //return 9 if the number is not in the spreadsheet, so that an error will occur in the array
    }

    public void setContents(String cellName, String stringContents) {
        int letterInt = convertToNumber(cellName);
        String numberString = cellName.substring(1, cellName.length()); //The int is the last part of the cellName
        int number = Integer.parseInt(numberString); //Changes the String int into an int int

        cellArray[letterInt][number - 1] = new StringCell(stringContents);
    }

    public void clearContents(String cellName) {
        String letter = cellName.substring(0, 1); //The letter is the first thing in cellName
        int letterInt = convertToNumber(letter); //converts the letter to an int
        String numberString = cellName.substring(1, cellName.length()); //The int is the last part of the cellName
        int number = Integer.parseInt(numberString); //Changes the String int into an int int

        cellArray[letterInt][number - 1] = new Cell();
    }

    public void clearContents(String firstCell, String secondCell) {
        String letter = firstCell.substring(0, 1); //The letter is the first thing in cellName
        int letterInt = convertToNumber(letter); //converts the letter to an int
        String numberString = firstCell.substring(1, firstCell.length()); //The int is the last part of the cellName
        int number = Integer.parseInt(numberString); //Changes the String int into an int int

        String letter2 = secondCell.substring(0, 1); //The letter is the first thing in cellName
        int letterInt2 = convertToNumber(letter); //converts the letter to an int
        String numberString2 = secondCell.substring(1, secondCell.length()); //The int is the last part of the cellName
        int number2 = Integer.parseInt(numberString); //Changes the String int into an int int







        //clear the array in the indicated ranges THIS DOESN'T WORK YET WORK ON THIS AT SOMEPOINT
        for (int i = letterInt; i < letterInt2; i++) {
            for (int j = number; j < number2; j++) {
                cellArray[i][j] = new Cell();
            }
        }
    }

    public void clearAll() {
        for (int i = 0; i < COLUMNS; i++) {
            for (int j = 0; j < ROWS; j++) {
                cellArray[j][i] = new Cell("empty"); //puts an empty cell in each cell
            }
        }
        this.cellArray = cellArray;
    }
}
