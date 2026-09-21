package p205z2;

/* JADX INFO: renamed from: z2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3175k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p205z2.C3166b f32259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p205z2.C3166b f32260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p205z2.C3166b f32261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p205z2.C3166b f32262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p205z2.C3166b f32263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p205z2.C3166b f32264f;
    public final p205z2.C3166b g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p205z2.C3166b f32265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p205z2.C3166b f32266i;
    public final p205z2.C3166b j;

    public C3175k(p205z2.C3166b c3166b, p205z2.C3166b c3166b2, p205z2.C3166b c3166b3, p205z2.C3166b c3166b4, p205z2.C3166b c3166b5, p205z2.C3166b c3166b6, p205z2.C3166b c3166b7, p205z2.C3166b c3166b8, p205z2.C3166b c3166b9, p205z2.C3166b c3166b10) {
        this.f32259a = c3166b;
        this.f32260b = c3166b2;
        this.f32261c = c3166b3;
        this.f32262d = c3166b4;
        this.f32263e = c3166b5;
        this.f32264f = c3166b6;
        this.g = c3166b7;
        this.f32265h = c3166b8;
        this.f32266i = c3166b9;
        this.j = c3166b10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p205z2.C3175k.class != obj.getClass()) {
            return false;
        }
        p205z2.C3175k c3175k = (p205z2.C3175k) obj;
        return kotlin.jvm.internal.m.a(this.f32259a, c3175k.f32259a) && kotlin.jvm.internal.m.a(this.f32260b, c3175k.f32260b) && kotlin.jvm.internal.m.a(this.f32261c, c3175k.f32261c) && kotlin.jvm.internal.m.a(this.f32262d, c3175k.f32262d) && kotlin.jvm.internal.m.a(this.f32263e, c3175k.f32263e) && kotlin.jvm.internal.m.a(this.f32264f, c3175k.f32264f) && kotlin.jvm.internal.m.a(this.g, c3175k.g) && kotlin.jvm.internal.m.a(this.f32265h, c3175k.f32265h) && kotlin.jvm.internal.m.a(this.f32266i, c3175k.f32266i) && kotlin.jvm.internal.m.a(this.j, c3175k.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.f32266i.hashCode() + ((this.f32265h.hashCode() + ((this.g.hashCode() + ((this.f32264f.hashCode() + ((this.f32263e.hashCode() + ((this.f32262d.hashCode() + ((this.f32261c.hashCode() + ((this.f32260b.hashCode() + (this.f32259a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "SelectableSurfaceBorder(border=" + this.f32259a + ", focusedBorder=" + this.f32260b + ",pressedBorder=" + this.f32261c + ", selectedBorder=" + this.f32262d + ",disabledBorder=" + this.f32263e + ", focusedSelectedBorder=" + this.f32264f + ", focusedDisabledBorder=" + this.g + ",pressedSelectedBorder=" + this.f32265h + ", selectedDisabledBorder=" + this.f32266i + ", focusedSelectedDisabledBorder=" + this.j + ')';
    }
}
