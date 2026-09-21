package androidx.media3.session;

public final class C1609v implements MediaControllerImplBase.RemoteSessionTask {

    public final int f17119h;

    public final MediaControllerImplBase f17120i;
    public final int j;

    public final int f17121k;

    public C1609v(MediaControllerImplBase mediaControllerImplBase, int i3, int i9, int i10) {
        this.f17119h = i10;
        this.f17120i = mediaControllerImplBase;
        this.j = i3;
        this.f17121k = i9;
    }

    @Override
    public final void run(IMediaSession iMediaSession, int i3) {
        switch (this.f17119h) {
            case 0:
                this.f17120i.lambda$moveMediaItem$43(this.j, this.f17121k, iMediaSession, i3);
                break;
            case 1:
                this.f17120i.lambda$removeMediaItems$41(this.j, this.f17121k, iMediaSession, i3);
                break;
            default:
                this.f17120i.lambda$setDeviceVolume$64(this.j, this.f17121k, iMediaSession, i3);
                break;
        }
    }
}
