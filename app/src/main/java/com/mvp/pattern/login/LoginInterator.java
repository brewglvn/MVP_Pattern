package com.mvp.pattern.login;

public interface LoginInterator {
    void login(String username, String password, OnLoginFinishedCallback callback);
}
