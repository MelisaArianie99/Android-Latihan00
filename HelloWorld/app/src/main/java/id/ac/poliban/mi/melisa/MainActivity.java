package id.ac.poliban.mi.melisa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etNim = findViewById(R.id.etNim);
        final EditText etNama = findViewById(R.id.etNama);
        Button btClear = findViewById(R.id.btClear);
        Button btSubmit = findViewById(R.id.btSubmit);

        //pasang listener dan handling pada btClear
        btClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNim.setText(""); //etNim kosongkan textnya
                etNama.setText("");//etNama kosongkan textnya
                etNim.requestFocus();//fokus kursor ada di etNim

            }
        });

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                etNim.setText("");
                etNama.setText("");
                Toast.makeText(MainActivity.this, "Data Telah Dibuat", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
