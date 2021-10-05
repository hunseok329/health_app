package com.example.heath_together;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

public class Main3 extends Fragment {       //GroupScActivitiy

    private String result;
    private View view;
    private Button moveButton;

    RecyclerView recyclerView;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.main3, container, false);

        moveButton = view.findViewById(R.id.changeAcButton);
        recyclerView = view.findViewById(R.id.group_list);


        moveButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                SearchAcFrag searchAcFrag = new SearchAcFrag();
                transaction.replace(R.id.main_frame, searchAcFrag);
                transaction.commit();

            }
        });



        return view;
    }
}
