package B;

/* JADX INFO: renamed from: B.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0087z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p137q0.f f582a;

    public C0087z(p137q0.f fVar) {
        this.f582a = fVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B.C0087z) && kotlin.jvm.internal.m.a(this.f582a, ((B.C0087z) obj).f582a);
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f582a.f26465a);
    }

    public final java.lang.String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f582a + ')';
    }
}
