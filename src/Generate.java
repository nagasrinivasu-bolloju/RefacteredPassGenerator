
public class Generate extends Conditions implements GenerateTempo
{
	public static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
	public static final String NUMBERS = "1234567890";
	public static final String SYMBOLS = "!@#$%^&*()-_=+\\/~?";
	private StringBuilder str=new StringBuilder("");
	public void GenPassword()
	{
		boolean correctParams;
		System.out.println();
        System.out.println("Hello, welcome to the Password Generator :) answer"
                + " the following questions by Yes or No \n");

        do {
        	correctParams=false;
            System.out.println("Do you want Lowercase letters \"abcd...\" to be used? ");
            String Input = keyboard.next();
            if (Input.equalsIgnoreCase("yes")) { conditions[0] = true;}
            System.out.println("Do you want Uppercase letters \"ABCD...\" to be used? ");
            Input = keyboard.next();
            if (Input.equalsIgnoreCase("yes")) conditions[1] = true;
            System.out.println("Do you want Numbers \"1234...\" to be used? ");
            Input = keyboard.next();
            if (Input.equalsIgnoreCase("yes")) conditions[2] = true;
            System.out.println("Do you want Symbols \"!@#$...\" to be used? ");
            Input = keyboard.next();
            if (Input.equalsIgnoreCase("yes")) conditions[3] = true;
            
            if (conditions[0]==false && !conditions[1] && !conditions[2] && !conditions[3])
            {
                System.out.println("You have selected no characters to generate your " +
                        "password at least one of your answers should be Yes");
                correctParams = true;
            }
        }while(correctParams==true);
        
        System.out.println("\n\nGreat! Now enter the length of the password");
        int length = keyboard.nextInt();
        System.out.println("\n\nGenerated password is:"+getRandPassword(length));
	}
	public String getRandPassword(int length)
	{
		if (conditions[0]) str.append(LOWERCASE_LETTERS);
		if (conditions[1]) str.append(UPPERCASE_LETTERS);
		if (conditions[2]) str.append(NUMBERS);
		if (conditions[3]) str.append(SYMBOLS);
		
		StringBuilder pool=new StringBuilder("");
        int range =str.length();
        for (int i = 0; i <length; i++)
        {
            int index = (int) (Math.random() * range);
            pool.append(str.charAt(index));
        }
        
		return pool.toString();
	}
}
