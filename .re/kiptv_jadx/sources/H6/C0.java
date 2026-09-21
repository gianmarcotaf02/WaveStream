package H6;

/* JADX INFO: loaded from: classes4.dex */
public final class C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f4364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4365b;

    public C0(java.lang.ClassLoader classLoader) {
        this.f4364a = new java.lang.ref.WeakReference(classLoader);
        this.f4365b = java.lang.System.identityHashCode(classLoader);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof H6.C0) && this.f4364a.get() == ((H6.C0) obj).f4364a.get();
    }

    public final int hashCode() {
        return this.f4365b;
    }

    public final java.lang.String toString() {
        java.lang.String string;
        java.lang.ClassLoader classLoader = (java.lang.ClassLoader) this.f4364a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
