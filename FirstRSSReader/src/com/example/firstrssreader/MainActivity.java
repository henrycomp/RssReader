package com.example.firstrssreader;

import com.android.firstrssreader.ListListener;
import com.android.firstrssreader.data.RssItem;
import com.android.firstrssreader.util.RssReader;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView; 
import android.support.v4.app.NavUtils;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		try {
			RssReader rssReader = new RssReader("http://www.theverge.com/rss/index.xml");
			ListView Items = (ListView)findViewById(R.id.listView1);
			//New List Adapter
			ArrayAdapter<RssItem> Adapter = new ArrayAdapter<RssItem>(this,android.R.layout.simple_list_item_1, rssReader.getItems());
			//List Adapter for the list view
			Items.setAdapter(Adapter);
			//Set list view click listener
			Items.setOnItemClickListener(new ListListener(rssReader.getItems(), this));		}catch (Exception e){
			Log.e("FirstRssReader", e.getMessage());
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	

}
