package com.sharedpreferences;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et_input;
    private Button btn_save;

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor sharedPreferencesEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_input = (EditText) findViewById(R.id.et_input);
        btn_save = (Button) findViewById(R.id.btn_save);

        btn_save.setOnClickListener(this);

        //get shared preference object
        sharedPreferences = getSharedPreferences(Constant.ME, MODE_PRIVATE);

        //get editor sp object
        if (null != sharedPreferences)
            sharedPreferencesEditor = sharedPreferences.edit();

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_save:

                String input = et_input.getText().toString();
                if (!"".equals(input.trim())) {
                    Toast.makeText(MainActivity.this, "Input is empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                sharedPreferencesEditor.putString(Constant.preference.DATA, input);
                break;
        }
    }
}
