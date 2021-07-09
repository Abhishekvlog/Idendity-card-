package com.example.idenditycard;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PeopleViewHolder extends RecyclerView.ViewHolder {
    private TextView mtvCompany;
    private ImageView mtvimage;
    private TextView mtvage;
    private TextView mtvprofession;

    public PeopleViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        mtvCompany = itemView.findViewById(R.id.tvCompany);
        mtvimage = itemView.findViewById(R.id.tvimage);
        mtvage = itemView.findViewById(R.id.tvage);
        mtvprofession = itemView.findViewById(R.id.tvprofession);
    }
    public void setData(People people){
        mtvCompany.setText(people.getCompany());
        mtvimage.setImageResource(people.getImage());
        mtvage.setText(people.getAge()+"");
        mtvprofession.setText(people.getProfession());
    }
}
