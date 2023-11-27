package main_package.calculations;

public class GameB extends Game {
    @Override
    public double calculateWinning(double betAmount) {
        if (betAmount > 7) {
            return 2 * betAmount - (2 * betAmount) / 10;
        } else {
            return super.calculateWinning(betAmount);
        }
    }
}
