package com.example.shakeapp;

import android.content.Context;
import android.content.Intent;
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

        String nameofshake = modelList.get(position).getsShakeName();
        String descriptionofshake = modelList.get(position).getsShakeDetail();
        int images = modelList.get(position).getsShakePhoto();

        holder.sShakeName.setText(nameofshake);
        holder.sShakeDescription.setText(descriptionofshake);
        holder.imageView.setImageResource(images);

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    // in order to make our views responsive we can implement onclicklistener on our recyclerview

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        // here we will find the views on which we will inflate our data

        TextView sShakeName, sShakeDescription;
        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);

            sShakeName = itemView.findViewById(R.id.shakeName);
            sShakeDescription = itemView.findViewById(R.id.description);
            imageView = itemView.findViewById(R.id.shakeImage);
            itemView.setOnClickListener(this);


        }

        @Override
        public void onClick(View v) {

            // lets get the position of the view in list and then work on it

            int position = getAdapterPosition();

            if (position == 0) {
                Intent intent = new Intent(context, InfoActivity.class);
                context.startActivity(intent);
            }

           // if (position == 1) {
               // Intent intent2 = new Intent(context, LatteActivity.class);
//            }
        }
    }
}
