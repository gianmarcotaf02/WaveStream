package com.google.common.util.concurrent;

/* JADX INFO: renamed from: com.google.common.util.concurrent.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1888c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.google.common.util.concurrent.C1888c f19425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.google.common.util.concurrent.C1888c f19426d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.RuntimeException f19428b;

    static {
        if (com.google.common.util.concurrent.AbstractC1902q.GENERATE_CANCELLATION_CAUSES) {
            f19426d = null;
            f19425c = null;
        } else {
            f19426d = new com.google.common.util.concurrent.C1888c(false, null);
            f19425c = new com.google.common.util.concurrent.C1888c(true, null);
        }
    }

    public C1888c(boolean z6, java.lang.RuntimeException runtimeException) {
        this.f19427a = z6;
        this.f19428b = runtimeException;
    }
}
