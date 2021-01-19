package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the number of rows: ");
        int numberOfRows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row: ");
        int numberOfSeats = scanner.nextInt();

        createCinema(numberOfRows, numberOfSeats);

        System.out.println("Enter a row number: ");
        int numberOfRow = scanner.nextInt();
        System.out.println("Enter a seat number in that row: ");
        int numberOfSeat = scanner.nextInt();

        singleSeat(numberOfRow, numberOfRows, numberOfSeats);
        createCinema(numberOfRows, numberOfSeats, numberOfRow, numberOfSeat);


    }

    public static void createCinema(int rows, int seats) {
        char[][] seatsArray = new char[rows][seats];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                seatsArray[i][j] = 'S';
            }
        }
        printCinema(seatsArray, rows, seats);
    }

    public static void singleSeat(int row, int rows, int seats) {
        System.out.println();
        int capacity = rows * seats;
        if (capacity <= 60 || capacity > 60 && row <= rows / 2) {
            System.out.printf("Ticket price: $%d", 10);
        } else {
            System.out.printf("Ticket price: $%d", 8);
        }
        System.out.println();
    }


    public static void createCinema(int rows, int seats, int row, int seat) {
        char[][] seatsArray = new char[rows][seats];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                seatsArray[i][j] = 'S';
                seatsArray[row - 1][seat - 1] = 'B';
            }
        }
        printCinema(seatsArray, rows, seats);

    }

    public static void printCinema(char[][] array, int rows, int seats) {
        System.out.println();
        System.out.println("Cinema:");
        for (int i = 0; i < rows; i++) {
            if (i == 0) {
                System.out.print(" ");
                for (int k = 1; k < seats + 1; k++) {
                    System.out.print(" " + k);
                }
                System.out.println();
            }
            System.out.print(i + 1);
            for (int j = 0; j < seats; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }



}