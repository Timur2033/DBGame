package ru.samsung.itschool.dbgame;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class ExtsResultActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_exts_result);
	
		DBManager dbManager = DBManager.getInstance(this);
		ArrayList<Result> results = dbManager.getAllResults();
		ListView lv = (ListView) findViewById(R.id.listView1);
		ResultAdapter adapter = new ResultAdapter
		(this, /*android.R.layout.simple_list_item_1*/  results);
		lv.setAdapter(adapter);
		
		
	}
	
}
