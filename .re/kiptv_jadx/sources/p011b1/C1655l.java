package p011b1;

/* JADX INFO: renamed from: b1.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1655l extends p011b1.AbstractC1656m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f17822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p011b1.K f17823b;

    public C1655l(java.lang.String str, p011b1.K k9) {
        this.f17822a = str;
        this.f17823b = k9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p011b1.C1655l)) {
            return false;
        }
        p011b1.C1655l c1655l = (p011b1.C1655l) obj;
        if (!kotlin.jvm.internal.m.a(this.f17822a, c1655l.f17822a)) {
            return false;
        }
        if (!kotlin.jvm.internal.m.a(this.f17823b, c1655l.f17823b)) {
            return false;
        }
        c1655l.getClass();
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f17822a.hashCode() * 31;
        p011b1.K k9 = this.f17823b;
        return (iHashCode + (k9 != null ? k9.hashCode() : 0)) * 31;
    }

    public final java.lang.String toString() {
        return Y6.f.l(new java.lang.StringBuilder("LinkAnnotation.Url(url="), this.f17822a, ')');
    }
}
