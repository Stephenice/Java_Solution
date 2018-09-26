public class PhraseOMatric{

public static void main(String[] args){
	
	//creating Array of 3 set of words
	String [] wordListOne ={"24/7","empowerment" ,"motivation" ,"B-to-B" ,"win-win" ,"free"};
	String [] wordListTwo ={"focused","mission" ,"shared" ,"valued" ,"oriented" ,"targeted"};
	String [] wordListThree ={"solution","mindshare" ,"architecture","outside-the-bus" ,"space" ,"portal"};
	
	//find out how many words are in each list
	int oneLength= wordListOne.length;
	int twoLength= wordListTwo.length;
	int threeLength = wordListThree.length;
	
	//generate three random words
	int ran1= (int) (Math.random () * oneLength);
	int ran2=(int) (Math.random()* twoLength);
	int ran3=(int ) (Math.random() * threeLength);
	
	System.out.println(Math.random+""+ ran1+" "+ran2+" "+ran3);

    //build new phase
    String phase= wordListOne[ran1] +" "+wordListTwo[ran2]+" "+wordListThree[ran3];
    // print out
    System.out.print("What we want is "+ phase);	
	
}
}