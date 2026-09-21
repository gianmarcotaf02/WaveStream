package p186w5;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.internal.play_billing.M0;
import com.kiptv.core.model.XtreamVODStream;
import kotlin.jvm.internal.m;

public final class C2980f implements InterfaceC2984h {

    public final XtreamVODStream f30224a;

    public C2980f(XtreamVODStream movie) {
        m.e(movie, "movie");
        this.f30224a = movie;
    }

    @Override
    public final String a() {
        return this.f30224a.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2980f) && m.a(this.f30224a, ((C2980f) obj).f30224a);
    }

    @Override
    public final String getKey() {
        return M0.l(this.f30224a.f20725d, CmcdData.OBJECT_TYPE_MANIFEST);
    }

    @Override
    public final String getTitle() {
        return this.f30224a.f20723b;
    }

    public final int hashCode() {
        return this.f30224a.hashCode();
    }

    public final String toString() {
        return "Movie(movie=" + this.f30224a + ")";
    }
}
