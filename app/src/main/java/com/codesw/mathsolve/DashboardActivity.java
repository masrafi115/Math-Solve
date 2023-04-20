package com.codesw.mathsolve;

import android.app.Activity;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.graphics.Typeface;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.DialogFragment;


public class DashboardActivity extends  Activity { 
	
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear19;
	private LinearLayout linear7;
	private LinearLayout linear26;
	private LinearLayout linear24;
	private LinearLayout linear5;
	private LinearLayout linear4;
	private LinearLayout linear33;
	private ImageView imageview2;
	private LinearLayout linear9;
	private TextView textview3;
	private TextView textview4;
	private ImageView imageview1;
	private LinearLayout linear6;
	private TextView textview1;
	private TextView textview2;
	private ImageView imageview13;
	private LinearLayout linear34;
	private TextView textview25;
	private TextView textview26;
	private ImageView imageview7;
	private LinearLayout linear22;
	private TextView textview13;
	private TextView textview14;
	private TextView textview27;
	private ImageView imageview10;
	private LinearLayout linear27;
	private TextView textview19;
	private TextView textview20;
	private ImageView imageview9;
	private LinearLayout linear25;
	private TextView textview17;
	private TextView textview18;
	
	private Intent i = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.dashboard);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear33 = (LinearLayout) findViewById(R.id.linear33);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview4 = (TextView) findViewById(R.id.textview4);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		textview1 = (TextView) findViewById(R.id.textview1);
		textview2 = (TextView) findViewById(R.id.textview2);
		imageview13 = (ImageView) findViewById(R.id.imageview13);
		linear34 = (LinearLayout) findViewById(R.id.linear34);
		textview25 = (TextView) findViewById(R.id.textview25);
		textview26 = (TextView) findViewById(R.id.textview26);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		textview13 = (TextView) findViewById(R.id.textview13);
		textview14 = (TextView) findViewById(R.id.textview14);
		textview27 = (TextView) findViewById(R.id.textview27);
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		linear27 = (LinearLayout) findViewById(R.id.linear27);
		textview19 = (TextView) findViewById(R.id.textview19);
		textview20 = (TextView) findViewById(R.id.textview20);
		imageview9 = (ImageView) findViewById(R.id.imageview9);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		textview17 = (TextView) findViewById(R.id.textview17);
		textview18 = (TextView) findViewById(R.id.textview18);
		
		linear7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), MathActivity.class);
				startActivity(i);
			}
		});
	}
	
	private void initializeLogic() {
		android.graphics.drawable.BitmapDrawable navigationBackground = new android.graphics.drawable.BitmapDrawable(BitmapFactory.decodeResource(
		                getResources(), R.drawable.background_single_tile));
		
		navigationBackground.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
		
		linear1.setBackgroundDrawable(navigationBackground);
		_RoundAndBorder(linear7, "#FF0F538B", 6, "#000000", 60);
		_RoundAndBorder(linear3, "#FAFAFA", 6, "#FF0F538B", 30);
		_RoundAndBorder(linear19, "#FAFAFA", 6, "#FF0F538B", 30);
		_RoundAndBorder(linear26, "#FAFAFA", 6, "#FF0F538B", 30);
		_RoundAndBorder(linear24, "#FAFAFA", 6, "#FF0F538B", 30);
		textview17.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/roboto_thin.ttf"), 0);
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/roboto_light.ttf"), 0);
		textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/roboto_light.ttf"), 0);
		textview3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/roboto_light.ttf"), 0);
		textview4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/roboto_light.ttf"), 0);
		textview13.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/roboto_bold.ttf"), 0);
		textview19.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/roboto_bold.ttf"), 0);
		textview17.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/roboto_bold.ttf"), 0);
		textview14.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/roboto_light.ttf"), 0);
		textview18.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/roboto_light.ttf"), 0);
		textview20.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/roboto_light.ttf"), 0);
		textview25.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/roboto_light.ttf"), 0);
		textview26.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/roboto_light.ttf"), 0);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _RoundAndBorder (final View _view, final String _color1, final double _border, final String _color2, final double _round) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		gd.setColor(Color.parseColor(_color1));
		gd.setCornerRadius((int) _round);
		gd.setStroke((int) _border, Color.parseColor(_color2));
		_view.setBackground(gd);
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}