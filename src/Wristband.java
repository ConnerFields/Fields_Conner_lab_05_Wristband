//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Wristband
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        final int WRISTBAND_AGE =21; //Set wristband age
        int age = 0; //initialize User Age
        System.out.println("Please enter your age"); //prompt user for age

        if(in.hasNextInt()); //User enters age
        {
            age = in.nextInt();
        }
        if(age >= WRISTBAND_AGE)
        {
            System.out.println("Please grab a wirstband"); //prompts user to grab a wristband
        }

    }
}