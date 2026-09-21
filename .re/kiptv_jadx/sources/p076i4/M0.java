package p076i4;

/* JADX INFO: loaded from: classes.dex */
public final class M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f22813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p076i4.N0 f22815c;

    public M0(p076i4.N0 n3, int i3) {
        this.f22815c = n3;
        this.f22813a = n3.f22817a[i3];
        this.f22814b = i3;
    }

    public final int a() {
        int i3 = this.f22814b;
        p076i4.N0 n3 = this.f22815c;
        java.lang.Object obj = this.f22813a;
        if (i3 == -1 || i3 >= n3.f22819c || !com.google.android.gms.internal.play_billing.AbstractC1853k0.m(obj, n3.f22817a[i3])) {
            this.f22814b = n3.c(obj);
        }
        int i9 = this.f22814b;
        if (i9 == -1) {
            return 0;
        }
        return n3.f22818b[i9];
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p076i4.M0) {
            p076i4.M0 m8 = (p076i4.M0) obj;
            if (a() == m8.a() && com.google.android.gms.internal.play_billing.AbstractC1853k0.m(this.f22813a, m8.f22813a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Object obj = this.f22813a;
        return (obj == null ? 0 : obj.hashCode()) ^ a();
    }

    public final java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(this.f22813a);
        int iA = a();
        if (iA == 1) {
            return strValueOf;
        }
        return strValueOf + " x " + iA;
    }
}
