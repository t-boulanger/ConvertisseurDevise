package com.example.convertisseurdevise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btConvertir;
    private Spinner spDevise1;
    private Spinner spDevise2;
    private String ChoixDevise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btConvertir=(Button) findViewById(R.id.btConvertir);
        spDevise1=(Spinner) findViewById(R.id.spDevise1);
        spDevise2=(Spinner) findViewById(R.id.spDevise2);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Devise, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spDevise1.setAdapter(adapter);
        spDevise2.setAdapter(adapter);

        spDevise1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ChoixDevise = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(adapter.getContext(), ChoixDevise, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}