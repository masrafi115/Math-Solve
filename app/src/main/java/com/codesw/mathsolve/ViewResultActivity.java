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
import java.util.HashMap;
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.DialogFragment;


public class ViewResultActivity extends  Activity { 
	
	
	private double n = 0;
	private HashMap<String, Object> map = new HashMap<>();
	
	private ArrayList<String> q = new ArrayList<>();
	private ArrayList<String> ans = new ArrayList<>();
	private ArrayList<String> input = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> list = new ArrayList<>();
	
	private LinearLayout linear1;
	private ListView listview1;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.view_result);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		listview1 = (ListView) findViewById(R.id.listview1);
	}
	
	private void initializeLogic() {
		android.graphics.drawable.BitmapDrawable navigationBackground = new android.graphics.drawable.BitmapDrawable(BitmapFactory.decodeResource(
		                getResources(), R.drawable.background_single_tile));
		
		navigationBackground.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
		
		linear1.setBackgroundDrawable(navigationBackground);
		q = new Gson().fromJson(getIntent().getStringExtra("q"), new TypeToken<ArrayList<String>>(){}.getType());
		
		ans = new Gson().fromJson(getIntent().getStringExtra("ans"), new TypeToken<ArrayList<String>>(){}.getType());
		
		input = new Gson().fromJson(getIntent().getStringExtra("input"), new TypeToken<ArrayList<String>>(){}.getType());
		
		for(int _repeat13 = 0; _repeat13 < (int)(ans.size()); _repeat13++) {
			map = new HashMap<>();
			map.put("q", q.get((int)(n)));
			map.put("ans", ans.get((int)(n)));
			map.put("input", input.get((int)(n)));
			list.add(map);
			n++;
		}
		
		listview1.setAdapter(new Listview1Adapter(list));
		((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		android.graphics.drawable.ColorDrawable sage = new android.graphics.drawable.ColorDrawable(Color.parseColor("#FF0F538B"));
		listview1.setDivider(sage);
		listview1.setDividerHeight(5);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _shapeRadius (final View _v, final String _color, final double _radius) {
		android.graphics.drawable.GradientDrawable shape = new android.graphics.drawable.GradientDrawable();
		  shape.setShape(android.graphics.drawable.GradientDrawable.RECTANGLE);
		
		shape.setCornerRadius((int)_radius);
		
		shape.setColor(Color.parseColor(_color));
		_v.setBackgroundDrawable(shape);
	}
	
	
	public class Listview1Adapter extends BaseAdapter {
		ArrayList<HashMap<String, Object>> _data;
		public Listview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.result, null);
			}
			
			final LinearLayout linear2 = (LinearLayout) _view.findViewById(R.id.linear2);
			final LinearLayout linear3 = (LinearLayout) _view.findViewById(R.id.linear3);
			final TextView textview1 = (TextView) _view.findViewById(R.id.textview1);
			final TextView textview2 = (TextView) _view.findViewById(R.id.textview2);
			final TextView textview3 = (TextView) _view.findViewById(R.id.textview3);
			final TextView textview4 = (TextView) _view.findViewById(R.id.textview4);
			
			textview1.setText(String.valueOf((long)(_position + 1)));
			_shapeRadius(textview1, "#2196F3", 90);
			textview2.setText(_data.get((int)_position).get("q").toString());
			textview3.setText("Your Answer ".concat(_data.get((int)_position).get("input").toString()));
			textview4.setText("Correct Answer ".concat(_data.get((int)_position).get("ans").toString()));
			
			return _view;
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