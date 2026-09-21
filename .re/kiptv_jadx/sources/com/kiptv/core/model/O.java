package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
public final class O extends com.kiptv.core.model.Q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f19897h;

    public O(int i3) {
        super(com.google.android.gms.internal.play_billing.M0.l(i3, "M3U download failed with status "));
        this.f19897h = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.kiptv.core.model.O) && this.f19897h == ((com.kiptv.core.model.O) obj).f19897h;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f19897h);
    }

    @Override // java.lang.Throwable
    public final java.lang.String toString() {
        return Y6.f.k(new java.lang.StringBuilder("DownloadFailed(statusCode="), this.f19897h, ")");
    }
}
