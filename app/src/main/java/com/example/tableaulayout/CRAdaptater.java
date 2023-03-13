package com.example.tableaulayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CRAdaptater extends RecyclerView.Adapter<CRAdaptater.ViewHolder> {

    Context context;
    List<CRModel> cr_list;

    public CRAdaptater(Context context,List<CRModel> cr_list) {
        this.context = context;
        this.cr_list = cr_list;
    }

    @NonNull
    @Override
    public CRAdaptater.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CRAdaptater.ViewHolder holder, int position) {
        if (cr_list != null && cr_list.size() > 0){
            CRModel model = cr_list.get(position);
            holder.rapport_tv.setText(model.getRapport());
            holder.interet_tv.setText(model.getInteret());
            holder.date_tv.setText(model.getDate());
        } else {
            return;
        }
    }

    @Override
    public int getItemCount() {
        return cr_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView rapport_tv,interet_tv,date_tv;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            rapport_tv = itemView.findViewById(R.id.rapport_tv);
            interet_tv = itemView.findViewById(R.id.interet_tv);
            date_tv = itemView.findViewById(R.id.date_tv);
        }
    }
}
