package J5;

/* JADX INFO: renamed from: J5.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0616n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f6517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f6518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f6519c;

    public C0616n2(java.lang.String fontSize, java.lang.String color, java.lang.String background) {
        kotlin.jvm.internal.m.e(fontSize, "fontSize");
        kotlin.jvm.internal.m.e(color, "color");
        kotlin.jvm.internal.m.e(background, "background");
        this.f6517a = fontSize;
        this.f6518b = color;
        this.f6519c = background;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J5.C0616n2)) {
            return false;
        }
        J5.C0616n2 c0616n2 = (J5.C0616n2) obj;
        return kotlin.jvm.internal.m.a(this.f6517a, c0616n2.f6517a) && kotlin.jvm.internal.m.a(this.f6518b, c0616n2.f6518b) && kotlin.jvm.internal.m.a(this.f6519c, c0616n2.f6519c);
    }

    public final int hashCode() {
        return this.f6519c.hashCode() + B2.a.a(this.f6517a.hashCode() * 31, 31, this.f6518b);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TvSubtitleStyleUiState(fontSize=");
        sb.append(this.f6517a);
        sb.append(", color=");
        sb.append(this.f6518b);
        sb.append(", background=");
        return Y6.f.m(sb, this.f6519c, ")");
    }
}
