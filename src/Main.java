import javax.xml.stream.FactoryConfigurationError;
import java.util.Scanner;

public class Main {
    private int numberToGuess;
    private final interface1 inputStrategy;
    public Main(interface1 inputStrategy) {
        this.inputStrategy = inputStrategy;
    }
    public void start() {
        numberToGuess = inputStrategy.getNumber();
        System.out.println("Угадай число!");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введи число: ");
            int playerGuess = scanner.nextInt();
            if (playerGuess < numberToGuess) {
                System.out.println("Моё число больше");
            } else if (playerGuess > numberToGuess) {
                System.out.println("Моё число меньше");
            } else {
                System.out.println("Красава угадал " + numberToGuess);
                break;
            }
        }
        scanner.close();
    }
    public static void main(String[] args) {
        System.out.println("Выберите режим: ");
        System.out.println("1 - Против AI");
        System.out.println("2 - Против игрока");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        interface1 inputStrategy;
        switch (choice){
            case 1: inputStrategy = new chislogen();
                break;
            case 2: inputStrategy = new FileReader();
                break;
            default:
                System.out.println("Некорктный ввод");
                return;
        }

        Main game = new Main(inputStrategy);
        game.start();
        scanner.close();
    }
}