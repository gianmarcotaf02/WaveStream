package p186w5;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.internal.play_billing.M0;
import com.kiptv.core.model.XtreamSeries;
import kotlin.jvm.internal.m;

public final class C2982g implements InterfaceC2984h {

    public final XtreamSeries f30231a;

    public C2982g(XtreamSeries series) {
        m.e(series, "series");
        this.f30231a = series;
    }

    @Override
    public final String a() {
        return this.f30231a.c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2982g) && m.a(this.f30231a, ((C2982g) obj).f30231a);
    }

    @Override
    public final String getKey() {
        return M0.l(this.f30231a.f20684c, CmcdData.STREAMING_FORMAT_SS);
    }

    @Override
    public final String getTitle() {
        return this.f30231a.f20683b;
    }

    public final int hashCode() {
        return this.f30231a.hashCode();
    }

    public final String toString() {
        return "Series(series=" + this.f30231a + ")";
    }
}
