package p159s5;

import com.kiptv.core.model.XtreamVODStream;
import kotlin.jvm.internal.m;

public final class C2741b extends AbstractC2743d {

    public final XtreamVODStream f27272a;

    public C2741b(XtreamVODStream stream) {
        m.e(stream, "stream");
        this.f27272a = stream;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2741b) && m.a(this.f27272a, ((C2741b) obj).f27272a);
    }

    public final int hashCode() {
        return this.f27272a.hashCode();
    }

    public final String toString() {
        return "Movie(stream=" + this.f27272a + ")";
    }
}
