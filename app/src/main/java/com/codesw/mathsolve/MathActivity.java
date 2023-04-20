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
import android.widget.ImageView;
import android.widget.Button;
import java.util.Timer;
import java.util.TimerTask;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.DialogFragment;


public class MathActivity extends  Activity { 
	
	private Timer _timer = new Timer();
	
	private double n = 0;
	private double m = 0;
	private double num = 0;
	private double correct = 0;
	private double TimeElapsed = 0;
	private double sec = 0;
	
	private ArrayList<Double> list_a = new ArrayList<>();
	private ArrayList<Double> list_b = new ArrayList<>();
	private ArrayList<Double> ope = new ArrayList<>();
	private ArrayList<String> q = new ArrayList<>();
	private ArrayList<String> list = new ArrayList<>();
	private ArrayList<String> input = new ArrayList<>();
	private ArrayList<String> ans = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear8;
	private LinearLayout linear14;
	private LinearLayout mathbox;
	private LinearLayout linear2;
	private LinearLayout linear15;
	private LinearLayout linear16;
	private LinearLayout linear17;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private TextView textview2;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private TextView textview3;
	private TextView textview6;
	private TextView textview8;
	private ImageView imageview1;
	private TextView textview9;
	private TextView textview1;
	private LinearLayout linear7;
	private TextView number1;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private TextView symbol;
	private TextView number2;
	private TextView equals;
	private TextView textview11;
	private Button button;
	private Button buttonn;
	private Button button0;
	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button5;
	private Button button6;
	private Button button7;
	private Button button8;
	private Button button9;
	
