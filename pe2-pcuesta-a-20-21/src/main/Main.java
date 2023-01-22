package main;

import beans.HashMap;
import beans.ShellSortV2;
import beans.Student;

/**
 * @author Pablo Cuesta Morer
 * @date 2023-01-21
 */
public class Main {

	private static final int PRIZE_THRESHOLD = 9;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a HashMap to store the Student objects
		HashMap hashMap = new HashMap();
		// Create Student objects
		Student student1 = new Student("AX1134", "Joseph", "Reiner", 7.6);
		Student student2 = new Student("PI4226", "Lisa", "Belros", 9.4);
		Student student3 = new Student("BF8735", "Edward", "Barding", 8.3);
		Student student4 = new Student("KL9848", "Diana", "Dietrich", 6.7);
		Student student5 = new Student("ZL7608", "Emma", "Herald", 9.2);
		hashMap.put(student1);
		hashMap.put(student2);
		hashMap.put(student3);
		hashMap.put(student4);
		hashMap.put(student5);
		// Create an array of Students
		Student[] students = { student1, student2, student3, student4, student5 };
		// Sort the array of Students DESC
		ShellSortV2<Student> shellSort = new ShellSortV2<>();
		shellSort.sort(students, Student.BY_AVERAGE_GRADE);
		// Iterate through the sorted array of Students and print out information
		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			String getPrize = i == 0 && student.getAverageGrade() > PRIZE_THRESHOLD ? "Y" : "N";
			System.out.println("(" + student.getId() + ") " + student.getSurname() + ", " + student.getName()
					+ ": average grade[" + student.getAverageGrade() + "], extraordinary prize [" + getPrize + "]");
		}

	}

}
