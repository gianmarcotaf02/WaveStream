package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements E3.k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.google.android.gms.internal.cast.N f18805h;

    public Q(com.google.android.gms.internal.cast.N n3) {
        this.f18805h = n3;
    }

    @Override // E3.k
    public final com.google.android.gms.common.api.Status getStatus() {
        return com.google.android.gms.common.api.Status.f18685l;
    }

    public final java.lang.String toString() {
        com.google.android.gms.internal.cast.N n3 = this.f18805h;
        H3.q.g(n3);
        return "OptInOptionsResultImpl[" + (n3.f18797h == 1) + "]";
    }
}
