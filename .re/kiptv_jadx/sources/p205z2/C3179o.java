package p205z2;

/* JADX INFO: renamed from: z2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3179o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p188x0.O f32288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p188x0.O f32289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p188x0.O f32290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p188x0.O f32291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p188x0.O f32292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p188x0.O f32293f;
    public final p188x0.O g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p188x0.O f32294h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p188x0.O f32295i;
    public final p188x0.O j;

    public C3179o(p188x0.O o8, p188x0.O o9, p188x0.O o10, p188x0.O o11, p188x0.O o12, p188x0.O o13, p188x0.O o14, p188x0.O o15, p188x0.O o16, p188x0.O o17) {
        this.f32288a = o8;
        this.f32289b = o9;
        this.f32290c = o10;
        this.f32291d = o11;
        this.f32292e = o12;
        this.f32293f = o13;
        this.g = o14;
        this.f32294h = o15;
        this.f32295i = o16;
        this.j = o17;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p205z2.C3179o.class != obj.getClass()) {
            return false;
        }
        p205z2.C3179o c3179o = (p205z2.C3179o) obj;
        return kotlin.jvm.internal.m.a(this.f32288a, c3179o.f32288a) && kotlin.jvm.internal.m.a(this.f32289b, c3179o.f32289b) && kotlin.jvm.internal.m.a(this.f32290c, c3179o.f32290c) && kotlin.jvm.internal.m.a(this.f32291d, c3179o.f32291d) && kotlin.jvm.internal.m.a(this.f32292e, c3179o.f32292e) && kotlin.jvm.internal.m.a(this.f32293f, c3179o.f32293f) && kotlin.jvm.internal.m.a(this.g, c3179o.g) && kotlin.jvm.internal.m.a(this.f32294h, c3179o.f32294h) && kotlin.jvm.internal.m.a(this.f32295i, c3179o.f32295i) && kotlin.jvm.internal.m.a(this.j, c3179o.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.f32295i.hashCode() + ((this.f32294h.hashCode() + ((this.g.hashCode() + ((this.f32293f.hashCode() + ((this.f32292e.hashCode() + ((this.f32291d.hashCode() + ((this.f32290c.hashCode() + ((this.f32289b.hashCode() + (this.f32288a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "SelectableSurfaceShape(shape=" + this.f32288a + ", focusedShape=" + this.f32289b + ",pressedShape=" + this.f32290c + ", selectedShape=" + this.f32291d + ",disabledShape=" + this.f32292e + ", focusedSelectedShape=" + this.f32293f + ", focusedDisabledShape=" + this.g + ",pressedSelectedShape=" + this.f32294h + ", selectedDisabledShape=" + this.f32295i + ", focusedSelectedDisabledShape=" + this.j + ')';
    }
}
