package com.convertmyfile.smartrollcallmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AdminPage extends AppCompatActivity {
    EditText company, password;
    Button enter;
    AdminHelp admin;
    DatabaseReference reff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_page);

        company = findViewById(R.id.insertcompanyname);
        password = findViewById(R.id.insertpassword);
        enter = findViewById(R.id.enterbutton);
        admin = new AdminHelp();

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String CompanyName = company.getText().toString().trim();
                String Password = password.getText().toString().trim();
                reff = FirebaseDatabase.getInstance().getReference("Admin");
                reff.setValue("111");
                //Toast.makeText(AdminPage.this, "Data inserted!", Toast.LENGTH_LONG).show();

            }
        });
    }
}