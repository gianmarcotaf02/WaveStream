package p048f1;

/* JADX INFO: renamed from: f1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2147e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p048f1.y f21645a;

    public C2147e(p048f1.y yVar) {
        this.f21645a = yVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p048f1.C2147e) {
            return kotlin.jvm.internal.m.a(this.f21645a, ((p048f1.C2147e) obj).f21645a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21645a.hashCode() * 31;
    }

    public final java.lang.String toString() {
        return "Key(font=" + this.f21645a + ", loaderKey=null)";
    }
}
