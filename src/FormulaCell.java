/**
 * Created by bal_SDkaplan on 2/3/2016.
 */
public class FormulaCell extends Cell{
    private String contents;

    /*
     * Creates a new cell and sets it contents to something
     */
    public FormulaCell(String contents) {
        super(contents);
        this.contents = contents;


    }
    public void formulate(){
        // Evaluating an expression is a simple accumulator problem.
        // Start with the first value on the left. Then, while there
        // are still more operators and values, keep adding; subtracting;
        // multiplying; or dividing the values into your running total.

        //while operating (true) (contents has a operator)
            //set value 1 to the numbers before the operator
            //Set operator to the operator
            //set value 2 to the numbers after hte operator until there is a space
            //operator value 1 and value 2 and set = to value 1
            //set contents to be value 1 + " " + the stuff from the next operator on
            //if there isn't another operator, set operating to false
                //exit loop
            //otherwise will go loop through again

        boolean operating = true;
        //while (operating){
            double valueOne = Double.parseDouble(contents.substring(0, contents.indexOf(" ")));
            System.out.println("ValueOne = " + valueOne);
            String operator = contents.substring(contents.indexOf(" "), contents.lastIndexOf(" ") + 1);
        System.out.println("Operator = " + operator);


        //look at string.split 
        //}
    }

    /*
     * Overrides the toString() method, returns contents as a string
     */
    public String toString() {
        return ("" + contents);
    }
}
