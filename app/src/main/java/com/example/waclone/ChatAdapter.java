package com.example.waclone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder>{

    ArrayList<Chat> chats;

    public ChatAdapter(Context context, ArrayList<Chat> chats)
    {
        this.chats = chats;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.singl_chat_item_design, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemView.setTag(chats.get(position));
        holder.scidMsg.setText(chats.get(position).getMsg());
        holder.scidName.setText(chats.get(position).getName());
        holder.scidTime.setText(chats.get(position).getTime());
        holder.scidLogo.setImageResource(R.drawable.logo);
    }

    @Override
    public int getItemCount() {
        return chats.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView scidLogo;
        TextView scidName, scidMsg, scidTime;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            scidLogo = itemView.findViewById(R.id.scidLogo);
            scidName = itemView.findViewById(R.id.scidName);
            scidMsg = itemView.findViewById(R.id.scidMsg);
            scidTime = itemView.findViewById(R.id.scidTime);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }
    }
}
