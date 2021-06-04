package com.example.firebaserecycleradapter;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


public class descfragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    String phoneNumData, aadharNumData, imageURL2, ageData, verified;

    public descfragment() {

    }

    public descfragment(String phoneNumData, String aadharNumData, String ageData, String imageURL2 , String verified) {
        this.phoneNumData=phoneNumData;
        this.aadharNumData=aadharNumData;
        this.ageData=ageData;
        this.imageURL2=imageURL2;
        this.verified=verified;
    }

    public static descfragment newInstance(String param1, String param2) {
        descfragment fragment = new descfragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_descfragment, container, false);

        ImageView imageholder=view.findViewById(R.id.imageholder);
        TextView nameholder=view.findViewById(R.id.nameholder);
        TextView courseholder=view.findViewById(R.id.courseholder);
        TextView emailholder=view.findViewById(R.id.emailholder);
        TextView verifiedholder = view.findViewById(R.id.verifiedholder);

        nameholder.setText(phoneNumData);
        courseholder.setText(aadharNumData);
        emailholder.setText(ageData);
        Glide.with(getContext()).load(imageURL2).into(imageholder);

        if(verified.equals("true")){
            verifiedholder.setText("Verified User");
            verifiedholder.setTextColor(Color.parseColor("#238E32"));
        }
        else{
            verifiedholder.setText("Not Verified");
            verifiedholder.setTextColor(Color.parseColor("#FF0000"));
        }

        return  view;
    }

    public void onBackPressed()
    {
        AppCompatActivity activity=(AppCompatActivity)getContext();
        activity.getSupportFragmentManager().beginTransaction().replace(R.id.wrapper,new recfragment()).addToBackStack(null).commit();

    }
}