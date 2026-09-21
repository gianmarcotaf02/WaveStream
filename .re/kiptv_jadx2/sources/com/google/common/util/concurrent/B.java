package com.google.common.util.concurrent;

public interface B {
    void onFailure(Throwable th);

    void onSuccess(Object obj);
}
