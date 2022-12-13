import java.util.Scanner;
public class Main
{
	
	public static Scanner keyboard=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Welcome to Ziz Password Services :)");

        String userOption = "-1";

        while (!userOption.equals("4"))
        {
        	System.out.println();
            System.out.println("Enter 1 - Password Generator");
            System.out.println("Enter 2 - Password Strength Check");
            System.out.println("Enter 3 - Useful Information");
            System.out.println("Enter 4 - Quit");
            System.out.print("Choice:");
            userOption = keyboard.next();
            switch (userOption) {
                case "1" ->
                {
                	GenerateTempo g=new Generate();
                    g.GenPassword();
                    break;
                }
                case "2" ->
                {
                     PasswardTempo p=new PasswordClass();
                     p.checkPassword();
                     break;
                }
                case "3" ->
                {
                    printUsefulInfo();
                    break;
                }
                case "4" -> 
                {
                	System.out.println("Closing the program bye bye!");
                	keyboard.close();
                	break;
                }
                default ->
                {
                    System.out.println();
                    System.out.println("Kindly select one of the available commands");
                }
            }
        }
    }
	
	private static void printUsefulInfo()
    {
        System.out.println();
        System.out.println("Use a minimum password length of 8 or more characters if permitted");
        System.out.println("Include lowercase and uppercase alphabetic characters, numbers and symbols if permitted");
        System.out.println("Generate passwords randomly where feasible");
        System.out.println("Avoid using the same password twice (e.g., across multiple user accounts and/or software systems)");
        System.out.println("Avoid character repetition, keyboard patterns, dictionary words, letter or number sequences," +
                "\nusernames, relative or pet names, romantic links (current or past) " +
                "and biographical information (e.g., ID numbers, ancestors' names or dates).");
        System.out.println("Avoid using information that the user's colleagues and/or " +
                "acquaintances might know to be associated with the user");
        System.out.println("Do not use passwords which consist wholly of any simple combination of the aforementioned weak components");
    }

}

