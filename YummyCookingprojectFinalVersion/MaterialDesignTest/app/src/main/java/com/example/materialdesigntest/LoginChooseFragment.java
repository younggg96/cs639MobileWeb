package com.example.materialdesigntest;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.button.MaterialButton;

public class LoginChooseFragment extends Fragment {

    MaterialButton mMaterialButtonGuest = null;
    MaterialButton mMaterialButtonLoginNow = null;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_loginchoose, container, false);

        mMaterialButtonGuest = view.findViewById(R.id.as_guest_button);
        mMaterialButtonLoginNow = view.findViewById(R.id.login_now_button);

        mMaterialButtonLoginNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((NavigationHost) getActivity()).navigateTo(new LoginUserPassFragment(), false);
            }
        });
        mMaterialButtonGuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // cannot go back to the login activity
                Intent intent=new Intent();
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setClass(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });


        return view;


    }



}
