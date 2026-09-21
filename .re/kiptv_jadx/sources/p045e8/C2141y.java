package p045e8;

/* JADX INFO: renamed from: e8.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2141y extends p063g8.v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p045e8.a0 f21604e;

    public C2141y(p045e8.a0 a0Var) {
        super(p045e8.AbstractC2128k.f21552c, a0Var == p045e8.a0.f21531i ? 2 : 1, a0Var == p045e8.a0.j ? 2 : null);
        this.f21604e = a0Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p045e8.C2141y) {
            return this.f21604e == ((p045e8.C2141y) obj).f21604e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21604e.hashCode();
    }
}
