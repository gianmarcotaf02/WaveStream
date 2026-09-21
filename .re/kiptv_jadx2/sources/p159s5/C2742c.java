package p159s5;

import com.kiptv.core.model.XtreamSeries;
import kotlin.jvm.internal.m;

public final class C2742c extends AbstractC2743d {

    public final XtreamSeries f27273a;

    public C2742c(XtreamSeries series) {
        m.e(series, "series");
        this.f27273a = series;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2742c) && m.a(this.f27273a, ((C2742c) obj).f27273a);
    }

    public final int hashCode() {
        return this.f27273a.hashCode();
    }

    public final String toString() {
        return "Series(series=" + this.f27273a + ")";
    }
}
