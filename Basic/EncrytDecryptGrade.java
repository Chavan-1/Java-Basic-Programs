package Basic;

public class EncrytDecryptGrade {
	
	public static void main(String[] args) {
		
		char grade = 'B';
		
		grade = (char) (grade + 8);
		System.out.println("Encrypted grade : "+grade);
		
		grade = (char) (grade - 8);
		System.out.println("Decryted grade : "+grade);
		
	}
}
