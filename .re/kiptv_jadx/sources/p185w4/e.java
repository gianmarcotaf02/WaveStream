package p185w4;

/* JADX INFO: loaded from: classes.dex */
public final class e extends p131p4.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p185w4.d f29973d;

    public e(int i3, int i9, p185w4.d dVar) {
        this.f29971b = i3;
        this.f29972c = i9;
        this.f29973d = dVar;
    }

    public final int b() {
        p185w4.d dVar = p185w4.d.f29961f;
        int i3 = this.f29972c;
        p185w4.d dVar2 = this.f29973d;
        if (dVar2 == dVar) {
            return i3;
        }
        if (dVar2 == p185w4.d.f29958c) {
            return i3 + 5;
        }
        if (dVar2 == p185w4.d.f29959d) {
            return i3 + 5;
        }
        if (dVar2 == p185w4.d.f29960e) {
            return i3 + 5;
        }
        throw new java.lang.IllegalStateException("Unknown variant");
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p185w4.e)) {
            return false;
        }
        p185w4.e eVar = (p185w4.e) obj;
        return eVar.f29971b == this.f29971b && eVar.b() == b() && eVar.f29973d == this.f29973d;
    }

    public final int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(this.f29971b), java.lang.Integer.valueOf(this.f29972c), this.f29973d);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AES-CMAC Parameters (variant: ");
        sb.append(this.f29973d);
        sb.append(", ");
        sb.append(this.f29972c);
        sb.append("-byte tags, and ");
        return Y6.f.k(sb, this.f29971b, "-byte key)");
    }
}
