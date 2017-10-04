
import com.mycompany.ct417assignment1.Module;
import com.mycompany.ct417assignment1.Programme;
import com.mycompany.ct417assignment1.Student;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**@author 14359691 */
public class TestDriver {

    public static void main(String args[]){
        //create two arraylist with generics of the Student class
        ArrayList<Student> studentList = new ArrayList<Student>();
        ArrayList<Student> studentList2 = new ArrayList<Student>();

        ArrayList<Student> allStudents = new ArrayList<Student>();  //contains all students
        
        //creating four instances of type student and adding first two to the studentList...
        Student student1 = new Student("Tom", 30, "21/10/86", "12345678");
        studentList.add(student1);
        Student student2 = new Student("Jerry", 31, "21/10/85", "12345679");
        studentList.add(student2);
        
        Student student3 = new Student("Simon", 20, "21/10/96", "12345680");
        studentList2.add(student3);
        Student student4 = new Student("Garfunkel", 21, "21/10/95", "12345681");
        studentList2.add(student4);
        
        //add all students to an arrayList containing all
        allStudents.add(student1);
        allStudents.add(student2);
        allStudents.add(student3);
        allStudents.add(student4);
        
        // creating two modules... sending a different list of students to both
        Module mod1 = new Module("Arts Stuff","BS101",studentList);
        Module mod2 = new Module("Time, how to waste it","BS102",studentList2);
        
        ArrayList<Module> modList = new ArrayList<Module>();
        modList.add(mod1);
        modList.add(mod2);
        
        Date start = new Date(118,9,5);
        Date end = new Date(122,5,17);

        Programme prog1 = new Programme("Arts with time",modList,start,end);
        //String courseName, ArrayList modules, Date startDate, Date endDate

        
    //A list of all the students, their assigned modules and the course they are registered for should be printed to the console. 
        ArrayList<Module> modules = prog1.getModules();

        System.out.println("Program name: "+prog1.getCourseName());
        for (Module m : modules) {
            System.out.println("  Module ID: "+m.getCourseID()+"\n  Module name: "+m.getModuleName());
            System.out.println("  Students taking course: "+m.getStudentList()+"\n");
        }

    }
    
}
