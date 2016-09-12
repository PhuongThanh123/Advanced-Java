package exercise43HandlingObject;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;

import java.util.List;
import java.util.stream.Collectors;

public class MainCLassHandlingObject {

	public static void main(String[] args) {
		List<Student> listStudent = Arrays.asList(new Student("Phuong Khuat",
				17, 8.0, 7.0), new Student("Hanh Nguyen", 19, 8.5, 7.5),
				new Student("Hoa Huynh", 18, 7.5, 6.5), new Student(
						"Duyen Phan", 20, 7.7, 7.5));

		System.out.println("List of Students:");
		listStudent.stream().forEach(System.out::println);

		// Count student have old >=18
		long countAgeOver18 = listStudent.stream()
				.filter(e -> e.getAge() >= 18).count();
		System.out.println("Number of student have old >=18 : "
				+ countAgeOver18);

		// Count student have FirstName start 'H'
		long countFirsNameH = listStudent.stream()
				.filter(e -> e.getFirstName().startsWith("H")).count();
		System.out.println("Numder of Student have FistName start 'H': "
				+ countFirsNameH);

		// Create list contain name start 'H'
		List<Student> nameStartH = listStudent.stream()
				.filter(e -> e.getFirstName().startsWith("H"))
				.collect(Collectors.toList());
		nameStartH.forEach(System.out::print);

		DoubleSummaryStatistics statisticsStudent = listStudent.stream()
				.mapToDouble((e) -> e.avg()).summaryStatistics();
		System.out.println("Highest Avg Mark in List: "
				+ statisticsStudent.getMax());
		System.out.println("Lowest Avg Mark in List: "
				+ statisticsStudent.getMin());

		System.out.println("Sum of all Ag Mark: " + statisticsStudent.getSum());
		System.out.println("Average of all Avg Marks: "
				+ statisticsStudent.getAverage());
		System.out.println("List of Very Good Students");

		List<Student> listGoodStudent = listStudent.stream()
				.filter(e -> e.avg() >= 8).collect(Collectors.toList());
		listGoodStudent.forEach(System.out::print);
	}

}
