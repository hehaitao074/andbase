package com.andbase.db;

import android.content.Context;

import com.ab.db.orm.AbDBHelper;
import com.andbase.demo.model.LocalUser;
import com.andbase.demo.model.Stock;
import com.andbase.friend.ChatMsg;
import com.andbase.model.User;
/**
 * 
 * Copyright (c) 2012 All rights reserved
 * 名称：DBInsideHelper.java 
 * 描述：手机data/data下面的数据库
 * @author zhaoqp
 * @date：2013-7-31 下午3:50:18
 * @version v1.0
 */
public class DBInsideHelper extends AbDBHelper {
	// 数据库名
	private static final String DBNAME = "andbasedemo.db";
    
    // 当前数据库的版本
	private static final int DBVERSION = 1;
	// 要初始化的表
	private static final Class<?>[] clazz = { User.class,LocalUser.class,Stock.class,ChatMsg.class};

	public DBInsideHelper(Context context) {
		super(context, DBNAME, null, DBVERSION, clazz);
	}

}



