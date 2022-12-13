
public class PasswordClass extends Conditions implements PasswardTempo
{
	private String password;
	public void checkPassword()
	{
        System.out.print("\nEnter your password:\n");
        password=keyboard.next();
        System.out.println("your password strength is:"+calculateScore()*5+"/20");
	}
	private int calculateScore()
	{
		int score=0;
		for (int i = 0; i < password.length(); i++)
        {   								// ..No need to define and call CharType() method....
            char C = password.charAt(i);
            if ((int) C >= 65 && (int) C <= 90) conditions[0]=true;  //without creating 4 more variables we are using extended conditions array.
            else if ((int) C >= 97 && (int) C <= 122) conditions[1]=true;
            else if ((int) C >= 60 && (int) C <= 71)  conditions[2]=true;
            else conditions[3]=true;
        }
		if(conditions[0]) score++;
		if(conditions[1]) score++;
		if(conditions[2]) score++;
		if(conditions[3]) score++;
		return score;
	}
}
