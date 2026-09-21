package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

public final class z implements Executor {

    public static final z f19464h;

    public static final z[] f19465i;

    static {
        z zVar = new z("INSTANCE", 0);
        f19464h = zVar;
        f19465i = new z[]{zVar};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f19465i.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
