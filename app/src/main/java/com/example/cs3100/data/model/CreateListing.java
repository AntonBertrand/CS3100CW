package com.example.cs3100.data.model;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


import com.example.cs3100.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CreateListing extends AppCompatActivity {

    Button createlisting_btn;
    EditText job_title;
    EditText job_desc;

    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_listing);

        job_title = (EditText) findViewById(R.id.job_title);
        job_desc = (EditText) findViewById(R.id.job_desc);
        createlisting_btn = (Button) findViewById(R.id.createlisting_btn);



        createlisting_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("Jobs");

                final String name = job_title.getText().toString().trim();
                final String description = job_desc.getText().toString().trim();

                JobHelperClass JobHelperClass = new JobHelperClass(name,description);


                reference.setValue(JobHelperClass);
            }
        });


    }
}
