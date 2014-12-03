package main.sudoku.model;

import java.util.List;

public class Square {
    private List<List<Cell>> _cells;

    public Square(List<List<Cell>> cells){
        _cells = cells;
    }

    public boolean isCellValueValid(int x, int y, Cell value){
        for (List<Cell> row : _cells) {
            if (row.contains(value))
                return false;
        }
        return true;
    }
}
