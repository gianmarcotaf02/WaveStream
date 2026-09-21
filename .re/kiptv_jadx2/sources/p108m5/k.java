package p108m5;

import O7.r;
import android.content.Context;
import android.graphics.Color;
import android.view.accessibility.CaptioningManager;
import androidx.media3.ui.CaptionStyleCompat;
import com.google.common.util.concurrent.P;
import com.kiptv.core.model.LocalDeviceSettings;
import com.kiptv.core.model.UserSettings;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.jvm.internal.m;
import p188x0.C3098s;
import p188x0.z;

public final class k {
    public static l a(Context context, UserSettings settings, LocalDeviceSettings local) {
        int i3;
        Object objT;
        long jC;
        m.e(context, "context");
        m.e(settings, "settings");
        m.e(local, "local");
        String str = "none";
        if (!m.a(local.f19833m, "custom")) {
            Object systemService = context.getSystemService("captioning");
            CaptioningManager captioningManager = systemService instanceof CaptioningManager ? (CaptioningManager) systemService : null;
            if (captioningManager == null) {
                return l.a(l.f25418k, 0, 0L, 0L, 0L, false, null, null, null, 767);
            }
            CaptionStyleCompat captionStyleCompatCreateFromCaptionStyle = CaptionStyleCompat.createFromCaptionStyle(captioningManager.getUserStyle());
            m.d(captionStyleCompatCreateFromCaptionStyle, "createFromCaptionStyle(...)");
            l lVar = l.f25418k;
            int iS = r.s((int) (captioningManager.getFontScale() * 18.0f), 10, 48);
            long jC2 = z.c(captionStyleCompatCreateFromCaptionStyle.foregroundColor);
            long jC3 = z.c(captionStyleCompatCreateFromCaptionStyle.backgroundColor);
            long jC4 = z.c(captionStyleCompatCreateFromCaptionStyle.windowColor);
            int i9 = captionStyleCompatCreateFromCaptionStyle.edgeType;
            if (i9 == 1) {
                str = "outline";
            } else if (i9 == 2) {
                str = "shadow";
            } else if (i9 == 3) {
                str = "raised";
            } else if (i9 == 4) {
                str = "depressed";
            }
            return l.a(lVar, iS, jC2, jC3, jC4, false, null, str, captionStyleCompatCreateFromCaptionStyle, 112);
        }
        if (!m.a(local.f19833m, "custom")) {
            return l.f25418k;
        }
        String str2 = settings.f20586k;
        int iHashCode = str2.hashCode();
        if (iHashCode != -756726333) {
            if (iHashCode != 102742843) {
                if (iHashCode == 109548807 && str2.equals("small")) {
                    i3 = 14;
                } else {
                    i3 = 18;
                }
            } else if (str2.equals("large")) {
                i3 = 22;
            } else {
                i3 = 18;
            }
        } else if (str2.equals("xlarge")) {
            i3 = 26;
        } else {
            i3 = 18;
        }
        int i10 = i3;
        String str3 = settings.f20587l;
        long j = C3098s.f31124c;
        try {
            objT = new C3098s(z.c(Color.parseColor(str3)));
        } catch (Throwable th) {
            objT = P.T(th);
        }
        Object c3098s = new C3098s(j);
        if (objT instanceof p070h6.m) {
            objT = c3098s;
        }
        C3098s c3098s2 = (C3098s) objT;
        String str4 = settings.f20588m;
        if (m.a(str4, "none")) {
            jC = C3098s.f31127f;
        } else {
            jC = m.a(str4, "opaque") ? C3098s.c(C3098s.f31123b, 0.85f) : C3098s.c(C3098s.f31123b, 0.5f);
        }
        return l.a(new l(c3098s2.f31129a, i10, jC, !m.a(settings.f20589n, RRWebVideoEvent.JsonKeys.TOP)), 0, 0L, 0L, 0L, local.f19835o, local.f19834n, local.f19836p, null, 799);
    }
}
