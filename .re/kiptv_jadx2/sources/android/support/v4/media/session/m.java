package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import java.lang.ref.WeakReference;

public class m {

    public final MediaSession f15605a;

    public final l f15606b;

    public final MediaSessionCompat$Token f15607c;

    public final Object f15608d = new Object();

    public final RemoteCallbackList f15609e = new RemoteCallbackList();

    public PlaybackStateCompat f15610f;
    public MediaMetadataCompat g;

    public k f15611h;

    public p082j2.a f15612i;

    public m(Context context) {
        MediaSession mediaSessionA = a(context);
        this.f15605a = mediaSessionA;
        l lVar = new l(this);
        this.f15606b = lVar;
        this.f15607c = new MediaSessionCompat$Token(mediaSessionA.getSessionToken(), lVar);
        mediaSessionA.setFlags(3);
    }

    public MediaSession a(Context context) {
        return new MediaSession(context, "CastMediaSession");
    }

    public final k b() {
        k kVar;
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

    public final PlaybackStateCompat d() {
        return this.f15610f;
    }

    public final void e(k kVar, Handler handler) {
        synchronized (this.f15608d) {
            this.f15611h = kVar;
            this.f15605a.setCallback(kVar == null ? null : kVar.f15599b, handler);
            if (kVar != null) {
                synchronized (kVar.f15598a) {
                    try {
                        kVar.f15601d = new WeakReference(this);
                        i iVar = kVar.f15602e;
                        i iVar2 = null;
                        if (iVar != null) {
                            iVar.removeCallbacksAndMessages(null);
                        }
                        if (handler != null) {
                            iVar2 = new i(kVar, handler.getLooper());
                        }
                        kVar.f15602e = iVar2;
                    } catch (Throwable th) {
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
