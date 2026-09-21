package androidx.media3.session;

/* JADX INFO: renamed from: androidx.media3.session.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1576e0 implements androidx.media3.common.util.ListenerSet.Event, androidx.media3.common.util.ListenerSet.IterationFinishedEvent {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaControllerImplLegacy f17009h;

    public /* synthetic */ C1576e0(androidx.media3.session.MediaControllerImplLegacy mediaControllerImplLegacy) {
        this.f17009h = mediaControllerImplLegacy;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(java.lang.Object obj) {
        this.f17009h.lambda$updateControllerInfo$14((androidx.media3.common.Player.Listener) obj);
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void invoke(java.lang.Object obj, androidx.media3.common.FlagSet flagSet) {
        this.f17009h.lambda$new$0((androidx.media3.common.Player.Listener) obj, flagSet);
    }
}
