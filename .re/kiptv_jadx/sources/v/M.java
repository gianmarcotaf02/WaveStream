package v;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f28879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f28881c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public android.widget.EdgeEffect f28882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public android.widget.EdgeEffect f28883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public android.widget.EdgeEffect f28884f;
    public android.widget.EdgeEffect g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public android.widget.EdgeEffect f28885h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public android.widget.EdgeEffect f28886i;
    public android.widget.EdgeEffect j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public android.widget.EdgeEffect f28887k;

    public M(android.content.Context context, int i3) {
        this.f28879a = context;
        this.f28880b = i3;
    }

    public static boolean f(android.widget.EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(android.widget.EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((android.os.Build.VERSION.SDK_INT >= 31 ? v.AbstractC2899t.b(edgeEffect) : 0.0f) == 0.0f);
    }

    public final android.widget.EdgeEffect a(x.EnumC3061p0 enumC3061p0) {
        int i3 = android.os.Build.VERSION.SDK_INT;
        android.content.Context context = this.f28879a;
        android.widget.EdgeEffect edgeEffectA = i3 >= 31 ? v.AbstractC2899t.a(context) : new v.W(context);
        edgeEffectA.setColor(this.f28880b);
        if (!p113n1.m.a(this.f28881c, 0L)) {
            if (enumC3061p0 == x.EnumC3061p0.f30978h) {
                long j = this.f28881c;
                edgeEffectA.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return edgeEffectA;
            }
            long j9 = this.f28881c;
            edgeEffectA.setSize((int) (j9 & 4294967295L), (int) (j9 >> 32));
        }
        return edgeEffectA;
    }

    public final android.widget.EdgeEffect b() {
        android.widget.EdgeEffect edgeEffect = this.f28883e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect edgeEffectA = a(x.EnumC3061p0.f30978h);
        this.f28883e = edgeEffectA;
        return edgeEffectA;
    }

    public final android.widget.EdgeEffect c() {
        android.widget.EdgeEffect edgeEffect = this.f28884f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect edgeEffectA = a(x.EnumC3061p0.f30979i);
        this.f28884f = edgeEffectA;
        return edgeEffectA;
    }

    public final android.widget.EdgeEffect d() {
        android.widget.EdgeEffect edgeEffect = this.g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect edgeEffectA = a(x.EnumC3061p0.f30979i);
        this.g = edgeEffectA;
        return edgeEffectA;
    }

    public final android.widget.EdgeEffect e() {
        android.widget.EdgeEffect edgeEffect = this.f28882d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect edgeEffectA = a(x.EnumC3061p0.f30978h);
        this.f28882d = edgeEffectA;
        return edgeEffectA;
    }
}
