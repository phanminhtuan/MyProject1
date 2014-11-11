package tuanpmpd01037.menu;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Window;

public class SlideoutActivity extends Activity {

	public static void prepare(Activity activity, int id, int width){
		Log.i("========SlideoutActivity===========>>>", "====prepare====>");
		SlideoutHelper.prepare(activity, id, width);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    requestWindowFeature(Window.FEATURE_NO_TITLE);
	    mSlideoutHelper.activate();
	    mSlideoutHelper.open();
	    Log.i("========SlideoutActivity===========>>>", "====onCreate====>");
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if(keyCode == KeyEvent.KEYCODE_BACK){
			mSlideoutHelper.close();
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
	
	private SlideoutHelper mSlideoutHelper;
}
