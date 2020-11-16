/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sang.util;

/**
 *
 * @author star
 */
public class MathUtility {

    //mình sẽ làm class này fake calss của JDK
    //Math.PI . abs() .sqrt() .pow() .sin()
    //cái gì mà là đồ xài chung , không lưu trữ riêng lẻ info ta sẽ chơi static
    public static final double PI = 3.1415;

    //xài MathUltility .PI y chang Math.PI
    //hàm tính n! = 1.2.3.4...n
    // n phải >=0 , 0!= 1!=1; quy ước
    //n! tăng nhanh , cho nen 21! tràn long rồi
    //ta chỉ tính n! từ 0..20
    //ngoài vùng này , dùng âm hay lố 20, éo tính,chừi = Exception
    //không thèm trả về -1 hàm ý giá trị không xài
    //học cách ném ngoại lệ luôn
    // thứ 2 ông viết tiếp, cấm vắng mặt
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be from 0->20");
        }
        if ((n == 0 || n == 1)) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
//ta tự tin gáy hàm ta chạy ngon, chạy đúng
//nhưng : team thì cần chứng minh điều đấy,đảm bảo chất lượng code,chất lượng hàm
//tést nghiã là đưa hàm ra xài, gọi với các tham số khác nhau
//muốn chứng minh hàm chạy đúng hay không ra cần test thử
//ví dụ gọi hàm getFactorial(với các tham số khác nhau đưa vào)
//getF(-5),......
//các giá trị đầu vào đại diện cho việc xài hàm
//ta gọi là test case, các tình huống cần tést , các tình huống xài hàm
//khi ta test hàm , ta cần quan tâm 2 việc
//1. dự kiến hàm trả về giá trị khi hàm chạy về với 1 đầu nào đó
//dự kiến hàm trả về giá trị,tui gọi là EXPECTED VALUE
//ví dụ : hàm sẽ trả về 120 khi ta gọi getF(5);
//2. hàm chạy với 1 đầu nào đó , thì nó sẽ ói/ return về 1 value
//cái value trả về của hàm khi chạy được gọi là actual value

//nnghề test chính là : so sánh coi expected value có bằng với actual value không?
//nếu có bằng,hàm đúng cho cáse/ tình huống này
//không KO bằng , hàm tính toán sai, hoặc kì vọng sai
//hàm mà tốt thì phải là expected == actual mọi tình huống
//nếu tốt ta mới đem ra xài, bán , public cộng đồng xài
//làm sao để test hàm coi có tốt không,expected = actual
//hai kĩ thuật được áp dụng
//kĩ thuật 1 : Nhing bằng mắt và so sánh từng cặp expected vs actual
//chính là kĩ thuật sout(expected),sout(actual-ói về gì khi chạy)
//kĩ thuật này đơn giản , dễ làm , nhưng măcs sai sót do có quá nhiều cặp
//expected actual cần so sánh bằng mắt.
//KĨ THUẬT 2 : Nhìn bằng mắt, không cần so sánh từng cặp, để máy so sánh dùm luôn
//mắt chỉ nhìn 2 màu XANH-ĐỎ duy nhất
//nếu tất cả các cặp actual vs expected đều thỏa , màu xanh cho tất cả.
//nếu hầu hết các cặp actual vs expected đều thỏa, có 1 vài cái không thỏa
//thì kết luận ngay , hàm sai, màu đỏ cho tất cả
//giai đoạn này giải thích là 
// chỉ cần 1 thằng sai , hàm sai
//tương đương câu:hàm tui chạy ngon lắm. đúng 99% , lâu lâu sai tí
//nói câu đó : hàm đéo tin cậy để xài
//kĩ thuật 2 này dùng màu sắc. muốn làm vậy thì phải sài thư viện bổ sung thêm
//chính là file .jar , .dll được cung cấp ngoài JDK
// Các thư viện này tùy thuộc ngôn ngữ lập trình được gọi chung là Uni Test framework
//C# thư viện cụ thể NUnit,MSUnit
//JAVA :  thư viện cụ thể JUnit,TestNG,xUnit
//C++ :CPP UNit

