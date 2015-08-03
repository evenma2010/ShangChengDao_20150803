package com.d1699.activity;

import com.example.shangchengdao.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * 找回密码界面
 * 
 * @author mayiwen
 *
 */
public class FindPasswordActivity extends Activity {
	
	/**
	 * 下一步按钮
	 */
	private Button button;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.find_password);
		
		initView();
		setListener();
	}
	
	
	public void initView() {
		button = (Button) this.findViewById(R.id.findpass_next);
	}
	
	public void setListener() {
		
		//下一步按钮点击事件
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(FindPasswordActivity.this,ResetPasswordActivity.class);
				startActivity(intent);
			}
		});
	}
	
}