	private TimerTask t;
	private Intent i = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.math);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		mathbox = (LinearLayout) findViewById(R.id.mathbox);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		textview2 = (TextView) findViewById(R.id.textview2);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview6 = (TextView) findViewById(R.id.textview6);
		textview8 = (TextView) findViewById(R.id.textview8);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview9 = (TextView) findViewById(R.id.textview9);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		number1 = (TextView) findViewById(R.id.number1);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		symbol = (TextView) findViewById(R.id.symbol);
		number2 = (TextView) findViewById(R.id.number2);
		equals = (TextView) findViewById(R.id.equals);
		textview11 = (TextView) findViewById(R.id.textview11);
		button = (Button) findViewById(R.id.button);
		buttonn = (Button) findViewById(R.id.buttonn);
		button0 = (Button) findViewById(R.id.button0);
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);
		button4 = (Button) findViewById(R.id.button4);
		button5 = (Button) findViewById(R.id.button5);
		button6 = (Button) findViewById(R.id.button6);
		button7 = (Button) findViewById(R.id.button7);
		button8 = (Button) findViewById(R.id.button8);
		button9 = (Button) findViewById(R.id.button9);
		
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview11.setText(textview11.getText().toString().concat("7"));
			}
		});
		
		buttonn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview11.setText(textview11.getText().toString().concat("8"));
			}
		});
		
		button0.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview11.setText(textview11.getText().toString().concat("9"));
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview11.setText(textview11.getText().toString().concat("4"));
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview11.setText(textview11.getText().toString().concat("5"));
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview11.setText(textview11.getText().toString().concat("6"));
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview11.setText(textview11.getText().toString().concat("1"));
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview11.setText(textview11.getText().toString().concat("2"));
			}
		});
		
		button6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview11.setText(textview11.getText().toString().concat("3"));
			}
		});
		
		button7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview11.setText(textview11.getText().toString().concat("0"));
			}
		});
		
		button8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview11.setText(textview11.getText().toString().substring((int)(0), (int)(textview11.getText().toString().length() - 1)));
			}
		});
		
		button9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (textview11.getText().toString().equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), "Answer can't null");
				}
				else {
					input.add(textview11.getText().toString());
					if (num == q.size()) {
						i.setClass(getApplicationContext(), FinishedActivity.class);
						i.putExtra("q", new Gson().toJson(q));
						i.putExtra("ans", new Gson().toJson(ans));
						i.putExtra("input", new Gson().toJson(input));
						i.putExtra("left", textview9.getText().toString());
						startActivity(i);
					}
					else {
						if (textview11.getText().toString().equals(ans.get((int)(num)))) {
							correct++;
							textview1.setText(String.valueOf((long)(correct)));
						}
						num++;
						textview3.setText(String.valueOf((long)(num)));
						number1.setText(String.valueOf((long)(list_a.get((int)(num)).doubleValue())));
						symbol.setText(list.get((int)(num)));
						number2.setText(String.valueOf((long)(list_b.get((int)(num)).doubleValue())));
						textview11.setText("");
					}
				}
				
			}
		});
	}
	
	private void initializeLogic() {
		_design();
		n = 20;
		textview8.setText(String.valueOf((long)(n)));
		for(int _repeat151 = 0; _repeat151 < (int)(n); _repeat151++) {
			list_a.add(Double.valueOf(SketchwareUtil.getRandom((int)(10), (int)(100))));
			list_b.add(Double.valueOf(SketchwareUtil.getRandom((int)(10), (int)(50))));
			ope.add(Double.valueOf((Math.random() * 4)));
			list.add(getOp((int)(double)ope.get((int)m)));
			q.add(String.valueOf((long)(list_a.get((int)(m)).doubleValue())).concat(" ".concat(list.get((int)(m)).concat(" ")).concat(String.valueOf((long)(list_b.get((int)(m)).doubleValue())).concat(" = ?"))));
			ans.add(jisuan(list_a.get((int)(m)), list_b.get((int)(m)), (int)(double)ope.get((int)m) ));
			m++;
		}
		number1.setText(String.valueOf((long)(list_a.get((int)(num)).doubleValue())));
		symbol.setText(list.get((int)(num)));
		number2.setText(String.valueOf((long)(list_b.get((int)(num)).doubleValue())));
		t = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						TimeElapsed++;
						_SetTimerText(TimeElapsed);
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(t, (int)(100), (int)(100));
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
	
	
	public void _design () {
		android.graphics.drawable.BitmapDrawable navigationBackground = new android.graphics.drawable.BitmapDrawable(BitmapFactory.decodeResource(
		                getResources(), R.drawable.background_single_tile));
		
		navigationBackground.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
		
		linear1.setBackgroundDrawable(navigationBackground);
		_RoundAndBorder(mathbox, "#FFFFFF", 8, "#FF0F528D", 15);
		_RoundAndBorder(linear9, "#FFFFFF", 4, "#000000", 8);
		_RoundAndBorder(linear13, "#FFFFFF", 4, "#000000", 8);
		_RoundAndBorder(linear14, "#FFFFFF", 4, "#FF0F528D", 90);
		_RoundAndBorder(button, "#FAFAFA", 6, "#FF0F538B", 60);
		_RoundAndBorder(buttonn, "#FAFAFA", 6, "#FF0F538B", 60);
		_RoundAndBorder(button0, "#FAFAFA", 6, "#FF0F538B", 60);
		_RoundAndBorder(button1, "#FAFAFA", 6, "#FF0F538B", 60);
		_RoundAndBorder(button2, "#FAFAFA", 6, "#FF0F538B", 60);
		_RoundAndBorder(button3, "#FAFAFA", 6, "#FF0F538B", 60);
		_RoundAndBorder(button4, "#FAFAFA", 6, "#FF0F538B", 60);
		_RoundAndBorder(button5, "#FAFAFA", 6, "#FF0F538B", 60);
		_RoundAndBorder(button6, "#FAFAFA", 6, "#FF0F538B", 60);
		_RoundAndBorder(button7, "#FAFAFA", 6, "#FF0F538B", 60);
		_RoundAndBorder(button8, "#EF5350", 6, "#FF0F538B", 60);
		_RoundAndBorder(button9, "#009688", 6, "#FF0F538B", 60);
	}
	
	
	public void _calculate () {
	} private static String jisuan(double a, double b, int index) {
				String sum = "";
				switch (index) {
						case 0:
							sum = String.valueOf((long)(a + b));
							break;
						case 1:
							sum = String.valueOf((long)(a - b));
							break;
						case 2:
							sum = String.valueOf((long)(a * b));
							break;
						case 3:
							sum = String.valueOf((long)(a / b));
							break;
				}
				return sum;
	}
	
	
	public void _getOperator () {
	} private static String getOp(int index) {
				String string = "";
				switch (index) {
						case 0:
							string = "+";
							break;
						case 1:
							string = "-";
							break;
						case 2:
							string = "*";
							break;
						case 3:
							string = "/";
							break;
				}
				return string;
	}
	
	
	public void _SetTimerText (final double _sec) {
		if (((_sec % 600) / 10) == 59) {
			i.setClass(getApplicationContext(), FinishedActivity.class);
			i.putExtra("q", new Gson().toJson(q));
			i.putExtra("ans", new Gson().toJson(ans));
			i.putExtra("input", new Gson().toJson(input));
			startActivity(i);
		}
		else {
			sec = 60 - ((_sec % 600) / 10);
			textview9.setText("00:".concat(String.valueOf((long)(sec))));
		}
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