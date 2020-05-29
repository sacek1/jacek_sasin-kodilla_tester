import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestLifecycle {

    @BeforeEach
    public void setup() {
        System.out.println("this is set up");
    }

    @Test
    public void myTest() {
        System.out.println("my test");
    }

    @Test
    public void myTest1() {
        System.out.println("my another test");
    }

    @AfterEach
    public void teardown() {
        System.out.println("this is tear down");
    }

}
