package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Contactus extends AppCompatActivity {
    private EditText nameField, emailField, messageField;
    private Button submitButton, resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactus);

        // Find the views in the layout
        nameField = (EditText) findViewById(R.id.name_field);
        emailField = (EditText) findViewById(R.id.email_field);
        messageField = (EditText) findViewById(R.id.message_field);
        submitButton = (Button) findViewById(R.id.submit_button);
        resetButton = (Button) findViewById(R.id.reset_button);

        // Set onClick listeners for the buttons
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitForm();
            }
        });
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetForm();
            }
        });
    }

    private void submitForm() {
        // Get the values from the form
        String name = nameField.getText().toString();
        String email = emailField.getText().toString();
        String message = messageField.getText().toString();

        // Validate the form
        if (name.isEmpty()) {
            Toast.makeText(this, "Please enter your name.", Toast.LENGTH_SHORT).show();
            return;
        }
        if (email.isEmpty()) {
            Toast.makeText(this, "Please enter your email.", Toast.LENGTH_SHORT).show();
            return;
        }
        if (message.isEmpty()) {
            Toast.makeText(this, "Please enter a message.", Toast.LENGTH_SHORT).show();
            return;
        }

        // Submit the form
        Toast.makeText(this, "Form submitted successfully!", Toast.LENGTH_SHORT).show();
    }

    private void resetForm() {
        // Clear the form
        nameField.setText("");
        emailField.setText("");
        messageField.setText("");
    }
}