package main.sudoku.model;

import java.util.List;

public class Line {
    private List<Cell> _cells;

    public Line(List<Cell> cells){
        _cells = cells;
    }

    public boolean isCellValueValid(int position, Cell value){
        if (_cells.contains(value))
            return false;
        else
            return true;
    }
}
