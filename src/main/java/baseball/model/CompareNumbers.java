package baseball.model;

import baseball.dto.GameResultDTO;

public class CompareNumbers {

    public GameResultDTO compare(String inputNumber, String targetNumber) {
        GameResultDTO dto = new GameResultDTO();

        int strikeCount = getStrikesCount(inputNumber, targetNumber);
        int ballCount = getBallsCount(inputNumber, targetNumber);
        boolean isNothing = getIsNothing(inputNumber, targetNumber);

        dto.setStrikeCount(strikeCount);
        dto.setBallCount(ballCount);
        dto.setNothing(isNothing);
        return dto;
    }

    public int getStrikesCount(String inputNumber, String targetNumber){
        int strikeCount = 0;
        for(int i=0; i<3; i++){
            strikeCount += equalsNumber(inputNumber.charAt(i), targetNumber.charAt(i));
        }
        return strikeCount;
    }

    private int getBallsCount(String inputNumber, String targetNumber) {
        int ballCount = 0;
        ballCount += containsNumber(inputNumber, targetNumber);
        ballCount -= getStrikesCount(inputNumber, targetNumber);
        return ballCount;
    }

    public boolean getIsNothing(String inputNumber, String targetNumber){
        boolean isNothing = true;
        for(int i=0; i<inputNumber.length(); i++){
            boolean isContainsNumber = targetNumber.indexOf(inputNumber.charAt(i)) > -1;
            isNothing = isNothing && isContainsNumber;
        }
        return isNothing;
    }

    public int equalsNumber(char inputNumberIndex, char targetNumberIndex){
        if(inputNumberIndex == targetNumberIndex)
            return 1;
        return 0;
    }

    public int containsNumber(String inputNumber, String targetNumber){
        int containsCount = 0;

        for(int i=0; i<inputNumber.length(); i++){
            if(targetNumber.indexOf(inputNumber.charAt(i)) > -1)
                containsCount++;
        }
        return containsCount;
    }
}
