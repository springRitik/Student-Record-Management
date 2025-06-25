import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */
public class Student {
	
	private int id;
	private String name;
	private int marks;
	
	
	

	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	



	public int getId() {
		return id;
	}


    public void setId(int id) {
		this.id = id;
	}


    public String getName() {
		return name;
	}



    public void setName(String name) {
		this.name = name;
	}




    public int getMarks() {
		return marks;
	}



   
    public void setMarks(int marks) {
		this.marks = marks;
	}





	@Override
	public String toString() {
		return "Student [getId() =" + getId() + ",getName()=" + getName() + ", getMarks()=" + getMarks() + "]";
	}




	

	public static void main(String[] args) {
		ArrayList<Student> studentlist = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		Boolean studentDetial = true;
		
		while(studentDetial) {
			System.out.println("  *** STUDENT RECORD MANAGEMENT SYSTEM ***  ");
			System.out.println(" ** Enter your choice ** ");
			
			
			System.out.println(" 1. for Add Student");
			System.out.println(" 2. for View Student");
			System.out.println(" 3. for Update Student");
			System.out.println(" 4. for Delete Student");
			System.out.println(" 5. for Exist ");
			
			int choice = scanner.nextInt();
			
			if (choice == 5) {
				
				System.out.println(" #EXIST ");
				studentDetial = false;
				break;
				}
			
			switch(choice){
				
				case 1 :
					System.out.println(" Enter id " );
					int ID = scanner.nextInt();
					scanner.nextLine();
					
					System.out.println(" Enter Name " );
					String NAME = scanner.nextLine();
					
					
					
					System.out.println(" Enter Marks " );
					int MARKS = scanner.nextInt();
					
					
					Student student = new Student (ID,NAME,MARKS);
					studentlist.add(student);
					System.out.println("New Student Added");
					break;
					
				case 2 :
					if (studentlist.isEmpty()) {
						System.out.println(" ERROR : students not found ");
					}else {
						System.out.println(" STUDENTS LIST : ");
					
					
				for (Student st : studentlist) {
					System.out.println(st);
				}
					}
				break;
					
	  
			case 3 : 
				System.out.println( "Enter Student Id" );
            int updateId = 	scanner.nextInt();	
            
            boolean found = false;
            
			for (Student st : studentlist) {
				
				if( st.getId() == updateId) {
					  scanner.nextLine();
					  
					  
					  System.out.println( "Enter new Name");
					String newName = scanner.nextLine();
					
					System.out.println( "Enter new Marks");
					int newMarks = scanner.nextInt();
					
					st.setName(newName);
					st.setMarks(newMarks);
					System.out.println(" Student Updated Sucessfully ");
					
					found = true;
					break;
				}
				}
		      
			if (!found) {
				System.out.println("Student With id " +updateId+ "not found");
			}
           break;
		
	
			case 4 :
				System.out.println(" Enter Student Id to DELETE ");
				int deleteId = scanner.nextInt();
				
				boolean found1 = false;
				
				for(Student st : studentlist ) {
					if(st.getId() == deleteId) {
						studentlist.remove(st);
						
						System.out.println("Student deleted! ");
						
						found1 = true;
						break;
					}
				}
				
				if(!found1) {
					
					System.out.println("Student With id" +deleteId+ "not found");
				}
				break;
           
           default :
        	   System.out.println("Something wrong");
           break;
           
           
			}
			
		
}
		
		scanner.close();
		
	}
}