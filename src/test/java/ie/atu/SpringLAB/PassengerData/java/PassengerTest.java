package ie.atu.SpringLAB.PassengerData.main.java;

import ie.Passenger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    @BeforeEach
   void setup()
    {
    }

@Test
void testTitleMr()
{
    Passenger customer = new Passenger("Mr","Patrick",20,1703021289,1892092);
    assertEquals("Mr", customer.getTitle());
}
@Test
void testTitleMrs() {
    Passenger customer = new Passenger("Mrs","Patrick",20,1703021289, 1892092);
    assertEquals("Mrs", customer.getTitle());
    }

    @Test
    void testTitleMs() {
        Passenger customer = new Passenger("Ms","Patrick",20,1703021289, 1892092);
        assertEquals("Ms", customer.getTitle());
    }

    @Test
    void testTitleFail() {
        Exception Message = assertThrows(IllegalArgumentException.class, () ->  {new Passenger("Ma","Patrick",20,1703021289, 1892092);});
        assertEquals("Entered invalid title.", Message.getMessage());
    }


    @Test
void testNameSuccess(){
        Passenger customer = new Passenger("Mr","Patrick",20,1703021289, 1892092);
       assertEquals("Patrick", customer.getName());
    }
    @Test
    void testNameFailure(){
        Exception Message = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mr","Ah",20,1703021289, 1892092);});
        assertEquals("Entered invalid Name", Message.getMessage());
    }
    @Test
        void testIDSuccess(){
            Passenger customer = new Passenger("Mr","Patrick",20,1703021289, 1892092);
            assertEquals(1703021289, customer.getID());
        }
    @Test
    void testIDFailure(){
        Exception Message = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mr","Patrick",20,1703, 1892092);});
        assertEquals("Invalid ID entered", Message.getMessage());
    }


    @Test
    void testPhoneNumSuccess(){
        Passenger customer = new Passenger("Mr","Patrick",20,1703021289, 1892092);
        assertEquals(1892092, customer.getPhone());
    }
    @Test
    void testPhoneNumFailure(){
        Exception Message = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mr","Patrick",20,1703021289, 12);});
        assertEquals("Invalid Phone Number", Message.getMessage());
    }


    @Test
    void testAgeSuccess(){
        Passenger customer = new Passenger("Mr","Patrick",20,1703021289, 1892092);
        assertEquals(20, customer.getAge());
    }
  @Test
    void testAgeFailure(){
        Exception Message = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mr","Patrick",8,1703021289, 1892092);});
        assertEquals("Applicant is too young to fly", Message.getMessage());
    }


    @AfterEach
    void tearDown() {
    }
}