package factories;
import gameWiinningStrategies.GameWinningStrategy;
import models.GameWinningStrategyName;

public class GameWinningStrategyFactory {

    public static GameWinningStrategy getGameWinningStrategyByName(GameWinningStrategyName gameWinningStrategyName){
        return switch (gameWinningStrategyName){
            case ROW -> null;
            case COLUMN -> null;
            case DIAGNOL -> null;
            case CORNER -> null;
        };
    }
}
