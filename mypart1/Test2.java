/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author molek
 */
public class Test2 {       

    private static class UserSystem {

        private static boolean isValidUsername(String kyl_1) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static boolean isValidPassword(String password) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static boolean isValidCellNumber(String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static boolean login(String kyl_1, String pass123, String kyl_10, String pass1230) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public UserSystem() {
        }
    }
  public class UserSystemTest {

    // Username tests
    @Test
    public void testValidUsername() {
        assertTrue(UserSystem.isValidUsername("kyl_1"));
    }

    @Test
    public void testInvalidUsername() {
        assertFalse(UserSystem.isValidUsername("kyle!!!!!!"));
    }

    // Password tests
    @Test
    public void testValidPassword() {
        assertTrue(UserSystem.isValidPassword("Ch&8sec@ke99!"));
    }

    @Test
    public void testInvalidPassword() {
        assertFalse(UserSystem.isValidPassword("password"));
    }

    // Cell number tests
    @Test
    public void testValidCellNumber() {
        assertTrue(UserSystem.isValidCellNumber("+27838968976"));
    }

    @Test
    public void testInvalidCellNumber() {
        assertFalse(UserSystem.isValidCellNumber("08966553"));
    }

    // Login tests
    @Test
    public void testLoginSuccess() {
        assertTrue(UserSystem.login("kyl_1", "Pass@123", "kyl_1", "Pass@123"));
}

@Test
public void testLoginFail(){
assertFalse(UserSystem.login("kyl_1", "Pass@123", "wrong" , "123"));
}
} 
}
