/**
 * 创建人：SongZhiyong
 * 创建时间：2012-12-23
 */
package com.example.weatherinfo;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
/**
 * @author SongZhiyong
 * 
 */
public class WeatherInfoDetail extends Activity {
	public static final String TAG = "WeatherInfoDetail";
	private String code = "";
	private TextView tvInfoName;
	private TextView tvInfoTemp;
	private TextView tvInfoWeather;
	private TextView tvInfoWind;
	private ImageView ivWeatherIndicate;
	private Handler handler;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_weather_detail);
		code = getIntent().getStringExtra("code");
		tvInfoName = (TextView) findViewById(R.id.tv_info_name);
		tvInfoTemp = (TextView) findViewById(R.id.tv_info_tem);
		tvInfoWeather = (TextView) findViewById(R.id.tv_info_weather);
		tvInfoWind = (TextView) findViewById(R.id.tv_info_wind);
		ivWeatherIndicate = (ImageView) findViewById(R.id.iv_weather_indicate);
		handler = new Handler() {
			public void handleMessage(android.os.Message msg) {
				String string = new String((byte[]) msg.obj);
				String info = string.substring(string.indexOf(":") + 1);
				info = info.substring(0, info.lastIndexOf("}"));
				Log.i("parseInfo", info);
				WeatherInfo object = (WeatherInfo) JSON.parseObject(info, WeatherInfo.class);
				tvInfoName.setText(object.getCity());
				tvInfoTemp.setText(object.getTemp1());
				tvInfoWeather.setText(object.getWeather1());
				tvInfoWind.setText(object.getWind1());
			};
		};
		new Thread() {
			public void run() {
				try {
					byte[] weatherInfos = null;
					weatherInfos = readParse("http://m.weather.com.cn/data/" + code + ".html");
					Message msg = Message.obtain();
					msg.obj = weatherInfos;
					handler.sendMessage(msg);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			};
		}.start();
		// "img_title1":"阵雨","img_title2":"中雨","img_title3":"中雨","img_title4":"小雨","img_title5":"小雨","img_title6":"小雨","img_title7":"小雨","img_title8":"小雨","img_title9":"小雨","img_title10":"阵雨","img_title11":"阵雨","img_title12":"小雨","img_title_single":"阵雨",
		// if ("阵雨".equals(object.getImg_title1())) {
		// ivWeatherIndicate.setImageResource(R.id.);
		// }else if ("中雨".equals(object.getImg_title1())) {
		// ivWeatherIndicate.setImageResource(R.id.);
		// }else if ("小雨".equals(object.getImg_title1())) {
		// ivWeatherIndicate.setImageResource(R.id.);
		// }else if ("中雨".equals(object.getImg_title1())) {
		// ivWeatherIndicate.setImageResource(R.id.);
		// }else if ("中雨".equals(object.getImg_title1())) {
		// ivWeatherIndicate.setImageResource(R.id.);
		// }else if ("中雨".equals(object.getImg_title1())) {
		// ivWeatherIndicate.setImageResource(R.id.);
		// }else if ("中雨".equals(object.getImg_title1())) {
		// ivWeatherIndicate.setImageResource(R.id.);
		// }else if ("中雨".equals(object.getImg_title1())) {
		// ivWeatherIndicate.setImageResource(R.id.);
		// }else if ("中雨".equals(object.getImg_title1())) {
		// ivWeatherIndicate.setImageResource(R.id.);
		// }
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
}
