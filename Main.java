package ogrenciNotSistemi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course mat=new Course("Matematik","MAT101","MAT");
		Course fizik=new Course("Fizik", "FZK101", "FZK");
		Course kimya=new Course("Kimya", "KMY101", "KMY");
		
		Teacher t1=new Teacher("Enis Hoca", "10000", "MAT");
		Teacher t2=new Teacher("Didem Hoca", "10001", "FZK");
		Teacher t3=new Teacher("Fatih Hoca", "10002", "KMY");
		
		mat.addTeacher(t1);
		fizik.addTeacher(t2);
		kimya.addTeacher(t3);
		
		Student s1=new Student("Ali", "12345", 4, mat, fizik, kimya);
		s1.addBulkExamNote(100, 90, 80);
		s1.isPass();
		Student s2=new Student("Şeyda", "12346", 4, mat, fizik, kimya);
		s2.addBulkExamNote(20, 40, 60);
		s2.isPass();
		Student s3=new Student("Alya", "12347", 4, mat, fizik, kimya);
		s3.addBulkExamNote(70, 60, 30);
		s3.isPass();

	}

}
