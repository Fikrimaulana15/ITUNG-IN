package id.itungin.itung_in.tampilperhari;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import id.itungin.itung_in.R;
import id.itungin.itung_in.tampil.Tampil;

public class TampilPerHari extends AppCompatActivity {

    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<DataTampilPerhari> dataSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_per_hari);

        Button Back = (Button) findViewById(R.id.back);

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TampilPerHari.this, Tampil.class);
                startActivity(i);
            }
        });
        dataSet = new ArrayList<>();
        initDataset();

        rvView = (RecyclerView) findViewById(R.id.receycleviewjam);
        rvView.setHasFixedSize(true);

        /**
         * Kita menggunakan LinearLayoutManager untuk list standar
         * yang hanya berisi daftar item
         * disusun dari atas ke bawah
         */
        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter = new RecylerViewTampilPeHari(dataSet);
        rvView.setAdapter(adapter);
//
    }

    private void initDataset() {

        dataSet.add(new DataTampilPerhari("10000","10:10"));
        dataSet.add(new DataTampilPerhari("10000","11:15"));
        dataSet.add(new DataTampilPerhari("10000","11:20"));
        dataSet.add(new DataTampilPerhari("10000","12:30"));
        dataSet.add(new DataTampilPerhari("10000","13:00"));
        dataSet.add(new DataTampilPerhari("10000","13:10"));
        dataSet.add(new DataTampilPerhari("10000","13:30"));
        dataSet.add(new DataTampilPerhari("10000","14:30"));
        dataSet.add(new DataTampilPerhari("10000","15:20"));
        dataSet.add(new DataTampilPerhari("10000","17:00"));


    }


}
