package main;

import beans.HashMap;
import beans.ShellSort;
import beans.ShellSortV2;
import beans.Student;

/**
 * @author Pablo Cuesta Morer
 * @date 2023-01-21
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap hashMap = new HashMap();

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

		// create an array of Student objects and add the students to it
		Student[] students = { student1, student2, student3, student4, student5 };

		// sort the array of students by average grade
//		ShellSort shellSort = new ShellSort();
		ShellSortV2 shellSort = new ShellSortV2();
		shellSort.sort(students);

		// generate a list
		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			if (i == 0 && student.getAverageGrade() > 9) {
				System.out.println("(" + student.getId() + ") " + student.getSurname() + ", " + student.getName()
						+ ": average grade[" + student.getAverageGrade() + "], extraordinary prize [Y]");
			} else {
				System.out.println("(" + student.getId() + ") " + student.getSurname() + ", " + student.getName()
						+ ": average grade[" + student.getAverageGrade() + "], extraordinary prize [N]");
			}
		}

	}

}
