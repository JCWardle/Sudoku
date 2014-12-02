package test.sudoku.model;

import main.sudoku.model.Cell;
import main.sudoku.model.Line;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LineTests {
    @Test
    public void invalid_Cell_One_Number() {
        List<Cell> cells = new ArrayList<Cell>();
        cells.add(Cell.ONE);
        Line line = new Line(cells);

        Assert.assertFalse(line.isCellValueValid(2, Cell.ONE));
    }

    @Test
    public void invalid_Cell_Two_Numbers() {
        List<Cell> cells = new ArrayList<Cell>();
        cells.add(Cell.ONE);
        cells.add(Cell.TWO);
        Line line = new Line(cells);

        Assert.assertFalse(line.isCellValueValid(3, Cell.TWO));
    }

    @Test
    public void valid_Cell_One_Number() {
        List<Cell> cells = new ArrayList<Cell>();
        cells.add(Cell.TWO);
        Line line = new Line(cells);

        Assert.assertTrue(line.isCellValueValid(2, Cell.ONE));
    }

    @Test
    public void valid_Cell_Two_Numbers() {
        List<Cell> cells = new ArrayList<Cell>();
        cells.add(Cell.TWO);
        cells.add(Cell.ONE);
        Line line = new Line(cells);

        Assert.assertTrue(line.isCellValueValid(2, Cell.THREE));
    }

    @Test
    public void replace_With_Invalid_Cell() {
        List<Cell> cells = new ArrayList<Cell>();
        cells.add(Cell.TWO);
        cells.add(Cell.ONE);
        Line line = new Line(cells);

        Assert.assertFalse(line.isCellValueValid(2, Cell.ONE ));
    }

    @Test
    public void add_Last_Cell(){
        List<Cell> cells = new ArrayList<Cell>();
        cells.add(Cell.ONE);
        cells.add(Cell.TWO);
        cells.add(Cell.THREE);
        cells.add(Cell.FOUR);
        cells.add(Cell.FIVE);
        cells.add(Cell.SIX);
        cells.add(Cell.SEVEN);
        cells.add(Cell.EIGHT);
        Line line = new Line(cells);

        Assert.assertTrue(line.isCellValueValid(8, Cell.NINE));
    }
}
