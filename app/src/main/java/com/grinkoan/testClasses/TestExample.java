package com.grinkoan.testClasses;

import android.util.Log;

import com.grinkoan.annotations.TesterInfo;

/**
 * Created by grinkoan on 8/25/2016.
 */
@TesterInfo
		(
				priority = TesterInfo.Priority.LOW,
				createdBy = "grinkoan",
				tags = {"sales","test"}

		)
public class TestExample
{

	private final String TAG = getClass().getSimpleName();

	public void demoMethod()
	{
//		do nothing
		Log.d(TAG,"Checking demoMethod");
	}

}
