package coil3.compose;

import C0.a;
import F2.f;
import S2.d;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"coil3/compose/AsyncImagePainter$State$Error", "LF2/f;", "LC0/a;", "painter", "LC0/a;", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "()LC0/a;", "coil-compose-core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class AsyncImagePainter$State$Error implements f {

    public final d f18553a;
    private final a painter;

    public AsyncImagePainter$State$Error(a aVar, d dVar) {
        this.painter = aVar;
        this.f18553a = dVar;
    }

    @Override
    public final a getPainter() {
        return this.painter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AsyncImagePainter$State$Error)) {
            return false;
        }
        AsyncImagePainter$State$Error asyncImagePainter$State$Error = (AsyncImagePainter$State$Error) obj;
        return m.a(this.painter, asyncImagePainter$State$Error.painter) && m.a(this.f18553a, asyncImagePainter$State$Error.f18553a);
    }

    public final int hashCode() {
        a aVar = this.painter;
        return this.f18553a.hashCode() + ((aVar == null ? 0 : aVar.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.painter + ", result=" + this.f18553a + ')';
    }
}
