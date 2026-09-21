package p011b1;

/* JADX INFO: loaded from: classes.dex */
public final class O implements p011b1.InterfaceC1645b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f17790a;

    public O(java.lang.String str) {
        this.f17790a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p011b1.O) {
            return kotlin.jvm.internal.m.a(this.f17790a, ((p011b1.O) obj).f17790a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17790a.hashCode();
    }

    public final java.lang.String toString() {
        return Y6.f.l(new java.lang.StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f17790a, ')');
    }
}
