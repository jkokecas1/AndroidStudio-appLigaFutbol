package mx.edu.itl.c18130578.myligafutbol;

import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TablaActivity extends AppCompatActivity {
    TableLayout tabla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabla);
        tabla =  findViewById(R.id.tablavew1);

        tabla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(view.getContext(),"S",Toast.LENGTH_SHORT);
            }
        });

    }
}