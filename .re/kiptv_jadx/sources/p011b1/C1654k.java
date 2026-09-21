package p011b1;

/* JADX INFO: renamed from: b1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1654k extends p011b1.AbstractC1656m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f17820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p011b1.K f17821b;

    public C1654k(java.lang.String str, p011b1.K k9) {
        this.f17820a = str;
        this.f17821b = k9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p011b1.C1654k)) {
            return false;
        }
        p011b1.C1654k c1654k = (p011b1.C1654k) obj;
        if (!kotlin.jvm.internal.m.a(this.f17820a, c1654k.f17820a)) {
            return false;
        }
        if (!kotlin.jvm.internal.m.a(this.f17821b, c1654k.f17821b)) {
            return false;
        }
        c1654k.getClass();
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f17820a.hashCode() * 31;
        p011b1.K k9 = this.f17821b;
        return (iHashCode + (k9 != null ? k9.hashCode() : 0)) * 31;
    }

    public final java.lang.String toString() {
        return Y6.f.l(new java.lang.StringBuilder("LinkAnnotation.Clickable(tag="), this.f17820a, ')');
    }
}
