package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16456i;
    public final /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16457k;

    public /* synthetic */ c(androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener, int i3) {
        this.f16455h = 1;
        this.j = eventDispatcher;
        this.f16457k = drmSessionEventListener;
        this.f16456i = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16455h) {
            case 0:
                androidx.media3.common.util.ListenerSet.lambda$queueEvent$0((java.util.concurrent.CopyOnWriteArraySet) this.j, this.f16456i, (androidx.media3.common.util.ListenerSet.Event) this.f16457k);
                break;
            case 1:
                ((androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher) this.j).lambda$drmSessionAcquired$0((androidx.media3.exoplayer.drm.DrmSessionEventListener) this.f16457k, this.f16456i);
                break;
            case 2:
                java.io.Serializable serializable = (java.io.Serializable) ((p020c0.C1704s0) this.f16457k).f18362i;
                p019c.i iVar = (p019c.i) this.j;
                java.lang.String str = (java.lang.String) iVar.f18040a.get(java.lang.Integer.valueOf(this.f16456i));
                if (str != null) {
                    p046f.d dVar = (p046f.d) iVar.f18044e.get(str);
                    if ((dVar != null ? dVar.f21611a : null) != null) {
                        p046f.b bVar = dVar.f21611a;
                        if (iVar.f18043d.remove(str)) {
                            bVar.d(serializable);
                        }
                    } else {
                        iVar.g.remove(str);
                        iVar.f18045f.put(str, serializable);
                    }
                    break;
                }
                break;
            case 3:
                ((p019c.i) this.j).a(this.f16456i, 0, new android.content.Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (android.content.IntentSender.SendIntentException) this.f16457k));
                break;
            default:
                ((p147r2.b) ((p105m2.a0) this.j).f25266c).d(this.f16456i, (java.io.Serializable) this.f16457k);
                break;
        }
    }

    public /* synthetic */ c(java.lang.Object obj, int i3, java.lang.Object obj2, int i9) {
        this.f16455h = i9;
        this.j = obj;
        this.f16456i = i3;
        this.f16457k = obj2;
    }
}
