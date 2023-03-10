// 1. import java scanner
import java.util.Scanner;
public class TimesTable {
    public static void main(String[] args) {
        // 2. create scanner object
        Scanner reader= new Scanner (System.in);
        // 3. ask user to enter any number (int timesTable variable)
        System.out.println("Display Time Table. What number would you like? Enter a number :");
        int userNumber = reader.nextInt(); // read user input
        // 4. use for loops to display the times table from i=1 to i <= 12
        for (int i = 1; i < 13; i++)
        {// 5. inside this loop print the timesTable * i and also print the result
            System.out.println(  userNumber + "x" + i + "=" + i* userNumber); // display userInput x i = i*userNumber
        }




    }
}
