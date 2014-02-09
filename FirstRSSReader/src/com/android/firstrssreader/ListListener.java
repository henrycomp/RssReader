package com.android.firstrssreader;

import java.util.List;

import com.android.firstrssreader.data.RssItem;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public class ListListener implements OnItemClickListener {

	List<RssItem> listItems;
	Activity activity;

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {
		// TODO Auto-generated method stub
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(listItems.get(pos).getLink()));
		activity.startActivity(i);
	}

}
