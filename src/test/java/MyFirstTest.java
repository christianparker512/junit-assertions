
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;


public class MyFirstTest{
        @Test

        public void testIfNamesAreEqual(){
            String name = "Jane";
            String input = "jane";
            assertEquals(name, input);
        }
        @Test
        public void testIfNumbersAreEqual(){
            int myNumber = 4;
            int userInput = 5;

            assertEquals(myNumber, userInput);
        }
        @Test
        public void testIfChangeIsCorrect() {
            Double price = 10.0;
            Double discount = 4.5;

            assertEquals(5.5, price - discount, 0);
            assertEquals(5.1, price - discount, 0.5);
            assertNotEquals(4.9, price - discount, 0.5);
        }
        @Test
        public void testIfObjectsAreDifferent() {
            Object dog = new Object();
            Object sheep = new Object();
            Object clonedSheep = sheep;

            assertNotSame(sheep, dog);
            assertSame(sheep, clonedSheep);
        }
        @Test
        public void testIfArrayEquals() {
            char[] expected = {'J','u','n','i','t'};
            char[] actual = "Junit".toCharArray();

            assertArrayEquals(expected, actual);
        }
        @Test
        public void testIfGreaterOrLesserThanWorks() {

            boolean learningTDD = true;

            assertTrue(learningTDD);
            assertTrue("5 is greater than 4", 5 > 4);
            assertFalse("5 is not greater than 6", 5 > 6);
        }
        @Test
        public void Codeup (){
            String name = "Codeup";
            String company = "Codeup";
            assertEquals(name, company);
        }
        @Test
        public void NotCodeup(){
            String name = "Codeup";
            String company = "CodeNext";
            assertNotEquals(name,company);
        }
        @Test
        public void NotTheSameArray(){
            List<String> languages = new ArrayList<>();
            List<String> moreLanguages = new ArrayList<>();
            assertNotSame(languages, moreLanguages);
        }
        @Test
        public void SpellingOfLanguages(){
            String language = "PHP";
            language.contains("H");
            language.contains("J");
//
            assertTrue(language.contains("H"));
//            assertFalse(language.contains("J"));
        }

    }

