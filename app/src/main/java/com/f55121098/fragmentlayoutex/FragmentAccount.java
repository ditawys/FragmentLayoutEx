package com.f55121098.fragmentlayoutex;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentAccount extends Fragment {
        View view;
        public FragmentAccount (){
        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                                 Bundle savedInstanceState) {
            view = inflater.inflate(R.layout.account_fragment,container,false);
            return view;
        }
    }