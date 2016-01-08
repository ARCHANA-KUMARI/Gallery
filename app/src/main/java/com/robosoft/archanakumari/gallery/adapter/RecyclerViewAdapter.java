package com.robosoft.archanakumari.gallery.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.robosoft.archanakumari.gallery.R;

/**
 * Created by archanakumari on 4/1/16.
 */
public class RecyclerViewAdapter extends  RecyclerView.Adapter<RecyclerViewAdapter.LayoutHolder> {

    private View mOneRow;
    private Context mContext;

    public RecyclerViewAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public LayoutHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType%2==0) {
            mOneRow = LayoutInflater.from(mContext).inflate(R.layout.child, parent, false);
            Log.i("HEllo", "I am in onCreateViewHOlder");

        }
        else
        {
            mOneRow = LayoutInflater.from(mContext).inflate(R.layout.childtwo, parent, false);
        }
        LayoutHolder layoutHolder = new LayoutHolder(mOneRow);
        return layoutHolder;
    }

    @Override
    public void onBindViewHolder(LayoutHolder holder, int position) {
     if(position%2==0) {
         holder.mImagfirst.setImageResource(R.drawable.images);
         holder.mImageDelete.setImageResource(R.drawable.ic_delete_white_18dp);
         holder.mImageSecond.setImageResource(R.drawable.images);
         holder.mImageMarker.setImageResource(R.drawable.marker);
         holder.mImagprofilepic.setImageResource(R.drawable.profile);
         holder.mTextfirsttext.setText("Charles");
         holder.mImageMessage.setImageResource(R.drawable.ic_local_post_office_black_24dp);
         holder.mTextNumbers.setText("12");
         holder.mImageLikeofLayTwo.setImageResource(R.drawable.thumb);
         holder. mTextofLayoutTwo.setText("12");
         holder.mImageofLayThree.setImageResource(R.drawable.profile);
         holder.mFirstTextOfLayThree.setText("Sweet pad you");
         holder.mImageLikeofLayThree.setImageResource(R.drawable.thumb);
         holder.mTextSecondTextOfLayThree.setText("12");

     }
        else{
         holder.mImagepropicOfChildTwo.setImageResource(R.drawable.profile);
         holder. mImageofChildTwo.setImageResource(R.drawable.images);
     }

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    class LayoutHolder extends RecyclerView.ViewHolder{
      //child.xml
        private ImageView mImagfirst;
        private ImageView mImageDelete;
        private ImageView mImageSecond;
        private ImageView mImageMarker;
        //child of second layout
        private ImageView mImagprofilepic;
        private TextView mTextfirsttext;
        private ImageView mImageMessage;
        private TextView mTextNumbers;
        private  ImageView mImageLikeofLayTwo;
        private TextView mTextofLayoutTwo;
        //child of third layout
        private ImageView mImageofLayThree;
        private TextView mFirstTextOfLayThree;
        private ImageView mImageLikeofLayThree;
        private TextView mTextSecondTextOfLayThree;
        //chiltwo.xml
        private ImageView mImagepropicOfChildTwo;
        private ImageView mImageofChildTwo;

        public LayoutHolder(View itemView) {
            super(itemView);
            //child.xml
            mImagfirst = (ImageView) itemView.findViewById(R.id.firstimage);
            mImageDelete = (ImageView) itemView.findViewById(R.id.delete);
            mImageSecond = (ImageView) itemView.findViewById(R.id.secondimage);
            mImageMarker = (ImageView) itemView.findViewById(R.id.marker);
            //child of second layout
            mImagprofilepic = (ImageView) itemView.findViewById(R.id.propicone);
            mTextfirsttext = (TextView) itemView.findViewById(R.id.firsttextoflaytwo);
            mImageMessage = (ImageView) itemView.findViewById(R.id.message);
            mTextNumbers = (TextView) itemView.findViewById(R.id.numberone);
            mImageLikeofLayTwo = (ImageView) itemView.findViewById(R.id.likeoflaytwo);
            mTextofLayoutTwo = (TextView) itemView.findViewById(R.id.firsttextoflaytwo);
            //child of third layout
            mImageofLayThree = (ImageView) itemView.findViewById(R.id.imageoflaythree);
            mFirstTextOfLayThree = (TextView) itemView.findViewById(R.id.firsttextoflaythree);
            mImageLikeofLayThree = (ImageView) itemView.findViewById(R.id.likeoflaythree);
            mTextSecondTextOfLayThree = (TextView) itemView.findViewById(R.id.secondtextoflaythree);
            mImagepropicOfChildTwo = (ImageView) itemView.findViewById(R.id.propicofchildtwo);
            mImageofChildTwo = (ImageView) itemView.findViewById(R.id.imagtwoofchildtwo);

        }
    }

}
