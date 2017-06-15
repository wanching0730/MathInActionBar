package com.example.android.mathinactionbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private EditText number1_field, number2_field, result_field;
    private int number1, number2, result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        number1_field = (EditText) findViewById(R.id.number_1);
        number2_field = (EditText) findViewById(R.id.number_2);
        result_field = (EditText)findViewById(R.id.result);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.plus:
            {
                number1 = Integer.parseInt(number1_field.getText().toString());
                number2 = Integer.parseInt(number2_field.getText().toString());
                result = number1 + number2;
                result_field.setText("" + result);
                return true;
            }
            case R.id.minus:
            {
                number1 = Integer.parseInt(number1_field.getText().toString());
                number2 = Integer.parseInt(number2_field.getText().toString());
                result = number1 - number2;
                result_field.setText("" + result);
                return true;
            }
            case R.id.multiply:
            {
                number1 = Integer.parseInt(number1_field.getText().toString());
                number2 = Integer.parseInt(number2_field.getText().toString());
                result = number1 * number2;
                result_field.setText("" + result);
                return true;
            }
            case R.id.divide:
            {
                number1 = Integer.parseInt(number1_field.getText().toString());
                number2 = Integer.parseInt(number2_field.getText().toString());
                result = number1 / number2;
                result_field.setText("" + result);
                return true;
            }
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
