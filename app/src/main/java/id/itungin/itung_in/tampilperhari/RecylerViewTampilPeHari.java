package id.itungin.itung_in.tampilperhari;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import id.itungin.itung_in.R;
import id.itungin.itung_in.tampil.RecyclerViewAdapter;

public class RecylerViewTampilPeHari extends RecyclerView.Adapter<RecylerViewTampilPeHari.MahasiswaViewHolder> {


private ArrayList<DataTampilPerhari> dataList;

public RecylerViewTampilPeHari(ArrayList<DataTampilPerhari> dataList) {
        this.dataList = dataList;
        }

@Override
public MahasiswaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.scroll_tampilperhari, parent, false);
        return new MahasiswaViewHolder(view);
        }

@Override
public void onBindViewHolder(MahasiswaViewHolder holder, final int position) {
        holder.txtJam.setText(dataList.get(position).getJam());
        holder.txtUang.setText(dataList.get(position).getHarga());
        holder.Tampilperhari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Indek Item" + position,Toast.LENGTH_LONG).show();
            }
        });
        }

@Override
public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
        }

public class MahasiswaViewHolder extends RecyclerView.ViewHolder{
    private TextView txtJam, txtUang;
    private ConstraintLayout Tampilperhari;

    public MahasiswaViewHolder(View itemView) {
        super(itemView);
        txtJam = (TextView) itemView.findViewById(R.id.tmpljam);
        txtUang = (TextView) itemView.findViewById(R.id.tgltmpl);
        Tampilperhari = (ConstraintLayout) itemView.findViewById(R.id.tampilperhari);
    }
}
}