package bai11;

public abstract class GiangVien {
    // Thuộc tính
    protected String hoTen;
    protected String diaChi;
    protected String loaiGiangVien;
    // Constructor 
    public GiangVien(String hoTen, String diaChi, String loaiGiangVien) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiGiangVien = loaiGiangVien;
    }

    // Phương thức nhập thông tin giảng viên (phương thức trừu tượng)
    public abstract void nhapThongTin();

    // Phương thức tính lương tháng (phương thức trừu tượng)
    public abstract double tinhLuong();

    // Phương thức in thông tin giảng viên
    public void inThongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Loại giảng viên: " + loaiGiangVien);
        System.out.println("Lương tháng: " + tinhLuong());
    }
}
