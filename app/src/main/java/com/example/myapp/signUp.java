package com.example.myapp;

import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;



public class signUp extends AppCompatActivity {

    private EditText mUsernameEditText;
    private EditText mPasswordEditText;
    private EditText mPasswordConfirmEditText;
    private Button mSignUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        mUsernameEditText = findViewById(R.id.username_edit_text);
        mPasswordEditText = findViewById(R.id.password_edit_text);
        mPasswordConfirmEditText = findViewById(R.id.password_confirm_edit_text);
        mSignUpButton = findViewById(R.id.sign_up_button);

        mSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = mUsernameEditText.getText().toString();
                String password = mPasswordEditText.getText().toString();
                String passwordConfirm = mPasswordConfirmEditText.getText().toString();

                if (TextUtils.isEmpty(username)) {
                    mUsernameEditText.setError("Username is required");
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    mPasswordEditText.setError("Password is required");
                    return;
                }

                if (!password.equals(passwordConfirm)) {
                    mPasswordConfirmEditText.setError("Passwords do not match");
                    return;
                }

                // TODO: Send the sign up request to the server

                // TODO: Save the user's credentials in the app's database or shared preferences

                // TODO: Navigate to the main activity
            }
        });
    }
}
