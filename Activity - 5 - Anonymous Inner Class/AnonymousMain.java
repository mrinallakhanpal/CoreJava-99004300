import java.util.*;
class StreamPopcorn{
   public void getColor()
{
	System.out.println("Orange");
}
	public void getTaste()
{
	System.out.println("Salty");
}
}


class AnonymousMain{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
StreamPopcorn pop = new StreamPopcorn();
System.out.println("Default Color and taste");
pop.getColor();
pop.getTaste();

System.out.println("Change taste to\n 1. Sweet\n 2. Spicy\n");

int n = sc.nextInt();

if(n == 1)
{
StreamPopcorn pop1 = new StreamPopcorn()
{
public void getTaste()
{
System.out.println("Changing taste from Salty to sweet");
System.out.println("Sweet");
}
};
pop1.getTaste();
}

else 
{
StreamPopcorn pop2 = new StreamPopcorn()
{
public void getTaste()
{
System.out.println("Changing taste from Salty to spicy");
System.out.println("Spicy");
}
};
pop2.getTaste();
}
}
}