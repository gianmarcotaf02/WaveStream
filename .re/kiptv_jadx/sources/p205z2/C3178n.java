package p205z2;

/* JADX INFO: renamed from: z2.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3178n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p205z2.C3178n f32285c = new p205z2.C3178n(1.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f32286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f32287b;

    public C3178n(float f9, float f10) {
        this.f32286a = f9;
        this.f32287b = f10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p205z2.C3178n.class != obj.getClass()) {
            return false;
        }
        p205z2.C3178n c3178n = (p205z2.C3178n) obj;
        return this.f32286a == c3178n.f32286a && this.f32287b == c3178n.f32287b;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(1.0f) + p121o0.p.c(1.0f, p121o0.p.c(1.0f, p121o0.p.c(1.0f, p121o0.p.c(this.f32287b, p121o0.p.c(1.0f, p121o0.p.c(1.0f, p121o0.p.c(1.0f, p121o0.p.c(this.f32286a, java.lang.Float.hashCode(1.0f) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final java.lang.String toString() {
        return "SelectableSurfaceScale(scale=1.0, focusedScale=" + this.f32286a + ",pressedScale=1.0, selectedScale=1.0,disabledScale=1.0, focusedSelectedScale=" + this.f32287b + ", focusedDisabledScale=1.0,pressedSelectedScale=1.0, selectedDisabledScale=1.0, focusedSelectedDisabledScale=1.0)";
    }
}
