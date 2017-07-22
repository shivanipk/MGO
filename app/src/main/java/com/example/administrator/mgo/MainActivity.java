package com.example.administrator.mgo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private String array_spinner[];
    private String array_spinner1[];
    private static Button rtg;
    Spinner spinnerS;

    //private FirebaseDatabase dbInst;
    //private DatabaseReference dbRef;

    //private String artifactId;

    //private DatabaseReference mDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        array_spinner=new String []{"Marathi","English","French","Chinese","Urdu"};
        array_spinner1=new String []{"No vice","Medium","Expert"};


        Spinner s = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, array_spinner);
        s.setAdapter(adapter);

        /*s = (Spinner) findViewById(R.id.spinner1);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, array_spinner1);
        s.setAdapter(adapter);*/

        onClickButtonListener();


       // FirebaseDatabase database = FirebaseDatabase.getInstance();
       // DatabaseReference myRef = database.getReference("message");

       // myRef.setValue("Hello, World!");
        /*
        //1st try
        //for artifact database
        dbInst = FirebaseDatabase.getInstance();

        // get reference to 'users' node
        dbRef = dbInst.getReference("MGO");

        // store app title to 'app_title' node
        dbInst.getReference("app_title").setValue("Artifact Database");

        createartifact();

        */

        //2nd try
       // mDatabase = FirebaseDatabase.getInstance().getReference();

        //Artifact artifact = new Artifact("2008","spk bro","20 august 1996","spk","jallu","vattad","mattad","the kondewar family");

        //mDatabase.child("users").child("1000").setValue(artifact);
    }
    public void onClickButtonListener(){

        rtg = (Button) findViewById(R.id.button);
        rtg.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick (View v){

                        String level = spinnerS.getSelectedItem().toString();
                        Intent i = new Intent("com.example.administrator.mgo.AfterLogin");
                        i.putExtra("level",level);
                        startActivity(i);

                    }
                }
        );

    }



    /**
     * Creating new artifact node under 'artifacts'
     */
    /*private void createartifact() {
        // TODO
        // In real apps this artifactId should be fetched
        // by implementing firebase auth
        if (TextUtils.isEmpty(artifactId)) {
            artifactId = dbRef.push().getKey();
        }

        Artifact artifact = new Artifact("2008","spk bro","20 august 1996","spk","jallu","vattad","mattad","the kondewar family");

        dbRef.child("0001").setValue(artifact);

        //addartifactChangeListener();
    }*/


    /**
     * artifact data change listener
     */
    /*private void addartifactChangeListener() {
        // artifact data change listener
        dbRef.child(artifactId).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Artifact artifact = dataSnapshot.getValue(Artifact.class);

                // Check for null
                if (artifact == null) {
                    Log.e(TAG, "artifact data is null!");
                    return;
                }

                Log.e(TAG, "artifact data is changed!" + artifact.name + ", " + artifact.email);

                // Display newly updated name and email
                txtDetails.setText(artifact.name + ", " + artifact.email);

                // clear edit text
                inputEmail.setText("");
                inputName.setText("");

                toggleButton();
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.e(TAG, "Failed to read artifact", error.toException());
            }
        });
    }*/

}
