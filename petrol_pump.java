package Queue;
import java.util.Scanner;

public class petrol_pump {	   
	    
public static int next(int i,int n){
	      if(i==n-1){
	            return 0;
	        }
	        else { return i+1;}	        
	    }
	    
public static void main(String args[]) {
	    int n;
	    petrolpump [] p;
	      
	      Scanner Sc=new Scanner(System.in);
	      
	      n=Sc.nextInt();
	      
	      p=new petrolpump[n];
	 	      for (int i=0;i<n;i++){
	          p[i]=new petrolpump();
	          p[i].petrol=Sc.nextInt();
	      }
	      for (int i=0;i<n;i++){
	   
	          p[i].distance=Sc.nextInt();
	      }
	      
	      int petrol=0,distance=0,front=0,i=0;
	      
	      
	      while(front<n){
	          petrol+=p[i].petrol;
	          distance=p[i].distance;
	          
	          if(petrol<distance){
	             i++; front=i;
	             petrol=0;distance=0;
	          }
	          else{
	              i=next(i,n);
	              petrol-=distance;
	              if(i==front){
	                  System.out.println(front);
	                  return ;
	              }
	          }
	      }
	      
	      if(front>=n){
	          System.out.println("No Solution");
	      }
	      
 }



}
class petrolpump{
    public int petrol;
    public int distance;   

}
