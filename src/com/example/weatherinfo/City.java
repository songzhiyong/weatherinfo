/**
 * <p>Copyright (R) 2012 北京市立方网版权所有。</p>
 * 创建人：SongZhiyong
 * 创建时间：2012-12-23
 */
package com.example.weatherinfo;

import java.io.Serializable;
import com.j256.ormlite.field.DatabaseField;

/**
 * @author SongZhiyong
 *
 */
public class City implements Serializable{
	private static final long serialVersionUID = 6352997348819552129L;
	
	@DatabaseField
	public String name;
	@DatabaseField
	public String code;
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	public City(String name, String code) {
		super();
		this.name = name;
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
