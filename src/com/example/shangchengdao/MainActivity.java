package com.example.shangchengdao;

import com.d1699.activity.LoginActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

//	private Button button;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 new Handler().postDelayed(new Runnable(){   
	            @Override   
	            public void run() {   
	                //MainActivity是欢迎界面显示之后要跳转的界面  
	                Intent mainIntent = new Intent(MainActivity.this,LoginActivity.class);   
	                startActivity(mainIntent);   
	                MainActivity.this.finish();   
	            }   
	           }, 3000); 
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	/**
	 * 设置监听器
	 * 
	 */
	public void setListener() {
	}
}
