package com.slohith.sheetsapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by K.S.LOHITH on 19-11-2017.
 */

public class sheetadapter extends ArrayAdapter<sheetclass> {
    private static final String LOG_TAG = sheetadapter.class.getSimpleName();
    public sheetadapter(Activity context, ArrayList<sheetclass> ki)
    {
        super( context, 0,  ki);
    }

    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        View sheetview = convertView;
        if( sheetview == null )
        {
            sheetview = LayoutInflater.from(getContext()).inflate(R.layout.activity_main,parent,false);
        }
        sheetclass currentsheet = getItem(position);
        TextView sheet = (TextView) sheetview.findViewById(R.id.title);
        sheet.setText(currentsheet.getMainword());
        TextView des = (TextView) sheetview.findViewById(R.id.description1);
        des.setText(currentsheet.getDescription());
        return sheetview;
    }
}
