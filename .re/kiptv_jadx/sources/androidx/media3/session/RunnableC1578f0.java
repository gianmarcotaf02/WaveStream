package androidx.media3.session;

/* JADX INFO: renamed from: androidx.media3.session.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1578f0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17018h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17019i;
    public final /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17020k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17021l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17022m;

    public /* synthetic */ RunnableC1578f0(androidx.media3.session.MediaControllerImplLegacy mediaControllerImplLegacy, java.util.concurrent.atomic.AtomicInteger atomicInteger, java.util.List list, java.util.ArrayList arrayList, int i3) {
        this.j = mediaControllerImplLegacy;
        this.f17020k = atomicInteger;
        this.f17021l = list;
        this.f17022m = arrayList;
        this.f17019i = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17018h) {
            case 0:
                ((androidx.media3.session.MediaControllerImplLegacy) this.j).lambda$addQueueItems$4((java.util.concurrent.atomic.AtomicInteger) this.f17020k, (java.util.List) this.f17021l, (java.util.ArrayList) this.f17022m, this.f17019i);
                break;
            default:
                ((androidx.media3.session.MediaSessionLegacyStub) this.j).lambda$dispatchSessionTaskWithSessionCommandInternal$22((androidx.media3.session.SessionCommand) this.f17020k, this.f17019i, (androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo) this.f17021l, (androidx.media3.session.MediaSessionLegacyStub.SessionTask) this.f17022m);
                break;
        }
    }

    public /* synthetic */ RunnableC1578f0(androidx.media3.session.MediaSessionLegacyStub mediaSessionLegacyStub, androidx.media3.session.SessionCommand sessionCommand, int i3, androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo, androidx.media3.session.MediaSessionLegacyStub.SessionTask sessionTask) {
        this.j = mediaSessionLegacyStub;
        this.f17020k = sessionCommand;
        this.f17019i = i3;
        this.f17021l = remoteUserInfo;
        this.f17022m = sessionTask;
    }
}
