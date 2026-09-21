package p011b1;

/* JADX INFO: loaded from: classes.dex */
public final class N implements p011b1.InterfaceC1645b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f17789a;

    public N(java.lang.String str) {
        this.f17789a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p011b1.N) {
            return kotlin.jvm.internal.m.a(this.f17789a, ((p011b1.N) obj).f17789a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17789a.hashCode();
    }

    public final java.lang.String toString() {
        return Y6.f.l(new java.lang.StringBuilder("UrlAnnotation(url="), this.f17789a, ')');
    }
}
