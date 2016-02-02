/**
 * Created by bal_Sdkaplan on 1/27/2016.
 */
public class DoubleCell extends Cell {
    private double cellValue;

    public DoubleCell(String contents) {
        super(contents);
        this.cellValue = Double.parseDouble(contents);
    }
    /*
    public String getCellValue(String cellName){
        String letter = cellName.substring(0, 1); //The letter is the first thing in cellName
        int letterInt = convertToNumber(letter); //converts the letter to an int
        String numberString = cellName.substring(1, cellName.length()); //The int is the last part of the cellName
        int number = Integer.parseInt(numberString) - 1; //Changes the String int into an int int

        System.out.println(letterInt);
        System.out.println(number);
        return (cellName + " = " + "\"" + cellArray[letterInt][number]) + "\""; //gets the value of the cellArray
    }
    */
}
