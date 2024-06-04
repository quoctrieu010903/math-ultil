/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.quoctrieu.mthutil.mathutil.core;


// Quy tắt đặt tên package trong java 
// tên miền công ty đảo ngược , đi kèm thông tin dự án / project và module
//com.ten-cty.ten-du-an.module. ten class
//com.microsoft/sqlserver.jdbc.
//com.microsoft.sql
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HP
 */

// class này chứa các test case dùng đê test code của class 
// chính bên mathun
public class MathUtilityTest {
   

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    /// Test case là bộ data đầu vào + thao tác nhập xuất hiện trên app , màn hình , trên hàm để vertify 1 hàm
    //màn hình , chức năng chạy đúng hay sai !! PE
    //testcase 1 : check/test getF() WITH N =1
    //Input/ given n = 0 
    // steps/procedure (bước test)
    //call method geTFactorial(n)
    //expected result : 1 (hy vọng 1!=1
    //Actual result : ???? cho chạy hàm mới biết
    // * Status passed / failed
    @Test // framwork ép ta phải viết code theo 1 quy tắc nào đó 
            // thư viện cho viết tự do , gọi là hàm tự do 
    //framwork là thư viện , nhưng thư viện ko hẳn là framework
    public void testFactorialGivenRightArgOReturnsWell(){
        assertEquals(1,MathUtil1808.getFactorial(0));
    }
    
     //testcase 2 : check/test getF() WITH N =5
    //Input/ given n = 0 
    // steps/procedure (bước test)
    //call method geTFactorial(n)
    //expected result : 1 (hy vọng 5!=120
    //Actual result : ???? cho chạy hàm mới biết
    // * Status passed / failed
    @Test // framwork ép ta phải viết code theo 1 quy tắc nào đó 
            // thư viện cho viết tự do , gọi là hàm tự do 
    //framwork là thư viện , nhưng thư viện ko hẳn là framework
    public void testFactorialGivenRightArg1ReturnsWell(){
        assertEquals(1,MathUtil1808.getFactorial(1)); 
    }
    
      //testcase 1 : check/test getF() WITH N =0 
    //Input/ given n = 0 
    // steps/procedure (bước test)
    //call method geTFactorial(n)
    //expected result : 1 (hy vọng 0!=1
    //Actual result : ???? cho chạy hàm mới biết
    // * Status passed / failed
    @Test // framwork ép ta phải viết code theo 1 quy tắc nào đó 
            // thư viện cho viết tự do , gọi là hàm tự do 
    //framwork là thư viện , nhưng thư viện ko hẳn là framework
    public void testFactorialGivenRightArg12345ReturnsWell(){
        assertEquals(1,MathUtil1808.getFactorial(1));   
        assertEquals(2,MathUtil1808.getFactorial(2)); 
        assertEquals(6,MathUtil1808.getFactorial(3)); 
        assertEquals(24,MathUtil1808.getFactorial(4)); 
        assertEquals(120,MathUtil1808.getFactorial(5)); 
        
    }
    // thấy ngoại lệ mừng rơi nước mắt
    //Test case #5:  check getF() with n = -1, the method throw Exception
    @Test
    public void testFactorialGivenWrongArg_1ThrowsException(){
        // ngoại lệ 
        assertThrows(IllegalArgumentException.class,
                        () -> {MathUtil1808.getFactorial(-1);});
    }
}
