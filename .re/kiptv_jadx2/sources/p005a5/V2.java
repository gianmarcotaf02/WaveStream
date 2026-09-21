package p005a5;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.internal.play_billing.M0;
import com.kiptv.core.model.XtreamVODStream;
import kotlin.jvm.internal.m;

public final class V2 extends W2 {

    public final C1250d3 f14020a;

    public V2(C1250d3 hit) {
        m.e(hit, "hit");
        this.f14020a = hit;
    }

    @Override
    public final String a() {
        return M0.l(((XtreamVODStream) this.f14020a.f14349a).f20725d, CmcdData.OBJECT_TYPE_MANIFEST);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof V2) && m.a(this.f14020a, ((V2) obj).f14020a);
    }

    public final int hashCode() {
        return this.f14020a.hashCode();
    }

    public final String toString() {
        return "Movie(hit=" + this.f14020a + ")";
    }
}
