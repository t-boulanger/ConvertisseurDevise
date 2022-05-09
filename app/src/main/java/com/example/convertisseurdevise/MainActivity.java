package com.example.convertisseurdevise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btConvertir;
    private Spinner spDevise1;
    private Spinner spDevise2;
    private String ChoixDevise;
    private EditText etDevise1;
    private EditText etDevise2;
    private String TextNombre1;
    private String Nombre2;
    private int Nombre1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btConvertir=(Button) findViewById(R.id.btConvertir);
        spDevise1=(Spinner) findViewById(R.id.spDevise1);
        spDevise2=(Spinner) findViewById(R.id.spDevise2);
        etDevise1=(EditText) findViewById(R.id.etDevise1);
        etDevise2=(EditText) findViewById(R.id.etDevise2);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Devise, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spDevise1.setAdapter(adapter);
        spDevise2.setAdapter(adapter);

        spDevise1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ChoixDevise = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(adapter.getContext(), ChoixDevise, Toast.LENGTH_SHORT).show();

                TextNombre1=etDevise1.getText().toString();
                Nombre1 = Integer.parseInt(TextNombre1);

                etDevise2.setText(Nombre1);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}