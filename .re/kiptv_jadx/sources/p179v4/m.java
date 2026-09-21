package p179v4;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Class f29175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Class f29176b;

    public m(java.lang.Class cls, java.lang.Class cls2) {
        this.f29175a = cls;
        this.f29176b = cls2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p179v4.m)) {
            return false;
        }
        p179v4.m mVar = (p179v4.m) obj;
        return mVar.f29175a.equals(this.f29175a) && mVar.f29176b.equals(this.f29176b);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.f29175a, this.f29176b);
    }

    public final java.lang.String toString() {
        return this.f29175a.getSimpleName() + " with primitive type: " + this.f29176b.getSimpleName();
    }
}
