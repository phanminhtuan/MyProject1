package tuanpmpd01037.main;



import tuanpmpd01037.menu.MenuActivity;
import tuanpmpd01037.menu.SlideoutActivity;
import com.example.slidemenudemo.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends Activity {

	private Context _context;
	private Activity _activity;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		Log.i("========MainActivity===========>>>", "====onCreate====>");
		_context = MainActivity.this;
		_activity = this;
		findViewById(R.id.btnOption).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						Log.i("========MainActivity===========>>>",
								"====onCreate===onSlideOut=>");
						onSlideOut();
					}
				});
		Bundle bundle = getIntent().getExtras();
		if (bundle != null && bundle.containsKey("name")) {
//			((TextView) findViewById(R.id.txtContent)).setText((String) bundle
//					.get("name"));
			if (bundle.get("name").equals("Vocabulary")) {
				Intent in1 = new Intent(MainActivity.this,
						VocabularyActivity.class);
				startActivity(in1);
			}else if(bundle.get("name").equals("Search")){
				Intent in2 = new Intent(MainActivity.this,
						SearchActivity.class);
				startActivity(in2);
			}

		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public void onSlideOut() {
		int width = (int) TypedValue.applyDimension(
				TypedValue.COMPLEX_UNIT_DIP, 56, getResources()
						.getDisplayMetrics());
		if (findViewById(R.id.content) != null) {
			SlideoutActivity.prepare(_activity, R.id.content, width);
		} else {
			SlideoutActivity.prepare(_activity, android.R.id.content, width);
		}
		Intent intent = new Intent(_context, MenuActivity.class);
		intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
		startActivity(intent);
		overridePendingTransition(0, 0);
	}

}
