
public class ArmstrongNumber {
	public int digitCount(int n) {
		int count=0;
		while(n!=0) {
			n=n/10;
			count++;	
		}
		return count;	
	}
	
	public int findArmstrong(int n) {
		
		int res = 0;
		int x = digitCount(n);
		while(n!=0) {
			
			int r = n%10;
			res =(int) (res+Math.pow(r, x));
			n=n/10;
		}
		return res;
	}
	
}
