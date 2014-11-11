package tuanpmpd01037.obj;

import java.util.List;

import com.example.slidemenudemo.R;


public class Chude {
	private String idChuDe;
	int image = R.drawable.menu_bg;
	private List<TuVung> listTuVung;

	public String getId() {
		return idChuDe;
	}

	public void setId(String id) {
		this.idChuDe = id;
	}

	@Override
	public String toString() {
		return idChuDe;
	}

	public Chude(String id) {
		this.idChuDe = id;
	}

	public Chude() {

	}

	public List<TuVung> getListTuVung() {
		return listTuVung;
	}

	public void setListTuVung(List<TuVung> listTuVung) {
		this.listTuVung = listTuVung;
	}
}
