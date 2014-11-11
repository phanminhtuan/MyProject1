package tuanpmpd01037.main;

import java.util.ArrayList;
import java.util.List;

import tuanpmpd01037.custom.CustomVocabularyXml;
import tuanpmpd01037.obj.Chude;
import tuanpmpd01037.obj.TuVung;

import com.example.slidemenudemo.DetailActivity;
import com.example.slidemenudemo.R;
import com.example.slidemenudemo.R.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class VocabularyActivity extends Activity {
	ListView mylist;
	static List<Chude> listChuDe = new ArrayList<Chude>();
	CustomVocabularyXml adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_vocabulary);
		mylist = (ListView) findViewById(R.id.mylist);
		loadDataChude();
		adapter = new CustomVocabularyXml(VocabularyActivity.this, listChuDe);
		mylist.setAdapter(adapter);
		mylist.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				DetailActivity.listChuDe_Detail.clear();
				DetailActivity.listChuDe_Detail.add(listChuDe.get(position));
//				if (listChuDe.get(position).getId()
//						.equals("Selecting a restaurant – Chọn nhà hàng")) {
//
////					Toast.makeText(getApplicationContext(),
////							"" + listChuDe.get(position), Toast.LENGTH_LONG)
////							.show();
//
					Intent in1 = new Intent(VocabularyActivity.this,
							DetailActivity.class);
					startActivity(in1);
//
//				} else if (listChuDe.get(position).getId()
//						.equals("Eating out – Ăn ngoài")) {
////					Toast.makeText(getApplicationContext(),
////							"" + listChuDe.get(position), Toast.LENGTH_LONG)
////							.show();
//				} else if (listChuDe.get(position).getId()
//						.equals("Cooking as a career – Đầu bếp")) {
//					Toast.makeText(getApplicationContext(),
//							"" + listChuDe.get(position), Toast.LENGTH_LONG)
//							.show();
//				} else if (listChuDe.get(position).getId()
//						.equals("Ordering lunch – Đặt bữa trưa")) {
//					Toast.makeText(getApplicationContext(),
//							"" + listChuDe.get(position), Toast.LENGTH_LONG)
//							.show();
//				} else if (listChuDe
//						.get(position)
//						.getId()
//						.equals("Renting and releasing – Thuê và cho thuê văn phòng")) {
//					Toast.makeText(getApplicationContext(),
//							"" + listChuDe.get(position), Toast.LENGTH_LONG)
//							.show();
//				}
//
			}
		});
	}

	void loadDataChude() {

		List<TuVung> tv_restaurent = new ArrayList<TuVung>();
		tv_restaurent.add(new TuVung("go", "danh tu", "di,chay"));
		tv_restaurent.add(new TuVung("go1", "danh tu", "di,chay"));
		tv_restaurent.add(new TuVung("go2", "danh tu", "di,chay"));
		tv_restaurent.add(new TuVung("go3", "danh tu", "di,chay"));
		tv_restaurent.add(new TuVung("go4", "danh tu", "di,chay"));
		Chude cd_NhaHang = new Chude();
		cd_NhaHang.setId("Selecting a restaurant – Chọn nhà hàng");
		
		cd_NhaHang.setListTuVung(tv_restaurent);
		listChuDe.add(cd_NhaHang);
		// ======================
		List<TuVung> tv_goout = new ArrayList<TuVung>();
		tv_goout.add(new TuVung("give", "danh tu", "cho"));
		tv_goout.add(new TuVung("give1", "danh tu", "cho"));
		tv_goout.add(new TuVung("give2", "danh tu", "cho"));
		tv_goout.add(new TuVung("give3", "danh tu", "cho"));
		Chude cd_GoOut = new Chude();
		cd_GoOut.setId("Eating out – Ăn ngoài");
		cd_GoOut.setListTuVung(tv_goout);
		listChuDe.add(cd_GoOut);

		// TuVung tv_restaurent=new TuVung("go", "danh tu", "di,chay");
		// arrayList.add(new Chude("Selecting a restaurant – Chọn nhà hàng"));
		// arrayList.add(new Chude("Eating out – Ăn ngoài"));
		// arrayList.add(new Chude("Cooking as a career – Đầu bếp"));
		// arrayList.add(new Chude("Ordering lunch – Đặt bữa trưa"));
		// arrayList.add(new Chude(
		// "Renting and releasing – Thuê và cho thuê văn phòng"));

	}
}
