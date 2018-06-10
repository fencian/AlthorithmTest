import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class  PartitionTest {
    @BeforeClass
    public static void beforeclass(){

        System.out.println("beforeclass");
    }
    @Test
    public void hello(){
        System.out.println("sss");
        String str = "hello";
        assertEquals("hello",str);
    }

    @Test
    public void helloworld(){
        System.out.println("helloworld");
        String str = "helloworld";
        assertEquals("helloworld",str);
    }
    @AfterClass
    public static void afterclass(){

        System.out.println("afterclass");
    }
}