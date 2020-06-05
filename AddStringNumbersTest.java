
package Assessment;

import org.junit.Test;
import static org.junit.Assert.*;

public class AddStringNumbersTest {
    
    // Function For Test Cases
    public void testAddString(String num, int expected) {
       
        AddStringNumbers sn = new AddStringNumbers();
        int result = sn.Add(num);
        assertEquals(expected, result);
    }
    
    // Test For Empty String.
    @org.junit.Test
    public void checkEmpltyString(){
        testAddString("", 0);
    }
    
    // Test For Single Number in String
    @org.junit.Test
    public void checkSingleNumber(){
        testAddString("3", 3);
    }
    
    // Test For Multiple Number
    @org.junit.Test
    public void checkMultipleNumber(){
        testAddString("3,4", 7);
    }
    
    @org.junit.Test(expected=NumberFormatException.class)
    public void checkStringStartingWithOtherDelimiters(){
        AddStringNumbers sn = new AddStringNumbers();
        sn.Add("*2,3");
    }
    
    // Test For Not Number String Input
    @org.junit.Test(expected=NumberFormatException.class)
    public void checkInputIsNumberFormat(){
        AddStringNumbers sn = new AddStringNumbers();
        sn.Add("dimple");
    }
    
    // Test For Negative Number
    @org.junit.Test(expected=NegativeException.class)
    public void checkNegatives(){
        AddStringNumbers sn = new AddStringNumbers();
        sn.Add("-3,2");
    }
    
    // Test For New Line Symbol
    @org.junit.Test
    public void checkNewLineSymbol(){
        testAddString("2\n3,4", 9);
    }
    
    // Tset For Different Delimiters
    @org.junit.Test
    public void checkDifferentDelimiters(){
        testAddString("//;\n2;3;4", 9);
    }
    
    // Test For Number Larger Than 1000
    @org.junit.Test
    public void checkNumberUpperlimit(){
        testAddString("1000,2", 2);
    }
}
