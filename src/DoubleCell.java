/**
 * Created by bal_Sdkaplan on 1/27/2016.
 */
public class DoubleCell extends Cell {
    private double cellValue;

    public DoubleCell(String contents) {
        super(contents);
        this.cellValue = Double.parseDouble(contents);
    }
}
