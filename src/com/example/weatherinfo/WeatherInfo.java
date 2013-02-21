/**
 * 创建人：SongZhiyong
 * 创建时间：2012-12-23
 */
package com.example.weatherinfo;

import java.io.Serializable;

/**
 * @author SongZhiyong
 * 
 * 
 *         { "weatherinfo":{ <!-- 基本信息 --> "city":"福州", "city_en":"fuzhou",
 *         "date_y":"2012年5月14日", "date":"", "week":"星期一", "fchh":"08",
 *         "cityid":"101230101", <!-- 从今天开始到第六天的每天的天气情况，这里的温度是摄氏温度 -->
 *         "temp1":"29℃~23℃"
 *         ,"temp2":"26℃~20℃","temp3":"24℃~20℃","temp4":"25℃~20℃"
 *         ,"temp5":"24℃~21℃","temp6":"25℃~22℃", <!--
 *         从今天开始到第六天的每天的天气情况，这里的温度是华氏温度 -->
 *         "tempF1":"84.2℉~73.4℉","tempF2":"78.8℉~68℉"
 *         ,"tempF3":"75.2℉~68℉","tempF4"
 *         :"77℉~68℉","tempF5":"75.2℉~69.8℉","tempF6":"77℉~71.6℉", <!-- 天气描述 -->
 *         "weather1"
 *         :"阵雨转中雨","weather2":"中雨转小雨","weather3":"小雨","weather4":"小雨",
 *         "weather5":"小雨转阵雨","weather6":"阵雨转小雨", <!-- 天气描述图片序号 -->
 *         "img1":"3","img2"
 *         :"8","img3":"8","img4":"7","img5":"7","img6":"99","img7"
 *         :"7","img8":"99"
 *         ,"img9":"7","img10":"3","img11":"3","img12":"7","img_single":"3",
 *         <!-- 图片名称 -->
 *         "img_title1":"阵雨","img_title2":"中雨","img_title3":"中雨","img_title4"
 *         :"小雨"
 *         ,"img_title5":"小雨","img_title6":"小雨","img_title7":"小雨","img_title8"
 *         :"小雨","img_title9":"小雨","img_title10":"阵雨","img_title11":"阵雨",
 *         "img_title12":"小雨","img_title_single":"阵雨", <!-- 风速描述 -->
 *         "wind1":"微风"
 *         ,"wind2":"微风","wind3":"微风","wind4":"微风","wind5":"微风","wind6"
 *         :"微风","fx1":"微风","fx2":"微风", <!-- 风速级别描述 -->
 *         "fl1":"小于3级","fl2":"小于3级"
 *         ,"fl3":"小于3级","fl4":"小于3级","fl5":"小于3级","fl6":"小于3级", <!-- 今天穿衣指数 -->
 *         "index":"热", "index_d":"天气较热，建议着短裙、短裤、短套装、T恤等夏季服装。年老体弱者宜着长袖衬衫和单裤。",
 *         <!-- 48小时穿衣指数 -->
 *         "index48":"暖","index48_d":"较凉爽，建议着长袖衬衫加单裤等春秋过渡装。年老体弱者宜着针织长袖衬衫、马甲和长裤。"
 *         , <!-- 紫外线及48小时紫外线 --> "index_uv":"弱","index48_uv":"最弱", <!-- 洗车 -->
 *         "index_xc":"不宜", <!-- 旅游 --> "index_tr":"适宜",、 <!-- 舒适指数 -->
 *         "index_co":"较不舒适",
 *         "st1":"27","st2":"21","st3":"24","st4":"18","st5":"22","st6":"18",
 *         <!-- 晨练 --> "index_cl":"较不宜", <!-- 晾晒 --> "index_ls":"不太适宜", <!-- 过敏
 *         --> "index_ag":"不易发" } }
 * 
 * 
 * 
 *         2. 图片接口 http://m.weather.com.cn/img/c0.gif
 *         http://m.weather.com.cn/img/b0.gif
 *         http://www.weather.com.cn/m/i/weatherpic/29x20/d0.gif
 *         http://www.weather.com.cn/m2/i/icon_weather/29x20/n00.gif
 *         这个图就是天气现象0（晴
 *         ）的图片，其他天气现象的图片依此类推。c打头的图片是20*20像素的，b打头的是50*46像素的，d打头的是反白的图标
 *         ，29*20像素，n打头的是夜间反白图标，29*20像素，注意这里的文件名是两位数字！ 也许还有更多的图标，等待大家发掘啦~
 * 
 */
