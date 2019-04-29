package gradleExp;

public class Exps {
public static void main(String [] args) {
	System.out.println("Main");
	int n1=0, n2= 1, temp=0, n = 5;
	String s = "a";
	
	for(int i=1; i<=n ;i++) {
		
		
		temp = n1 + n2;
		n1=n2;
		n2 = temp;
		System.out.println(temp);
	}
}

public int recur(int a) {
	
	return 1;
}
}
