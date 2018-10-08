//creating a class 
class Movie{
	String title;
	String genre;
	int rating;
	
	//create a method
	void playIt(){
	System.out.println("Playing the movie ");
	}
}

public class MovieTestDrive{
	public static void main(String[] args){
		//create a object of a class
		Movie oneMovie = new Movie();
		oneMovie.title="Gone with the stock";
		oneMovie.genre="Tragic";
		oneMovie.rating=-2;
		
		Movie twoMovie = new Movie();
		twoMovie.title="Lost in cubicle space";
		twoMovie.genre="Comedy";
		twoMovie.rating=5;
		twoMovie.playIt();
		
		Movie threeMovie = new Movie();
		threeMovie.title="Byte club";
		threeMovie.genre="Tragic but ultimately uplifting";
		threeMovie.rating=127;
	}
}