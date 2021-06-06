package challenge23;
//AGV
//6-5-2021
import java.util.Locale;
import java.util.Scanner;

public class Challenge23 {
    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);

        System.out.println("Is the car silent when you turn the key? ");
        String response = inputs.nextLine();
        response = response.toLowerCase();

        if(response.equals("yes")||response.equals("y"))
        {
            System.out.println("Are the battery terminals corroded? ");
            response = inputs.nextLine();
            response = response.toLowerCase();
            if(response.equals("yes")||response.equals("y"))
            {
                System.out.println("Clean terminals and try starting again.");
            }
            else
            {
                System.out.println("Replace cables and try again.");
            }

        }
        else
        {
            if(response.equals("yes")||response.equals("y"))
            {
                System.out.println("Does the car make a slicking noise?");
                response = inputs.nextLine();
                response = response.toLowerCase();
                if(response.equals("yes")||response.equals("y"))
                {
                    System.out.println("Check spark plug connections");
                }
            }
            else
            {
                System.out.println("Does the engine start and then die?");
                response = inputs.nextLine();
                response = response.toLowerCase();
                if(response.equals("yes")||response.equals("y"))
                {
                    System.out.println("Does your car have fuel injection?");
                    response = inputs.nextLine();
                    response = response.toLowerCase();
                    if(response.equals("yes")||response.equals("y"))
                    {
                        System.out.println("Get it in for service.");

                    }
                    else
                    {
                        System.out.println("Check to ensure the choke is opening and closing.");
                    }
                }
                else
                {
                    System.out.println("This should not be possible.");
                }

            }
        }
    }
}
