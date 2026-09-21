package android.support.v4.media.session;

/* JADX INFO: loaded from: classes.dex */
public final class i extends android.os.Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15595a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15596b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p105m2.C2611i c2611i) {
        super(android.os.Looper.getMainLooper());
        this.f15596b = c2611i;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        android.support.v4.media.session.m mVar;
        android.support.v4.media.session.k kVar;
        android.support.v4.media.session.i iVar;
        switch (this.f15595a) {
            case 0:
                if (message.what == 1) {
                    synchronized (((android.support.v4.media.session.k) this.f15596b).f15598a) {
                        mVar = (android.support.v4.media.session.m) ((android.support.v4.media.session.k) this.f15596b).f15601d.get();
                        kVar = (android.support.v4.media.session.k) this.f15596b;
                        iVar = kVar.f15602e;
                        break;
                    }
                    if (mVar == null || kVar != mVar.b() || iVar == null) {
                        return;
                    }
                    mVar.f((p082j2.a) message.obj);
                    ((android.support.v4.media.session.k) this.f15596b).a(mVar, iVar);
                    mVar.f(null);
                    return;
                }
                return;
            case 1:
                int i3 = message.what;
                int i9 = message.arg1;
                java.lang.Object obj = message.obj;
                android.os.Bundle bundlePeekData = message.peekData();
                p105m2.C2611i c2611i = (p105m2.C2611i) this.f15596b;
                p105m2.V v6 = (p105m2.V) c2611i.j.get(i9);
                if (v6 == null) {
                    android.util.Log.w("MR2Provider", "Pending callback not found for control request.");
                    return;
                }
                c2611i.j.remove(i9);
                if (i3 == 3) {
                    v6.b((android.os.Bundle) obj);
                    return;
                } else {
                    if (i3 != 4) {
                        return;
                    }
                    p105m2.V.a(bundlePeekData == null ? null : bundlePeekData.getString("error"), (android.os.Bundle) obj);
                    return;
                }
            default:
                int i10 = message.what;
                p105m2.AbstractC2622u abstractC2622u = (p105m2.AbstractC2622u) this.f15596b;
                if (i10 != 1) {
                    if (i10 != 2) {
                        return;
                    }
                    abstractC2622u.f25367m = false;
                    abstractC2622u.f(abstractC2622u.f25366l);
                    return;
                }
                abstractC2622u.f25369o = false;
                p105m2.C2604b c2604b = abstractC2622u.f25365k;
                if (c2604b != null) {
                    p007a7.z zVar = abstractC2622u.f25368n;
                    p105m2.C2608f c2608f = c2604b.f25271a;
                    p105m2.C2627z c2627zD = c2608f.d(abstractC2622u);
                    if (c2627zD != null) {
                        c2608f.m(c2627zD, zVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public i(p105m2.AbstractC2622u abstractC2622u) {
        this.f15596b = abstractC2622u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.support.v4.media.session.k kVar, android.os.Looper looper) {
        super(looper);
        this.f15596b = kVar;
    }
}
