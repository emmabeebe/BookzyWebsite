package com.bookzy.bookzy;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookzyApplicationTests {

    private BookzyApplication ticketer = new BookzyApplication();
    
    @Test
    public void testRandomNumber() {
   	 assertTrue(ticketer.getRandomTicketNumber()>1000&&ticketer.getRandomTicketNumber()<9999);
    }

}
