package mx.edu.itl.c18130578.myligafutbol;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.ViewHolder> {

    List<Model> modelList;
    Context context;

    public OrderAdapter(Context context, List<Model> modelList) {
        this.context = context;
        this.modelList = modelList;
    }

    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int i) {

        View view = LayoutInflater.from(context).inflate(R.layout.listitem, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder( ViewHolder holder, int position) {

        // here we will find the position and start setting the output on our views

        String nameEquipo1 = modelList.get(position).getEquipo1name();
        int images1 = modelList.get(position).getEqiopo1Photo();
        String nameEquipo2 = modelList.get(position).getEquipo2name();
        int images2 = modelList.get(position).getEqiopo2Photo();
        String fecha = modelList.get(position).getFecha();

        holder.nom1.setText(nameEquipo1);
        holder.nom2.setText(nameEquipo2);
        holder.imageView.setImageResource(images1);
        holder.imageView2.setImageResource(images2);
        holder.fecha.setText(fecha);

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    // in order to make our views responsive we can implement onclicklistener on our recyclerview

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        // here we will find the views on which we will inflate our data

        TextView nom1, nom2, fecha;
        ImageView imageView,imageView2;

        public ViewHolder(View itemView) {
            super(itemView);

            nom1 = itemView.findViewById(R.id.nomb1);
            fecha = itemView.findViewById(R.id.coffeeName);
            imageView = itemView.findViewById(R.id.imgEquipo1);
            nom2 = itemView.findViewById(R.id.nom2);
            imageView2 = itemView.findViewById(R.id.imgEquipo2);
            itemView.setOnClickListener(this);


        }

        @Override
        public void onClick(View v) {

            // lets get the position of the view in list and then work on it

            int position = getAdapterPosition();

            if (position == 0) {
                //Intent intent = new Intent(context, InfoActivity.class);
                //context.startActivity(intent);
            }

            if (position == 1) {
                //Intent intent2 = new Intent(context, LatteActivity.class);
                //context.startActivity(intent2);
            }
        }
    }
}