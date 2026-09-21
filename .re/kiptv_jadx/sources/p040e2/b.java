package p040e2;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashMap f21365a = new java.util.LinkedHashMap();

    public abstract java.lang.Object a(V1.b bVar);

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof p040e2.b) && kotlin.jvm.internal.m.a(this.f21365a, ((p040e2.b) obj).f21365a);
    }

    public final int hashCode() {
        return this.f21365a.hashCode();
    }

    public final java.lang.String toString() {
        return "CreationExtras(extras=" + this.f21365a + ')';
    }
}
