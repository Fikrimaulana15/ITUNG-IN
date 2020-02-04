package id.itungin.itung_in.tampil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import id.itungin.itung_in.MainActivity;
import id.itungin.itung_in.R;

public class Tampil extends AppCompatActivity {

    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil);


        Button Back = (Button) findViewById(R.id.back);

       Back.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent i = new Intent(Tampil.this, MainActivity.class);
                startActivity(i);
            }
        });

        dataSet = new ArrayList<>();
        initDataset();

        rvView = (RecyclerView) findViewById(R.id.receycleviewtgl);
        rvView.setHasFixedSize(true);

        /**
         * Kita menggunakan LinearLayoutManager untuk list standar
         * yang hanya berisi daftar item
         * disusun dari atas ke bawah
         */
        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(dataSet);
        rvView.setAdapter(adapter);
//
    }

    private void initDataset() {

        dataSet.add("11/01/2020");
        dataSet.add("12/01/2020");
        dataSet.add("13/01/2020");
        dataSet.add("14/01/2020");
        dataSet.add("15/01/2020");
        dataSet.add("16/01/2020");
        dataSet.add("17/01/2020");
        dataSet.add("18/01/2020");
        dataSet.add("19/01/2020");
        dataSet.add("20/01/2020");
    }


}
