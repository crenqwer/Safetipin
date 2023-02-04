package com.example.safetipin.safetipin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.safetipin.R;

import java.util.ArrayList;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.MyViewHolder>{
    String[] laws;
    Context context;
    MyOnClickListener myOnClickListener;



    public ContactsAdapter(Context context, ArrayList<String> laws, MyOnClickListener onClickListener){
        this.laws = laws;
        this.context = context;
        this.myOnClickListener = onClickListener;
    }

    public ContactsAdapter(activity_contact context, ArrayList<String> send, MyOnClickListener onClickListener) {
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.law_it,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        int newPosition = position + 1;
        String displayString = newPosition + " " + laws[position];
        holder.law.setText(displayString);
        holder.law.setOnClickListener(view -> {
            myOnClickListener.onItemClicked(position);
        });
    }

    @Override
    public int getItemCount() {
        return laws.length;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView law;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            law = itemView.findViewById(R.id.lawItem);

        }
    }
}
