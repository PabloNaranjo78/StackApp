package cr.ac.tec.stackapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    TextView numView;
    EditText entry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.numView = findViewById(R.id.numView);
        this.entry = findViewById(R.id.entry);
    }

    public void push(View view){
        this.numView.setText("Prueba");
    }

    public void pop(View view){

    }

    public void peek(View view){

    }
}