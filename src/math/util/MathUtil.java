/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import sang.util.MathUtility;

/**
 *
 * @author star
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long expected = 120;// tao hy vọng 120 được ói về nếu tao goị hàm 5;
        long actual = MathUtility.getFactorial(5); // ta gọi hàm 5!
        //case 1:
        System.out.println("5!? expected:"+expected+" ;actual "+actual);
        
        //case 2:
        expected = 720;
        actual = MathUtility.getFactorial(6);
        System.out.println("6!? expected:"+expected+" ;actual "+actual);
        
        //case 3: ta kì vọng ngoại lệ IllegalArgumentException nếu ta gọi -5!
        
        MathUtility.getFactorial(-5);
        //thấy ngoại lệ lại mừng vì hàm chạy khi thiết kế
        
    }
    
}
//cất code lên server GitHub 
//nhớ kho trên github là url : https://github.com/ten/tenkho.git
//nho username va pass va email vao github cua minh
//cần tool để đồng bộ code từ máy mình lên server(github,gitLab,bitbucker)
//tool có thể là :cmd,GUI,IDE
//vì ta professional, ta chơi cmd

//file đặc biệt để nói với git tool rằng ai lên server ai lên server ai ở lại local host
//file này được gọi là .gitignore(file thuần text)
//nó sẽ khác nhau tùy dự án, tùy vào IDE mình xài, ngôn ngữ lập trình mình xài
//có 1 gã dev cực kì dễ thương đã làm sẵn file ứng với các IDE,NNLT rồi
//xin anh ấy đem về xài htpps://gitignore.io

