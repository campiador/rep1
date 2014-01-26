package com.campiador.selectortest;


import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

public class MainActivity extends Activity {

	WebView webView;
	
	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.page_two);
		
//		TextView tv = (TextView) findViewById(R.id.textView1);
//		tv.setSelected(true);	
		  
		webView = (WebView) findViewById(R.id.webview_slideshow);
		WebSettings settings = webView.getSettings();
		settings.setJavaScriptEnabled(true);
		webView.loadUrl("file:///android_asset/slider.html");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
