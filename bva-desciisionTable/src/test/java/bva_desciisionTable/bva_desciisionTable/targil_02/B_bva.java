package bva_desciisionTable.bva_desciisionTable.targil_02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import bva_desciisionTable.bva_desciisionTable.MinCalculator;

public class B_bva {
    

    @Test 
    public void B_min_minus_1_ep_0_and_below() {
        
        int a = 100; 
        int b = 0;
        int c = 100;
        int d = 100;
        int e = 100;
        // act + assert
        assertThrows(IllegalArgumentException.class, () -> {
        MinCalculator.findMin(a, b, c, d, e);
        });
    }

    @Test
    public void B_min_ep_1_1000() {
        
        int a = 100; 
        int b = 1;
        int c = 100;
        int d = 100;
        int e = 100;
        // act
        int result = MinCalculator.findMin(a, b, c, d, e);

        // assert
        assertEquals(1, result);   // 1 הוא הערך המינימלי
    }
    
    @Test
    public void B_min_plus_1_ep_1_1000() {
        
        int a = 100; 
        int b = 2;
        int c = 100;
        int d = 100;
        int e = 100;

        // act
        int result = MinCalculator.findMin(a, b, c, d, e);

        // assert
        assertEquals(2, result);   // 2 הוא הערך המינימלי
        
    }

    @Test
    public void B_nominal_ep_1_1000() {
        
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
    public void B_max_minus_1_ep_1_1000() {
        
        int a = 100; 
        int b = 999;
        int c = 100;
        int d = 100;
        int e = 100;

        // act
        int result = MinCalculator.findMin(a, b, c, d, e);

        // assert
        assertEquals(100, result);   // 100 הוא הערך המינימלי
    } 

    @Test
    public void B_max_ep_1_1000() {
        
        int a = 100; 
        int b = 1000;
        int c = 100;
        int d = 100;
        int e = 100;

        // act
        int result = MinCalculator.findMin(a, b, c, d, e);

        // assert
        assertEquals(100, result);   // 100 הוא הערך המינימלי
    }
    
    @Test
    public void B_max_plus_1_ep_upper_than_1000() {
        
        int a = 100; 
        int b = 1001;
        int c = 100;
        int d = 100;
        int e = 100;

        // act + assert
        assertThrows(IllegalArgumentException.class, () -> {
            MinCalculator.findMin(a, b, c, d, e);
        });
    }  

}
