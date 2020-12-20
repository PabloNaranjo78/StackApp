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
import cr.ac.tec.stackapp.stack.Stack;

/***
 * Clase principal para la creaciónde la aplicación
 */
public class MainActivity extends AppCompatActivity {

    TextView numView;
    EditText entry;
    Stack stack = new Stack();

    /***
     * Se inicia la aplicación
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.numView = findViewById(R.id.numView);
        this.entry = findViewById(R.id.entry);
        actNum();
    }

    /***
     * Agrega un elemento al stack y actualiza el número en pantalla
     * @param view
     */
    public void push(View view){
        stack.push(Integer.parseInt(entry.getText().toString()));
        actNum();
        entry.setText("");
    }

    /***
     * Elimina un elemento al stack y actualiza el número en pantalla
     * @param view
     */
    public void pop(View view){
        if (stack.node != null){
            stack.pop();
            actNum();
        }
    }

    /***
     * Hace peek del stack
     * @param view
     */
    public void peek(View view){
        actNum();
    }

    /***
     * Actualiza el número en pantalla
     */
    private void actNum(){
        if (stack.node!=null ){
            numView.setText(stack.peek()+"");
        }else{
            numView.setText("Stack vacío");
        }
    }
}