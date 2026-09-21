package t8;

/* JADX INFO: renamed from: t8.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2863m extends B7.l {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f28632k;

    public C2863m(t8.q qVar, boolean z6) {
        super(qVar);
        this.f28632k = z6;
    }

    @Override // B7.l
    public final void h(java.lang.String value) {
        kotlin.jvm.internal.m.e(value, "value");
        if (this.f28632k) {
            super.h(value);
        } else {
            f(value);
        }
    }
}
