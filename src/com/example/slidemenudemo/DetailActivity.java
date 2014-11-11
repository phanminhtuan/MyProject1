package com.example.slidemenudemo;

import java.util.ArrayList;
import java.util.List;

import tuanpmpd01037.main.VocabularyActivity;
import tuanpmpd01037.obj.Chude;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class DetailActivity extends Activity {
	public static List<Chude> listChuDe_Detail = new ArrayList<Chude>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);
		 Toast.makeText(getApplicationContext(), ""+ listChuDe_Detail.get(0).getId(),
		 Toast.LENGTH_SHORT).show();
		 Log.i("//==================", "tong so phan tu"+listChuDe_Detail.get(0).getListTuVung().size());
	}
}
