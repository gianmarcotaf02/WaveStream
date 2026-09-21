package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

public final class P implements Executor {

    public static final P f19271h;

    public static final P[] f19272i;

    static {
        P p2 = new P("INSTANCE", 0);
        f19271h = p2;
        f19272i = new P[]{p2};
    }

    public static P[] values() {
        return (P[]) f19272i.clone();
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
