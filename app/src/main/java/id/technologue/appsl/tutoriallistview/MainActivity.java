package id.technologue.appsl.tutoriallistview;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] teams = getResources().getStringArray(R.array.teams);

        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, R.id.item, teams));

        ListView lv = getListView();

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                String team = ((TextView) view).getText().toString();

                Intent il = new Intent(getApplicationContext(), SecondActivity.class);

                il.putExtra("team", team);
                startActivity(il);
            }
        });
    }

}
