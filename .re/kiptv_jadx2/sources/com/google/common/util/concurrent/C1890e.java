package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

public final class C1890e {

    public static final C1890e f19431d = new C1890e();

    public final Runnable f19432a;

    public final Executor f19433b;

    public C1890e f19434c;

    public C1890e(Runnable runnable, Executor executor) {
        this.f19432a = runnable;
        this.f19433b = executor;
    }

    public C1890e() {
        this.f19432a = null;
        this.f19433b = null;
    }
}
