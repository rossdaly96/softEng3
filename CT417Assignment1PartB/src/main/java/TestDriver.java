
import com.mycompany.ct417assignment1.Module;
import com.mycompany.ct417assignment1.Programme;
import com.mycompany.ct417assignment1.Student;
import static java.lang.String.format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.joda.time.DateTime;
import java.util.ArrayList;
import java.util.Date;

/**@author 14359691 */
public class TestDriver {

    public static void main(String args[]) throws ParseException{
        //create two arraylist with generics of the Student class
        ArrayList<Student> studentList = new ArrayList<Student>();
        ArrayList<Student> studentList2 = new ArrayList<Student>();

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
        ArrayList<Student> allStudents = new ArrayList<Student>();  //contains all students
        allStudents.add(student1);
        allStudents.add(student2);
        allStudents.add(student3);
        allStudents.add(student4);
        
        // creating three modules... sending a different list of students for two and one with all
        Module mod1 = new Module("Arts Stuff","BS101",allStudents);
        Module mod2 = new Module("Time, how to waste it","BS102",studentList);
        Module mod3 = new Module("Dead people from history","BS103",studentList2);
        
        ArrayList<Module> modList = new ArrayList<Module>();
        modList.add(mod1);
        modList.add(mod2);
        modList.add(mod3);
        
        //creating the two joda DateTimes to represent the start and end dates
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String srt="5/9/2018";
        String ed="17/5/2022";
        Date d1=format.parse(srt);
        Date d2=format.parse(ed);
        DateTime start = new DateTime(d1);
        DateTime end = new DateTime(d2);

        Programme prog1 = new Programme("Arts with time",modList,start,end);

        ArrayList<Module> modules = prog1.getModules();

        System.out.println("Program name: "+prog1.getCourseName());
        for (Module m : modules) {
            System.out.println("  Module ID: "+m.getCourseID()+"\n  Module name: "+m.getModuleName());
            System.out.println("  Students taking course: "+m.getStudentList()+"\n");
        }
    }
    
}
