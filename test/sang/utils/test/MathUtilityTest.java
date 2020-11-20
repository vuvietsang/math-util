/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sang.utils.test;

import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sang.util.MathUtility;

/**
 *
 * @author star
 */
public class MathUtilityTest {
    
    @Test //biến cái hàm trong class này thành public static void main 
    //nhờ bộ thư viện JUnit.
    //tại sao cần vậy, vì mặc định app chạy từ main() chuẩn
    //trong khi đó mình cần test thử hàm thôi , không can thiệp main()
    //vậy mình cần main() khác, @Test giups điều đó
    //nhưng vì có nhiều main() default
    //SHIFT F6 dành cho bên này
    
    //cú pháp đặt tên hàm dùng để test hàm dùng để test hàm khác của dân QC
    
    public void getFactorial_RunsWell_IfValidArgument(){
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(720, MathUtility.getFactorial(6));
    }
    @Test(expected = IllegalArgumentException.class)
    public void getFactorial_ThrownsException_IfInvalidArgument(){
        //ngoại lệ không phải là value để assert()
        //chỉ có thể chụp nó lại
        MathUtility.getFactorial(-5);
        
    }
}
