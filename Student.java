package ogrenciNotSistemi;

public class Student {
	String name,stuNo;
	int classes;
	Course mat;
	Course fizik;
	Course kimya;
	double avarage;
	boolean isPass;
	
	public Student (String name,String stuNo,int classes,Course mat,Course fizik,Course kimya){
		this.name=name;
		this.stuNo=stuNo;
		this.classes=classes;
		this.mat=mat;
		this.fizik=fizik;
		this.kimya=kimya;
		calcAverage();
		this.avarage=avarage;
		this.isPass=false;
	}
	public void addBulkExamNote(int mat,int fizik,int kimya){
		if(mat>=0 && mat<=100) {
			this.mat.note=mat;
		}
		if(fizik>=0 && fizik<=100) {
			this.fizik.note=fizik;
		}
		if(kimya>=0 && kimya<=100) {
			this.kimya.note=kimya;
		}
		
	}
	
	public void isPass() {
		if(this.fizik.note==0 || this.mat.note==0||this.kimya.note==0) {
			System.out.println("Sınav notu girilmemiş");
		}
		else {
			this.isPass=isCheckPass();
			printNote();
			System.out.println("Ortalama: "+this.avarage);
			if(this.isPass) {
				System.out.println("Sınıfı geçti.");
			}else {
				System.out.println("Sınıfta kaldı. " );
			}
		}
	}
	
	public void calcAverage() {
		this.avarage=(this.fizik.note+this.mat.note+this.kimya.note)/3;
	}
	
	public boolean isCheckPass() {
		calcAverage();
		return this.avarage>50;
	}
	
	public void printNote() {
		System.out.println("=========================================================");
		System.out.println("Öğrenci: "+this.name+" matematik notu: "+this.mat.note+
				" fizik notu: "+this.fizik.note+" kimya notu: "+this.kimya.note);
	}
		
	
}
