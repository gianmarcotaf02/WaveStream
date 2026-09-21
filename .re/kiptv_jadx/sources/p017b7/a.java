package p017b7;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C7.W f18010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p017b7.b f18011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.Set f18014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C7.B f18015f;

    public a(C7.W w6, p017b7.b bVar, boolean z6, boolean z9, java.util.Set set, C7.B b9) {
        this.f18010a = w6;
        this.f18011b = bVar;
        this.f18012c = z6;
        this.f18013d = z9;
        this.f18014e = set;
        this.f18015f = b9;
    }

    public static p017b7.a a(p017b7.a aVar, p017b7.b bVar, boolean z6, java.util.Set set, C7.B b9, int i3) {
        C7.W howThisTypeIsUsed = aVar.f18010a;
        if ((i3 & 2) != 0) {
            bVar = aVar.f18011b;
        }
        p017b7.b flexibility = bVar;
        if ((i3 & 4) != 0) {
            z6 = aVar.f18012c;
        }
        boolean z9 = z6;
        boolean z10 = aVar.f18013d;
        if ((i3 & 16) != 0) {
            set = aVar.f18014e;
        }
        java.util.Set set2 = set;
        if ((i3 & 32) != 0) {
            b9 = aVar.f18015f;
        }
        aVar.getClass();
        kotlin.jvm.internal.m.e(howThisTypeIsUsed, "howThisTypeIsUsed");
        kotlin.jvm.internal.m.e(flexibility, "flexibility");
        return new p017b7.a(howThisTypeIsUsed, flexibility, z9, z10, set2, b9);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p017b7.a)) {
            return false;
        }
        p017b7.a aVar = (p017b7.a) obj;
        return kotlin.jvm.internal.m.a(aVar.f18015f, this.f18015f) && aVar.f18010a == this.f18010a && aVar.f18011b == this.f18011b && aVar.f18012c == this.f18012c && aVar.f18013d == this.f18013d;
    }

    public final int hashCode() {
        C7.B b9 = this.f18015f;
        int iHashCode = b9 != null ? b9.hashCode() : 0;
        int iHashCode2 = this.f18010a.hashCode() + (iHashCode * 31) + iHashCode;
        int iHashCode3 = this.f18011b.hashCode() + (iHashCode2 * 31) + iHashCode2;
        int i3 = (iHashCode3 * 31) + (this.f18012c ? 1 : 0) + iHashCode3;
        return (i3 * 31) + (this.f18013d ? 1 : 0) + i3;
    }

    public final java.lang.String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f18010a + ", flexibility=" + this.f18011b + ", isRaw=" + this.f18012c + ", isForAnnotationParameter=" + this.f18013d + ", visitedTypeParameters=" + this.f18014e + ", defaultType=" + this.f18015f + ')';
    }

    public /* synthetic */ a(C7.W w6, boolean z6, boolean z9, java.util.Set set, int i3) {
        this(w6, p017b7.b.f18016h, (i3 & 4) != 0 ? false : z6, (i3 & 8) != 0 ? false : z9, (i3 & 16) != 0 ? null : set, null);
    }
}
