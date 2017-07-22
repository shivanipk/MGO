package com.example.administrator.mgo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ViewInfo extends AppCompatActivity {





    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_info);

        Bundle bundle = getIntent().getExtras();
        String scannedQr = bundle.getString("scanned");
        mDatabase = FirebaseDatabase.getInstance().getReference();



        //Value event listener for realtime data update
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                for (DataSnapshot postSnapshot : snapshot.getChildren()) {
                    //Getting the data from snapshot
                    Artifact a = postSnapshot.getValue(Artifact.class);

                    //Adding it to a string
                    String string = "Name: "+person.getName()+"\nAddress: "+person.getAddress()+"\n\n";

                    //Displaying it on textview
                    textViewPersons.setText(string);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("The read failed: " + databaseError.getMessage());

            }

        });


    }
}
