package p186w5;

/* JADX INFO: renamed from: w5.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2981f0 implements p186w5.InterfaceC2983g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f30225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f30226b;

    public C2981f0(java.util.ArrayList arrayList, boolean z6) {
        this.f30225a = arrayList;
        this.f30226b = z6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p186w5.C2981f0)) {
            return false;
        }
        p186w5.C2981f0 c2981f0 = (p186w5.C2981f0) obj;
        return this.f30225a.equals(c2981f0.f30225a) && this.f30226b == c2981f0.f30226b;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f30226b) + (this.f30225a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Trending(items=");
        sb.append(this.f30225a);
        sb.append(", isMovie=");
        return com.google.android.gms.internal.play_billing.M0.o(sb, this.f30226b, ")");
    }
}
