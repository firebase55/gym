package com.msatech.gym.ui.diet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.msatech.gym.R;

public class HomeViewModel extends Fragment
{
    private ImageButton back;
    private View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.diet,container,false);
        back = (ImageButton)view.findViewById(R.id.back_id);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                DietFragment diet = new DietFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fr, diet, "newframe")
                        .addToBackStack(null)
                        .commit();


            }
        });
        return view;
    }

}