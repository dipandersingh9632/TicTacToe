package models;

import excpetions.DuplicateSymbolExcpetion;
import gameWiinningStrategies.GameWinningStrategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Game {
    private List<Player> players;
    private Board board;
    private List<Move> moves;
    private List<GameWinningStrategy> gameWinningStrategies;
    private int lastMovedPlayerIndex;
    private GameStatus gameStatus;
    private Player winner;

    private Game() {
        this.players = new ArrayList<>();
        this.moves = new ArrayList<>();
        this.gameWinningStrategies = new ArrayList<>();
        this.lastMovedPlayerIndex = -1;
        this.gameStatus = GameStatus.IN_PROGRESS;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public List<GameWinningStrategy> getGameWinningStrategies() {
        return gameWinningStrategies;
    }

    public void setGameWinningStrategies(List<GameWinningStrategy> gameWinningStrategies) {
        this.gameWinningStrategies = gameWinningStrategies;
    }

    public int getLastMovedPlayerIndex() {
        return lastMovedPlayerIndex;
    }

    public void setLastMovedPlayerIndex(int lastMovedPlayerIndex) {
        this.lastMovedPlayerIndex = lastMovedPlayerIndex;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }



    // BUILDER CLASS
    public static class  Builder {
        private List<Player> players;
        private List<GameWinningStrategy> gameWinningStrategies;

        public Builder() {
            this.players = new ArrayList<>();
            this.gameWinningStrategies = new ArrayList<>();
        }

        public Builder addPlayer(Player player) {
            this.players.add(player);
            return this;
        }

        public Builder addPlayers(List<Player> players) {
            this.players.addAll(players);
            return this;
        }

        public Builder addGameWinningStrategy(GameWinningStrategy strategy) {
            this.gameWinningStrategies.add(strategy);
            return this;
        }

        public Builder addGameWinningStrategies(List<GameWinningStrategy> strategies) {
            this.gameWinningStrategies.addAll(strategies);
            return this;
        }

        public Game build() {
            Set<Character> alreadyExistingCharacter = new HashSet<>();

            for (Player player : players) {
                Character ch = player.getSymbol().getCharacter();
                if (alreadyExistingCharacter.contains(ch)) {
                    throw new DuplicateSymbolExcpetion(ch);
                }
                alreadyExistingCharacter.add(ch);
            }
            Game game = new Game();
            game.players = players;
            game.gameWinningStrategies = gameWinningStrategies;
            game.board = new Board(players.size() + 1);
            return game;
        }
    }
}
