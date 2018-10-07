import java.util.*;
public class WeatherArraylist{

public static void main(String[] args){
Scanner Input=new Scanner(System.in);

ArrayList<String> weatherDay= new ArrayList<String>();
	weatherDay.add("Monday");
	weatherDay.add("Tuesday");
	weatherDay.add("Wednessday");
	weatherDay.add("Thurday");
	weatherDay.add("Friday");
	weatherDay.add("Saturday");
	weatherDay.add("Sunday");
	int days= weatherDay.size();
	System.out.println("------------ Days' temperatures ---------------");
	ArrayList<Integer> temp =new ArrayList<Integer>();
		
		
		int sum=0;
	for(int i=0; i<days; i++){
	//	String value=weatherDay.get(i);
		System.out.print(weatherDay.get(i) + " high temp: ");
		int j= Input.nextInt();
		temp.add(i,j);
		//= Input.nextInt();
		
		sum += temp.get(i);
	}
	
	
	double AverageTemp = (double) sum/ days;
	System.out.println(" ");
	System.out.printf("Average temp =  %.2f\n", AverageTemp );
	
	int AbvAvg=0;
	for(int j=0; j<days;j++){
	if(temp.get(j)> AverageTemp){
		AbvAvg++; 
		System.out.println(weatherDay.get(j) + " is above average");
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


}}