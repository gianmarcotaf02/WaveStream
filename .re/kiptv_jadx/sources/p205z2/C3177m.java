package p205z2;

/* JADX INFO: renamed from: z2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3177m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p205z2.C3173i f32279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p205z2.C3173i f32280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p205z2.C3173i f32281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p205z2.C3173i f32282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p205z2.C3173i f32283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p205z2.C3173i f32284f;

    public C3177m(p205z2.C3173i c3173i, p205z2.C3173i c3173i2, p205z2.C3173i c3173i3, p205z2.C3173i c3173i4, p205z2.C3173i c3173i5, p205z2.C3173i c3173i6) {
        this.f32279a = c3173i;
        this.f32280b = c3173i2;
        this.f32281c = c3173i3;
        this.f32282d = c3173i4;
        this.f32283e = c3173i5;
        this.f32284f = c3173i6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p205z2.C3177m.class != obj.getClass()) {
            return false;
        }
        p205z2.C3177m c3177m = (p205z2.C3177m) obj;
        return kotlin.jvm.internal.m.a(this.f32279a, c3177m.f32279a) && kotlin.jvm.internal.m.a(this.f32280b, c3177m.f32280b) && kotlin.jvm.internal.m.a(this.f32281c, c3177m.f32281c) && kotlin.jvm.internal.m.a(this.f32282d, c3177m.f32282d) && kotlin.jvm.internal.m.a(this.f32283e, c3177m.f32283e) && kotlin.jvm.internal.m.a(this.f32284f, c3177m.f32284f);
    }

    public final int hashCode() {
        return this.f32284f.hashCode() + ((this.f32283e.hashCode() + ((this.f32282d.hashCode() + ((this.f32281c.hashCode() + ((this.f32280b.hashCode() + (this.f32279a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "SelectableSurfaceGlow(glow=" + this.f32279a + ", focusedGlow=" + this.f32280b + ",pressedGlow=" + this.f32281c + ", selectedGlow=" + this.f32282d + ",focusedSelectedGlow=" + this.f32283e + ", pressedSelectedGlow=" + this.f32284f + ')';
    }
}
