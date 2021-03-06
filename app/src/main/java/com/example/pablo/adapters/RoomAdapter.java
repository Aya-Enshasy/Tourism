package com.example.pablo.adapters;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.pablo.R;
import com.example.pablo.activity.BookingInfo;
import com.example.pablo.interfaces.MyInterface;
import com.example.pablo.interfaces.RoomsInterface;
import com.example.pablo.interfaces.Service;
import com.example.pablo.databinding.RoomItemBinding;
import com.example.pablo.model.rooms.Data;

import java.util.List;

import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;

public class RoomAdapter extends RecyclerView.Adapter<RoomAdapter.ViewHolder> {
    private List<Data> list  ;
    Context context;
    private RoomsInterface listener ;

    public RoomAdapter(Context context, RoomsInterface listener){
        this.context= context;
        this.listener=listener;
    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        RoomItemBinding binding = RoomItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(RoomAdapter.ViewHolder holder, int position) {

        holder.binding.room.setText(list.get(position).getName()+"");
        holder.binding.roomNum.setText(list.get(position).getCapacity());
        holder.binding.roomPrice.setText(list.get(position).getPricePerNight()+"");
        holder.binding.availableRoom.setText(list.get(position).getAvailableRooms()+"");
        Log.e("image",list.get(2).getRoomImages()+"");

//
//    Glide.with(context).load(list.get(position).getRoomImages())
//                .transition(withCrossFade())
//                .circleCrop()
//                .apply(new RequestOptions().transform(new RoundedCorners(5))
//                        .skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE))
//                .error(R.drawable.bed1).skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE)
//                .into((holder).binding.img1);
        listener.onItemRoomClick(list.get(position).getAvailableRooms());


        if (list.get(position).getAvailableRooms()==0){
            holder.binding.book.setEnabled(false);
            holder.binding.book.setBackgroundDrawable(context.getResources()
                    .getDrawable(R.drawable.disable_button));
        }

        holder.binding.book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                listener.onItemClick(list.get(position).getId());

            }
        });


    }

    @Override
    public int getItemCount() {
        return list!=null?list.size():0;
    }


    public void setdata(List<Data> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder  {
        RoomItemBinding binding;
        public ViewHolder(RoomItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }


    }

}

