package day02.misc;

public class App {

	public static void main(String[] args) {
		Accademy accademy = new Accademy();
		accademy.setName("Freshworks Software Accademy");
		accademy.setId(1234);
		accademy.setCode("FSSA");

		Student student1 = new Student();
		student1.setName("Boobalan");
		student1.setEmail("rboomibalan459@gmail.com");
		student1.setId(5678);
		System.out.println("Instence: " + Student.count);

		Student student2 = new Student();
		student2.setName("Ragunath");
		student2.setEmail("ragunath123@gmail.com");
		student2.setId(7891);
		System.out.println("Instence: " + Student.count);

	}

}
