package com.example.waclone;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class UpdatesFragment extends Fragment {

    TextInputEditText etName, etSms, etTime;
    Button btnAddNewChat, btnClear;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        etName = view.findViewById(R.id.etName);
        etSms = view.findViewById(R.id.etSms);
        etTime = view.findViewById(R.id.etTime);
        btnClear = view.findViewById(R.id.btnclear);
        btnAddNewChat = view.findViewById(R.id.btnAddNewChat);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear();
            }
        });

        btnAddNewChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name, sms, time;

                name = etName.getText().toString().trim();
                sms = etSms.getText().toString().trim();
                time = etTime.getText().toString().trim();

                MyApplication.chatsList.add(new Chat(name, "", sms, time));
                Toast.makeText(getContext(), "Record added", Toast.LENGTH_SHORT).show();
                clear();
      //          ChatsFragment.adapter.notifyDataSetChanged();

            }
        });

    }
    private void clear()
    {
        etName.setText("");
        etSms.setText("");
        etTime.setText("");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_updates, container, false);
    }
}