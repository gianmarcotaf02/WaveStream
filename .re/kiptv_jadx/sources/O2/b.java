package O2;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O2.u f7886a;

    public b(O2.u uVar) {
        this.f7886a = uVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof O2.b) {
            return kotlin.jvm.internal.m.a(this.f7886a, ((O2.b) obj).f7886a);
        }
        return false;
    }

    public final int hashCode() {
        O2.u uVar = this.f7886a;
        if (uVar != null) {
            return uVar.hashCode();
        }
        return 0;
    }

    public final java.lang.String toString() {
        return "WriteResult(response=" + this.f7886a + ')';
    }
}
