package models;

public class Player {
    private Symbol symbol;
    private PlayerType playerType;
    private String name;

    public Player(String name, PlayerType type, Symbol symbol) {
        this.playerType = type;
        this.symbol = symbol;
        this.name = name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    //public abstract Move makeMove(Board board);
}
