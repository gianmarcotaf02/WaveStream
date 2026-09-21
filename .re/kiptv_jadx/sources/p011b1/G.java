package p011b1;

/* JADX INFO: loaded from: classes.dex */
public final class G implements p011b1.InterfaceC1645b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f17761a;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p011b1.G) {
            return kotlin.jvm.internal.m.a(this.f17761a, ((p011b1.G) obj).f17761a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17761a.hashCode();
    }

    public final java.lang.String toString() {
        return Y6.f.l(new java.lang.StringBuilder("StringAnnotation(value="), this.f17761a, ')');
    }
}
