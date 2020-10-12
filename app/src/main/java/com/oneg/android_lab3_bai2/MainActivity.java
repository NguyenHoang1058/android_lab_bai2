package com.oneg.android_lab3_bai2;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Build;
import android.os.Bundle;
import android.widget.GridView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initial grid view
        GridView gridView = (GridView) findViewById(R.id.gvMain);

//        toolbar = (Toolbar) findViewById(R.id.toolBar);
//        setSupportActionBar(toolbar);

        //initial cable list
        ArrayList<Cable> arrCable = new ArrayList<>();
        Cable cable1 = new Cable("Cáp chuyển cổng USB", R.drawable.blackcable, "690000 đ", "39%" );
        Cable cable2 = new Cable("Cáp chuyển cổng USB", R.drawable.bluecable, "600000 đ", "16%" );
        Cable cable3 = new Cable("Cáp ethernet", R.drawable.ethernetcable, "710000 đ", "40%" );
        Cable cable4 = new Cable("Jack cắm loa", R.drawable.cable, "580000 đ", "37%" );

        //add item to list
        arrCable.add(cable1);
        arrCable.add(cable2);
        arrCable.add(cable3);
        arrCable.add(cable4);

        CustomAdapter customAdapter = new CustomAdapter(arrCable, this, R.layout.grid_view_item);
        gridView.setAdapter(customAdapter);
    }
}