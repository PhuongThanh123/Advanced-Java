package Exercise124StorePet;

public class MainClassPetManger {

	public static void main(String[] args) {
		PetManger<Dog> mangerDog=new PetManger<Dog>();
		PetManger<Cat> mangerCat=new PetManger<Cat>();
		
		System.out.println("Enter name of Dog: ");
		String nameDog="Husky, poo, alatca";
		String DogName[]=nameDog.split(",");
		
		for(String Dogname: DogName){
			mangerDog.getPest().add(new Dog(Dogname));
		}
		
		
		if(mangerDog==null && !mangerDog.getPest().isEmpty()){
			for(int i=0;i<mangerDog.getPest().size();i++){
				//dua vao ds chung
			}
		}
		
	}

}
