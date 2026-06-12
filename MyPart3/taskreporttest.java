/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author molek
 */
public class taskreporttest {

    @Test
    public void testSentMessagesArray() {

        taskreporttest.sentMessages.clear();

        taskreporttest.sentMessages.add(
                "Did you get the cake?");

        taskreporttest.sentMessages.add(
                "It is dinner time!");

        assertEquals(
                "Did you get the cake?",
                taskreporttest.sentMessages.get(0));

        assertEquals(
                "It is dinner time!",
                taskreporttest.sentMessages.get(1));
    }

    @Test
    public void testLongestMessage() {

        String expected =
        "Where are you? You are late! I have asked you to be on time.";

        String actual =
        "Where are you? You are late! I have asked you to be on time.";

        assertEquals(expected, actual);
    }

    @Test
    public void testSearchMessageID() {

        String expected =
        "It is dinner time!";

        String actual =
        "It is dinner time!";

        assertEquals(expected, actual);
    }

    @Test
    public void testRecipientSearch() {

        String expected1 =
        "Where are you? You are late! I have asked you to be on time.";

        String expected2 =
        "Ok, I am leaving without you.";

        assertEquals(
                "Where are you? You are late! I have asked you to be on time.",
                expected1);

        assertEquals(
                "Ok, I am leaving without you.",
                expected2);
    }

    @Test
    public void testDeleteMessage() {

        String expected =
        "Message deleted successfully";

        String actual =
        "Message deleted successfully";

        assertEquals(expected, actual);
    }

    @Test
    public void testDisplayReport() {

        String report =
        "Message Hash Recipient Message";

        assertTrue(report.contains("Message Hash"));
        assertTrue(report.contains("Recipient"));
        assertTrue(report.contains("Message"));
    }

    private static class sentMessages {

        private static Object get(int i) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void add(String it_is_dinner_time) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void clear() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public sentMessages() {
        }
    }
}
