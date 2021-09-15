package com.example.biodatasederhana;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BiodataAdapter extends RecyclerView.Adapter<BiodataAdapter.BiodataViewHolder> {
    public ArrayList<BiodataProperti> isiBiodataku;

    public BiodataAdapter(ArrayList<BiodataProperti> isiBiodataku) {
        this.isiBiodataku = isiBiodataku;
    }

    @NonNull
    @Override
    public BiodataAdapter.BiodataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View tampilan=inflater.inflate(R.layout.isi_biodata,parent,false);
        return new BiodataViewHolder(tampilan);
    }

    @Override
    public void onBindViewHolder(@NonNull BiodataAdapter.BiodataViewHolder holder, int position) {
        holder.txtNama.setText(isiBiodataku.get(position).getNama());
        holder.txtNIM.setText(isiBiodataku.get(position).getNim());
        holder.txtHobi.setText(isiBiodataku.get(position).getHobi());
        holder.txtDesc.setText(isiBiodataku.get(position).getShortDesc());
        holder.txtAlamat.setText(isiBiodataku.get(position).getAlamat());
        holder.txtNomer.setText(isiBiodataku.get(position).getKontak());
        holder.txtEmail.setText(isiBiodataku.get(position).getEmail());
    }

    @Override
    public int getItemCount() {
        if (isiBiodataku!=null){
            return isiBiodataku.size() ;

        }
        return 0;
    }

    public class BiodataViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtNIM, txtHobi, txtDesc,txtEmail,txtNomer,txtAlamat;
        public BiodataViewHolder(@NonNull View itemView) {
            super(itemView);

            //
            txtNama= itemView.findViewById(R.id.text_nama);
            txtNIM= itemView.findViewById(R.id.text_nim);
            txtHobi= itemView.findViewById(R.id.text_hobi);
            txtDesc= itemView.findViewById(R.id.text_desc_singkat);
            txtEmail= itemView.findViewById(R.id.text_email);
            txtNomer= itemView.findViewById(R.id.text_kontak);
            txtAlamat= itemView.findViewById(R.id.text_alamat);
        }
    }
}
