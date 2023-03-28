package factories;

import models.BotDifficultyLevel;

public class BotDifficultyLevelFactory {
    public static BotDifficultyLevel getBotDifficultyLevelByName(String name){
        if(name.equals("EASY")) return BotDifficultyLevel.EASY;
        else return BotDifficultyLevel.MEDIUM;
    }
}
