package com.example.hanifa_maimaitijiang_java3_hw2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.hanifa_maimaitijiang_java3_hw2.R;

public class MainFragment extends Fragment {
    Button btn_plus, btn_minus;
    TextView tv;

    int n;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Init();
        InitClick();
    }

    void Init() {
        n = 0;
        btn_plus = requireActivity().findViewById(R.id.btn_plus);
        btn_minus = requireActivity().findViewById(R.id.btn_minus);
        tv = requireActivity().findViewById(R.id.tv);
    }

    void InitClick() {
        btn_plus.setOnClickListener(view-> {
            tv.setText(String.valueOf(++n));
        });

        btn_minus.setOnClickListener(view-> {
            tv.setText(String.valueOf(--n));
        });
    }
}