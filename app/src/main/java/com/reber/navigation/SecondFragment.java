package com.reber.navigation;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondFragment extends Fragment {

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button button = view.findViewById(R.id.button2);
        TextView age = view.findViewById(R.id.ageText);
        assert getArguments() != null;
        String input = getArguments().getString("age");
        TextView textBox = view.findViewById(R.id.textView);
        textBox.setText(input);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goFirst(view);
            }
        });
    }

    public void goFirst(View view){
        Navigation.findNavController(view).navigate(R.id.action_secondFragment_to_firstFragment);
    }
}