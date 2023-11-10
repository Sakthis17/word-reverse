public class wordreversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String d[]=s.split(" ");
		for(int i=d.length-1;i>=0;i--)
		{
			System.out.print(d[i]+" ");
		}
		

	}

} 

INPUT: 
HII HELLO WELCOME

OUTPUT:
WELCOME HELLO HII