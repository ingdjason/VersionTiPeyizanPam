package com.djamoli.versiontipeyizanpam;

/**
 * Created by Ing Djason(Admin) on 19-Sep-15.
 */
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapterFruits extends BaseAdapter {
    private Context mContext;

    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.fruits_ackee, R.drawable.fruits_ananas,
            R.drawable.fruits_cachiman, R.drawable.fruits_carambola,
            R.drawable.fruits_carotte, R.drawable.fruits_citron,
            R.drawable.fruits_goyave, R.drawable.fruits_mandarine,
            R.drawable.fruits_mangomuscat, R.drawable.fruits_papaye,
            R.drawable.fruits_noixdecoco, R.drawable.fruits_veritab
    };

    public String[] mThumbText = {
            "Description", "Description",
            "Description","Description",
            "Description", "Description",
            "Description", "Description",
            "Description", "Description",
            "Description", "Description"
    };

    // Constructor
    public ImageAdapterFruits(Context c){
        mContext = c;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(100, 100));
        return imageView;
    }

}
