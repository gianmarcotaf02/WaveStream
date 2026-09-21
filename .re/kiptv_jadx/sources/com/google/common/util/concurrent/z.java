package com.google.common.util.concurrent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class z implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.google.common.util.concurrent.z f19464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ com.google.common.util.concurrent.z[] f19465i;

    static {
        com.google.common.util.concurrent.z zVar = new com.google.common.util.concurrent.z("INSTANCE", 0);
        f19464h = zVar;
        f19465i = new com.google.common.util.concurrent.z[]{zVar};
    }

    public static com.google.common.util.concurrent.z valueOf(java.lang.String str) {
        return (com.google.common.util.concurrent.z) java.lang.Enum.valueOf(com.google.common.util.concurrent.z.class, str);
    }

    public static com.google.common.util.concurrent.z[] values() {
        return (com.google.common.util.concurrent.z[]) f19465i.clone();
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
