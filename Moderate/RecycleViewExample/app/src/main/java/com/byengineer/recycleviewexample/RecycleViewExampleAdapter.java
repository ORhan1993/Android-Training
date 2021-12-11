package com.byengineer.recycleviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleViewExampleAdapter extends RecyclerView.Adapter<RecycleViewExampleAdapter.Myholder> {

    Context context;
    ArrayList<RecycleViewExampleModel> arrayList=new ArrayList<>();

    public RecycleViewExampleAdapter(Context context,ArrayList<RecycleViewExampleModel> arrayList)
    {
        this.context=context;
        this.arrayList=arrayList;
    }



    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.example_recycle_view_card,parent,false);

        return new Myholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewExampleAdapter.Myholder holder, int position) {
        int img=arrayList.get(position).getImage();
        String title=arrayList.get(position).getTitle();
        String subtitle=arrayList.get(position).getSubtitle();

        holder.imageView.setBackgroundResource(img);
        holder.title.setText(title);
        holder.sub_title.setText(subtitle);
        holder.imageView.setTag(title);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class Myholder extends  RecyclerView.ViewHolder{
        ImageView imageView;
        TextView title,sub_title;
        public Myholder(@NonNull final View itemView){
            super(itemView);
            imageView=itemView.findViewById(R.id.image);
            title=itemView.findViewById(R.id.title_rv_example);
            sub_title=itemView.findViewById(R.id.subtitle_rv_example);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(itemView.getContext(), itemView.getTag().toString(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
