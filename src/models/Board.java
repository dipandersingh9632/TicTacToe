package models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    // So in Board there will be size and cell
    private int dimension;
    private List<List<Cell>> board;

    public int getDimension(){ return this.dimension; }

    public Board(int dimension){
        this.dimension = dimension;

        board = new ArrayList<>();
        // For board add the arraylist and in each column add the cell
        for(int i = 0; i < dimension; i++){
            board.add(new ArrayList<>());
            for(int j = 0; j < dimension; j++){
                board.get(i).add(new Cell());
            }
        }
    }

    public Cell getCell(int i, int j){
        return this.board.get(i).get(j);
    }

    public List<List<Cell>> getBoard(){
        return board;
    }

    public void printBoard(){
        for(List<Cell> row : board){
            for(Cell cell : row){
                if(cell.getSymbol() == null) System.out.print("|    |");
                else System.out.print("|  " + cell.getSymbol().getCharacter() + "  |");
            }
            System.out.print("\n");
        }
    }
}
