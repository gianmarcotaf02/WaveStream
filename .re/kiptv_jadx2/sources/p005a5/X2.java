package p005a5;

import com.kiptv.core.model.EPGProgram;
import com.kiptv.core.model.XtreamLiveStream;
import kotlin.jvm.internal.m;

public final class X2 {

    public final XtreamLiveStream f14081a;

    public final EPGProgram f14082b;

    public X2(XtreamLiveStream channel, EPGProgram ePGProgram) {
        m.e(channel, "channel");
        this.f14081a = channel;
        this.f14082b = ePGProgram;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X2)) {
            return false;
        }
        X2 x9 = (X2) obj;
        return m.a(this.f14081a, x9.f14081a) && m.a(this.f14082b, x9.f14082b);
    }

    public final int hashCode() {
        return this.f14082b.hashCode() + (this.f14081a.hashCode() * 31);
    }

    public final String toString() {
        return "ProgramSearchHit(channel=" + this.f14081a + ", program=" + this.f14082b + ")";
    }
}
