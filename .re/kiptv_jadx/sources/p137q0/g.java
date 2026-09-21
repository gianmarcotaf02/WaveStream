package p137q0;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f26466a;

    public g(float f9) {
        this.f26466a = f9;
    }

    public final int a(int i3, int i9) {
        return java.lang.Math.round((1 + this.f26466a) * ((i9 - i3) / 2.0f));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p137q0.g) && java.lang.Float.compare(this.f26466a, ((p137q0.g) obj).f26466a) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f26466a);
    }

    public final java.lang.String toString() {
        return p121o0.p.q(new java.lang.StringBuilder("Vertical(bias="), this.f26466a, ')');
    }
}
