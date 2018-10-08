
//creating a class dog
class Dog{
	int size;
	String breed;
	String name;
	
	void bark(){
		System.out.println("Ruff! Ruff!");
	}
} 

//main class 
class DogTestDrive{
public static void main (String [] args){
//making a Dog object	
	Dog dogObject = new Dog();
	dogObject.size=40;
	dogObject.breed = "bull dog";
	dogObject.name = "tom";
	dogObject.bark();
}
}







