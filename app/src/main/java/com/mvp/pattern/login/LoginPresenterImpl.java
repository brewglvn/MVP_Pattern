package com.mvp.pattern.login;

public class LoginPresenterImpl implements LoginPresenter, OnLoginFinishedCallback {

    private LoginView loginView;
    private LoginInterator loginInterator;

    public LoginPresenterImpl(LoginView view) {
        this.loginView = view;
        loginInterator = new LoginInteratorImpl();
    }

    @Override
    public void validaterLogin(String username, String password) {
        loginView.showloading();
        loginInterator.login(username, password, this);
    }

    @Override
    public void onError(String message) {
        loginView.onLoginError(message);
        loginView.hideloading();
    }

    @Override
    public void onSuccess() {
        loginView.hideloading();
        loginView.onLoginSuccess();
    }
}
