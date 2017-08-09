package cl.mind.listexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Bands> bands = new ArrayList<>();
    private TextView possitionTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bands.add(new Bands("Aisles", true));
        bands.add(new Bands("Delta", true));
        bands.add(new Bands("lol", false));

        possitionTv = (TextView) findViewById(R.id.possitionTv);
        possitionTv.setText(bands.get(0).getName());

        final EditText editText = (EditText) findViewById(R.id.inputBandEt);
        final CheckBox checkBox = (CheckBox) findViewById(R.id.rockCb);

        Button saveBtn = (Button) findViewById(R.id.saveBtn);
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addBandView(editText.getText().toString(), checkBox.isChecked());
            }
        });

        Button removeBtn = (Button) findViewById(R.id.removeBtn);

        removeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                removeBandView();
            }
        });
    }


    private void addBandView(String name, boolean rock) {

        bands.add(new Bands(name, rock));
        possitionTv.setText(String.valueOf(bands.size()));


    }

    private void removeBandView() {

        if (bands.size() > 0) {

            bands.remove(bands.size() - 1);
            possitionTv.setText(String.valueOf(bands.size()));


        } else {

            Toast.makeText(this, "NO QUEDAN MAS ELEMENTOS", Toast.LENGTH_SHORT).show();

        }


    }
}
