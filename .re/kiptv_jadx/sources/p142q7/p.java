package p142q7;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends p142q7.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C7.AbstractC0191x f26665a;

    public p(C7.AbstractC0191x abstractC0191x) {
        this.f26665a = abstractC0191x;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p142q7.p) && kotlin.jvm.internal.m.a(this.f26665a, ((p142q7.p) obj).f26665a);
    }

    public final int hashCode() {
        return this.f26665a.hashCode();
    }

    public final java.lang.String toString() {
        return "LocalClass(type=" + this.f26665a + ')';
    }
}
