/* Diego Lara*/

import java.util.Scanner;
import java.util.Random;

public class CL2_Lara {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] key = setupBoard();
        int[] playingBoard = new int[key.length];
        int game = runGame(playingBoard, key);

    }

    // this metod creates an array with the size the user wants for his board
    public static int[] setupBoard() {
        Scanner boardscanner = new Scanner(System.in);
        System.out.println("Enter the size of the board (even number): ");
        int size = boardscanner.nextInt();
        // this while loop repeats until the user enters an even number, otherwise will
        // keep asking to enter an even number
        while (!(size % 2 == 0 && size > 2)) {
            System.out.println("Enter the size of the board (even number): ");
            size = boardscanner.nextInt();
        }
        int[] board = new int[size];
        placePairs(board); // this class the placePairs method to the array, creating pairs throughout the
                           // array
        int boardLength = size; // this is used for the withinBounds method

        return board;

    }

    // this method displays the menu options to the user
    public static void displayMainMenu(int attempts) {

        Scanner opScanner = new Scanner(System.in);
        System.out.println("Do you wish to play for:");
        System.out.println("1. " + attempts + " attempts");
        System.out.println("2. Unlimited number of attempts");
        System.out.println("3. Exit game");

    }

    public static boolean isCellSelected(int[] board, int cell) {

        if (board[cell] == 0) {
            return false;

        } else {
            return true;
        }
    }

    // this method is used to place random pairs in the "board" array
    private static void placePairs(int[] board) {

        Random rand = new Random();

        for (int i = 0; i < board.length; i++)
            board[i] = i / 2 + 1;
        for (int i = 0; i < board.length - 1; i++) {
            int j = rand.nextInt(board.length - i);
            int temp = board[i];
            board[i] = board[j];
            board[j] = temp;
        }

    }

    public static void displayBoard(int[] board) {
        for (int i = 0; i < board.length; i++) {
            int db = i;
            System.out.print(db);
        }
        System.out.println(" ");

        for (int j = 0; j < board.length; j++) {
            if (board[j] == 0) {
                System.out.print("?");
            } else {
                System.out.print(board[j]);

            }
        }
    }

    public static boolean isBoardCleared(int[] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[i] == 0) {
                return false;
            }

        }
        return true;
    }

    public static boolean isWithinBounds(int boardLength, int cell) {
        if (cell <= boardLength && cell >= 0) {
            return false;
        }
        return true;
    }

    public static void clearCell(int[] board, int cell, int value) {
        board[cell] = value;

    }

    public static int runGame(int[] playingBoard, int[] board) {
        int cell1, cell2;
        Scanner gamScanner = new Scanner(System.in);
        int attempts = board.length / 2 + 2;
        displayMainMenu(attempts);
        int option = gamScanner.nextInt();

        if (option == 1) {
            System.out.println("Number of attempts left: " + attempts);
            displayBoard(playingBoard);
            while (isBoardCleared(playingBoard) == false) {
                do {
                    System.out.print("\nEnter cell number: ");
                    cell1 = gamScanner.nextInt();
                } while (!isWithinBounds(playingBoard.length, cell1) && isCellSelected(playingBoard, cell1));

                System.out.println("You have discovered: " + board[cell1] + "\nWhere is the matching pair? ");

                clearCell(playingBoard, cell1, board[cell1]);
                displayBoard(playingBoard);

                do {
                    System.out.print("\nEnter cell number: ");
                    cell2 = gamScanner.nextInt();

                } while (!isWithinBounds(playingBoard.length, cell2) && isCellSelected(playingBoard, cell2));
                System.out.println("\nYou have discovered: " + board[cell2] + "\nWhere is the matching pair? ");

                clearCell(playingBoard, cell2, board[cell2]);
                displayBoard(playingBoard);

                if (board[cell1] == board[cell2]) {
                    System.out.println("\nYou have found a pair!");
                } else {
                    System.out.println("\nYou have uncovered: " + board[cell2]);
                    attempts--;
                }
                System.out.println("Number of attempts left: " + attempts);
            }

            if (isBoardCleared(playingBoard)) {
                System.out.println("\nGame over");
                return 3;
            }
        }
        if (option == 2) {
            System.out.println("Number of attempts left: unlimited");
            displayBoard(playingBoard);
        while (isBoardCleared(playingBoard) == false) {
            do {
                System.out.print("\nEnter cell number: ");
                cell1 = gamScanner.nextInt();
            } while (!isWithinBounds(playingBoard.length, cell1) && isCellSelected(playingBoard, cell1));

            System.out.println("You have discovered: " + board[cell1] + "\nWhere is the matching pair? ");

            clearCell(playingBoard, cell1, board[cell1]);
            displayBoard(playingBoard);

            do {
                System.out.print("\nEnter cell number: ");
                cell2 = gamScanner.nextInt();

            } while (!isWithinBounds(playingBoard.length, cell2) && isCellSelected(playingBoard, cell2));
            System.out.println("\nYou have discovered: " + board[cell2] + "\nWhere is the matching pair? ");

            clearCell(playingBoard, cell2, board[cell2]);
            displayBoard(playingBoard);

            if (board[cell1] == board[cell2]) {
                System.out.println("\nYou have found a pair!");
            } else {
                System.out.println("\nYou have uncovered: " + board[cell2]);
            }
        }

        if (isBoardCleared(playingBoard)) {
            System.out.println("\nGame over");
            return 3;
        }
        }
        if (option == 3) {
            System.out.println("Game over.");

        }
        return 0;
    }
}
