package android.support.v4.media.session;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;

public abstract class k {

    public boolean f15600c;

    public i f15602e;

    public final Object f15598a = new Object();

    public final j f15599b = new j(this);

    public WeakReference f15601d = new WeakReference(null);

    public final void a(m mVar, Handler handler) {
        if (this.f15600c) {
            this.f15600c = false;
            handler.removeMessages(1);
            PlaybackStateCompat playbackStateCompatD = mVar.d();
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

    public boolean c(Intent intent) {
        m mVar;
        i iVar;
        KeyEvent keyEvent;
        if (Build.VERSION.SDK_INT < 27) {
            synchronized (this.f15598a) {
                mVar = (m) this.f15601d.get();
                iVar = this.f15602e;
            }
            if (mVar != null && iVar != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
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
                    iVar.sendMessageDelayed(iVar.obtainMessage(1, aVarC), ViewConfiguration.getDoubleTapTimeout());
                    return true;
                }
                iVar.removeMessages(1);
                this.f15600c = false;
                PlaybackStateCompat playbackStateCompatD = mVar.d();
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

    public void b(String str) {
    }
}
