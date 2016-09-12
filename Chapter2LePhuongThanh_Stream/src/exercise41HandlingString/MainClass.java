package exercise41HandlingString;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;




public class MainClass {
	public static void main(String args[]) {
		List <String> listName = Arrays.asList( "Join", "Linsa", "Andy", "Anna", "Obama",
						"Happy", "Tom", "Molisa", "Trump","Happy", "Jackson", "Smith","Happy","Jerry", "" );
		listName.stream().forEach(System.out::println);
		
		//Count element is length >=5
		long countElementEmpty=listName.stream().filter(e->e.isEmpty()).count();
		System.out.println("Total element is empty: "+countElementEmpty);
		
		//Count element have length >=5
		long countName5=listName.stream().filter(n -> n.length()>=5).count();
		System.out.println("Total element have length >=5 : "+countName5);
		
		//Count element startWith "A"
		long countNameA=listName.stream().filter(e->e.startsWith("A")).count();
		System.out.println("Total element start word A: "+countNameA);
		
		//Count exactly element is "Happy"
		long countNameHappy=listName.stream().filter(e->e.equalsIgnoreCase("Happy")).count();
		System.out.println("Total element is Happy: "+countNameHappy);
		
		//Create List Name 2 with element is not empty
		List<String> listName2=listName.stream().filter(e->!e.isEmpty()).collect(Collectors.toList());
		System.out.println("ListName2: "+listName2);
		
		//Create list name 3 with elements have length >=3 and <=6
		List<String> listName3=listName.stream().filter(e->(e.length()>=3 && e.length()<= 6)).collect(Collectors.toList());
		String list3Join=listName3.stream().collect(Collectors.joining(", "));
		
		System.out.println("List Name 3: "+list3Join);
		//Create list 4 contain list name concat happy
		List<String> listName4=listName.stream().map(e->e.concat(" Happy")).collect(Collectors.toList());
		String listNam4Join=listName4.stream().collect(Collectors.joining(", "));

		System.out.println("List Name 3: "+listNam4Join);
	}
}
