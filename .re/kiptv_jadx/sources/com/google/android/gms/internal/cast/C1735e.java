package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1735e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f18890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f18891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p191x3.x f18892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p191x3.C3101b f18893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.android.gms.internal.cast.BinderC1783q f18894e;

    public C1735e(android.content.Context context, p191x3.C3101b c3101b, com.google.android.gms.internal.cast.BinderC1783q binderC1783q) {
        java.lang.String strY0;
        boolean zIsEmpty = java.util.Collections.unmodifiableList(c3101b.f31169i).isEmpty();
        java.lang.String str = c3101b.f31168h;
        if (zIsEmpty) {
            strY0 = p184w3.x.a(str);
        } else {
            java.util.List listUnmodifiableList = java.util.Collections.unmodifiableList(c3101b.f31169i);
            if (str == null) {
                throw new java.lang.IllegalArgumentException("applicationId cannot be null");
            }
            if (listUnmodifiableList == null) {
                throw new java.lang.IllegalArgumentException("namespaces cannot be null");
            }
            strY0 = p079i7.f.Y0(new p079i7.f(str, listUnmodifiableList, 14));
        }
        this.f18892c = new p191x3.x(this);
        this.f18890a = context.getApplicationContext();
        H3.q.e(strY0);
        this.f18891b = strY0;
        this.f18893d = c3101b;
        this.f18894e = binderC1783q;
    }
}