public class WeatherInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1997663475093198723L;
	// <!-- 基本信息 -->
	// "city":"福州",
	private String city;
	// "city_en":"fuzhou",
	private String city_en;
	// "date_y":"2012年5月14日",
	private String date_y;
	// "date":"",
	private String date;
	// "week":"星期一",
	private String week;
	// "fchh":"08",
	private String fchh;
	// "cityid":"101230101",
	// <!-- 从今天开始到第六天的每天的天气情况，这里的温度是摄氏温度 -->
	private String temp1;
	private String temp2;
	private String temp3;
	private String temp4;
	private String temp5;
	private String temp6;
	// "temp1":"29℃~23℃","temp2":"26℃~20℃","temp3":"24℃~20℃","temp4":"25℃~20℃","temp5":"24℃~21℃","temp6":"25℃~22℃",
	// <!-- 从今天开始到第六天的每天的天气情况，这里的温度是华氏温度 -->
	private String tempF1;
	private String tempF2;
	private String tempF3;
	private String tempF4;
	private String tempF5;
	private String tempF6;
	// "tempF1":"84.2℉~73.4℉","tempF2":"78.8℉~68℉","tempF3":"75.2℉~68℉","tempF4":"77℉~68℉","tempF5":"75.2℉~69.8℉","tempF6":"77℉~71.6℉",
	// <!-- 天气描述 -->
	private String weather1;
	private String weather2;
	private String weather3;
	private String weather4;
	private String weather5;
	private String weather6;
	// "weather1":"阵雨转中雨","weather2":"中雨转小雨","weather3":"小雨","weather4":"小雨","weather5":"小雨转阵雨","weather6":"阵雨转小雨",
	// <!-- 天气描述图片序号 -->
	private String img1;
	private String img2;
	private String img3;
	private String img4;
	private String img5;
	private String img6;
	// "img1":"3","img2":"8","img3":"8","img4":"7","img5":"7","img6":"99","img7":"7","img8":"99","img9":"7","img10":"3","img11":"3","img12":"7","img_single":"3",
	// <!-- 图片名称 -->
	private String img_title1;
	private String img_title2;
	private String img_title3;
	private String img_title4;
	private String img_title5;
	private String img_title6;
	// "img_title1":"阵雨","img_title2":"中雨","img_title3":"中雨","img_title4":"小雨","img_title5":"小雨","img_title6":"小雨","img_title7":"小雨","img_title8":"小雨","img_title9":"小雨","img_title10":"阵雨","img_title11":"阵雨","img_title12":"小雨","img_title_single":"阵雨",
	// <!-- 风速描述 -->
	private String wind1;
	private String wind2;
	private String wind3;
	private String wind4;
	private String wind5;
	private String wind6;
	// "wind1":"微风","wind2":"微风","wind3":"微风","wind4":"微风","wind5":"微风","wind6":"微风","fx1":"微风","fx2":"微风",
	// <!-- 风速级别描述 -->
	private String fl1;
	private String fl2;
	private String fl3;
	private String fl4;
	private String fl5;
	private String fl6;
	// "fl1":"小于3级","fl2":"小于3级","fl3":"小于3级","fl4":"小于3级","fl5":"小于3级","fl6":"小于3级",
	// <!-- 今天穿衣指数 -->
	private String index;
	// "index":"热",
	private String index_d;
	// "index_d":"天气较热，建议着短裙、短裤、短套装、T恤等夏季服装。年老体弱者宜着长袖衬衫和单裤。",
	// <!-- 48小时穿衣指数 -->
	private String index48;
	private String index48_d;
	// "index48":"暖","index48_d":"较凉爽，建议着长袖衬衫加单裤等春秋过渡装。年老体弱者宜着针织长袖衬衫、马甲和长裤。",
	// <!-- 紫外线及48小时紫外线 -->
	private String index_uv;
	private String index48_uv;
	// "index_uv":"弱","index48_uv":"最弱",
	// <!-- 洗车 -->
	private String index_xc;
	// "index_xc":"不宜",
	// <!-- 旅游 -->
	private String index_tr;
	// "index_tr":"适宜",、
	// <!-- 舒适指数 -->
	private String index_co;
	// "index_co":"较不舒适",
	// "st1":"27","st2":"21","st3":"24","st4":"18","st5":"22","st6":"18",
	// <!-- 晨练 -->
	private String index_cl;
	// "index_cl":"较不宜",
	// <!-- 晾晒 -->
	private String index_ls;
	// "index_ls":"不太适宜",
	// <!-- 过敏 -->
	private String index_ag;

	public WeatherInfo(String city, String city_en, String date_y, String date,
			String week, String fchh, String temp1, String temp2, String temp3,
			String temp4, String temp5, String temp6, String tempF1,
			String tempF2, String tempF3, String tempF4, String tempF5,
			String tempF6, String weather1, String weather2, String weather3,
			String weather4, String weather5, String weather6, String img1,
			String img2, String img3, String img4, String img5, String img6,
			String img_title1, String img_title2, String img_title3,
			String img_title4, String img_title5, String img_title6,
			String wind1, String wind2, String wind3, String wind4,
			String wind5, String wind6, String fl1, String fl2, String fl3,
			String fl4, String fl5, String fl6, String index, String index_d,
			String index48, String index48_d, String index_uv,
			String index48_uv, String index_xc, String index_tr,
			String index_co, String index_cl, String index_ls, String index_ag) {
		super();
		this.city = city;
		this.city_en = city_en;
		this.date_y = date_y;
		this.date = date;
		this.week = week;
		this.fchh = fchh;
		this.temp1 = temp1;
		this.temp2 = temp2;
		this.temp3 = temp3;
		this.temp4 = temp4;
		this.temp5 = temp5;
		this.temp6 = temp6;
		this.tempF1 = tempF1;
		this.tempF2 = tempF2;
		this.tempF3 = tempF3;
		this.tempF4 = tempF4;
		this.tempF5 = tempF5;
		this.tempF6 = tempF6;
		this.weather1 = weather1;
		this.weather2 = weather2;
		this.weather3 = weather3;
		this.weather4 = weather4;
		this.weather5 = weather5;
		this.weather6 = weather6;
		this.img1 = img1;
		this.img2 = img2;
		this.img3 = img3;
		this.img4 = img4;
		this.img5 = img5;
		this.img6 = img6;
		this.img_title1 = img_title1;
		this.img_title2 = img_title2;
		this.img_title3 = img_title3;
		this.img_title4 = img_title4;
		this.img_title5 = img_title5;
		this.img_title6 = img_title6;
		this.wind1 = wind1;
		this.wind2 = wind2;
		this.wind3 = wind3;
		this.wind4 = wind4;
		this.wind5 = wind5;
		this.wind6 = wind6;
		this.fl1 = fl1;
		this.fl2 = fl2;
		this.fl3 = fl3;
		this.fl4 = fl4;
		this.fl5 = fl5;
		this.fl6 = fl6;
		this.index = index;
		this.index_d = index_d;
		this.index48 = index48;
		this.index48_d = index48_d;
		this.index_uv = index_uv;
		this.index48_uv = index48_uv;
		this.index_xc = index_xc;
		this.index_tr = index_tr;
		this.index_co = index_co;
		this.index_cl = index_cl;
		this.index_ls = index_ls;
		this.index_ag = index_ag;
	}

	public WeatherInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity_en() {
		return city_en;
	}

	public void setCity_en(String city_en) {
		this.city_en = city_en;
	}

	public String getDate_y() {
		return date_y;
	}

	public void setDate_y(String date_y) {
		this.date_y = date_y;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public String getFchh() {
		return fchh;
	}

	public void setFchh(String fchh) {
		this.fchh = fchh;
	}

	public String getTemp1() {
		return temp1;
	}

	public void setTemp1(String temp1) {
		this.temp1 = temp1;
	}

	public String getTemp2() {
		return temp2;
	}

	public void setTemp2(String temp2) {
		this.temp2 = temp2;
	}

	public String getTemp3() {
		return temp3;
	}

	public void setTemp3(String temp3) {
		this.temp3 = temp3;
	}

	public String getTemp4() {
		return temp4;
	}

	public void setTemp4(String temp4) {
		this.temp4 = temp4;
	}

	public String getTemp5() {
		return temp5;
	}

	public void setTemp5(String temp5) {
		this.temp5 = temp5;
	}

	public String getTemp6() {
		return temp6;
	}

	public void setTemp6(String temp6) {
		this.temp6 = temp6;
	}

	public String getTempF1() {
		return tempF1;
	}

	public void setTempF1(String tempF1) {
		this.tempF1 = tempF1;
	}

	public String getTempF2() {
		return tempF2;
	}

	public void setTempF2(String tempF2) {
		this.tempF2 = tempF2;
	}

	public String getTempF3() {
		return tempF3;
	}

	public void setTempF3(String tempF3) {
		this.tempF3 = tempF3;
	}

	public String getTempF4() {
		return tempF4;
	}

	public void setTempF4(String tempF4) {
		this.tempF4 = tempF4;
	}

	public String getTempF5() {
		return tempF5;
	}

	public void setTempF5(String tempF5) {
		this.tempF5 = tempF5;
	}

	public String getTempF6() {
		return tempF6;
	}

	public void setTempF6(String tempF6) {
		this.tempF6 = tempF6;
	}

	public String getWeather1() {
		return weather1;
	}

	public void setWeather1(String weather1) {
		this.weather1 = weather1;
	}

	public String getWeather2() {
		return weather2;
	}

	public void setWeather2(String weather2) {
		this.weather2 = weather2;
	}

	public String getWeather3() {
		return weather3;
	}

	public void setWeather3(String weather3) {
		this.weather3 = weather3;
	}

	public String getWeather4() {
		return weather4;
	}

	public void setWeather4(String weather4) {
		this.weather4 = weather4;
	}

	public String getWeather5() {
		return weather5;
	}

	public void setWeather5(String weather5) {
		this.weather5 = weather5;
	}

	public String getWeather6() {
		return weather6;
	}

	public void setWeather6(String weather6) {
		this.weather6 = weather6;
	}

	public String getImg1() {
		return img1;
	}

	public void setImg1(String img1) {
		this.img1 = img1;
	}

	public String getImg2() {
		return img2;
	}

	public void setImg2(String img2) {
		this.img2 = img2;
	}

	public String getImg3() {
		return img3;
	}

	public void setImg3(String img3) {
		this.img3 = img3;
	}

	public String getImg4() {
		return img4;
	}

	public void setImg4(String img4) {
		this.img4 = img4;
	}

	public String getImg5() {
		return img5;
	}

	public void setImg5(String img5) {
		this.img5 = img5;
	}

	public String getImg6() {
		return img6;
	}

	public void setImg6(String img6) {
		this.img6 = img6;
	}

	public String getImg_title1() {
		return img_title1;
	}

	public void setImg_title1(String img_title1) {
		this.img_title1 = img_title1;
	}

	public String getImg_title2() {
		return img_title2;
	}

	public void setImg_title2(String img_title2) {
		this.img_title2 = img_title2;
	}

	public String getImg_title3() {
		return img_title3;
	}

	public void setImg_title3(String img_title3) {
		this.img_title3 = img_title3;
	}

	public String getImg_title4() {
		return img_title4;
	}

	public void setImg_title4(String img_title4) {
		this.img_title4 = img_title4;
	}

	public String getImg_title5() {
		return img_title5;
	}

	public void setImg_title5(String img_title5) {
		this.img_title5 = img_title5;
	}

	public String getImg_title6() {
		return img_title6;
	}

	public void setImg_title6(String img_title6) {
		this.img_title6 = img_title6;
	}

	public String getWind1() {
		return wind1;
	}

	public void setWind1(String wind1) {
		this.wind1 = wind1;
	}

	public String getWind2() {
		return wind2;
	}

	public void setWind2(String wind2) {
		this.wind2 = wind2;
	}

	public String getWind3() {
		return wind3;
	}

	public void setWind3(String wind3) {
		this.wind3 = wind3;
	}

	public String getWind4() {
		return wind4;
	}

	public void setWind4(String wind4) {
		this.wind4 = wind4;
	}

	public String getWind5() {
		return wind5;
	}

	public void setWind5(String wind5) {
		this.wind5 = wind5;
	}

	public String getWind6() {
		return wind6;
	}

	public void setWind6(String wind6) {
		this.wind6 = wind6;
	}

	public String getFl1() {
		return fl1;
	}

	public void setFl1(String fl1) {
		this.fl1 = fl1;
	}

	public String getFl2() {
		return fl2;
	}

	public void setFl2(String fl2) {
		this.fl2 = fl2;
	}

	public String getFl3() {
		return fl3;
	}

	public void setFl3(String fl3) {
		this.fl3 = fl3;
	}

	public String getFl4() {
		return fl4;
	}

	public void setFl4(String fl4) {
		this.fl4 = fl4;
	}

	public String getFl5() {
		return fl5;
	}

	public void setFl5(String fl5) {
		this.fl5 = fl5;
	}

	public String getFl6() {
		return fl6;
	}

	public void setFl6(String fl6) {
		this.fl6 = fl6;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getIndex_d() {
		return index_d;
	}

	public void setIndex_d(String index_d) {
		this.index_d = index_d;
	}

	public String getIndex48() {
		return index48;
	}

	public void setIndex48(String index48) {
		this.index48 = index48;
	}

	public String getIndex48_d() {
		return index48_d;
	}

	public void setIndex48_d(String index48_d) {
		this.index48_d = index48_d;
	}

	public String getIndex_uv() {
		return index_uv;
	}

	public void setIndex_uv(String index_uv) {
		this.index_uv = index_uv;
	}

	public String getIndex48_uv() {
		return index48_uv;
	}

	public void setIndex48_uv(String index48_uv) {
		this.index48_uv = index48_uv;
	}

	public String getIndex_xc() {
		return index_xc;
	}

	public void setIndex_xc(String index_xc) {
		this.index_xc = index_xc;
	}

	public String getIndex_tr() {
		return index_tr;
	}

	public void setIndex_tr(String index_tr) {
		this.index_tr = index_tr;
	}

	public String getIndex_co() {
		return index_co;
	}

	public void setIndex_co(String index_co) {
		this.index_co = index_co;
	}

	public String getIndex_cl() {
		return index_cl;
	}

	public void setIndex_cl(String index_cl) {
		this.index_cl = index_cl;
	}

	public String getIndex_ls() {
		return index_ls;
	}

	public void setIndex_ls(String index_ls) {
		this.index_ls = index_ls;
	}

	public String getIndex_ag() {
		return index_ag;
	}

	public void setIndex_ag(String index_ag) {
		this.index_ag = index_ag;
	}

	// "index_ag":"不易发"
	@Override
	public String toString() {
		return "WeatherInfo [city=" + city + ", city_en=" + city_en
				+ ", date_y=" + date_y + ", date=" + date + ", week=" + week
				+ ", fchh=" + fchh + ", temp1=" + temp1 + ", temp2=" + temp2
				+ ", temp3=" + temp3 + ", temp4=" + temp4 + ", temp5=" + temp5
				+ ", temp6=" + temp6 + ", tempF1=" + tempF1 + ", tempF2="
				+ tempF2 + ", tempF3=" + tempF3 + ", tempF4=" + tempF4
				+ ", tempF5=" + tempF5 + ", tempF6=" + tempF6 + ", weather1="
				+ weather1 + ", weather2=" + weather2 + ", weather3="
				+ weather3 + ", weather4=" + weather4 + ", weather5="
				+ weather5 + ", weather6=" + weather6 + ", img1=" + img1
				+ ", img2=" + img2 + ", img3=" + img3 + ", img4=" + img4
				+ ", img5=" + img5 + ", img6=" + img6 + ", img_title1="
				+ img_title1 + ", img_title2=" + img_title2 + ", img_title3="
				+ img_title3 + ", img_title4=" + img_title4 + ", img_title5="
				+ img_title5 + ", img_title6=" + img_title6 + ", wind1="
				+ wind1 + ", wind2=" + wind2 + ", wind3=" + wind3 + ", wind4="
				+ wind4 + ", wind5=" + wind5 + ", wind6=" + wind6 + ", fl1="
				+ fl1 + ", fl2=" + fl2 + ", fl3=" + fl3 + ", fl4=" + fl4
				+ ", fl5=" + fl5 + ", fl6=" + fl6 + ", index=" + index
				+ ", index_d=" + index_d + ", index48=" + index48
				+ ", index48_d=" + index48_d + ", index_uv=" + index_uv
				+ ", index48_uv=" + index48_uv + ", index_xc=" + index_xc
				+ ", index_tr=" + index_tr + ", index_co=" + index_co
				+ ", index_cl=" + index_cl + ", index_ls=" + index_ls
				+ ", index_ag=" + index_ag + "]";
	}

}
