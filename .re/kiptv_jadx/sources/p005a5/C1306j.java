package p005a5;

/* JADX INFO: renamed from: a5.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1306j extends p005a5.AbstractC1346n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f14642a;

    public C1306j(java.lang.String message) {
        kotlin.jvm.internal.m.e(message, "message");
        this.f14642a = message;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p005a5.C1306j) && kotlin.jvm.internal.m.a(this.f14642a, ((p005a5.C1306j) obj).f14642a);
    }

    public final int hashCode() {
        return this.f14642a.hashCode();
    }

    public final java.lang.String toString() {
        return Y6.f.m(new java.lang.StringBuilder("Error(message="), this.f14642a, ")");
    }
}
