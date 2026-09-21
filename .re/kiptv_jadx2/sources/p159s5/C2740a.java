package p159s5;

import com.kiptv.core.model.XtreamLiveStream;
import kotlin.jvm.internal.m;

public final class C2740a extends AbstractC2743d {

    public final XtreamLiveStream f27271a;

    public C2740a(XtreamLiveStream channel) {
        m.e(channel, "channel");
        this.f27271a = channel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2740a) && m.a(this.f27271a, ((C2740a) obj).f27271a);
    }

    public final int hashCode() {
        return this.f27271a.hashCode();
    }

    public final String toString() {
        return "Live(channel=" + this.f27271a + ")";
    }
}
