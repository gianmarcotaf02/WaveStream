package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p007a7.z;
import p105m2.AbstractC2622u;
import p105m2.C2604b;
import p105m2.C2608f;
import p105m2.C2611i;
import p105m2.C2627z;
import p105m2.V;

public final class i extends Handler {

    public final int f15595a = 0;

    public final Object f15596b;

    public i(C2611i c2611i) {
        super(Looper.getMainLooper());
        this.f15596b = c2611i;
    }

    @Override
    public final void handleMessage(Message message) {
        m mVar;
        k kVar;
        i iVar;
        switch (this.f15595a) {
            case 0:
                if (message.what == 1) {
                    synchronized (((k) this.f15596b).f15598a) {
                        mVar = (m) ((k) this.f15596b).f15601d.get();
                        kVar = (k) this.f15596b;
                        iVar = kVar.f15602e;
                        break;
                    }
                    if (mVar == null || kVar != mVar.b() || iVar == null) {
                        return;
                    }
                    mVar.f((p082j2.a) message.obj);
                    ((k) this.f15596b).a(mVar, iVar);
                    mVar.f(null);
                    return;
                }
                return;
            case 1:
                int i3 = message.what;
                int i9 = message.arg1;
                Object obj = message.obj;
                Bundle bundlePeekData = message.peekData();
                C2611i c2611i = (C2611i) this.f15596b;
                V v6 = (V) c2611i.j.get(i9);
                if (v6 == null) {
                    Log.w("MR2Provider", "Pending callback not found for control request.");
                    return;
                }
                c2611i.j.remove(i9);
                if (i3 == 3) {
                    v6.b((Bundle) obj);
                    return;
                } else {
                    if (i3 != 4) {
                        return;
                    }
                    V.a(bundlePeekData == null ? null : bundlePeekData.getString("error"), (Bundle) obj);
                    return;
                }
            default:
                int i10 = message.what;
                AbstractC2622u abstractC2622u = (AbstractC2622u) this.f15596b;
                if (i10 != 1) {
                    if (i10 != 2) {
                        return;
                    }
                    abstractC2622u.f25367m = false;
                    abstractC2622u.f(abstractC2622u.f25366l);
                    return;
                }
                abstractC2622u.f25369o = false;
                C2604b c2604b = abstractC2622u.f25365k;
                if (c2604b != null) {
                    z zVar = abstractC2622u.f25368n;
                    C2608f c2608f = c2604b.f25271a;
                    C2627z c2627zD = c2608f.d(abstractC2622u);
                    if (c2627zD != null) {
                        c2608f.m(c2627zD, zVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public i(AbstractC2622u abstractC2622u) {
        this.f15596b = abstractC2622u;
    }

    public i(k kVar, Looper looper) {
        super(looper);
        this.f15596b = kVar;
    }
}
