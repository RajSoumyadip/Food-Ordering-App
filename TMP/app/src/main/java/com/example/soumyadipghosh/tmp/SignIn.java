package com.example.soumyadipghosh.tmp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.soumyadipghosh.tmp.Common.Common;
import com.example.soumyadipghosh.tmp.Model.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.rengwuxian.materialedittext.MaterialEditText;

import static android.R.attr.data;
import static android.R.id.edit;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class SignIn extends AppCompatActivity {

    EditText edtPhone,edtPassword;
    Button btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        edtPassword = (MaterialEditText)findViewById(R.id.edtPassword);
        edtPhone = (MaterialEditText)findViewById(R.id.edtPhone);
        btnSignIn = (Button)findViewById(R.id.btnSignIn);

        //Init Firebase
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference tabel_user = database.getReference("User");

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final ProgressDialog mDialog = new ProgressDialog(SignIn.this);
                mDialog.setMessage("Please Wait");
                mDialog.show();

                tabel_user.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        //Check if User Exists in DataBase
                        if (dataSnapshot.child(edtPhone.getText().toString()).exists())
                        {
                            //Get User Information
                            mDialog.dismiss();
                             User user = dataSnapshot.child(edtPhone.getText().toString()).getValue(User.class);
                            if (user.getPassword().equals(edtPassword.getText().toString()))
                            {
                            Toast.makeText(SignIn.this, "Sign in Successful", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(SignIn.this,MenuSelectionActivity.class);
                                Common.currentUser = user;
                                startActivity(intent);
                                finish();
                            }
                            else
                            {
                            Toast.makeText(SignIn.this, "Wrong Password!! Try Again", Toast.LENGTH_SHORT).show();
                            }
                        }

                        else {
                            mDialog.dismiss();
                            Toast.makeText(SignIn.this, "User Does Not Exist.PLease Sign Up.", Toast.LENGTH_SHORT).show();

                        }

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });
    }
}
