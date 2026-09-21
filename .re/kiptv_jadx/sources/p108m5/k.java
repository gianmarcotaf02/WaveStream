package p108m5;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    public static p108m5.l a(android.content.Context context, com.kiptv.core.model.UserSettings settings, com.kiptv.core.model.LocalDeviceSettings local) {
        int i3;
        java.lang.Object objT;
        long jC;
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(settings, "settings");
        kotlin.jvm.internal.m.e(local, "local");
        java.lang.String str = "none";
        if (!kotlin.jvm.internal.m.a(local.f19833m, "custom")) {
            java.lang.Object systemService = context.getSystemService("captioning");
            android.view.accessibility.CaptioningManager captioningManager = systemService instanceof android.view.accessibility.CaptioningManager ? (android.view.accessibility.CaptioningManager) systemService : null;
            if (captioningManager == null) {
                return p108m5.l.a(p108m5.l.f25418k, 0, 0L, 0L, 0L, false, null, null, null, 767);
            }
            androidx.media3.ui.CaptionStyleCompat captionStyleCompatCreateFromCaptionStyle = androidx.media3.ui.CaptionStyleCompat.createFromCaptionStyle(captioningManager.getUserStyle());
            kotlin.jvm.internal.m.d(captionStyleCompatCreateFromCaptionStyle, "createFromCaptionStyle(...)");
            p108m5.l lVar = p108m5.l.f25418k;
            int iS = O7.r.s((int) (captioningManager.getFontScale() * 18.0f), 10, 48);
            long jC2 = p188x0.z.c(captionStyleCompatCreateFromCaptionStyle.foregroundColor);
            long jC3 = p188x0.z.c(captionStyleCompatCreateFromCaptionStyle.backgroundColor);
            long jC4 = p188x0.z.c(captionStyleCompatCreateFromCaptionStyle.windowColor);
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
            return p108m5.l.a(lVar, iS, jC2, jC3, jC4, false, null, str, captionStyleCompatCreateFromCaptionStyle, 112);
        }
        if (!kotlin.jvm.internal.m.a(local.f19833m, "custom")) {
            return p108m5.l.f25418k;
        }
        java.lang.String str2 = settings.f20586k;
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
        java.lang.String str3 = settings.f20587l;
        long j = p188x0.C3098s.f31124c;
        try {
            objT = new p188x0.C3098s(p188x0.z.c(android.graphics.Color.parseColor(str3)));
        } catch (java.lang.Throwable th) {
            objT = com.google.common.util.concurrent.P.T(th);
        }
        java.lang.Object c3098s = new p188x0.C3098s(j);
        if (objT instanceof p070h6.m) {
            objT = c3098s;
        }
        p188x0.C3098s c3098s2 = (p188x0.C3098s) objT;
        java.lang.String str4 = settings.f20588m;
        if (kotlin.jvm.internal.m.a(str4, "none")) {
            jC = p188x0.C3098s.f31127f;
        } else {
            jC = kotlin.jvm.internal.m.a(str4, "opaque") ? p188x0.C3098s.c(p188x0.C3098s.f31123b, 0.85f) : p188x0.C3098s.c(p188x0.C3098s.f31123b, 0.5f);
        }
        return p108m5.l.a(new p108m5.l(c3098s2.f31129a, i10, jC, !kotlin.jvm.internal.m.a(settings.f20589n, io.sentry.rrweb.RRWebVideoEvent.JsonKeys.TOP)), 0, 0L, 0L, 0L, local.f19835o, local.f19834n, local.f19836p, null, 799);
    }
}
