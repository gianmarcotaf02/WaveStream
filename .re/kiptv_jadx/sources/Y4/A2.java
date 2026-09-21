package Y4;

/* JADX INFO: loaded from: classes.dex */
public final class A2 extends Y4.E2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f11539h;

    public A2(java.lang.String str) {
        super(str);
        this.f11539h = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Y4.A2) && kotlin.jvm.internal.m.a(this.f11539h, ((Y4.A2) obj).f11539h);
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        return this.f11539h;
    }

    public final int hashCode() {
        return this.f11539h.hashCode();
    }

    @Override // java.lang.Throwable
    public final java.lang.String toString() {
        return Y6.f.m(new java.lang.StringBuilder("NetworkError(message="), this.f11539h, ")");
    }
}
