package p020c0;

/* JADX INFO: loaded from: classes.dex */
public final class B0 extends p020c0.AbstractC1703s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p020c0.AbstractC1703s f18099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18100e;

    public B0(p020c0.AbstractC1703s abstractC1703s, int i3) {
        this.f18099d = abstractC1703s;
        this.f18100e = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p020c0.B0)) {
            return false;
        }
        p020c0.B0 b9 = (p020c0.B0) obj;
        return kotlin.jvm.internal.m.a(b9.f18099d, this.f18099d) && b9.f18100e == this.f18100e;
    }

    public final int hashCode() {
        return this.f18099d.hashCode() + (this.f18100e * 31);
    }
}
