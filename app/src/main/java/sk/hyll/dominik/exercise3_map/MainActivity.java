package sk.hyll.dominik.exercise3_map;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void OpenMap(View view){

        try {
            double lat = Double.parseDouble(((EditText)findViewById(R.id.lat)).getText().toString());
            double lng = Double.parseDouble(((EditText)findViewById(R.id.lng)).getText().toString());

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:"+lat+","+lng));
            startActivity(intent);

        }catch (Exception ex) {
            Toast.makeText(this, "Enter valid coordinates", Toast.LENGTH_SHORT).show();
        }
    }
}
