package examplecode;

public class For {
	public static void main(String[] args)
    {
        // i, sum (interger type variable)
        int i, sum=0;

        // for loop of sum 1 ~ 10
        for (i=1 ; i<=10 ; i++)
        {       System.out.print(i + " ");
                sum += i;
        }
        System.out.println();                // new line
        System.out.println("1 ~ 10 sum : " + sum);
    }
}

