package O2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O2.u f7885a;

    public a(O2.u uVar) {
        this.f7885a = uVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O2.a)) {
            return false;
        }
        O2.a aVar = (O2.a) obj;
        aVar.getClass();
        return kotlin.jvm.internal.m.a(this.f7885a, aVar.f7885a);
    }

    public final int hashCode() {
        O2.u uVar = this.f7885a;
        if (uVar != null) {
            return uVar.hashCode();
        }
        return 0;
    }

    public final java.lang.String toString() {
        return "ReadResult(request=null, response=" + this.f7885a + ')';
    }
}
