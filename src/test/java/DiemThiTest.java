import org.junit.Assert;
import org.junit.Test;

public class DiemThiTest {

    @Test
    public void testcase1() {
        DiemThi diemThi = new DiemThi();
        String expected = "Nhập giá trị không hợp lệ";
        String actual = diemThi.ketQua(-1, 1, 1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase2() {
        DiemThi diemThi = new DiemThi();
        String expected = "Đỗ";
        String actual = diemThi.ketQua(8, 9, 10);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase3() {
        DiemThi diemThi = new DiemThi();
        String expected = "Trượt";
        String actual = diemThi.ketQua(8, 7, 6);
        Assert.assertEquals(expected, actual);
    }
}
