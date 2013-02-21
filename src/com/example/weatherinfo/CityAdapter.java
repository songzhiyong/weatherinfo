/**
 * <p>Copyright (R) 2012 北京市立方网版权所有。</p>
 * 创建人：SongZhiyong
 * 创建时间：2012-12-23
 */
package com.example.weatherinfo;

import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.example.weatherinfo.City;

/**
 * @author SongZhiyong
 * 
 */
public class CityAdapter extends BaseAdapter {

	private List<City> cities;
	private Context mContext;
	private LayoutInflater inflater;

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = ((cities != null) ? cities : new ArrayList<City>());
	}

	public Context getmContext() {
		return mContext;
	}

	public void setmContext(Context mContext) {
		this.mContext = mContext;
	}

	public CityAdapter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CityAdapter(List<City> cities, Context mContext) {
		super();
		setCities(cities);
		this.mContext = mContext;
		this.inflater = LayoutInflater.from(mContext);
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return cities.size();
	}

	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return cities.get(position);
	}

	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder = null;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = inflater.inflate(R.layout.item_city, null);
			holder.tvCityCode = (TextView) convertView
					.findViewById(R.id.tv_city_code);
			holder.tvCityName = (TextView) convertView
					.findViewById(R.id.tv_city_name);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		City city = cities.get(position);
		holder.tvCityName.setText(city.name);
		holder.tvCityCode.setText(city.code);
		return convertView;
	}

	class ViewHolder {
		TextView tvCityName;
		TextView tvCityCode;
	}

}
