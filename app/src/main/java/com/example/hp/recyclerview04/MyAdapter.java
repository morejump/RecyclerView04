package com.example.hp.recyclerview04;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by HP on 9/10/2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    List<Person> list;
    Context context;
    LayoutInflater layoutInflater;

    public MyAdapter(List<Person> list, Context context) {
        this.list = list;
        this.context = context;
        layoutInflater = layoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_on_list, null);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.getName().setText(list.get(position).getName());
        holder.getSDT().setText(list.get(position).getSDT());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private ImageView imageView;
        private TextView name;
        private TextView SDT;

        public TextView getName() {
            return name;
        }

        public void setName(TextView name) {
            this.name = name;
        }

        public TextView getSDT() {
            return SDT;
        }

        public void setSDT(TextView SDT) {
            this.SDT = SDT;
        }

        public MyViewHolder(View itemView) {
            super(itemView);
            name= (TextView) itemView.findViewById(R.id.txt_name);
            SDT= (TextView) itemView.findViewById(R.id.txt_SDT);
            imageView= (ImageView) itemView.findViewById(R.id.img_avatar);
            imageView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
//            Toast.makeText(, "", Toast.LENGTH_SHORT).show();
            Log.d("bug", "clicked image :)) ");
        }
    }
}
