package mx.edu.itl.c18130578.myligafutbol;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    LinearLayout posicion,linePatron,lineaGoles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        posicion = findViewById(R.id.linea_posicion);
        linePatron = findViewById(R.id.linePatron);
        lineaGoles = findViewById(R.id.lineaGoles);

        posicion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tabl = new Intent(view.getContext(), TablaActivity.class);
                startActivity(tabl);
            }
        });

        linePatron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent par = new Intent(view.getContext(), PartidosActivity.class);
                startActivity(par);
            }
        });

        lineaGoles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gol = new Intent(view.getContext(), GolesActivity.class);
                startActivity(gol);
            }
        });

    }
}