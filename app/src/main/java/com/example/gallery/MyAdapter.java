package com.example.gallery;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.io.File;

public class MyAdapter extends BaseAdapter {

    Context context;
    String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM) + "/" + "IMAGES";
    File[] files;
    public MyAdapter(Context context) {
        this.context = context;
        File DCIM_IMAGES = new File(path);
        files = DCIM_IMAGES.listFiles();
    }

    @Override
    public int getCount() {
        return files.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item = inflater.inflate(R.layout.gridview_item, null);
        ImageView imageView = item.findViewById(R.id.img);
        Bitmap image = BitmapFactory.decodeFile(files[position].getPath());
        imageView.setImageBitmap(image);
        return item;
    }
}
