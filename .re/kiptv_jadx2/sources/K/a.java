package K;

import M.g;
import O.m;
import Q.e;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import kotlin.jvm.functions.Function0;
import p011b1.L;
import p020c0.C1700q;
import p070h6.A;
import p194x6.p;

public final class a implements p {

    public final int f6636h;

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i3;
        int i9;
        switch (this.f6636h) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                long j = ((L) obj5).f17784a;
                String string = ((CharSequence) obj4).subSequence(L.f(j), L.e(j)).toString();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                break;
            case 1:
                g gVar = (g) obj;
                e eVar = (e) obj2;
                Function0 function0 = (Function0) obj3;
                C1700q c1700q = (C1700q) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                if ((iIntValue & 6) == 0) {
                    i3 = ((iIntValue & 8) == 0 ? c1700q.f(gVar) : c1700q.h(gVar) ? 4 : 2) | iIntValue;
                } else {
                    i3 = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i3 |= (iIntValue & 64) == 0 ? c1700q.f(eVar) : c1700q.h(eVar) ? 32 : 16;
                }
                if ((iIntValue & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i3 |= c1700q.h(function0) ? 256 : 128;
                }
                if (c1700q.T(i3 & 1, (i3 & 1171) != 1170)) {
                    m.c(gVar, eVar, function0, c1700q, i3 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
                } else {
                    c1700q.W();
                }
                break;
            default:
                g gVar2 = (g) obj;
                e eVar2 = (e) obj2;
                Function0 function1 = (Function0) obj3;
                C1700q c1700q2 = (C1700q) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i9 = ((iIntValue2 & 8) == 0 ? c1700q2.f(gVar2) : c1700q2.h(gVar2) ? 4 : 2) | iIntValue2;
                } else {
                    i9 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i9 |= (iIntValue2 & 64) == 0 ? c1700q2.f(eVar2) : c1700q2.h(eVar2) ? 32 : 16;
                }
                if ((iIntValue2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i9 |= c1700q2.h(function1) ? 256 : 128;
                }
                if (c1700q2.T(i9 & 1, (i9 & 1171) != 1170)) {
                    m.c(gVar2, eVar2, function1, c1700q2, i9 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
                } else {
                    c1700q2.W();
                }
                break;
        }
        return A.f22523a;
    }
}
