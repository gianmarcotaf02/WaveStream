package com.google.android.gms.internal.play_billing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class P implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.google.android.gms.internal.play_billing.P f19271h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ com.google.android.gms.internal.play_billing.P[] f19272i;

    static {
        com.google.android.gms.internal.play_billing.P p2 = new com.google.android.gms.internal.play_billing.P("INSTANCE", 0);
        f19271h = p2;
        f19272i = new com.google.android.gms.internal.play_billing.P[]{p2};
    }

    public static com.google.android.gms.internal.play_billing.P[] values() {
        return (com.google.android.gms.internal.play_billing.P[]) f19272i.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
