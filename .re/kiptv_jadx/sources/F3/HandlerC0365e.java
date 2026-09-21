package F3;

/* JADX INFO: renamed from: F3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC0365e extends Z3.d {
    @Override // Z3.d, android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i3 = message.what;
        if (i3 != 1) {
            if (i3 != 2) {
                android.util.Log.wtf("BasePendingResult", com.google.android.gms.internal.play_billing.M0.l(i3, "Don't know how to handle message: "), new java.lang.Exception());
                return;
            } else {
                ((com.google.android.gms.common.api.internal.BasePendingResult) message.obj).l0(com.google.android.gms.common.api.Status.f18688o);
                return;
            }
        }
        android.util.Pair pair = (android.util.Pair) message.obj;
        try {
            ((p199y3.n) pair.first).a((E3.k) pair.second);
        } catch (java.lang.RuntimeException e6) {
            B4.a aVar = com.google.android.gms.common.api.internal.BasePendingResult.f18693x;
            throw e6;
        }
    }
}
