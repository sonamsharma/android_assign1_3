package com.ucb.example.assign1_3;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void buttonPress(View view){
		Button button = (Button) findViewById(R.id.button2);
		
	}
	public void pressButton1(View view){
		System.out.println(view);
		Toast toast = Toast.makeText(getBaseContext(), "Button 1 got pressed", Toast.LENGTH_SHORT);
		toast.show();
	}
	public void pressButton2(View view){
		System.out.println(view);
		Toast toast = Toast.makeText(getBaseContext(), "Button 2 got pressed", Toast.LENGTH_SHORT);
		toast.show();
	}
	public void pressButton3(View view){
		System.out.println(view);
		Toast toast = Toast.makeText(getBaseContext(), "Button 3 got pressed", Toast.LENGTH_SHORT);
		toast.show();
	}
	

}
