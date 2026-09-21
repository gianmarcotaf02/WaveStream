package w;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements p194x6.s {
    @Override // p194x6.s
    public final java.lang.Object b(java.lang.String str, java.lang.Boolean bool, w.c cVar, java.lang.Object obj, java.lang.Object obj2, p020c0.C1700q c1700q, java.lang.Integer num) {
        int i3;
        p137q0.m mVar = p137q0.m.f26474b;
        boolean zBooleanValue = bool.booleanValue();
        p194x6.n nVar = (p194x6.n) obj;
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) obj2;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            i3 = (c1700q.f(mVar) ? 4 : 2) | iIntValue;
        } else {
            i3 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i3 |= c1700q.f(str) ? 32 : 16;
        }
        if ((iIntValue & androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= c1700q.g(zBooleanValue) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i3 |= c1700q.f(cVar) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i3 |= c1700q.h(nVar) ? 16384 : 8192;
        }
        if ((iIntValue & 196608) == 0) {
            i3 |= c1700q.h(function0) ? 131072 : 65536;
        }
        if (c1700q.T(i3 & 1, (599187 & i3) != 599186)) {
            w.g.c(str, zBooleanValue, cVar, mVar, nVar, function0, c1700q, ((i3 >> 3) & androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED) | ((i3 << 9) & 7168) | (57344 & i3) | (i3 & 458752));
        } else {
            c1700q.W();
        }
        return p070h6.A.f22523a;
    }
}
