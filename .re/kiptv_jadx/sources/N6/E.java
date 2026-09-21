package N6;

/* JADX INFO: loaded from: classes4.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p101l7.b f7364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f7365b;

    public E(p101l7.b classId, java.util.List list) {
        kotlin.jvm.internal.m.e(classId, "classId");
        this.f7364a = classId;
        this.f7365b = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N6.E)) {
            return false;
        }
        N6.E e6 = (N6.E) obj;
        return kotlin.jvm.internal.m.a(this.f7364a, e6.f7364a) && kotlin.jvm.internal.m.a(this.f7365b, e6.f7365b);
    }

    public final int hashCode() {
        return this.f7365b.hashCode() + (this.f7364a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassRequest(classId=");
        sb.append(this.f7364a);
        sb.append(", typeParametersCount=");
        return com.google.android.gms.internal.play_billing.M0.n(sb, this.f7365b, ')');
    }
}
