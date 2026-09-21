package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import androidx.media3.session.legacy.MediaControllerCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class f {

    public final MediaController f15590a;

    public final Object f15591b = new Object();

    public final ArrayList f15592c = new ArrayList();

    public final HashMap f15593d = new HashMap();

    public final MediaSessionCompat$Token f15594e;

    public f(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        d dVar;
        this.f15594e = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.f15567i);
        this.f15590a = mediaController;
        synchronized (mediaSessionCompat$Token.f15566h) {
            dVar = mediaSessionCompat$Token.j;
        }
        if (dVar == null) {
            MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = new MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(null);
            mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.f15562h = new WeakReference(this);
            mediaController.sendCommand(MediaControllerCompat.COMMAND_GET_EXTRA_BINDER, null, mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
        }
    }

    public final void a() {
        d dVar;
        MediaSessionCompat$Token mediaSessionCompat$Token = this.f15594e;
        synchronized (mediaSessionCompat$Token.f15566h) {
            dVar = mediaSessionCompat$Token.j;
        }
        if (dVar == null) {
            return;
        }
        ArrayList arrayList = this.f15592c;
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            arrayList.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            this.f15593d.put(null, new e());
            throw null;
        }
    }
}
