package examplecode;

public class If2 {

	public static void main(String[] args)
    {
        // n : 0 ~ 10 random number(integer)
        int n = (int)( 11*Math.random() );
        System.out.println("random number : " + n);

        if (n<=5)
        {       System.out.println("n : " + n);
                System.out.println("n*n : " + n*n);
        }
        System.out.println();
        System.out.println("end");
    }

}
