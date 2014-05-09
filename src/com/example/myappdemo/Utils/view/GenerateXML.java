package com.example.myappdemo.utils.view;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;

import com.example.myappdemo.R;
import com.example.myappdemo.utils.controller.ItemOnClickListemerUtil;

public class GenerateXML {
	public static int genLinearLayoutItems(LinearLayout linearLayout, SimpleAdapter simpleAdapter, Context context, final int pageNum) {
		int count = simpleAdapter.getCount();
		for (int i = 0; i < count; i++) {
			View v = simpleAdapter.getView(i, null, linearLayout);// v 是simpleadapter产生的一个linearlayout的子项
			// set different bg resource
			if (i == 0) {
				v.setBackgroundResource(R.drawable.seletor_item_bg_top);
			} else if (i == count - 1) {
				v.setBackgroundResource(R.drawable.selector_item_bg_bottom);
			} else {
				v.setBackgroundResource(R.drawable.selector_item_bg_middle);
			}

			switch (pageNum) {
			case 1:
				break;
			case 2:
				ItemOnClickListemerUtil.setPage2OnClickListener(context, v, i);
				break;
			case 3:
				break;
			case 4:
				break;
			case 113://page1-->button13-->linearlayout's item
				ItemOnClickListemerUtil.setPage1Button13OnClickListener(context, v);
				break;
			
			default:
				break;
			}

			linearLayout.addView(v);
		}
//		Log.e("GenXML-drawable","context.getResources().getDrawable(R.drawable.qav_video_header_animation)");
//		linearLayout.setDividerDrawable(context.getResources().getDrawable(R.drawable.qav_video_header_animation));
		return 0;
	}
}
