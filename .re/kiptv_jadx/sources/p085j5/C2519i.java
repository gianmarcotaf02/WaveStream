package p085j5;

/* JADX INFO: renamed from: j5.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2519i implements androidx.media3.common.Player.Listener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.ExoPlayer f24145h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.A f24146i;
    public final /* synthetic */ S7.C0895k j;

    public C2519i(androidx.media3.exoplayer.ExoPlayer exoPlayer, kotlin.jvm.internal.A a2, S7.C0895k c0895k) {
        this.f24145h = exoPlayer;
        this.f24146i = a2;
        this.j = c0895k;
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPositionDiscontinuity(androidx.media3.common.Player.PositionInfo oldPosition, androidx.media3.common.Player.PositionInfo newPosition, int i3) {
        kotlin.jvm.internal.m.e(oldPosition, "oldPosition");
        kotlin.jvm.internal.m.e(newPosition, "newPosition");
        if (i3 == 1) {
            this.f24145h.removeListener(this);
            this.f24146i.f24539h = null;
            S7.C0895k c0895k = this.j;
            if (c0895k.isActive()) {
                c0895k.resumeWith(p070h6.A.f22523a);
            }
        }
    }
}
