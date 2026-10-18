

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class RucksackTest
{
   


    @Test
    public void testDrunter()
    {
        Rucksack rucksack1;
        rucksack1 = new Rucksack("Blau", -13, false);
        // Fehlermeldung
        rucksack1.printRucksack();
        assertEquals(1, rucksack1.getVolumen());
    }

    @Test
    public void testOK()
    {
        Rucksack rucksack2;
        rucksack2 = new Rucksack("Blau", 13, false);   
        rucksack2.printRucksack();
        assertEquals(13, rucksack2.getVolumen());
    }

    @Test
    public void testDrueber()
    {
        Rucksack rucksack3;
        rucksack3 = new Rucksack("Blau", 153, false);   
        rucksack3.printRucksack();
        assertEquals(1, rucksack3.getVolumen());
    }

}