package com.example.tableaulayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler_view;
    CRAdaptater adaptater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler_view = findViewById(R.id.recycler_view);

        setRecyclerView();
    }

    private void setRecyclerView() {
        recycler_view.setHasFixedSize(true);
        recycler_view.setLayoutManager(new LinearLayoutManager(this));
        adaptater = new CRAdaptater(this,getList());
        recycler_view.setAdapter(adaptater);
    }

    private List<CRModel> getList(){
        List<CRModel> cr_list = new ArrayList<>();
        cr_list.add(new CRModel("Jean tartine","Pas trop","06/02/2023"));
        cr_list.add(new CRModel("Jean tartine","Pas trop","06/02/2023"));
        cr_list.add(new CRModel("Jean tartine","Pas trop","06/02/2023"));
        cr_list.add(new CRModel("Jean tartine","Pas trop","06/02/2023"));

        return  cr_list;
    }
}