/**
 * Created by bal_Sdkaplan on 1/21/2016.
 */
public class Spreadsheet {
    private Cell[][] cellArray;
    final int ROWS = 7;
    final int COLUMNS = 10;

    public Spreadsheet() {
        Cell[][] cellArray = new Cell[ROWS][COLUMNS]; //creates a new 2d array of cells
        for (int i = 0; i < COLUMNS; i++) {
            for (int j = 0; j < ROWS; j++) {
                cellArray[j][i] = new Cell(); //puts an empty cell in each cell
            }
        }
        this.cellArray = cellArray;
    }

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
                System.out.print(cellArray[j][i]);
                System.out.print("|");
            }
            System.out.println();
            System.out.println(betweenColumns);
        }
    }

    public void exit() {
        //do I need this method?
    }
}
