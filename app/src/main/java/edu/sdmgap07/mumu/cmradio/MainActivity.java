package edu.sdmgap07.mumu.cmradio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declaring Variable
    private RadioGroup radioGroup;
    private Button button, inte;
    private RadioButton radioButton;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find
        radioGroup = findViewById(R.id.radio);
        button = findViewById(R.id.button);
        result = findViewById(R.id.result);
        inte = findViewById(R.id.next);

        //set on click listener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selected = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(selected);
                String value = radioButton.getText().toString();
                result.setText("You are selected as a "+value+ "!");
            }
        });

        inte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Second.class);
                startActivity(intent);
            }
        });
    }
}
