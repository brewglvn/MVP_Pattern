package com.mvp.pattern.login;

import android.os.Handler;
import android.text.TextUtils;

public class LoginInteratorImpl implements LoginInterator {

    @Override
    public void login(final String username,final String password,final OnLoginFinishedCallback callback) {
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                boolean error = false;
                if (TextUtils.isEmpty(username)){
                    callback.onError("Username Empty");
                    error = true;
                }
                if (TextUtils.isEmpty(password)){
                    callback.onError("Password Empty");
                    error = true;
                }
                if (!error){
                    callback.onSuccess();
                }
            }
        }, 2000);
    }
}
