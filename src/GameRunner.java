import java.util.Random;
import java.util.Scanner;

public class GameRunner {public static void main(String[] args){

while (true) {
    Field gameField = new Field();
    GameLogic gameLogic = new GameLogic();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Выберите предмет: ");
    String playerChoice = scanner.nextLine();
    if (playerChoice.equals("0")) {
        break;
    }
    gameField.setPlayerChoice(playerChoice);
    String compChoice = gameLogic.getCompChoice();
    gameField.setCompChoice(compChoice);
    String result = gameLogic.determineWinner(gameField);
    System.out.println(result);
    System.out.println(compChoice);

}

}
}
