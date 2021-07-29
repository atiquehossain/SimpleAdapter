package com.example.simpleadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    TextView textView;
    ImageView imageView;
    //two arrage
    //name
    String[] name={"Cat One","Cat Two","Cat Three"};
    //address of image
    int []image={R.drawable.cat1,R.drawable.cat2,R.drawable.cat3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);
//We take Arraylist to put the value
        ArrayList<HashMap<String,String>>arrayList= new ArrayList<>();


//loop for put the value one by one in HashMap
        for(int i=0;i<name.length;i++){
            HashMap<String,String >hashMap=new HashMap<>();
            hashMap.put("Name",name[i]);
            hashMap.put("Image",image[i]+"");
            arrayList.add(hashMap);

        }

        //from: A list of column names that will be added to the Map associated with each item.
        String[] from={"Name","Image"};
        //to: The views that should display column in the “from” parameter. These should all be TextViews.
        // The first N views in this list are given the values of the first N columns in the from parameter.
        int []to={R.id.textview,R.id.imageview};

        SimpleAdapter simpleAdapter=new SimpleAdapter(this,arrayList,R.layout.activity_list,from,to);
        listView.setAdapter(simpleAdapter);
    }
}