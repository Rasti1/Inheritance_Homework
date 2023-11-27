package main_package.view;

import main_package.calculations.GameA;
import main_package.calculations.GameB;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the bet amount: ");
        double betAmount = scanner.nextDouble();
        scanner.nextLine();

        GameA gameTypeA = new GameA();
        double winningA = gameTypeA.calculateWinning(betAmount);
        System.out.println("Winning for GameA: $" + String.format("%.2f", winningA));

        GameB gameTypeB = new GameB();
        double winningB = gameTypeB.calculateWinning(betAmount);
        System.out.println("Winning for GameB: $" + String.format("%.2f", winningB));
    }
}
