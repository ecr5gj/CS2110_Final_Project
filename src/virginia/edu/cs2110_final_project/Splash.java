package virginia.edu.cs2110_final_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Splash extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		Thread logoTimer = new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					sleep(5000);
					Intent i = new Intent("virginia.edu.cs2110_final_project.MAIN");
					startActivity(i);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				finally{
					finish();
				}
			}
		};
		logoTimer.start();
	
	}
}
