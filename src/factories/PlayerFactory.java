package factories;

import models.*;

public class PlayerFactory {
    public static Player createHumanPlayer(String name, Character character){
        return new Player(name, PlayerType.HUMAN, new Symbol(character));
    }

    public static Player createBot(String name, Character character, BotDifficultyLevel botDifficultyLevel){
        /* BOT is extending the Player class */
        return new Bot(name, PlayerType.BOT, new Symbol(character), botDifficultyLevel);
    }
}
