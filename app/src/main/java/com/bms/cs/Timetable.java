package com.bms.cs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.bms.cs.Adapters.ListAdapterTV;
import com.bms.cs.classes.TimeTableItem;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class Timetable extends AppCompatActivity {
    public ArrayList arrayListtm;
    ListView listView;

    ImageView bck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);

        bck = findViewById(R.id.backtble);



        listView = findViewById(R.id.listviewTimeTable);
        listItemShow();

        ListAdapterTV listAdapter = new ListAdapterTV(this, arrayListtm);
        listView.setAdapter(listAdapter);


        bck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Timetable.this, HomeScreen.class);
                startActivity(i);
            }
        });


    }

    private void listItemShow() {
        arrayListtm = new ArrayList();


        arrayListtm.add(new TimeTableItem("Tuesday","9:00am to 11:00am","GST 101: Use of English 1","Statistics Hall"));
        arrayListtm.add(new TimeTableItem("Wednesday","9:00am to 11:00am","GST 103:Citizenship Education","Lecture East"));
        arrayListtm.add(new TimeTableItem("Wednesday","12:00pm to 2:00pm","GST 105:Philosophy and Logic","New Exam Hall"));
        arrayListtm.add(new TimeTableItem("Thursday","9:00am to 11:00am","GST 121:Use of Library","Lecture East Big Hall"));
    }
}