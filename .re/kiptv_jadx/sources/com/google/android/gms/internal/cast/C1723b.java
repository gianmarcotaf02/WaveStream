package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1723b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f18868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18869e;

    public C1723b(B3.z zVar) {
        this.f18869e = zVar.f677i;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        this.f18865a = jCurrentTimeMillis;
        this.f18866b = jCurrentTimeMillis;
        this.f18868d = new java.util.concurrent.atomic.AtomicInteger(1);
    }
}
