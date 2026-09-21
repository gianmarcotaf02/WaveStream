package android.support.v4.media.session;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15600c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public android.support.v4.media.session.i f15602e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f15598a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.support.v4.media.session.j f15599b = new android.support.v4.media.session.j(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f15601d = new java.lang.ref.WeakReference(null);

    public final void a(android.support.v4.media.session.m mVar, android.os.Handler handler) {
        if (this.f15600c) {
            this.f15600c = false;
            handler.removeMessages(1);
            android.support.v4.media.session.PlaybackStateCompat playbackStateCompatD = mVar.d();
            long j = playbackStateCompatD == null ? 0L : playbackStateCompatD.f15576l;
            boolean z6 = playbackStateCompatD != null && playbackStateCompatD.f15573h == 3;
            boolean z9 = (516 & j) != 0;
            boolean z10 = (j & 514) != 0;
            if (z6 && z10) {
                d();
            } else {
                if (z6 || !z9) {
                    return;
                }
                e();
            }
        }
    }

    public boolean c(android.content.Intent intent) {
        android.support.v4.media.session.m mVar;
        android.support.v4.media.session.i iVar;
        android.view.KeyEvent keyEvent;
        if (android.os.Build.VERSION.SDK_INT < 27) {
            synchronized (this.f15598a) {
                mVar = (android.support.v4.media.session.m) this.f15601d.get();
                iVar = this.f15602e;
            }
            if (mVar != null && iVar != null && (keyEvent = (android.view.KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                p082j2.a aVarC = mVar.c();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    a(mVar, iVar);
                    return false;
                }
                if (keyEvent.getRepeatCount() != 0) {
                    a(mVar, iVar);
                    return true;
                }
                if (!this.f15600c) {
                    this.f15600c = true;
                    iVar.sendMessageDelayed(iVar.obtainMessage(1, aVarC), android.view.ViewConfiguration.getDoubleTapTimeout());
                    return true;
                }
                iVar.removeMessages(1);
                this.f15600c = false;
                android.support.v4.media.session.PlaybackStateCompat playbackStateCompatD = mVar.d();
                if (((playbackStateCompatD == null ? 0L : playbackStateCompatD.f15576l) & 32) != 0) {
                    g();
                }
                return true;
            }
        }
        return false;
    }

    public void d() {
    }

    public void e() {
    }

    public void f(long j) {
    }

    public void g() {
    }

    public void h() {
    }

    public void b(java.lang.String str) {
    }
}
