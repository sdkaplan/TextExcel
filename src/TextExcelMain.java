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
                if (command.indexOf("-") != -1) {
                    String firstCell = command.substring(command.indexOf(" ") + 1, command.indexOf(" ") + 3); //if you type in any 10 value this wont work!!!!!!!!!!!!!
                    String secondCell = command.substring(command.lastIndexOf(" ") + 1, command.length());
                    spreadsheet.clearContents(firstCell, secondCell);
                } else if(command.indexOf("all") != -1) { //for a clear all method. Will make a new empty spreadsheet if user enters "clear all"
                    spreadsheet.clearAll();
                } else {
                    String cellName = command.substring(command.indexOf(" ") + 1, command.length());
                    spreadsheet.clearContents(cellName);
                }
            } else if (command.contains("=")){ //if command is setting the value
                //cell name is the characters before the = (not including the space)
                String cellName = command.substring(0, command.indexOf(" "));

                if (command.indexOf("\"") != -1) { //it is a String
                    String settingValue = command.substring(command.indexOf("\"") + 1, command.lastIndexOf("\""));
                    spreadsheet.setContents(cellName, settingValue);

                } else if (command.indexOf("(") != -1) { //if it is a formula
                    String settingValue = command.substring(command.indexOf("(") + 1, command.lastIndexOf(")"));
                    spreadsheet.setContents(cellName, settingValue);
                } else { //it is a double
                    String settingValue = command.substring(command.indexOf("=") + 1, command.length());
                    spreadsheet.setContents(cellName, settingValue);
                    //Double settingValueDouble = Double.parseDouble(settingValue);
                }
            } else { //cell contains a cell name, will return the contents of the cell
                System.out.println(spreadsheet.getCellValue(command));

            }
            //else if command contains sorta
            //else if command contains sortb
        }
    }
}
