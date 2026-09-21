package K0;

import Q0.X;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LK0/r;", "LQ0/X;", "LK0/s;", "ui"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class r extends X {
    @Override
    public final p137q0.o e() {
        return new C0670s(w.f6736b, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        ((r) obj).getClass();
        C0653a c0653a = w.f6736b;
        return c0653a.equals(c0653a);
    }

    @Override
    public final void f(p137q0.o oVar) {
        C0670s c0670s = (C0670s) oVar;
        C0653a c0653a = w.f6736b;
        if (kotlin.jvm.internal.m.a(c0670s.f6703w, c0653a)) {
            return;
        }
        c0670s.f6703w = c0653a;
        if (c0670s.f6704x) {
            c0670s.P0();
        }
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + w.f6736b + ", overrideDescendants=false)";
    }
}
