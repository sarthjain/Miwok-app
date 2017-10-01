package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sarth on 7/29/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mResourceId;

    public WordAdapter(Activity context, ArrayList<Word> list, int id)
    {
        super(context,0,list);
        mResourceId=id;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentAndroidFlavor = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.default_text_view);

        nameTextView.setText(currentAndroidFlavor.getDefaultTranslation());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);

        numberTextView.setText(currentAndroidFlavor.getMivokTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
        if(currentAndroidFlavor.haveImage()) {
            imageView.setImageResource(currentAndroidFlavor.getImageId());
            imageView.setVisibility(View.VISIBLE);
        }
        else
        {
            imageView.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
