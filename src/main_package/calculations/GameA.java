package main_package.calculations;

public class GameA extends Game {
    @Override
    public double calculateWinning(double betAmount) {
        if (betAmount < 3) {
            return 125 * betAmount / 100;
        } else if (betAmount >= 3 && betAmount <= 7) {
            return 125 * betAmount / 100 - 5 * betAmount / 100;
        } else {
            return super.calculateWinning(betAmount);
        }
    }
}
