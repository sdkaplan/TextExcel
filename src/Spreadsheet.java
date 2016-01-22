/**
 * Created by bal_Sdkaplan on 1/21/2016.
 */
public class Spreadsheet {
    private Cell[][] cellArray;

    public Spreadsheet() {
        Cell[][] cellArray = new Cell[7][10]; //creates a new 2d array of cells
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 7; j++) {
                cellArray[j][i] = new Cell(); //puts an empty cell in each cell
            }
        }
    }
    /*
    public void createNew() {
        Cell[][] cellArray = new Cell[7][10]; //creates a new 2d array of cells
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 7; j++) {
                cellArray[j][i] = new Cell(); //puts an empty cell in each cell
            }
        }
    }
    */
    public void printSpreadsheet() {

        String ABC = ("            |     A      |     B      |     C      |     D      |     E      |     F      |     G      |");
        String betweenColumns = ("------------+------------+------------+------------+------------+------------+------------+------------+");

        System.out.println(ABC);
        System.out.println(betweenColumns);
        for (int i = 0; i < 10; i++) {
            if (i < 9) {
                System.out.print("     " + (i + 1) + "      |");
            } else {
                System.out.print("     " + (i + 1) + "     |");
            }

            for (int j = 0; j < 7; j++) {
                System.out.print(cellArray[j][i]);
                System.out.print("|");
            }
            System.out.println();
            System.out.println(betweenColumns);
        }
    }
}
