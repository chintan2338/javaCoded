import java.util.Scanner; 
import java.util.*;


class Guesser
{
    int guessNum;

    int guessingNumber()
    {   
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser! kindly guess the number");
        guessNum = scan.nextInt();
        return guessNum;
    }
}
class Player
{
    int guessNum;
    int guessingNumber()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player! Kindly guess the number");
        guessNum = scan.nextInt();
        return guessNum;
    }
}
class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser()
    {
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNumber();
    }
    void collectNumFromPlayer()
    {
        Player p1 = new Player();//object create
        Player p2 = new Player();//object create
        Player p3 = new Player();//object create 
        numFromPlayer1=p1.guessingNumber();//calling 
        numFromPlayer2=p2.guessingNumber();//calling 
        numFromPlayer3=p3.guessingNumber();//calling 
    }
    void compare()
    {
        if(numFromGuesser==numFromPlayer1)
        {
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
            {
                System.out.println("sab ney sahi ansewer diya! sab winner hain bhai");
            }
            else if(numFromGuesser==numFromPlayer2)
            {
                System.out.println("Player 1 aur Player 2 jeet gaye");
            }
            else if(numFromGuesser==numFromPlayer3)
            {
                System.out.println("Player 1 aur Player 3 jeet gaye");
            }
            else 
            {
                System.out.println("Player1 won the game");
            }
        }
        
        else if(numFromGuesser==numFromPlayer2)
        {
            if(numFromGuesser==numFromPlayer3)
            {
                System.out.println("Player 2 aur Player 3 jeet gaye");
            }
            else
            {
                System.out.println("Player2 won the game");
            }
        }
        else if(numFromGuesser==numFromPlayer3)
        {
            System.out.println("Player3 won the game");
        }
        else
        {
            System.out.println("sab ke sab galat hai.Aap game har gaye hai");
        }
    }
}

public class LaunchGame
{
    public static void main(String [] args)
    {
        System.out.println("Game started");
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();
    }
}