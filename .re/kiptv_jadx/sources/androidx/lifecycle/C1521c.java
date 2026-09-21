package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1521c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Method f16341b;

    public C1521c(int i3, java.lang.reflect.Method method) {
        this.f16340a = i3;
        this.f16341b = method;
        method.setAccessible(true);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.lifecycle.C1521c)) {
            return false;
        }
        androidx.lifecycle.C1521c c1521c = (androidx.lifecycle.C1521c) obj;
        return this.f16340a == c1521c.f16340a && this.f16341b.getName().equals(c1521c.f16341b.getName());
    }

    public final int hashCode() {
        return this.f16341b.getName().hashCode() + (this.f16340a * 31);
    }
}
