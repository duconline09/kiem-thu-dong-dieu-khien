public class DiemThi {
    /*
    Điểm xét tuyển ngành ngôn ngữ Anh trường Đại học Ngoại ngữ - ĐHQG Hà Nội năm 2021
    Điểm trúng tuyển: 36.9
     */
    public String ketQua(double diemToan, double diemVan, double diemAnh) {
        double diemXetTuyen = diemToan + diemVan + diemAnh * 2;
        if (diemToan < 0 || diemVan < 0 || diemAnh < 0 || diemToan > 10 || diemVan > 10 || diemAnh > 10) {
            return "Nhập giá trị không hợp lệ";
        } else {
            if (diemXetTuyen >= 36.9) {
                return "Đỗ";
            } else {
                return "Trượt";
            }
        }
    }
}
