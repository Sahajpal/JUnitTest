import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testAddStrings {
    @Test
    void addStrings() {
        jUnitTesting addString = new jUnitTesting();
        String result = addString.addStrings("My","Man");
        assertEquals("MyMan",result);
        result = addString.addStrings("Your","Woman");
        assertEquals("YourWoman",result);
        result = addString.addStrings("Our","God");
        assertEquals("OurGod",result);
    }
}