import org.junit.Test;

import static org.junit.Assert.assertEquals;

class helloworldTest {



    @Test
    void add() {
        assertEquals(3,add(1,2));
        assertEquals(8,add(3,5));
    }
}