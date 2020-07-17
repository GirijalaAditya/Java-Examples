import java.util.*; 
import java.lang.*; 
class Student 
{ 
	int rollno; 
    	String name; 
  	public Student(int rollno, String name) 
    	{ 
        		this.rollno = rollno; 
        		this.name = name;  
    	}  
    	public String toString() 
    	{ 
        		return this.rollno + " " + this.name; 
    	} 
} 
class Sortbyroll implements Comparator<Student> 
{ 
	public int compare(Student a, Student b) 
    	{ 
        		return a.rollno - b.rollno; 
    	} 
} 
class Sortbyname implements Comparator<Student> 
{  
    	public int compare(Student a, Student b) 
    	{ 
        		return a.name.compareTo(b.name); 
    	} 
} 
class Compex 
{ 
    	public static void main (String[] args) 
    	{ 
        		ArrayList<Student> al = new ArrayList<Student>(); 
        		al.add(new Student(3,"Aditya")); 
        		al.add(new Student(1,"Shiva")); 
        		al.add(new Student(2,"Rama")); 
  		System.out.println("Unsorted"); 
        		for (int i=0; i<al.size(); i++) 
            		System.out.println(al.get(i)); 
  		
		Collections.sort(al, new Sortbyroll()); 
		System.out.println("\nSorted by rollno"); 
        		for (int i=0; i<al.size(); i++) 
            		System.out.println(al.get(i)); 
  		
		Collections.sort(al, new Sortbyname()); 
  		System.out.println("\nSorted by name"); 
        		for (int i=0; i<al.size(); i++) 
            		System.out.println(al.get(i)); 
    	} 
}