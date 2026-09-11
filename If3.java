package examplecode;

public class If3 {

	public static void main(String[] args)
    {       // n : -100 ~ 100 random number(integer)
            int n = (int)( 200*Math.random() ) - 100;
            System.out.println("Random number : " + n);

            if (n>=100)
                    System.out.println("more than 100");
            else if (n>0)
                    System.out.println("0 ~ 100");
            else if (n>-100)
                    System.out.println("-100 ~ 0 ");
            else
                    System.out.println("less than 100");
    }

}
