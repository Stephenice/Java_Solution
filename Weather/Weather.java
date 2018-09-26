import java.util.*;
public class Weather{
	
	public static void main(String[] args){
	Scanner Input= new Scanner(System.in);
	String [] days={"Monday","Tuesday","Wednessday","Thurday","Friday","Saturday","Sunday"};
	int [] temp= new int[7];
	
	System.out.println("------------ Days' temperatures ---------------");
	int sum=0;
	for(int i=0; i<temp.length; i++){
		System.out.print(days[i]+ " high temp: ");
		temp[i]= Input.nextInt();
		sum += temp[i];
	}
	
	double AverageTemp = (double) sum/ temp.length;
	System.out.println(" ");
	System.out.printf("Average temp =  %.2f\n", AverageTemp );
	
	int AbvAvg=0;
	for(int j=0; j<temp.length;j++){
	if(temp[j]> AverageTemp){
		AbvAvg++; 
		System.out.println(days[j] + " is average");
	}
	}
	System.out.println(" ");
	
	if (AbvAvg > 1){
			System.out.println(AbvAvg +" days were above average.");
	}else if(AbvAvg==1){
		String word= "day";
		System.out.println(AbvAvg +" "+ word +" is above average.");
	}else{
		System.out.println(" ");
	}
	
	}
	
}