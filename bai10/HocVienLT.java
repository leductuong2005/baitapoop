package bai10;

public class HocVienLT extends HocVien{
	private int soBuoi=10,donGia=500000;
	public HocVienLT() {
		super();
		loaiCT="Lap Trinh";
	}
	public HocVienLT(String hoTen, String diaChi, String loaiCT, int loaiUT) {
		super(hoTen, diaChi, loaiCT, loaiUT);
		loaiCT="Do Hoa";
	}
	
	@Override
	public long hocPhi() {
		if(loaiUT==1)return soBuoi*donGia-1000000;
		return  soBuoi*donGia-800000;
	}
	@Override
	public String toString() {
		return super.toString()+"\n"+
				"loai chuong trinh dang ky hoc : "+loaiCT+"\n"+
				"hoc phi : "+hocPhi();
	}
	
}
