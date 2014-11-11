package tuanpmpd01037.obj;

public class TuVung {
	String tu;
	String loaiTu;
	String nghiaTu;
	public String getTu() {
		return tu;
	}
	public void setTu(String tu) {
		this.tu = tu;
	}
	public String getLoaiTu() {
		return loaiTu;
	}
	public void setLoaiTu(String loaiTu) {
		this.loaiTu = loaiTu;
	}
	public String getNghiaTu() {
		return nghiaTu;
	}
	public void setNghiaTu(String nghiaTu) {
		this.nghiaTu = nghiaTu;
	}
	public TuVung(String tu, String loaiTu, String nghiaTu) {
		this.tu = tu;
		this.loaiTu = loaiTu;
		this.nghiaTu = nghiaTu;
	}
	public TuVung() {
	}

}
