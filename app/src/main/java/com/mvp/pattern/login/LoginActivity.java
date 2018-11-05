package com.mvp.pattern.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.mvp.pattern.R;
import com.mvp.pattern.main.MainActivity;

public class LoginActivity extends AppCompatActivity implements LoginView, View.OnClickListener {

    private EditText username, password;
    private Button btnLogin;
    private ProgressBar progressBar;
    protected LoginPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.login);
        progressBar = (ProgressBar) findViewById(R.id.progress);
        btnLogin.setOnClickListener(this);
        mPresenter = new LoginPresenterImpl(this);

    }

    @Override
    public void onClick(View view) {
        //click on Login button
        mPresenter.validaterLogin(username.getText().toString(), password.getText().toString());
    }

    @Override
    public void showloading() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideloading() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void onLoginError(String message) {
        Toast.makeText(LoginActivity.this, "Login error : " + message, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onLoginSuccess() {
        Toast.makeText(LoginActivity.this, "Login success", Toast.LENGTH_LONG).show();
        gotoMain();
    }

    public void gotoMain() {
        Intent intent = MainActivity.getIntent(LoginActivity.this);
        startActivity(intent);
        finish();
    }
}
