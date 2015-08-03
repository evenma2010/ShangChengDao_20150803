package com.d1699.activity;

import com.example.shangchengdao.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * 登陆界面
 * 
 * @author mayiwen
 *
 */
public class LoginActivity extends Activity {
	
	/** 用户名 */
	private EditText userName;
	/** 密码 */
	private EditText password;
	/** 登陆 */
	private Button button;
	/** 注册 */
	private TextView register;
	/** 找回密码 */
	private TextView findPassword;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		
		initView();
		
		setListener();
	}
	
	
	
	/**
	 * 初始化组件
	 * 
	 */
	public void initView() {
		userName = (EditText) this.findViewById(R.id.lgoin_username);
		password = (EditText) this.findViewById(R.id.lgoin_password);
		button = (Button) this.findViewById(R.id.login_button);
		register = (TextView) this.findViewById(R.id.login_register);
		findPassword = (TextView) this.findViewById(R.id.login_find_password);
	}
	
	
	/**
	 * 设置组件Listener
	 * 
	 */
	public void setListener() {
		
		//登陆Listener
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
			}
		});
		
		//注册Listener
		register.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(LoginActivity.this, RegisterActivity.class); 
				startActivity(intent);
			}
		});
		
		//找回密码Listener
		findPassword.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(LoginActivity.this, FindPasswordActivity.class); 
				startActivity(intent);
			}
		});
		
	}
	
	/**
	 * 验证用户名密码
	 * 
	 * @return
	 */
	public void VaildUserNameAndPassword() {
		
	}
	
	
}
