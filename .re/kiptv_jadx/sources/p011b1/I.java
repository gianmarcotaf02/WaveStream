package p011b1;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p011b1.C1650g f17764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p011b1.M f17765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f17766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17769f;
    public final p113n1.c g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p113n1.n f17770h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p048f1.h f17771i;
    public final long j;

    public I(p011b1.C1650g c1650g, p011b1.M m8, java.util.List list, int i3, boolean z6, int i9, p113n1.c cVar, p113n1.n nVar, p048f1.h hVar, long j) {
        this.f17764a = c1650g;
        this.f17765b = m8;
        this.f17766c = list;
        this.f17767d = i3;
        this.f17768e = z6;
        this.f17769f = i9;
        this.g = cVar;
        this.f17770h = nVar;
        this.f17771i = hVar;
        this.j = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p011b1.I)) {
            return false;
        }
        p011b1.I i3 = (p011b1.I) obj;
        return kotlin.jvm.internal.m.a(this.f17764a, i3.f17764a) && kotlin.jvm.internal.m.a(this.f17765b, i3.f17765b) && kotlin.jvm.internal.m.a(this.f17766c, i3.f17766c) && this.f17767d == i3.f17767d && this.f17768e == i3.f17768e && this.f17769f == i3.f17769f && kotlin.jvm.internal.m.a(this.g, i3.g) && this.f17770h == i3.f17770h && kotlin.jvm.internal.m.a(this.f17771i, i3.f17771i) && p113n1.a.b(this.j, i3.j);
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.j) + ((this.f17771i.hashCode() + ((this.f17770h.hashCode() + ((this.g.hashCode() + p121o0.p.d(this.f17769f, p121o0.p.f((B2.a.b((this.f17765b.hashCode() + (this.f17764a.hashCode() * 31)) * 31, 31, this.f17766c) + this.f17767d) * 31, 31, this.f17768e), 31)) * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TextLayoutInput(text=");
        sb.append((java.lang.Object) this.f17764a);
        sb.append(", style=");
        sb.append(this.f17765b);
        sb.append(", placeholders=");
        sb.append(this.f17766c);
        sb.append(", maxLines=");
        sb.append(this.f17767d);
        sb.append(", softWrap=");
        sb.append(this.f17768e);
        sb.append(", overflow=");
        int i3 = this.f17769f;
        if (i3 == 1) {
            str = "Clip";
        } else if (i3 == 2) {
            str = "Ellipsis";
        } else if (i3 == 5) {
            str = "MiddleEllipsis";
        } else if (i3 == 3) {
            str = "Visible";
        } else {
            str = i3 == 4 ? "StartEllipsis" : "Invalid";
        }
        sb.append((java.lang.Object) str);
        sb.append(", density=");
        sb.append(this.g);
        sb.append(", layoutDirection=");
        sb.append(this.f17770h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.f17771i);
        sb.append(", constraints=");
        sb.append((java.lang.Object) p113n1.a.l(this.j));
        sb.append(')');
        return sb.toString();
    }
}
