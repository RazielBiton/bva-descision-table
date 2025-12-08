package bva_desciisionTable.bva_desciisionTable.targil_02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import bva_desciisionTable.bva_desciisionTable.MinCalculator;

public class A_bva {

    @Test 
    public void A_min_minus_1_ep_0_and_below() {
        
        int a = 0; 
        int b = 100;
        int c = 100;
        int d = 100;
        int e = 100;
        // act + assert
        assertThrows(IllegalArgumentException.class, () -> {
        MinCalculator.findMin(a, b, c, d, e);
        });
    }

    @Test
    public void A_min_ep_1_1000() {
        
        int a = 1; 
        int b = 100;
        int c = 100;
        int d = 100;
        int e = 100;
        // act
        int result = MinCalculator.findMin(a, b, c, d, e);

        // assert
        assertEquals(1, result);   // 1 הוא הערך המינימלי
    }
    
    @Test
    public void A_min_plus_1_ep_1_1000() {
        
        int a = 2; 
        int b = 100;
        int c = 100;
        int d = 100;
        int e = 100;

        // act
        int result = MinCalculator.findMin(a, b, c, d, e);

        // assert
        assertEquals(2, result);   // 2 הוא הערך המינימלי
        
    }

    @Test
    public void A_nominal_ep_1_1000() {
        
        int a = 100; 
        int b = 100;
        int c = 100;
        int d = 100;
        int e = 100;


        // act
        int result = MinCalculator.findMin(a, b, c, d, e);

        // assert
        assertEquals(100, result);   // 100 הוא הערך המינימלי
    }  

    @Test
    public void A_max_minus_1_ep_1_1000() {
        
        int a = 999; 
        int b = 100;
        int c = 100;
        int d = 100;
        int e = 100;

        // act
        int result = MinCalculator.findMin(a, b, c, d, e);

        // assert
        assertEquals(100, result);   // 100 הוא הערך המינימלי
    } 

    @Test
    public void A_max_ep_1_1000() {
        
        int a = 1000; 
        int b = 100;
        int c = 100;
        int d = 100;
        int e = 100;

        // act
        int result = MinCalculator.findMin(a, b, c, d, e);

        // assert
        assertEquals(100, result);   // 100 הוא הערך המינימלי
    }
    
    @Test
    public void A_max_plus_1_ep_1000_and_up() {
        
        int a = 1001; 
        int b = 100;
        int c = 100;
        int d = 100;
        int e = 100;

        // act + assert
        assertThrows(IllegalArgumentException.class, () -> {
            MinCalculator.findMin(a, b, c, d, e);
        });
    }   
}
