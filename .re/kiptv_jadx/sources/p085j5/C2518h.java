package p085j5;

/* JADX INFO: renamed from: j5.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2518h implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.ExoPlayer f24143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p085j5.C2519i f24144i;
    public final /* synthetic */ kotlin.jvm.internal.A j;

    public C2518h(androidx.media3.exoplayer.ExoPlayer exoPlayer, p085j5.C2519i c2519i, kotlin.jvm.internal.A a2) {
        this.f24143h = exoPlayer;
        this.f24144i = c2519i;
        this.j = a2;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        this.f24143h.removeListener(this.f24144i);
        this.j.f24539h = null;
        return p070h6.A.f22523a;
    }
}
