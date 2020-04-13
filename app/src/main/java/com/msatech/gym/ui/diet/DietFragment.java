package com.msatech.gym.ui.diet;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.msatech.gym.R;

public class DietFragment extends Fragment {
private View v;
private Button button;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
     v =  inflater.inflate(R.layout.dietactivity,container,false);
     button  = (Button)v.findViewById(R.id.b1);
     button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v)
         {
             HomeViewModel wingFirstExercise = new HomeViewModel();
             getActivity().getSupportFragmentManager().beginTransaction()
                     .replace(R.id.fr, wingFirstExercise, "newframe")
                     .addToBackStack(null)
                     .commit();

         }
     });
     return v;
    }

}
