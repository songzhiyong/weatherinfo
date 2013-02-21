package com.example.weatherinfo;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.j256.ormlite.android.apptools.OrmLiteBaseActivity;
import com.j256.ormlite.dao.Dao;
public class WeatherActivity extends OrmLiteBaseActivity<DataOpenHelper> implements
		OnItemClickListener {
	public static String TAG = "WeatherActivity";
	private ListView lvCities;
	private Dao<City, Integer> cityDao;
	private List<City> cityList;
	private CityAdapter adapter;
	private ProgressDialog progressDialog;
	private Handler handler;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// requestWindowFeature(Window.FEATURE_NO_TITLE);
		// getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
		// WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_weather);
		handler = new Handler() {
			public void handleMessage(android.os.Message msg) {
				switch (msg.what) {
				case 0:
					progressDialog.show();
					break;
				case 1:
					progressDialog.dismiss();
					adapter.setCities(cityList);
					adapter.notifyDataSetChanged();
					break;
				default:
					break;
				}
			};
		};
		progressDialog = new ProgressDialog(this);
		progressDialog.setTitle("数据加载中。。。");
		progressDialog.setIndeterminate(true);
		progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
		progressDialog.setCancelable(false);
		adapter = new CityAdapter(cityList, this);
		lvCities = (ListView) findViewById(R.id.lv_cities);
		lvCities.setAdapter(adapter);
		lvCities.setOnItemClickListener(this);
		try {
			cityDao = getHelper().getCityDataDao();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// 查詢數據庫
		// byte[] weatherInfos = null;
		// try {
		// weatherInfos =
		// readParse("http://m.weather.com.cn/data/101010100.html");
		// String string = new String(weatherInfos);
		// WeatherInfo object = (WeatherInfo) JSON.parse(string);
		// Log.i(TAG, object.toString());
		// } catch (Exception e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
	}
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		if (cityList == null || cityList.size() == 0) {
			progressDialog.show();
			getCities();
		}
	}
	private void getCities() {
		try {
			cityList = cityDao.queryForAll();
			if (cityList == null || cityList.size() == 0) {
				handler.sendEmptyMessage(0);
				// 插入数据库
				String cities = getString(R.string.city_data);
				String[] citiesString = cities.split(";");
				for (int i = 0; i < citiesString.length; i++) {
					City city = new City();
					city.name = citiesString[i].substring(0, citiesString[i].indexOf(":"));
					city.code = citiesString[i].substring(citiesString[i].indexOf(":") + 1);
					cityList.add(city);
					try {
						cityDao.create(city);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				handler.sendEmptyMessage(1);
			} else {
				handler.sendEmptyMessage(1);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	/**
	 * 从指定的url中获取字节数组
	 * 
	 * @param urlPath
	 * @return 字节数组
	 * @throws Exception
	 */
	public static byte[] readParse(String urlPath) throws Exception {
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		byte[] data = new byte[1024];
		int len = 0;
		URL url = new URL(urlPath);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		InputStream inStream = conn.getInputStream();
		while ((len = inStream.read(data)) != -1) {
			outStream.write(data, 0, len);
		}
		inStream.close();
		return outStream.toByteArray();
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * android.widget.AdapterView.OnItemClickListener#onItemClick(android.widget
	 * .AdapterView, android.view.View, int, long)
	 */
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		Intent intent = new Intent(this, WeatherInfoDetail.class);
		intent.putExtra("code", cityList.get(position).code);
		startActivity(intent);
	}
}
