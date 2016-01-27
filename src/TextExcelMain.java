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
            } else if (command.contains("=")){
                //cell name is the characters before the = (not including the space)
                String cellName = command.substring(0, command.indexOf(" "));

                if (command.indexOf("\"") != -1) { //its a String
                    String settingValue = command.substring(command.indexOf("\"") + 1, command.lastIndexOf("\""));
                    System.out.println(settingValue);
                } else if (command.indexOf("(") != -1) { //if its a formula
                    String settingValue = command.substring(command.indexOf("(") + 1, command.lastIndexOf(")"));
                    System.out.println(settingValue);
                } else { //its a double
                    String settingValue = command.substring(command.indexOf("=") + 1, command.length());
                    Double settingValueDouble = Double.parseDouble(settingValue);
                    System.out.println(settingValueDouble);
                }
            } else { //cell contains a cell name
                System.out.println(spreadsheet.getCellValue(command));
            }
            //else if command contains sorta
            //else if command contains sortb
        }
    }
}
