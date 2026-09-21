package p014b4;

/* JADX INFO: renamed from: b4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1662d extends p014b4.AbstractC1661c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final T3.o f17881h;

    public C1662d(T3.o oVar) {
        this.f17881h = oVar;
    }

    @Override // p014b4.AbstractC1661c
    public final java.lang.Object a() {
        return this.f17881h;
    }

    @Override // p014b4.AbstractC1661c
    public final boolean b() {
        return true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p014b4.C1662d) {
            return this.f17881h.equals(((p014b4.C1662d) obj).f17881h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17881h.hashCode() + 1502476572;
    }

    public final java.lang.String toString() {
        return Y6.f.h("Optional.of(", this.f17881h.toString(), ")");
    }
}
