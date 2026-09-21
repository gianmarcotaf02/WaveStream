package E2;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f2761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f2762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f2763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f2764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f2765e;

    public C(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f2761a = str;
        this.f2762b = str2;
        this.f2763c = str3;
        this.f2764d = str4;
        this.f2765e = str5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof E2.C) && kotlin.jvm.internal.m.a(((E2.C) obj).f2761a, this.f2761a);
    }

    public final int hashCode() {
        return this.f2761a.hashCode();
    }

    public final java.lang.String toString() {
        return this.f2761a;
    }
}
