package p005a5;

import com.kiptv.core.local.cache.MovieCollectionStore$Part;
import com.kiptv.core.model.XtreamVODStream;
import java.util.List;
import kotlin.jvm.internal.m;
import p078i6.o;

public final class Z2 {

    public final MovieCollectionStore$Part f14163a;

    public final List f14164b;

    public Z2(MovieCollectionStore$Part part, List list) {
        m.e(part, "part");
        this.f14163a = part;
        this.f14164b = list;
    }

    public final XtreamVODStream a() {
        return (XtreamVODStream) o.j1(this.f14164b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z2)) {
            return false;
        }
        Z2 z6 = (Z2) obj;
        return m.a(this.f14163a, z6.f14163a) && m.a(this.f14164b, z6.f14164b);
    }

    public final int hashCode() {
        return this.f14164b.hashCode() + (this.f14163a.hashCode() * 31);
    }

    public final String toString() {
        return "SagaEntry(part=" + this.f14163a + ", copies=" + this.f14164b + ")";
    }
}
