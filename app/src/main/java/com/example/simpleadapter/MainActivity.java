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

        ArrayList<HashMap<String,String>>arrayList= new ArrayList<>();
        listView=findViewById(R.id.listview);


        for(int i=0;i<name.length;i++){
            HashMap<String,String >hashMap=new HashMap<>();
            hashMap.put("Name",name[i]);
            hashMap.put("Image",image[i]+"");
            arrayList.add(hashMap);

        }
        String[] from={"Name","Image"};
        int []to={R.id.textview,R.id.imageview};

        SimpleAdapter simpleAdapter=new SimpleAdapter(this,arrayList,R.layout.activity_list,from,to);
        listView.setAdapter(simpleAdapter);
    }
}