package com.mvp.pattern.login;

public interface LoginView {
    void showloading();
    void hideloading();
    void onLoginError(String message);
    void onLoginSuccess();
}
