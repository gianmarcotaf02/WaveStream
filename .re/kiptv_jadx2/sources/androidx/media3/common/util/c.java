package androidx.media3.common.util;

import android.content.Intent;
import android.content.IntentSender;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import java.io.Serializable;
import java.util.concurrent.CopyOnWriteArraySet;
import p020c0.C1704s0;
import p105m2.a0;

public final class c implements Runnable {

    public final int f16455h;

    public final int f16456i;
    public final Object j;

    public final Object f16457k;

    public c(DrmSessionEventListener.EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener, int i3) {
        this.f16455h = 1;
        this.j = eventDispatcher;
        this.f16457k = drmSessionEventListener;
        this.f16456i = i3;
    }

    @Override
    public final void run() {
        switch (this.f16455h) {
            case 0:
                ListenerSet.lambda$queueEvent$0((CopyOnWriteArraySet) this.j, this.f16456i, (ListenerSet.Event) this.f16457k);
                break;
            case 1:
                ((DrmSessionEventListener.EventDispatcher) this.j).lambda$drmSessionAcquired$0((DrmSessionEventListener) this.f16457k, this.f16456i);
                break;
            case 2:
                Serializable serializable = (Serializable) ((C1704s0) this.f16457k).f18362i;
                p019c.i iVar = (p019c.i) this.j;
                String str = (String) iVar.f18040a.get(Integer.valueOf(this.f16456i));
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
                ((p019c.i) this.j).a(this.f16456i, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f16457k));
                break;
            default:
                ((p147r2.b) ((a0) this.j).f25266c).d(this.f16456i, (Serializable) this.f16457k);
                break;
        }
    }

    public c(Object obj, int i3, Object obj2, int i9) {
        this.f16455h = i9;
        this.j = obj;
        this.f16456i = i3;
        this.f16457k = obj2;
    }
}
