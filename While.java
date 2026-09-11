package examplecode;

public class While {
	public static void main(String[] args)
    {
        int i=0;
        long sum=0;         // sum init.

        while ( i<=100 )    // i<=100
        {       sum += i;   // sum=sum+i
                i++;        // i=i+1
        }
        System.out.println("sum(1 ~ 100) : " + sum);
    }
}
