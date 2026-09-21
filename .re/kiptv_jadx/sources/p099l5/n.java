package p099l5;

/* JADX INFO: loaded from: classes.dex */
public final class n extends p099l5.v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f24788i;

    public n(java.lang.String str) {
        super(str);
        this.f24788i = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p099l5.n) && kotlin.jvm.internal.m.a(this.f24788i, ((p099l5.n) obj).f24788i);
    }

    public final int hashCode() {
        return this.f24788i.hashCode();
    }

    @Override // java.lang.Throwable
    public final java.lang.String toString() {
        return Y6.f.m(new java.lang.StringBuilder("EngineCrash(msg="), this.f24788i, ")");
    }
}
