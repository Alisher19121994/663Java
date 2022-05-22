package com.example.a663java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView1, recyclerView2, recyclerView3,recyclerView4,recyclerView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data_1();
        data_2();
        data_3();
        data_4();
        data_5();
    }

    void data_1() {
        recyclerView1 = findViewById(R.id.main_recyclerview_id);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ArrayList<Hor_0> list = new ArrayList<>();
        list.add(new Hor_0("fRIEND", R.drawable.rasm));
        list.add(new Hor_0("fRIEND", R.drawable.rasm));
        list.add(new Hor_0("fRIEND", R.drawable.rasm));
        list.add(new Hor_0("fRIEND", R.drawable.rasm));
        list.add(new Hor_0("fRIEND", R.drawable.rasm));
        list.add(new Hor_0("fRIEND", R.drawable.rasm));
        list.add(new Hor_0("fRIEND", R.drawable.rasm));
        Adapter_H adapter_h = new Adapter_H(list, this);
        recyclerView1.setAdapter(adapter_h);


    }

    void data_2() {
        recyclerView2 = findViewById(R.id.main_recyclerview_2_id);
        recyclerView2.setLayoutManager(new GridLayoutManager(this, 2));
        ArrayList<G_1> list = new ArrayList<>();
        list.add(new G_1(R.drawable.s1));
        list.add(new G_1(R.drawable.s2));
        list.add(new G_1(R.drawable.s1));
        list.add(new G_1(R.drawable.s2));
        list.add(new G_1(R.drawable.s1));
        list.add(new G_1(R.drawable.s2));
        Adapter_G_1 adapter_g_1 = new Adapter_G_1(list, this);
        recyclerView2.setAdapter(adapter_g_1);
    }

    void data_3() {
        recyclerView3 = findViewById(R.id.main_recyclerview_3_id);
        recyclerView3.setLayoutManager(new GridLayoutManager(this, 2));
        ArrayList<G_2> list = new ArrayList<>();
        list.add(new G_2(R.drawable.c2));
        list.add(new G_2(R.drawable.c2));
        list.add(new G_2(R.drawable.c3));
        list.add(new G_2(R.drawable.c4));
        list.add(new G_2(R.drawable.c2));
        list.add(new G_2(R.drawable.c5));
        list.add(new G_2(R.drawable.c2));

        Adapter_G_2 adapter_g_2 = new Adapter_G_2(list, this);
        recyclerView3.setAdapter(adapter_g_2);
    }

    void data_4() {
        recyclerView4 = findViewById(R.id.main_recyclerview_4_id);
        recyclerView4.setLayoutManager(new GridLayoutManager(this, 1));
        ArrayList<Books> list = new ArrayList<>();
        list.add(new Books(R.drawable.home_1, "The Very Hungry Caterpiller", "$5 06"));
        list.add(new Books(R.drawable.home_1, "The Very Hungry Caterpiller", "$5 06"));
        list.add(new Books(R.drawable.home_1, "The Very Hungry Caterpiller", "$5 06"));
        list.add(new Books(R.drawable.home_1, "The Very Hungry Caterpiller", "$5 06"));
        list.add(new Books(R.drawable.home_1, "The Very Hungry Caterpiller", "$5 06"));
        list.add(new Books(R.drawable.home_1, "The Very Hungry Caterpiller", "$5 06"));
        list.add(new Books(R.drawable.home_1, "The Very Hungry Caterpiller", "$5 06"));
        list.add(new Books(R.drawable.home_1, "The Very Hungry Caterpiller", "$5 06"));
        list.add(new Books(R.drawable.home_1, "The Very Hungry Caterpiller", "$5 06"));
        list.add(new Books(R.drawable.home_1, "The Very Hungry Caterpiller", "$5 06"));
        list.add(new Books(R.drawable.home_1, "The Very Hungry Caterpiller", "$5 06"));
        list.add(new Books(R.drawable.home_1, "The Very Hungry Caterpiller", "$5 06"));

        Adapter_Books books = new Adapter_Books(list, this);
        recyclerView4.setAdapter(books);
    }
    void data_5() {
        recyclerView5 = findViewById(R.id.main_recyclerview_5_id);
        recyclerView5.setLayoutManager(new GridLayoutManager(this, 2));
        ArrayList<Explores> list = new ArrayList<>();
        list.add(new Explores(R.drawable.home_2,"Beauty"));
        list.add(new Explores(R.drawable.home_6,"Beauty"));
        list.add(new Explores(R.drawable.home_2,"Beauty"));
        list.add(new Explores(R.drawable.home_7,"Beauty"));
        list.add(new Explores(R.drawable.home_2,"Beauty"));
        list.add(new Explores(R.drawable.home_6,"Beauty"));
        list.add(new Explores(R.drawable.home_8,"Beauty"));
        list.add(new Explores(R.drawable.home_2,"Beauty"));
        list.add(new Explores(R.drawable.home_7,"Beauty"));
        list.add(new Explores(R.drawable.home_2,"Beauty"));
        list.add(new Explores(R.drawable.home_9,"Beauty"));
        list.add(new Explores(R.drawable.home_8,"Beauty"));
        list.add(new Explores(R.drawable.home_6,"Beauty"));

        Adapter_Explores explores = new Adapter_Explores(list, this);
        recyclerView5.setAdapter(explores);
    }
}