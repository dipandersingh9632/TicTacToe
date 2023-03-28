package models;

public class Bot extends Player {
    private BotDifficultyLevel botDifficultyLevel;

    public Bot(String name, PlayerType type, Symbol symbol, BotDifficultyLevel botDifficultyLevel) {
        super(name, type, symbol);
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }
}