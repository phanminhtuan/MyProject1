package tuanpmpd01037.menu;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MenuAdapter extends ArrayAdapter<String> {

	public MenuAdapter(Context context, int resource, String[] objects) {
		super(context, resource, objects);
		Log.i("========MenuAdapter===========>>>", "====MenuAdapter====>");
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Log.i("========MenuAdapter===========>>>", "====getView====>");
		TextView textview = (TextView)super.getView(position, convertView, parent);
		textview.setTextColor(Color.WHITE);
		return textview;
	}

}
