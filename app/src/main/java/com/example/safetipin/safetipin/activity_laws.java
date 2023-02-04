package com.example.safetipin.safetipin;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.safetipin.R;

public class activity_laws extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(activity_laws.this,MainActivity.class));
        activity_laws.this.finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laws);
        RecyclerView recyclerView = findViewById(R.id.recycleLaws);
        String[] laws = new String[]{"The Prohibition of Child Marriage Act, 2006","Special Marriage Act, 1954","Dowry Prohibition Act, 1961","Indian Divorce Act, 1969","Maternity Benefit Act,1861","Medical Termination of Pregnancy Act,1971","Sexual Harassment of Women at Workplace (Prevention, Prohibition and Redress) Act, 2013","Indecent Representation of Women(Prevention) Act,1986","National Commission for Women Act, 1990","Equal Remuneration Act, 1976"};

        ContactsAdapter adapter = new ContactsAdapter(this, laws, position -> {
            Intent intent = new Intent(activity_laws.this, activity_law_displayer.class);
            intent.putExtra("position",position);
            startActivity(intent);
        });
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



        findViewById(R.id.backBtn).setOnClickListener(view -> {
            startActivity(new Intent(activity_laws.this,MainActivity.class));
            activity_laws.this.finish();
        });

    }


}