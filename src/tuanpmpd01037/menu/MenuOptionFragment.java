package tuanpmpd01037.menu;

import tuanpmpd01037.main.MainActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.example.slidemenudemo.R;

public class MenuOptionFragment extends Fragment {

	private Activity _activity;
	private ListView _listMenu;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater
				.inflate(R.layout.slideout_menu_layout, container, false);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		if (savedInstanceState != null) {
			return;
		}
		Log.i("========MenuOptionFragment===========>>>", "====onActivityCreated====>");
		_activity = (MenuActivity) getActivity();
		_listMenu = (ListView) _activity.findViewById(R.id.lvMenu);
		_listMenu.setAdapter(new MenuAdapter(_activity, android.R.layout.simple_list_item_1, _activity.getResources().getStringArray(R.array.menu_slide_item)));
		_listMenu.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(final AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				final String name = (String) arg0.getItemAtPosition(arg2);
				AnimationListener listener = new AnimationListener() {
					@Override
					public void onAnimationStart(Animation animation) {
					}

					@Override
					public void onAnimationRepeat(Animation animation) {
					}

					@Override
					public void onAnimationEnd(Animation animation) {
						Intent intent = new Intent(getActivity(), MainActivity.class);
						intent.putExtra("name", name);
						intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION | Intent.FLAG_ACTIVITY_CLEAR_TOP);
						startActivity(intent);
					}
				};
				((MenuActivity) getActivity()).getSlideoutHelper().close(listener);
			}
		});
	}

	@Override
	public void onAttach(Activity activity) {
		getActivity();
		super.onAttach(activity);
	}
}
