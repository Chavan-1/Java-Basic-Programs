package Basic;

public class CompareObjects {
	
public static void main(String[] args) {
	    
	    String s1 = "Java";
	    String s2 = new String("Java");
	    
        System.out.println(s1.equals(s2));  //Compares obj reference
		System.out.println(s1==s2);         //Compares content
		
		//When object are equal, hashCode is equal
		//When we override the equals() method, it is necessary to override the hashCode() method, also.
		
	}
}

/******************************************************************************

Java Object class is the super class of all the Java classes. 
All Java classes implements the Object class by default. 
The Java Object class provides the two important methods to compare two objects in Java, 
i.e. equals() and hashCode() method.

The equals() method of the Object class compare the equality of two objects. 
The two objects will be equal if they share the same memory address.
In Java, the == operator compares that two references are identical or not. Whereas the equals() method compares two objects.


*******************************************************************************/