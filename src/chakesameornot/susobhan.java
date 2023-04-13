package chakesameornot;
import java.util.*;
public class susobhan {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int j =0;j<t;j++){
		    
		    String sum1 = "";
		    String sum2 = "";
		    int n = sc.nextInt();//6
		    String s = sc.next();
		    
		    
		    for(int m =0;m<n/2;m++){
		        char s1 = s.charAt(m);
		        sum1 += s1; 
		    }
		    
		     for(int l =n/2;l<n;l++){
		       char s2 = s.charAt(l);
		        sum2 += s2; 
		    }
		    
		   
		    if(sum1.equals(sum2)){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		    
		    
		    
		}
	}

}
