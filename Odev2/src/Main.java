
public class Main {
    public  static  void main(String[] args)
    {
       
       StudentManager studentManager = new StudentManager();
		Student student = new Student("Selma", "Kara", "12324");
		InstructorManager instructorManager = new InstructorManager();
		Instructor instructor = new Instructor( "Seyda", "Tasdan", "sifrembu");
		userManager UserManager = new userManager();
		UserManager.kaydol(student);
		UserManager.girisyap(student);
                UserManager.kaydol(instructor);
		UserManager.girisyap(instructor);
                instructorManager.dersver(instructor);
                studentManager.dersekle(student);
      
    
    }
            
            }
