/* CS.11.01-Quiz.1.1

Ensure that you read all instructions carefully. Think carefully about your solution before writing any code. Use good programming practices such as meaningful variable names and good indentation so that your code is neat and easy to read - take pride in your work! Good luck, have fun! 

For each of the questions below, write each programming statement inside the main method that you created in 2. and write each programming statement on a separate line.

1. Create a Scanner object called scanner. 
2. Declare a variable of type int called age.
3. Declare a variable of type String called firstName.
4. Declare a variable of type String called favouriteFood.

5. Write a single println statement that prompts the user to enter their age.
6. Initialise age to the user input. That is, use the scanner class to initialise age to whatever value the user inputs. 
7. Write a single println statement that prompts the user to enter their first name.
8. Initialise firstName to the user input. That is, use the scanner class to initialise firstName to whatever value the user inputs. 
9. Write a single println statement that prompts the user to enter their favourite food.
10. Initialise favouriteFood to the user input. That is, use the scanner class to initialise favouriteFood to whatever value the user inputs.

11. Write a single println statement that prints out the information that the user input (age, firstName, favouriteFood). Ensure that you print out this information in the following format. For example:

<p>First name: 清清</p>

<p>Age: 18</p>

<p>Favourite food: 火锅</p>

(Each of First name, Age, and Favourite food are on separate lines). 

Commit and push your changes to your Github repository. Inspect your Github repository to ensure that all of the code that you wrote is on Github. Submit the link to your Github repository on Schoology. 


*/

/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Oliver
*****************************************************************************************************
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // 1
        int age; // 2
        String firstName; // 3
        String favoriteFood; // 4

        System.out.println("How old are you?"); // 5
        age = input.nextInt(); // 6
        input.nextLine(); // Fixes an issue where the next nextLine() is skipped following a nextInt()
        System.out.println("What's your first name?"); // 7
        firstName = input.nextLine(); // 8
        System.out.println("What's your favorite food?"); // 9
        favoriteFood = input.nextLine(); //10

        System.out.println("\nFirst name: " + firstName + "\n\nAge: " + age + "\n\nFavorite food: " + favoriteFood);

    }

}
