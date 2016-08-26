package com.grinkoan;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.grinkoan.myapplication.R;
import com.grinkoan.annotations.TesterInfo;
import com.grinkoan.testClasses.TestExample;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity
{

	private static final File main_directory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
	private final String TAG = getClass().getSimpleName();


	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.d(TAG,main_directory.getPath());
		Log.d(TAG,main_directory.getAbsolutePath());
		try
		{
			Log.d(TAG,main_directory.getCanonicalPath());
		}
		catch (IOException p_e)
		{
			p_e.printStackTrace();
		}
		Class<TestExample> obj = TestExample.class;
		/*********************/
		Method methodToFind = null;
		try
		{
			methodToFind = obj.getMethod("demoMethod",(Class<?>[]) null);
		}
		catch (NoSuchMethodException p_e)
		{
			p_e.printStackTrace();
		}
		if(methodToFind == null)
		{
			Log.d(TAG,"Method not found");
		}
		else
		{
			Log.d(TAG,"Method found");
		}

		/*********************/
		if (obj.isAnnotationPresent(TesterInfo.class))
		{
			Annotation annotation = obj.getAnnotation(TesterInfo.class);
			TesterInfo testerInfo = (TesterInfo) annotation;
			Log.d(TAG, "Priority:"+testerInfo.priority());
		}


	}
}
