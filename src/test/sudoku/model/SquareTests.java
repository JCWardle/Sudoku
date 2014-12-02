package test.sudoku.model;

import main.sudoku.model.Cell;
import main.sudoku.model.Square;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SquareTests {
    @Test
    public void valid_When_Empty() {
        List<List<Cell>> cells = new ArrayList<List<Cell>>();
        cells.add(new ArrayList<Cell>());
        cells.add(new ArrayList<Cell>());
        cells.add(new ArrayList<Cell>());
        Square square = new Square(cells);

        Assert.assertTrue(square.isCellValueValid(0, 0, Cell.ONE));
    }

    @Test
    public void invalid_Addition_Same_Row() {
        List<List<Cell>> cells = new ArrayList<List<Cell>>();
        cells.add(new ArrayList<Cell>());
        cells.add(new ArrayList<Cell>());
        cells.add(new ArrayList<Cell>());
        cells.get(0).add(Cell.ONE);
        Square square = new Square(cells);

        Assert.assertFalse(square.isCellValueValid(1, 0, Cell.ONE));
    }

    @Test
    public void invalid_Addition_Different_Row() {
        List<List<Cell>> cells = new ArrayList<List<Cell>>();
        cells.add(new ArrayList<Cell>());
        cells.add(new ArrayList<Cell>());
        cells.add(new ArrayList<Cell>());
        cells.get(0).add(Cell.ONE);
        Square square = new Square(cells);

        Assert.assertFalse(square.isCellValueValid(1, 1, Cell.ONE));
    }

    @Test
    public void valid_Last_Number() {
        List<List<Cell>> cells = new ArrayList<List<Cell>>();
        cells.add(new ArrayList<Cell>());
        cells.add(new ArrayList<Cell>());
        cells.add(new ArrayList<Cell>());
        cells.get(0).add(Cell.ONE);
        cells.get(0).add(Cell.TWO);
        cells.get(0).add(Cell.THREE);
        cells.get(1).add(Cell.FOUR);
        cells.get(1).add(Cell.FIVE);
        cells.get(1).add(Cell.SIX);
        cells.get(2).add(Cell.SEVEN);
        cells.get(2).add(Cell.EIGHT);
        Square square = new Square(cells);

        Assert.assertTrue(square.isCellValueValid(2, 2, Cell.NINE));
    }
}