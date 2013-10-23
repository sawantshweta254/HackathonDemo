package com.creativecapsule.hackathondemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SetReminderDialogFragment extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_set_reminder_dialog_fragment);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.set_reminder_dialog, menu);
		return true;
	}

}
