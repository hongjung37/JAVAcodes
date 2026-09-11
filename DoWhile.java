package examplecode;

public class DoWhile {

	public static void main(String[] args)
    {
        int i=0, n;
        long sum=0;
        // n : 10 ~ 15 random number(integer)
        n = (int)( 6*Math.random() ) + 10;
        System.out.println("Random number : " + n);
        do {
            sum += i;
            i++;
        }
        while (i<=n);
        System.out.println("\n i    : " + i);
        System.out.println(" 1 ~ n sum : " + sum);
    }

}
