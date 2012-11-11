package pl.edu.uj.myfirstapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.MenuItem;
import android.widget.TextView;
import android.support.v4.app.NavUtils;

public class DisplayMessageActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        
        //Get the message from the intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        
        //Create the TextView
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);
        
        //Set the textView as a activity layout
        setContentView(textView);
    }

    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
