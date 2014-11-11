package tuanpmpd01037.custom;

import java.util.List;

import com.example.slidemenudemo.R;

import tuanpmpd01037.obj.Chude;




import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomVocabularyXml extends BaseAdapter {

	List<Chude> arrayTinTuc;

	public Activity context;
	public LayoutInflater inflater;

	public CustomVocabularyXml(Activity context, List<Chude> arrayTinTuc) {
		super();

		this.context = context;
		this.arrayTinTuc = arrayTinTuc;
		this.inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return arrayTinTuc.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return arrayTinTuc.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static class ViewHolder {
		ImageView img;
		TextView txtChude;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub

		ViewHolder holder;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = inflater.inflate(R.layout.item_vocabulary, null);

			holder.img = (ImageView) convertView
					.findViewById(R.id.imageView1);
			holder.txtChude = (TextView) convertView
					.findViewById(R.id.textView1);

			convertView.setTag(holder);
		} else
			holder = (ViewHolder) convertView.getTag();

		Chude _entry = (Chude) arrayTinTuc.get(position);
//		 holder.img.setImageResource(_entry.getLogoTaxi());
		holder.txtChude.setText(_entry.getId());

		return convertView;
	}

}
