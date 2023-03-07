package com.reber.navigation;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FirstFragment extends Fragment {

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button button = view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goSecond(view);
            }
        });
    }
    public void goSecond(View view){

        EditText ageInput = view.findViewById(R.id.ageInput);
        String data = String.valueOf(ageInput.getText());
        Bundle bundle = new Bundle();
        bundle.putString("age",data);
        NavController navController = Navigation.findNavController(view);
        navController.navigate(R.id.action_firstFragment_to_secondFragment,bundle);

    }
}