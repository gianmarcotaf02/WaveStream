package android.support.v4.media.session;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.media.session.MediaSession f15605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.support.v4.media.session.l f15606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.support.v4.media.session.MediaSessionCompat$Token f15607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f15608d = new java.lang.Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final android.os.RemoteCallbackList f15609e = new android.os.RemoteCallbackList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public android.support.v4.media.session.PlaybackStateCompat f15610f;
    public android.support.v4.media.MediaMetadataCompat g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public android.support.v4.media.session.k f15611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p082j2.a f15612i;

    public m(android.content.Context context) {
        android.media.session.MediaSession mediaSessionA = a(context);
        this.f15605a = mediaSessionA;
        android.support.v4.media.session.l lVar = new android.support.v4.media.session.l(this);
        this.f15606b = lVar;
        this.f15607c = new android.support.v4.media.session.MediaSessionCompat$Token(mediaSessionA.getSessionToken(), lVar);
        mediaSessionA.setFlags(3);
    }

    public android.media.session.MediaSession a(android.content.Context context) {
        return new android.media.session.MediaSession(context, "CastMediaSession");
    }

    public final android.support.v4.media.session.k b() {
        android.support.v4.media.session.k kVar;
        synchronized (this.f15608d) {
            kVar = this.f15611h;
        }
        return kVar;
    }

    public p082j2.a c() {
        p082j2.a aVar;
        synchronized (this.f15608d) {
            aVar = this.f15612i;
        }
        return aVar;
    }

    public final android.support.v4.media.session.PlaybackStateCompat d() {
        return this.f15610f;
    }

    public final void e(android.support.v4.media.session.k kVar, android.os.Handler handler) {
        synchronized (this.f15608d) {
            this.f15611h = kVar;
            this.f15605a.setCallback(kVar == null ? null : kVar.f15599b, handler);
            if (kVar != null) {
                synchronized (kVar.f15598a) {
                    try {
                        kVar.f15601d = new java.lang.ref.WeakReference(this);
                        android.support.v4.media.session.i iVar = kVar.f15602e;
                        android.support.v4.media.session.i iVar2 = null;
                        if (iVar != null) {
                            iVar.removeCallbacksAndMessages(null);
                        }
                        if (handler != null) {
                            iVar2 = new android.support.v4.media.session.i(kVar, handler.getLooper());
                        }
                        kVar.f15602e = iVar2;
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public void f(p082j2.a aVar) {
        synchronized (this.f15608d) {
            this.f15612i = aVar;
        }
    }
}
