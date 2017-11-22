package com.example.c4q.whatismyaddress;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edit;
    Button button1, button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edit = (EditText) findViewById(R.id.Edit1);
        button1= (Button) findViewById(R.id.Button1);
        button2= (Button) findViewById(R.id.Button2);

        private void address_shared_preferences(String edit){
            SharedPreferences sharedPreferences = getSharedPreferences(edit, MODE_PRIVATE);

            String key = getString(R.string.Address);
            String existingaddress= sharedPreferences.getString(key, null);
    }

    public void no(View view)
    {
        Intent intent = new Intent(MainActivity.this, RecyclerView.class);
        startActivity(intent);

        Intent sharedpref = getIntent();
    }


}
}
