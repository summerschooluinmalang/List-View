package id.technologue.appsl.tutoriallistview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by jauharibill on 7/5/2018.
 */

public class SecondActivity extends Activity {

    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_second);

        TextView txtProduct = (TextView) findViewById(R.id.team_label);

        Intent i = getIntent();
        String product = i.getStringExtra("team");
        txtProduct.setText(product);

    }
}
