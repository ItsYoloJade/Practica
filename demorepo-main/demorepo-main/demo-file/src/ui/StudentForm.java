package ui;

import java.util.Date;
import java.util.Scanner;

import dol.Student;
import misc.DateUtil;

public class StudentForm  {
	Scanner scan;
	Student student;
	
	public StudentForm(Scanner scanner) {
		scan = scanner;
	}
	
	public StudentForm(Student s) {
		student = s;
	}

	
	
	
	public Student catchStudent() {
		Student s = new Student();
		
		System.out.println("Numero de carnet: ");
		s.setNumCarnet(scan.next());

		Date Inscriptiondate = DateUtil.catchValidDate(scan, "Fecha de inscripcion (dd/MM/yyyy): ");
		
		
			
		return s;
	}
	
	public void showStudent() {
		
		System.out.printf("Numero de carnet: %s\n", student.getNumCarnet());
		
		
		System.out.printf("Fecha de inscripcion: %s\n", DateUtil.dateToString(((Student) student).getInscriptiondate(), "dd/MM/yyyy"));


			
	}

}
