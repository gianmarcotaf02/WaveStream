package android.support.v4.media.session;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.media.session.MediaController f15590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f15591b = new java.lang.Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f15592c = new java.util.ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f15593d = new java.util.HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final android.support.v4.media.session.MediaSessionCompat$Token f15594e;

    public f(android.content.Context context, android.support.v4.media.session.MediaSessionCompat$Token mediaSessionCompat$Token) {
        android.support.v4.media.session.d dVar;
        this.f15594e = mediaSessionCompat$Token;
        android.media.session.MediaController mediaController = new android.media.session.MediaController(context, (android.media.session.MediaSession.Token) mediaSessionCompat$Token.f15567i);
        this.f15590a = mediaController;
        synchronized (mediaSessionCompat$Token.f15566h) {
            dVar = mediaSessionCompat$Token.j;
        }
        if (dVar == null) {
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = new android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(null);
            mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.f15562h = new java.lang.ref.WeakReference(this);
            mediaController.sendCommand(androidx.media3.session.legacy.MediaControllerCompat.COMMAND_GET_EXTRA_BINDER, null, mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
        }
    }

    public final void a() {
        android.support.v4.media.session.d dVar;
        android.support.v4.media.session.MediaSessionCompat$Token mediaSessionCompat$Token = this.f15594e;
        synchronized (mediaSessionCompat$Token.f15566h) {
            dVar = mediaSessionCompat$Token.j;
        }
        if (dVar == null) {
            return;
        }
        java.util.ArrayList arrayList = this.f15592c;
        java.util.Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            arrayList.clear();
        } else {
            if (it.next() != null) {
                throw new java.lang.ClassCastException();
            }
            this.f15593d.put(null, new android.support.v4.media.session.e());
            throw null;
        }
    }
}
