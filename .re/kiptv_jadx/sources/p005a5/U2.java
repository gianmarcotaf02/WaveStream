package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class U2 extends p005a5.W2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p005a5.T2 f13961a;

    public U2(p005a5.T2 t9) {
        this.f13961a = t9;
    }

    @Override // p005a5.W2
    public final java.lang.String a() {
        return com.google.android.gms.internal.play_billing.M0.l(this.f13961a.f13919a, "c");
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p005a5.U2) && kotlin.jvm.internal.m.a(this.f13961a, ((p005a5.U2) obj).f13961a);
    }

    public final int hashCode() {
        return this.f13961a.hashCode();
    }

    public final java.lang.String toString() {
        return "Collection(group=" + this.f13961a + ")";
    }
}
