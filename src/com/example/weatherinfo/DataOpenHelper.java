package com.example.weatherinfo;

import java.sql.SQLException;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

public class DataOpenHelper extends OrmLiteSqliteOpenHelper {

	// 数据库名称
	private static final String DATABASE_NAME = "city_ormlite.db";
	// 数据库版本
	private static final int DATABASE_VERSION = 1;
	// dao
	private Dao<City, Integer> cityDao = null;

	public DataOpenHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db, ConnectionSource connectionSource) {
		try {
			TableUtils.createTable(connectionSource, City.class);
		} catch (SQLException e) {
			Log.e(DataOpenHelper.class.getName(), "创建数据库失败", e);
			e.printStackTrace();
		}
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, ConnectionSource connectionSource,
			int arg2, int arg3) {
		try {
			TableUtils.dropTable(connectionSource, City.class, true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Log.e(DataOpenHelper.class.getName(), "数据库更新失败", e);
			e.printStackTrace();
		}
		onCreate(db, connectionSource);
	}

	@Override
	public void close() {
		super.close();
		cityDao = null;
	}

	public Dao<City, Integer> getCityDataDao() throws SQLException {
		if (cityDao == null) {
			cityDao = getDao(City.class);
		}
		return cityDao;
	}

}