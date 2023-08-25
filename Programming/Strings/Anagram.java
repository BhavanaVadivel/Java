import java.util.*;
public class Anagram {
	

	    static boolean isAnagram(String a, String b) {
	            if(a.length()!=b.length())
	        return false;
	    int suma=0;
	    int sumb=0;
	    a=a.toLowerCase();
	    b=b.toLowerCase();
	    char[] arra=a.toCharArray();
	    char[] arrb=b.toCharArray();      
	    for(int i=0;i<a.length();i++)
	    {
	        suma+=arra[i];
	        sumb+=arrb[i];
	    }
	    if(suma==sumb)
	        return true;


	    return false;
	}
	    

	    public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	
}
