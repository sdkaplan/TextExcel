/**
 * Created by bal_Sdkaplan on 1/21/2016.
 */
import java.util.Scanner;
public class TextExcelMain {
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);
        Spreadsheet spreadsheet = new Spreadsheet();

        System.out.println("Welcome to TextExcel!");
        System.out.println();
        System.out.println("Enter a command: ");
        System.out.println();

        //String command = input.nextLine();

        spreadsheet.printSpreadsheet();

        //String ABC = ("            |     A      |     B      |     C      |     D      |     E      |     F      |     G      |");
        //String betweenColumns = ("------------+------------+------------+------------+------------+------------+------------+------------+");
        /*
        Cell[][] cellArray = new Cell[7][10]; //creates a new 2d array of cells
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 7; j++) {
                cellArray[j][i] = new Cell(); //puts an empty cell in each cell
            }
        }

        /*System.out.println(ABC);
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
        } */
    }
}
