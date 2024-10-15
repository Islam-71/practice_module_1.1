import java.util.Random;

public class GameLogic {
    private static final String[] options = {"Камень", "Ножницы", "Бумага"};

    public String getCompChoice() {
        Random random = new Random();
        int index = random.nextInt(options.length);
        return options[index];
    }

    public String determineWinner(Field field) {
        String playerChoice = field.getPlayerChoice();
        String compChoice = field.getCompChoice();

        if (playerChoice.equals(compChoice)) {
            return "Ничья";
        }

        if (playerChoice.equals("Камень")) {
            if (compChoice.equals("Ножницы")) {
                return "Игрок победил";
            } else {
                return "Комп победил";
            }
        }

        if (playerChoice.equals("Ножницы")){
            if (compChoice.equals("Бумага")){
                return "Игрок победил";
            }else {
                return "Комп победил";
            }
        }

        if (playerChoice.equals("Бумага")){
            if (compChoice.equals("Камень")){
                return "Игрок победил";
            }else {
                return "Комп победил";
            }
        }

        return "Неправильный выбор";
    }
}
