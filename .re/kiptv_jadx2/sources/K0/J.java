package K0;

import J.AbstractC0549n;
import Q0.C0778l;
import Q0.X;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LK0/J;", "LQ0/X;", "LK0/K;", "ui"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class J extends X {

    public final C0778l f6657b;

    public J(C0778l c0778l) {
        this.f6657b = c0778l;
    }

    @Override
    public final p137q0.o e() {
        return new K(AbstractC0549n.f5849c, this.f6657b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j = (J) obj;
        j.getClass();
        C0653a c0653a = AbstractC0549n.f5849c;
        return c0653a.equals(c0653a) && kotlin.jvm.internal.m.a(this.f6657b, j.f6657b);
    }

    @Override
    public final void f(p137q0.o oVar) {
        K k9 = (K) oVar;
        C0653a c0653a = AbstractC0549n.f5849c;
        if (!kotlin.jvm.internal.m.a(k9.f6703w, c0653a)) {
            k9.f6703w = c0653a;
            if (k9.f6704x) {
                k9.P0();
            }
        }
        k9.f6702v = this.f6657b;
    }

    public final int hashCode() {
        int iF = p121o0.p.f(AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED * 31, 31, false);
        C0778l c0778l = this.f6657b;
        return iF + (c0778l != null ? c0778l.hashCode() : 0);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + AbstractC0549n.f5849c + ", overrideDescendants=false, touchBoundsExpansion=" + this.f6657b + ')';
    }
}
