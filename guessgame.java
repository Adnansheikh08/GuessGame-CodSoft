import java.util.Scanner;
import java.util.Random;

class guessgame
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        /*int ar[]={21,66,34,22,14,13,77,97,65,65,76,33,24,65,42,76,56,85,91,67};
        System.out.println("Choose any Number Between 1 to 20");
        int n=sc.nextInt();
        int ran=ar[n];//*Our Random Number*/
        Random r=new Random();
        int ran=r.nextInt(100);
        System.out.println("Your Random Number Has Been Set");
        System.out.println("Guess the Number between 1 to 100");
        System.out.println("You have 10 chances");
        int c=10;
        boolean g=true;
        char s;
        while(g&&c>=1)
        {
            int guess=sc.nextInt();
            {
                if(guess>ran)
                {
                    System.out.println("Too Far");
                    c--;
                    System.out.println("Chance Left="+c);
                }
                if(guess<ran)
                {
                    System.out.println("Too Close");
                    c--;
                    System.out.println("Chance Left="+c);
                }
                if(guess==ran)
                {
                    System.out.println("Congrats You Won");
                    System.out.println("Your Score "+(c*10));
                    
                    break;
                }
                if(c==0)
                {
                    System.out.println("You Lose");
                    break;             
                }
                if(c<=2)
                {
                    System.out.println("Your Credit is Low");
                    System.out.println("Wanna Reset the game Y/N");
                    s=sc.next().charAt(0);
                    System.out.println("Guess then");
                    if(s=='Y'||s=='y')
                    { 
                    c=10;
                    System.out.println("credit has been reset to 10");
                    continue;
                    }
                    else if(s=='N'||s=='n')
                    {
                        continue;
                    }
                    }
                }
            }
            }
        }
