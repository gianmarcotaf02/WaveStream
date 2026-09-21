package C5;

/* JADX INFO: renamed from: C5.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0099c0 extends C5.AbstractC0108f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1227a;

    public C0099c0(int i3) {
        this.f1227a = i3;
    }

    @Override // C5.AbstractC0108f0
    public final boolean a() {
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5.C0099c0) && this.f1227a == ((C5.C0099c0) obj).f1227a;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f1227a);
    }

    public final java.lang.String toString() {
        return Y6.f.k(new java.lang.StringBuilder("Live(streamId="), this.f1227a, ")");
    }
}
