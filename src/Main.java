import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Warrior character1 = new Warrior("Rocio", 100, 60, 50);
        Wizard character2 = new Wizard("Raquel",100, 8, 50);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Player 1 enter your name: ");
        character1.setName(scanner.nextLine());
        System.out.println("Player 2 enter your name: ");
        character2.setName(scanner.nextLine());
        System.out.println("---------------------------------");
        System.out.println(character1);
        System.out.println(character2);
        System.out.println("---------------------------------");
        Thread.sleep(1000);
        System.out.println("Game is starting");
        Thread.sleep(1000);
        System.out.println();
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println();
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println();
        System.out.println("1!");
        System.out.println();
        scanner.close();

        game(character1, character2);
    }

    public static void game(Character character1, Character character2) throws InterruptedException {
        String gameOver = "\u001B[31m┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\n" +
                "███▀▀▀██┼███▀▀▀███┼███▀█▄█▀███┼██▀▀▀\n" +
                "██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼█┼┼┼██┼██┼┼┼\n" +
                "██┼┼┼▄▄▄┼██▄▄▄▄▄██┼██┼┼┼▀┼┼┼██┼██▀▀▀\n" +
                "██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██┼┼┼\n" +
                "███▄▄▄██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██▄▄▄\n" +
                "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\n" +
                "███▀▀▀███┼▀███┼┼██▀┼██▀▀▀┼██▀▀▀▀██▄┼\n" +
                "██┼┼┼┼┼██┼┼┼██┼┼██┼┼██┼┼┼┼██┼┼┼┼┼██┼\n" +
                "██┼┼┼┼┼██┼┼┼██┼┼██┼┼██▀▀▀┼██▄▄▄▄▄▀▀┼\n" +
                "██┼┼┼┼┼██┼┼┼██┼┼█▀┼┼██┼┼┼┼██┼┼┼┼┼██┼\n" +
                "███▄▄▄███┼┼┼─▀█▀┼┼─┼██▄▄▄┼██┼┼┼┼┼██▄\n" +
                "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\n" +
                "┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼\n" +
                "┼┼┼┼┼┼████▄┼┼┼▄▄▄▄▄▄▄┼┼┼▄████┼┼┼┼┼┼┼\n" +
                "┼┼┼┼┼┼┼┼┼▀▀█▄█████████▄█▀▀┼┼┼┼┼┼┼┼┼┼\n" +
                "┼┼┼┼┼┼┼┼┼┼┼█████████████┼┼┼┼┼┼┼┼┼┼┼┼\n" +
                "┼┼┼┼┼┼┼┼┼┼┼██▀▀▀███▀▀▀██┼┼┼┼┼┼┼┼┼┼┼┼\n" +
                "┼┼┼┼┼┼┼┼┼┼┼██┼┼┼███┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼\n" +
                "┼┼┼┼┼┼┼┼┼┼┼█████▀▄▀█████┼┼┼┼┼┼┼┼┼┼┼┼\n" +
                "┼┼┼┼┼┼┼┼┼┼┼┼███████████┼┼┼┼┼┼┼┼┼┼┼┼┼\n" +
                "┼┼┼┼┼┼┼┼▄▄▄██┼┼█▀█▀█┼┼██▄▄▄┼┼┼┼┼┼┼┼┼\n" +
                "┼┼┼┼┼┼┼┼▀▀██┼┼┼┼┼┼┼┼┼┼┼██▀▀┼┼┼┼┼┼┼┼┼\n" +
                "┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼\n" +
                "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\u001B[31m";

        for (int i = 1; i <= 3; i++) {
            Thread.sleep(1000);
            System.out.println("\033[33m ROUND " + i + "! \033[33m");
            System.out.println("\033[0m \033[0m");
            System.out.println( character1.getName() + " HP: " + character1.getHp());
            System.out.println(character2.getName() + " HP: " + character2.getHp());
            System.out.println();
            Thread.sleep(1000);
            character1.attack(character2);
            System.out.println();
            Thread.sleep(1000);
            character2.attack(character1);
            System.out.println();
            Thread.sleep(1000);
            if (character1.getHp() == 0) {
                System.out.println(gameOver);
                System.out.println("\033[37m \033[37m");
                Thread.sleep(1000);
                System.out.println("\uD83C\uDFC6" + "\uD83C\uDFC6" + "\uD83C\uDFC6 " + "\u001B[35m \u001B[35m" + character2.getName() + " is the winner!" + " \uD83C\uDFC6" + "\uD83C\uDFC6" + "\uD83C\uDFC6");
                break;
            } else if (character2.getHp() == 0) {
                System.out.println(gameOver);
                System.out.println("\033[37m \033[37m");
                Thread.sleep(1000);
                System.out.println("\uD83C\uDFC6" + "\uD83C\uDFC6" + "\uD83C\uDFC6 " + "\u001B[35m \u001B[35m" + character1.getName() + " is the winner!" + " \uD83C\uDFC6" + "\uD83C\uDFC6" + "\uD83C\uDFC6");
                break;
            }else if(i==3){
                if(character2.getHp() < character1.getHp()){
                    System.out.println(gameOver);
                    System.out.println("\033[37m \033[37m");
                    Thread.sleep(1000);
                    System.out.println("\uD83C\uDFC6" + "\uD83C\uDFC6" + "\uD83C\uDFC6 " + "\u001B[35m \u001B[35m" + character1.getName() + " is the winner!" + " \uD83C\uDFC6" + "\uD83C\uDFC6" + "\uD83C\uDFC6");
                }else{
                    System.out.println(gameOver);
                    System.out.println("\033[37m \033[37m");
                    Thread.sleep(1000);
                    System.out.println("\uD83C\uDFC6" + "\uD83C\uDFC6" + "\uD83C\uDFC6 " + "\u001B[35m \u001B[35m" + character2.getName() + " is the winner!" + " \uD83C\uDFC6" + "\uD83C\uDFC6" + "\uD83C\uDFC6");
                }
            }
        }
    }

}