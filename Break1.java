package examplecode;

public class Break1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,n,sum=0;
		while(true) {
			n=(int)(11*Math.random())+10;
			System.out.print(n+" ");
			if(n==15) 
				break;
			sum +=n;
		}
		System.out.println("\nsum:" +sum);
	}

}
