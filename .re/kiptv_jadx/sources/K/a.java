package K;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements p194x6.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6636h;

    @Override // p194x6.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        int i3;
        int i9;
        switch (this.f6636h) {
            case 0:
                boolean zBooleanValue = ((java.lang.Boolean) obj3).booleanValue();
                long j = ((p011b1.L) obj5).f17784a;
                java.lang.String string = ((java.lang.CharSequence) obj4).subSequence(p011b1.L.f(j), p011b1.L.e(j)).toString();
                android.content.Intent intentPutExtra = new android.content.Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                android.content.pm.ActivityInfo activityInfo = ((android.content.pm.ResolveInfo) obj2).activityInfo;
                android.content.Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((android.content.Context) obj).startActivity(className);
                break;
            case 1:
                M.g gVar = (M.g) obj;
                Q.e eVar = (Q.e) obj2;
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) obj3;
                p020c0.C1700q c1700q = (p020c0.C1700q) obj4;
                int iIntValue = ((java.lang.Integer) obj5).intValue();
                if ((iIntValue & 6) == 0) {
                    i3 = ((iIntValue & 8) == 0 ? c1700q.f(gVar) : c1700q.h(gVar) ? 4 : 2) | iIntValue;
                } else {
                    i3 = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i3 |= (iIntValue & 64) == 0 ? c1700q.f(eVar) : c1700q.h(eVar) ? 32 : 16;
                }
                if ((iIntValue & androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i3 |= c1700q.h(function0) ? 256 : 128;
                }
                if (c1700q.T(i3 & 1, (i3 & 1171) != 1170)) {
                    O.m.c(gVar, eVar, function0, c1700q, i3 & androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
                } else {
                    c1700q.W();
                }
                break;
            default:
                M.g gVar2 = (M.g) obj;
                Q.e eVar2 = (Q.e) obj2;
                kotlin.jvm.functions.Function0 function1 = (kotlin.jvm.functions.Function0) obj3;
                p020c0.C1700q c1700q2 = (p020c0.C1700q) obj4;
                int iIntValue2 = ((java.lang.Integer) obj5).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i9 = ((iIntValue2 & 8) == 0 ? c1700q2.f(gVar2) : c1700q2.h(gVar2) ? 4 : 2) | iIntValue2;
                } else {
                    i9 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i9 |= (iIntValue2 & 64) == 0 ? c1700q2.f(eVar2) : c1700q2.h(eVar2) ? 32 : 16;
                }
                if ((iIntValue2 & androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i9 |= c1700q2.h(function1) ? 256 : 128;
                }
                if (c1700q2.T(i9 & 1, (i9 & 1171) != 1170)) {
                    O.m.c(gVar2, eVar2, function1, c1700q2, i9 & androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
                } else {
                    c1700q2.W();
                }
                break;
        }
        return p070h6.A.f22523a;
    }
}
