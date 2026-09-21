package p179v4;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Class f29185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4.a f29186b;

    public q(java.lang.Class cls, C4.a aVar) {
        this.f29185a = cls;
        this.f29186b = aVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p179v4.q)) {
            return false;
        }
        p179v4.q qVar = (p179v4.q) obj;
        return qVar.f29185a.equals(this.f29185a) && qVar.f29186b.equals(this.f29186b);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.f29185a, this.f29186b);
    }

    public final java.lang.String toString() {
        return this.f29185a.getSimpleName() + ", object identifier: " + this.f29186b;
    }
}
