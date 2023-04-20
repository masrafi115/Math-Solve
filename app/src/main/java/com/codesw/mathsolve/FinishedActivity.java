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
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.DialogFragment;


public class FinishedActivity extends  Activity { 
	
	
	private ArrayList<String> input = new ArrayList<>();
	private ArrayList<String> input2 = new ArrayList<>();
	private ArrayList<String> ans = new ArrayList<>();
	private ArrayList<String> q = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear9;
	private TextView textview1;
	private TextView textview2;
	private LinearLayout mathbox;
	private TextView textview3;
	private LinearLayout linear8;
	private Button button1;
	private LinearLayout linear7;
	private TextView number2;
	private LinearLayout linear5;
	private EditText answer;
	private TextView textview4;
	private ImageView imageview1;
	
	private Intent i = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.finished);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		textview1 = (TextView) findViewById(R.id.textview1);
		textview2 = (TextView) findViewById(R.id.textview2);
		mathbox = (LinearLayout) findViewById(R.id.mathbox);
		textview3 = (TextView) findViewById(R.id.textview3);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		button1 = (Button) findViewById(R.id.button1);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		number2 = (TextView) findViewById(R.id.number2);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		answer = (EditText) findViewById(R.id.answer);
		textview4 = (TextView) findViewById(R.id.textview4);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), ViewResultActivity.class);
				i.putExtra("ans", new Gson().toJson(ans));
				i.putExtra("input", new Gson().toJson(input));
				i.putExtra("q", new Gson().toJson(q));
				startActivity(i);
			}
		});
	}
	
	private void initializeLogic() {
		android.graphics.drawable.BitmapDrawable navigationBackground = new android.graphics.drawable.BitmapDrawable(BitmapFactory.decodeResource(
		                getResources(), R.drawable.background_single_tile));
		
		navigationBackground.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
		
		linear1.setBackgroundDrawable(navigationBackground);
		answer.setEnabled(false);
		_Elevation(linear2, 6);
		_Elevation(linear9, 6);
		_RoundAndBorder(linear2, "#FFFFFF", 6, "#FF5722", 15);
		_RoundAndBorder(mathbox, "#FFFFFF", 8, "#FF0F528D", 15);
		_RoundAndBorder(linear8, "#FFFFFF", 6, "#000000", 15);
		_RoundAndBorder(button1, "#FF0F538B", 6, "#000000", 60);
		imageview1.setColorFilter(0xFFFFC107, PorterDuff.Mode.MULTIPLY);
		ans = new Gson().fromJson(getIntent().getStringExtra("ans"), new TypeToken<ArrayList<String>>(){}.getType());
		
		input = new Gson().fromJson(getIntent().getStringExtra("input"), new TypeToken<ArrayList<String>>(){}.getType());
		
		input2 = new Gson().fromJson(getIntent().getStringExtra("input"), new TypeToken<ArrayList<String>>(){}.getType());
		
		q = new Gson().fromJson(getIntent().getStringExtra("q"), new TypeToken<ArrayList<String>>(){}.getType());
		
		input2.retainAll(ans);
		if (getIntent().hasExtra("left")) {
			textview4.setText(getIntent().getStringExtra("left"));
		}
		number2.setText(String.valueOf((long)(input2.size())));
		
		if (input.size() < ans.size()) {
			for(int _repeat30 = 0; _repeat30 < (int)((ans.size() - input.size())); _repeat30++) {
				input.add(" ");
			}
		}
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
	
	
	public void _Elevation (final View _view, final double _number) {
		
		_view.setElevation((int)_number);
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