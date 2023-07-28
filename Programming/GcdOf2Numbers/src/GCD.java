
public class GCD {
	public static int findTheGCD(int m,int n) {
		while(n!=0) {
			int rem = m%n;
			m=n;
			n=rem;
		}
		return m;
	}
}
