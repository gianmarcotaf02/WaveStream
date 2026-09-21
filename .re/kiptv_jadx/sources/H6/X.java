package H6;

/* JADX INFO: loaded from: classes4.dex */
public final class X implements java.lang.reflect.Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Type[] f4400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4401b;

    public X(java.lang.reflect.Type[] types) {
        kotlin.jvm.internal.m.e(types, "types");
        this.f4400a = types;
        this.f4401b = java.util.Arrays.hashCode(types);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof H6.X) {
            return java.util.Arrays.equals(this.f4400a, ((H6.X) obj).f4400a);
        }
        return false;
    }

    @Override // java.lang.reflect.Type
    public final java.lang.String getTypeName() {
        return p078i6.m.v0(this.f4400a, ", ", "[", "]", null, 56);
    }

    public final int hashCode() {
        return this.f4401b;
    }

    public final java.lang.String toString() {
        return getTypeName();
    }
}
