package androidx.media3.session;

/* JADX INFO: renamed from: androidx.media3.session.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1615y implements p068h4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaControllerImplBase f17137b;

    public /* synthetic */ C1615y(androidx.media3.session.MediaControllerImplBase mediaControllerImplBase, int i3) {
        this.f17136a = i3;
        this.f17137b = mediaControllerImplBase;
    }

    @Override // p068h4.j
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.f17136a) {
            case 0:
                return this.f17137b.lambda$setMediaItems$28((androidx.media3.common.MediaItem) obj);
            case 1:
                return this.f17137b.lambda$addMediaItems$38((androidx.media3.common.MediaItem) obj);
            case 2:
                return this.f17137b.lambda$replaceMediaItems$46((androidx.media3.common.MediaItem) obj);
            case 3:
                return this.f17137b.lambda$setMediaItems$30((androidx.media3.common.MediaItem) obj);
            case 4:
                return this.f17137b.lambda$setMediaItems$26((androidx.media3.common.MediaItem) obj);
            default:
                return this.f17137b.lambda$addMediaItems$36((androidx.media3.common.MediaItem) obj);
        }
    }
}
