package com.kiptv.core.model;

/* JADX INFO: renamed from: com.kiptv.core.model.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1941f {
    public static final com.kiptv.core.model.C1939e Companion = new com.kiptv.core.model.C1939e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.Set f20750b = p078i6.m.F0(new java.lang.String[]{"Screenplay", "Writer", "Teleplay"});

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.Set f20751c = p078i6.m.F0(new java.lang.String[]{"Original Music Composer", "Music", "Main Title Theme Composer"});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f20752a;

    public C1941f(java.util.ArrayList arrayList) {
        this.f20752a = arrayList;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.kiptv.core.model.C1941f) && this.f20752a.equals(((com.kiptv.core.model.C1941f) obj).f20752a);
    }

    public final int hashCode() {
        return this.f20752a.hashCode();
    }

    public final java.lang.String toString() {
        return "DetailInfoData(rows=" + this.f20752a + ")";
    }
}
