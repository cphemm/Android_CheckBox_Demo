package com.example.carolynhemmings.checkbox;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBoxVanilla;
    private CheckBox checkBoxChocolate;
    private CheckBox checkBoxTuttiFruity;
    private Button showButton;
    private TextView showTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        checkBoxVanilla = (CheckBox) findViewById(R.id.checkBoxVanilla);
        checkBoxChocolate = (CheckBox) findViewById(R.id.checkBoxChocolate);
        checkBoxTuttiFruity = (CheckBox) findViewById(R.id.checkBoxTuttiFruity);
        showButton = (Button) findViewById(R.id.showButtonid);
        showTextView = (TextView) findViewById(R.id.showTextViewId);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();

                stringBuilder.append(checkBoxVanilla.getText().toString() + " status is: " + checkBoxVanilla.isChecked() + "\n");
                stringBuilder.append(checkBoxChocolate.getText().toString() + " status is: " + checkBoxChocolate.isChecked() + "\n");
                stringBuilder.append(checkBoxTuttiFruity.getText().toString() + " status is: " + checkBoxTuttiFruity.isChecked());

                showTextView.setText(stringBuilder);
            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
