package com.mvp.pattern.login;

public interface OnLoginFinishedCallback {
    void onError(String message);
    void onSuccess();
}
