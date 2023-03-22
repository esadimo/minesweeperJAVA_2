import java.util.Scanner;
public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select level: (easy/medium/hard)");
        String level = sc.nextLine();
        //validates input
        while(!level.equals("easy") && !level.equals("medium") && !level.equals("hard") )
        {
            System.out.println("Invalid input. Please try again.");
            level = sc.nextLine();
        }
        // Output user input
        System.out.println("Selected level is: " + level);
        System.out.println();

        //generates the board
        GameBoard gameBoard = new GameBoard(level);

        System.out.println();
        System.out.println("Make your move");
        //String input = sc.nextLine();
    }
}
