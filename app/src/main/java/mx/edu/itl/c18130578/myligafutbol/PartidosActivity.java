package mx.edu.itl.c18130578.myligafutbol;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class PartidosActivity extends AppCompatActivity {

    List<Model> modelList;
    RecyclerView recyclerView;
    OrderAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partidos);

        modelList = new ArrayList<>();
        modelList.add(new Model("Atlas","Pachuca",R.drawable.atlas,R.drawable.pachuca,"Hoy, 05:40"));
        modelList.add(new Model("Atlas","Pachuca",R.drawable.atlas,R.drawable.pachuca,"Hoy, 05:40"));
        modelList.add(new Model("Atlas","Pachuca",R.drawable.atlas,R.drawable.pachuca,"Hoy, 05:40"));
        modelList.add(new Model("Atlas","Pachuca",R.drawable.atlas,R.drawable.pachuca,"Hoy, 05:40"));

        recyclerView =findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(null));
        mAdapter = new OrderAdapter(this,modelList);
        recyclerView.setAdapter(mAdapter);
    }
}