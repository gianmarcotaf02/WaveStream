package D5;

/* JADX INFO: renamed from: D5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0249e extends D5.AbstractC0253g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D5.C0241a f2283a;

    public C0249e(D5.C0241a c0241a) {
        this.f2283a = c0241a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof D5.C0249e) && kotlin.jvm.internal.m.a(this.f2283a, ((D5.C0249e) obj).f2283a);
    }

    public final int hashCode() {
        return this.f2283a.hashCode();
    }

    public final java.lang.String toString() {
        return "Stepper(control=" + this.f2283a + ")";
    }
}
