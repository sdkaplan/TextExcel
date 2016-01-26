/**
 * Created by bal_Sdkaplan on 1/21/2016.
 */
import java.util.Scanner;
public class TextExcelMain {
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);
        Spreadsheet spreadsheet = new Spreadsheet();

        System.out.println("Welcome to TextExcel!");

        Boolean running = true;
        while(running == true) {
            System.out.println();
            System.out.println("Enter a command: ");

            String command = input.nextLine();
            System.out.println();

            if (command.equals("print")) {
                spreadsheet.printSpreadsheet();
            } else if (command.equals("exit")) {
                System.out.println("GoodBye!");
                running = false;
            } else if (command.contains("clear")) {
                //clear range
            } else { //cell contains a cell name
                System.out.println(spreadsheet.getCellValue(command));
            }
            //else if cell contains cell name = something
            //else if cell contains sorta
            //else if cell contains sortb
        }
    }
}
