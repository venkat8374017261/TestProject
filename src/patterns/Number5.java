package patterns;

public class Number5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for (int i=1;i<=n;i++)
		
		{
			for(int j=1;j<=5;j++)
			if((i+j)>=(n+1)||((i+j)==6))
				System.out.print(j);
			else
				System.out.print(" ");
			
		System.out.println();
		}
	}
}
