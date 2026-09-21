package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public interface U extends Future {
    void a(Runnable runnable, Executor executor);
}
