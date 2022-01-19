package com.example.project_kgu_eats;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BottomNavFragment2 extends Fragment {
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.bottom_fragment2,null);
        return view;

//        RelativeLayout layout = (RelativeLayout)inflater.inflate(R.layout.fragment_fragment2,
//
//                container, false);
//        return layout;
    }


}
