package ru.samsung.itschool.dbgame;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ResultAdapter extends ArrayAdapter<Result>
{
	Context context;
ResultAdapter(Context context,ArrayList<Result> results)
{
	super(context, R.layout.result_my, results);
	this.context = context;
}
 public View getView(int position, View v, ViewGroup vg)
{
	LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	
	if(v == null) inflater.inflate(R.layout.result_my, null);
	Result result = this.getItem(position);
	TextView tv = (TextView)v.findViewById(R.id.Scrore);
	tv.setText(result.score + "");
	TextView tv2 = (TextView)v.findViewById(R.id.Username);
	tv2.setText(result.name );
	return v;
}
 
}
