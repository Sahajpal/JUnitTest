import static org.junit.Assert.assertEquals;

public class testAddNumbers {
    @org.junit.jupiter.api.Test
    void addNumbers() {
        jUnitTesting addNum = new jUnitTesting();
        int result = addNum.addNumbers(50, 10);
        assertEquals (60,result);
        result = addNum.addNumbers(15, 20);
        assertEquals (30, result);
    }
}