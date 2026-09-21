package U7;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends U7.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Throwable f10217a;

    public p(java.lang.Throwable th) {
        this.f10217a = th;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof U7.p) {
            return kotlin.jvm.internal.m.a(this.f10217a, ((U7.p) obj).f10217a);
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Throwable th = this.f10217a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // U7.q
    public final java.lang.String toString() {
        return "Closed(" + this.f10217a + ')';
    }
}
