package T2;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final T2.h f9738c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T2.c f9739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T2.c f9740b;

    static {
        T2.b bVar = T2.b.f9732a;
        f9738c = new T2.h(bVar, bVar);
    }

    public h(T2.c cVar, T2.c cVar2) {
        this.f9739a = cVar;
        this.f9740b = cVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T2.h)) {
            return false;
        }
        T2.h hVar = (T2.h) obj;
        return kotlin.jvm.internal.m.a(this.f9739a, hVar.f9739a) && kotlin.jvm.internal.m.a(this.f9740b, hVar.f9740b);
    }

    public final int hashCode() {
        return this.f9740b.hashCode() + (this.f9739a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "Size(width=" + this.f9739a + ", height=" + this.f9740b + ')';
    }
}
