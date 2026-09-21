package coil3.compose;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"coil3/compose/AsyncImagePainter$State$Success", "LF2/f;", "LC0/a;", "painter", "LC0/a;", androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_AUDIO_ONLY, "()LC0/a;", "coil-compose-core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class AsyncImagePainter$State$Success implements F2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S2.q f18554a;
    private final C0.a painter;

    public AsyncImagePainter$State$Success(C0.a aVar, S2.q qVar) {
        this.painter = aVar;
        this.f18554a = qVar;
    }

    @Override // F2.f
    /* JADX INFO: renamed from: a, reason: from getter */
    public final C0.a getPainter() {
        return this.painter;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof coil3.compose.AsyncImagePainter$State$Success)) {
            return false;
        }
        coil3.compose.AsyncImagePainter$State$Success asyncImagePainter$State$Success = (coil3.compose.AsyncImagePainter$State$Success) obj;
        return kotlin.jvm.internal.m.a(this.painter, asyncImagePainter$State$Success.painter) && kotlin.jvm.internal.m.a(this.f18554a, asyncImagePainter$State$Success.f18554a);
    }

    public final int hashCode() {
        return this.f18554a.hashCode() + (this.painter.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "Success(painter=" + this.painter + ", result=" + this.f18554a + ')';
    }
}
