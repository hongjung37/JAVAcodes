package examplecode;

public class If1 {

	public static void main(String[] args)
    {
        // n : -5 ~ 5 random number(integer)
        int n = (int)( 11*Math.random() ) - 5;
        System.out.println("Random number : " + n);

        if (n > 0)          System.out.println("positive");
        else                System.out.println("0 or negative");
    }

}
