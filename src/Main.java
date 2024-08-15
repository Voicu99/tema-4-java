import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        // Task 1
        //Write a Java program where you create two String objects named stringOne and stringTwo with the same value "OpenAI". Check and print whether they refer to the same object.
        String stringOne = "OpenAI";
        String stringTwo = "OpenAI";
        System.out.println("Task 1: Do string One and string Two refer to the same object? " + (stringOne == stringTwo));

        // Task 2
        //Write a Java program to declare two integer variables firstNumber and secondNumber with any values. Use an equality operator to compare these two numbers and print the result. Do the same for two String objects firstString and secondString with the same value, but use the equals() method for comparison. Print the result.
        int firstNumber = 5;
        int secondNumber = 10;
        System.out.println("Task 2: Are firstNumber and secondNumber equal? " + (firstNumber == secondNumber));

        String firstString = "OpenAI";
        String secondString = "OpenAI";
        System.out.println("Task 2: Are firstString and secondString equal? " + firstString.equals(secondString));

        // Task 3
        //Write a Java program that declares an integer variable age with a value of 20. Print a statement saying "I am adult" if age is 18 or more, else print "I am not an adult".
        int age = 20;
        if (age >= 18) {
            System.out.println("Task 3: I am an adult");
        } else {
            System.out.println("Task 3: I am not an adult");
        }

        // Task 4
        // Write a Java program where you declare two integer variables heightOne and heightTwo with any values. Use a ternary operator to determine the greater height and assign it to a variable maximumHeight. Print the result.
        int heightOne = 170;
        int heightTwo = 180;
        int maximumHeight = heightOne > heightTwo ? heightOne : heightTwo;
        System.out.println("Task 4: The greater height is " + maximumHeight);

        // Task 5 - Print numbers 1 to 10
        //Write a Java program to print the numbers from 1 to 10 using a for loop. As a next step, modify your program to print only the even numbers from 1 to 10.
        System.out.print("Task 5: Numbers from 1 to 10: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();


        // Task 6
        //Write a Java program where you declare an integer variable temperature. Assign a value to it and print "Hot" if the temperature is more than 30, "Warm" if the temperature is between 20 and 30, and "Cold" if it's less than 20.
        int temperature = 25;
        if (temperature > 30) {
            System.out.println("Task 6: Hot");
        } else if (temperature >= 20) {
            System.out.println("Task 6: Warm");
        } else {
            System.out.println("Task 6: Cold");
        }

        // Task 7
        // Write a Java program that determines the type of a triangle based on its sides. Declare three variables sideOne, sideTwo and sideThree to represent the sides of the triangle. Use the ternary operator to determine and print whether the triangle is "Equilateral", "Isosceles", or "Scalene".
        int sideOne = 5, sideTwo = 5, sideThree = 5;
        String triangleType = (sideOne == sideTwo && sideTwo == sideThree) ? "Equilateral"
                : (sideOne == sideTwo || sideTwo == sideThree || sideOne == sideThree) ? "Isosceles" : "Scalene";
        System.out.println("Task 7: The triangle is " + triangleType);

        // Task 8
        // Write a Java program to calculate the factorial of a number using a for loop. Declare an integer variable number and assign a value to it. Then calculate and print the factorial of number.
        int number = 5;
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Task 8: Factorial of " + number + " is " + factorial);

        // Task 9
        //Write a Java program to create two String variables, countryOne with the value "USA" and countryTwo with the value "USA". Check if countryOne and countryTwo are equal using the equals() method and print the result. Then change the value of countryTwo to "UK" and check for equality again. Print the result.
        String countryOne = "USA";
        String countryTwo = "USA";
        System.out.println("Task 9: Are countryone and countryTwo equal? " + countryOne.equals(countryTwo));
        countryTwo = "UK";
        System.out.println("Task 9: Are countryone and countryTwo equal after changing countryTwo? " + countryOne.equals(countryTwo));

        // Task 10
        //. Write a Java program that creates two distinct ArrayList objects, listOne and listTwo. Add some elements to listOne and assign listOne to listTwo. Now modify listOne by adding a new element. Print both lists and observe the output.
        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("A");
        listOne.add("B");
        ArrayList<String> listTwo = listOne;
        listOne.add("C");
        System.out.println("Task 10: listOne: " + listOne);
        System.out.println("Task 10: listTwo: " + listTwo);

        // Task 11
        // Write a Java program where you declare four integer variables: a, b, c, and d. Assign them values of 10, 20, 30, and 40 respectively. Create two more variables additionResult and multiplicationResult. Set additionResult to the sum of a and b and multiplicationResult to the product of c and d. Print the values of additionResult and multiplicationResult.
        int a = 10, b = 20, c = 30, d = 40;
        int additionResult = a + b;
        int multiplicationResult = c * d;
        System.out.println("Task 11: Addition result: " + additionResult);
        System.out.println("Task 11: Multiplication result: " + multiplicationResult);

        // Task 12
        //Write a Java program where you declare an integer variable number with a value of 25. Use unary minus operator to change the sign of number and assign it to a variable negativeNumber. Print the values of number and negativeNumber.
        number = 25;
        int negativeNumber = -number;
        System.out.println("Task 12: number = " + number);
        System.out.println("Task 12: negativeNumber = " + negativeNumber);

        // Task 13
        //Write a Java program where you declare two boolean variables isRaining and isSunny with values of true and false, respectively. Use the logical complement operator to negate the values of both variables and print the new values.
        boolean isRaining = true;
        boolean isSunny = false;
        System.out.println("Task 13: is Raining (negated): " + !isRaining);
        System.out.println("Task 13: is Sunny (negated): " + !isSunny);

        // Task 14
        //Write a Java program where you declare an integer variable counter with a value of 0. Use the increment operator to increase the value of counter by 1 and then print the value. After that, use the decrement operator to decrease the value of counter by 1 and then print the value.
        int counter = 0;
        counter++;
        System.out.println("Task 14: counter after increment: " + counter);
        counter--;
        System.out.println("Task 14: counter after decrement: " + counter);

        // Task 15
        //Write a Java program where you declare an integer variable total with a value of 100. Use the compound assignment operator to decrease the total by 20 and then print the value. Next, use another compound assignment operator to multiply the total by 2 and then print the value.
        int total = 100;
        total -= 20;
        System.out.println("Task 15: total after subtraction: " + total);
        total *= 2;
        System.out.println("Task 15: total after multiplication: " + total);

        // Task 16
        //Write a Java program where you use unary operators to perform a series of transformations on an integer variable number initialized to 50. First, negate number, then take the absolute value, and finally increment it by 1. Print the result at each step.
        number = 50;
        number = -number;
        System.out.println("Task 16: After negation: " + number);
        number = Math.abs(number);
        System.out.println("Task 16: After taking absolute value: " + number);
        number++;
        System.out.println("Task 16: After increment: " + number);

        // Task 17
        //Write a Java program that simulates a simple authentication system. Declare a boolean variable hasUsername and hasPassword. Set up a series of logical conditions using these two variables that will check the following conditions:
        //If both hasUsername and hasPassword are true, print "Authentication successful".
        //If either hasUsername or hasPassword is false, print "Authentication failed".
        //If hasUsername is true but hasPassword is false, print "Password is incorrect".
        boolean hasUsername = true;
        boolean hasPassword = false;
        if (hasUsername && hasPassword) {
            System.out.println("Task 17: Authentication successful");
        } else if (hasUsername && !hasPassword) {
            System.out.println("Task 17: Password is incorrect");
        } else {
            System.out.println("Task 17: Authentication failed");
        }

        // Task 18
        //Write a Java program where you declare an integer array with 5 elements. Use a for loop to initialize the array such that each element is equal to its index incremented by 1. Then use another for loop to decrement each element by 1. Print the array before and after the decrement operation using a for-each loop.
        int[] array = new int[5];
        System.out.print("Task 18: Array before decrement: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Task 18: Array after decrement: ");
        for (int i = 0; i < array.length; i++) {
            array[i]--;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Task 19
        //Write a Java program that takes an integer variable age as input. Use a ternary operator to classify the person into one of the following categories: "Child" (age < 12), "Teenager" (age between 12 and 17), "Adult" (age between 18 and 64), and "Senior" (age 65 and above). Print the resulting classification.
        age = 16;
        String category = (age < 12) ? "Child"
                : (age <= 17) ? "Teenager"
                : (age <= 64) ? "Adult"
                : "Senior";
        System.out.println("Task 19: The person is a " + category);

        // Task 20
        // Write a Java program that takes three integer variables a, b, and c as input. Use nested ternary operators to find and print the largest number among the three.
        a = 5;
        b = 10;
        c = 7;
        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Task 20: The largest number is " + largest);

        // Task 21
        //Write a Java program that takes a double variable score representing a student’s score on a test. Use a ternary operator to classify the score into letter grades A, B, C, D, or F according to the following scale:
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59
        double score = 85.5;
        String grade = (score >= 90) ? "A"
                : (score >= 80) ? "B"
                : (score >= 70) ? "C"
                : (score >= 60) ? "D"
                : "F";
        System.out.println("Task 21: The grade is " + grade);
    }
}
