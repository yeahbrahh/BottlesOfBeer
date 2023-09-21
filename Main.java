/* Task
Your task for this lab is to write a program to generate the lyrics to the song “99 Bottles of Beer”. However, your program should read in the starting number of bottles the user wants in the song, it won’t always be 99.

Details
Name the project BottlesOfBeer.
Prompt the user to enter the starting number of bottles.
Read in the value using a Scanner object.
Create a loop to loop for each bottle of beer.
Inside the loop, print out one verse to the song.
Be sure to get the plurality correct. Your program should not say “1 bottles”.
Be sure to get the last verse correct, it should restart with the original starting number of bottles.

Sample Run
Below is a sample run of the program. Values entered by the user are shown in bold face.

Enter the number of bottles to start with: 5
5 bottles of beer on the wall, 5 bottles of beer.
Take one down and pass it around, 4 bottles of beer on the wall.

4 bottles of beer on the wall, 4 bottles of beer.
Take one down and pass it around, 3 bottles of beer on the wall.

3 bottles of beer on the wall, 3 bottles of beer.
Take one down and pass it around, 2 bottles of beer on the wall.

2 bottles of beer on the wall, 2 bottles of beer.
Take one down and pass it around, 1 bottle of beer on the wall.

1 bottle of beer on the wall, 1 bottle of beer.
Take one down and pass it around, 0 bottles of beer on the wall.

0 bottles of beer on the wall, 0 bottles of beer.
Go to the store and buy some more, 5 bottles of beer on the wall.*/

import java.util.Scanner; // import Scanner class
public class Main {
    static Scanner sc = new Scanner(System.in);// assign Scanner
   //Prompts User and Receives Input
    static int input() {
        System.out.print("\nHow many bottles are you starting with? ");
        return sc.nextInt(); // returns type int
    }
    // Main Method
    // For loop to call and decrement input() method
    // If else statement to print singular "bottle" at end of program
    public static void main(String[] args) {
        int b = input(); // reassigned input to variable 'b' so I could pass the original value down
        for (int i = b ; i  > 0 ; i--) { // changed from i = input() to i = b
      if (i == 1) {
          System.out.println("\n1 bottle of beer on the wall, 1 bottle of beer.\n");
                 System.out.println("\nTake it down and pass it around,no more bottles of beer on the wall:( ");
      } else
            System.out.print( "\n" + i + " bottles of beer on the wall, " + i + " bottles of beer.\n");
        System.out.println("\nTake one down and pass it around, " + (i - 1) + " bottles of beer on the wall.");

    }
        // Fixed code
        System.out.println("\nGo to the store and buy some more. " + b + " bottles of beer on the wall!!! ");
    }

}