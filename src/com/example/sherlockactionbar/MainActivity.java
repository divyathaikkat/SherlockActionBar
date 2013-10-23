package com.example.sherlockactionbar;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Toast;

public class MainActivity extends SherlockActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.activity_main, menu);
		// First Menu Button
        menu.add("Help")
                .setOnMenuItemClickListener(this.HelpButtonClickListener)
                .setIcon(R.drawable.help_button) // Set the menu icon
                .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		// Second Menu Button
        menu.add("Like")
                .setOnMenuItemClickListener(LikeButtonClickListener)
                .setIcon(R.drawable.like_button) // Set the menu icon
                .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        
     // Third Menu Button
        menu.add("Exit")
                .setOnMenuItemClickListener(this.ExitButtonClickListener)
                .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
 
        return super.onCreateOptionsMenu(menu);
	}
	 OnMenuItemClickListener HelpButtonClickListener = new OnMenuItemClickListener() {
		 
	       

			@Override
			public boolean onMenuItemClick(android.view.MenuItem item) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "Help Button", Toast.LENGTH_SHORT)
                .show();

				// Do something else
				return false;
			}
	    };
	    OnMenuItemClickListener LikeButtonClickListener=new OnMenuItemClickListener() {
			
			
			@Override
			public boolean onMenuItemClick(android.view.MenuItem item) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		// Capture third menu button click
	    OnMenuItemClickListener ExitButtonClickListener = new OnMenuItemClickListener() {
	 
			@Override
			public boolean onMenuItemClick(android.view.MenuItem item) {
				// TODO Auto-generated method stub
				 // Create a simple toast message
	            Toast.makeText(MainActivity.this, "Exit Button", Toast.LENGTH_SHORT)
	                    .show();
	 
	            // Do something else
	            return false;
			}
	    };
}

