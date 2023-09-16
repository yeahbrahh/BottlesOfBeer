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

import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int input() {
        System.out.print("How many bottles are you starting with? ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        for (int i = input() ; i  > 0 ; i--) {
      if (i == 1){
          System.out.println("1 bottle of beer on the wall, 1 bottle of beer.\n" +
                  "Take it down and pass it around, no more bottles of beer on the wall.");
      } else
            System.out.print( i + " bottles of beer on the wall, " + i + " bottles of beer.\n");
         System.out.println("\nTake one down and pass it around, " + (i - 1) + " bottles of beer on the wall.");
        }

    }
}