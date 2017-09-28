package TestPackage;

import com.mycompany.ct417assignment1.Student;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**@author 14359691 */
public class MyJUnitTest {
    
    public MyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void studentUsernameTest() {
        Student student1 = new Student("Tom", 20, "21/10/96", "12345678");
        String expected = "Tom"+20;
        String actual = student1.getUsername();
        assertEquals(expected, actual);
    }
}
