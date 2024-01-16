import java.util.Scanner;
class Gusser
{
	int guessNum;
	public int guessNum()
	{
		System.out.println("Gusser please guss the number:");
		Scanner scan = new Scanner(System.in);
		guessNum=scan.nextInt();
		return guessNum;
	}
}
class Player
{
	int guessNum;
	public int guessNum()
	{
		System.out.println("player guess the number");
		Scanner scan = new Scanner(System.in);
		guessNum=scan.nextInt();
		return guessNum;
	}
}
class Umpire
{
	int numFromGusser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	public void getNumFromGusser()
	{
		Gusser g=new Gusser();
		numFromGusser=g.guessNum();
	}
	public void getNumFromPlayer()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNum();
		numFromPlayer2=p2.guessNum();
		numFromPlayer3=p3.guessNum();
	}
	public void compare()
	{
		 if(numFromGusser==numFromPlayer1)
	        {
	            if(numFromGusser==numFromPlayer2 && numFromGusser==numFromPlayer3)
	            {
	                System.out.println("sab ney sahi ansewer diya! sab winner hain bhai");
	            }
	            else if(numFromGusser==numFromPlayer2)
	            {
	                System.out.println("Player 1 aur Player 2 jeet gaye");
	            }
	            else if(numFromGusser==numFromPlayer3)
	            {
	                System.out.println("Player 1 aur Player 3 jeet gaye");
	            }
	            else 
	            {
	                System.out.println("Player1 won the game");
	            }
	        }
	        
	        else if(numFromGusser==numFromPlayer2)
	        {
	            if(numFromGusser==numFromPlayer3)
	            {
	                System.out.println("Player 2 aur Player 3 jeet gaye");
	            }
	            else
	            {
	                System.out.println("Player2 won the game");
	            }
	        }
	        else if(numFromGusser==numFromPlayer3)
	        {
	            System.out.println("Player3 won the game");
	        }
	        else
	        {
	            System.out.println("sab ke sab galat hai.Aap game har gaye hai");
	        }
	}
}
public class LaunchGameexp
{
	public static void main(String []args)
	{
		System.out.println("Game ! started");
		Umpire u=new Umpire();
		u.getNumFromGusser();
		u.getNumFromPlayer();
		u.compare();
	}
}