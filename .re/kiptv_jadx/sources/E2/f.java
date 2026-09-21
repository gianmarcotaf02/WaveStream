package E2;

/* JADX INFO: loaded from: classes.dex */
public final class f implements E2.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f2781a;

    public f(android.graphics.drawable.Drawable drawable) {
        this.f2781a = drawable;
    }

    @Override // E2.l
    public final int a() {
        return X2.l.a(this.f2781a);
    }

    @Override // E2.l
    public final int b() {
        return X2.l.b(this.f2781a);
    }

    @Override // E2.l
    public final long c() {
        android.graphics.drawable.Drawable drawable = this.f2781a;
        long jB = ((long) X2.l.b(drawable)) * 4 * ((long) X2.l.a(drawable));
        if (jB < 0) {
            return 0L;
        }
        return jB;
    }

    @Override // E2.l
    public final boolean d() {
        return false;
    }

    @Override // E2.l
    public final void e(android.graphics.Canvas canvas) {
        this.f2781a.draw(canvas);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof E2.f) {
            return kotlin.jvm.internal.m.a(this.f2781a, ((E2.f) obj).f2781a);
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(false) + (this.f2781a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "DrawableImage(drawable=" + this.f2781a + ", shareable=false)";
    }
}
