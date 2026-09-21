package v;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import x.EnumC3061p0;

public final class M {

    public final Context f28879a;

    public final int f28880b;

    public long f28881c = 0;

    public EdgeEffect f28882d;

    public EdgeEffect f28883e;

    public EdgeEffect f28884f;
    public EdgeEffect g;

    public EdgeEffect f28885h;

    public EdgeEffect f28886i;
    public EdgeEffect j;

    public EdgeEffect f28887k;

    public M(Context context, int i3) {
        this.f28879a = context;
        this.f28880b = i3;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? AbstractC2899t.b(edgeEffect) : 0.0f) == 0.0f);
    }

    public final EdgeEffect a(EnumC3061p0 enumC3061p0) {
        int i3 = Build.VERSION.SDK_INT;
        Context context = this.f28879a;
        EdgeEffect edgeEffectA = i3 >= 31 ? AbstractC2899t.a(context) : new W(context);
        edgeEffectA.setColor(this.f28880b);
        if (!p113n1.m.a(this.f28881c, 0L)) {
            if (enumC3061p0 == EnumC3061p0.f30978h) {
                long j = this.f28881c;
                edgeEffectA.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return edgeEffectA;
            }
            long j9 = this.f28881c;
            edgeEffectA.setSize((int) (j9 & 4294967295L), (int) (j9 >> 32));
        }
        return edgeEffectA;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.f28883e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(EnumC3061p0.f30978h);
        this.f28883e = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f28884f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(EnumC3061p0.f30979i);
        this.f28884f = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(EnumC3061p0.f30979i);
        this.g = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f28882d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(EnumC3061p0.f30978h);
        this.f28882d = edgeEffectA;
        return edgeEffectA;
    }
}
