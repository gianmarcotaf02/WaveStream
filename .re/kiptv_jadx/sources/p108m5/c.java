package p108m5;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f25400h;

    public /* synthetic */ c(int i3) {
        this.f25400h = i3;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f25400h) {
            case 0:
                android.content.Context context = (android.content.Context) obj;
                kotlin.jvm.internal.m.e(context, "context");
                return new org.videolan.libvlc.util.VLCVideoLayout(context);
            case 1:
                android.content.Context context2 = (android.content.Context) obj;
                kotlin.jvm.internal.m.e(context2, "context");
                androidx.media3.ui.PlayerView playerView = new androidx.media3.ui.PlayerView(context2);
                playerView.setUseController(false);
                playerView.setResizeMode(0);
                playerView.setShowBuffering(0);
                android.view.View videoSurfaceView = playerView.getVideoSurfaceView();
                android.view.SurfaceView surfaceView = videoSurfaceView instanceof android.view.SurfaceView ? (android.view.SurfaceView) videoSurfaceView : null;
                if (surfaceView != null) {
                    surfaceView.getHolder();
                }
                return playerView;
            case 2:
                androidx.media3.ui.PlayerView playerView2 = (androidx.media3.ui.PlayerView) obj;
                kotlin.jvm.internal.m.e(playerView2, "playerView");
                playerView2.setPlayer(null);
                return p070h6.A.f22523a;
            case 3:
                android.content.Context viewContext = (android.content.Context) obj;
                kotlin.jvm.internal.m.e(viewContext, "viewContext");
                androidx.media3.ui.PlayerView playerView3 = new androidx.media3.ui.PlayerView(viewContext);
                playerView3.setUseController(false);
                playerView3.setResizeMode(4);
                playerView3.setShowBuffering(0);
                return playerView3;
            case 4:
                return new p112n0.e((java.util.Map) obj);
            case 5:
                return obj;
            case 6:
                android.content.Context it = (android.content.Context) obj;
                kotlin.jvm.internal.m.e(it, "it");
                if (it instanceof android.content.ContextWrapper) {
                    return ((android.content.ContextWrapper) it).getBaseContext();
                }
                return null;
            case 7:
                android.content.Context it2 = (android.content.Context) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                if (it2 instanceof android.content.ContextWrapper) {
                    return ((android.content.ContextWrapper) it2).getBaseContext();
                }
                return null;
            case 8:
                kotlin.jvm.internal.m.e((p040e2.b) obj, "$this$initializer");
                return new p114n2.C2654m();
            case 9:
                p114n2.t it3 = (p114n2.t) obj;
                kotlin.jvm.internal.m.e(it3, "it");
                return it3.j;
            case 10:
                p114n2.t it4 = (p114n2.t) obj;
                kotlin.jvm.internal.m.e(it4, "it");
                if (!(it4 instanceof p114n2.v)) {
                    return null;
                }
                F3.C0371k c0371k = ((p114n2.v) it4).f25679m;
                return c0371k.b(c0371k.f3600a);
            case 11:
                p114n2.C navOptions = (p114n2.C) obj;
                kotlin.jvm.internal.m.e(navOptions, "$this$navOptions");
                navOptions.f25588b = true;
                return p070h6.A.f22523a;
            case 12:
                p114n2.C navigate = (p114n2.C) obj;
                int i3 = com.kiptv.tv.TvActivity.f21002Z;
                kotlin.jvm.internal.m.e(navigate, "$this$navigate");
                navigate.f25590d = 0;
                navigate.f25592f = false;
                p114n2.M m8 = new p114n2.M();
                int i9 = com.kiptv.tv.TvActivity.f21002Z;
                m8.f25611a = true;
                navigate.f25592f = m8.f25611a;
                navigate.g = m8.f25612b;
                navigate.f25588b = true;
                return p070h6.A.f22523a;
            case 13:
                E6.InterfaceC0331d it5 = (E6.InterfaceC0331d) obj;
                kotlin.jvm.internal.m.e(it5, "it");
                kotlinx.serialization.KSerializer kSerializerK = com.google.common.util.concurrent.D.K(it5);
                if (kSerializerK != null) {
                    return kSerializerK;
                }
                if (p153r8.AbstractC2686a0.i(it5)) {
                    return new p119n8.d(it5);
                }
                return null;
            case 14:
                E6.InterfaceC0331d it6 = (E6.InterfaceC0331d) obj;
                kotlin.jvm.internal.m.e(it6, "it");
                kotlinx.serialization.KSerializer kSerializerK2 = com.google.common.util.concurrent.D.K(it6);
                if (kSerializerK2 == null) {
                    kSerializerK2 = p153r8.AbstractC2686a0.i(it6) ? new p119n8.d(it6) : null;
                }
                if (kSerializerK2 != null) {
                    return com.google.android.gms.internal.play_billing.V0.s(kSerializerK2);
                }
                return null;
            case 15:
                synchronized (p121o0.k.f25993c) {
                    ?? r9 = p121o0.k.f25998i;
                    int size = r9.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((p194x6.j) r9.get(i10)).invoke(obj);
                    }
                }
                return p070h6.A.f22523a;
            case 16:
                p108m5.c cVar = p121o0.k.f25991a;
                return p070h6.A.f22523a;
            case 17:
                return new p123o2.a(androidx.lifecycle.X.b((p040e2.b) obj));
            case 18:
                return p154s.K.c(p163t.AbstractC2750d.p(org.videolan.libvlc.media.MediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING, 0, null, 6), 2);
            case 19:
                p114n2.t tVar = ((p114n2.C2650i) ((p154s.C2729o) obj).b()).f25625i;
                kotlin.jvm.internal.m.c(tVar, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                int i11 = p114n2.t.f25669l;
                for (p114n2.t tVar2 : com.google.android.gms.internal.play_billing.AbstractC1853k0.x((p123o2.h) tVar)) {
                    if (tVar2 instanceof p123o2.h) {
                        ((p123o2.h) tVar2).getClass();
                    } else if (tVar2 instanceof p123o2.f) {
                        ((p123o2.f) tVar2).getClass();
                    }
                }
                return null;
            case 20:
                return p154s.K.d(p163t.AbstractC2750d.p(org.videolan.libvlc.media.MediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING, 0, null, 6), 2);
            case 21:
                return ((p114n2.C2650i) obj).f25628m;
            case 22:
                kotlin.jvm.internal.m.e((p135p8.a) obj, "<this>");
                return p070h6.A.f22523a;
            case 23:
                p040e2.b initializer = (p040e2.b) obj;
                kotlin.jvm.internal.m.e(initializer, "$this$initializer");
                return new q2.b(androidx.lifecycle.X.b(initializer));
            case 24:
                p114n2.t destination = (p114n2.t) obj;
                kotlin.jvm.internal.m.e(destination, "destination");
                p114n2.v vVar = destination.j;
                if (vVar == null || vVar.f25679m.f3600a != destination.f25671i.f8482a) {
                    return null;
                }
                return vVar;
            case 25:
                p114n2.t destination2 = (p114n2.t) obj;
                kotlin.jvm.internal.m.e(destination2, "destination");
                p114n2.v vVar2 = destination2.j;
                if (vVar2 == null || vVar2.f25679m.f3600a != destination2.f25671i.f8482a) {
                    return null;
                }
                return vVar2;
            case 26:
                p114n2.C navOptions2 = (p114n2.C) obj;
                kotlin.jvm.internal.m.e(navOptions2, "$this$navOptions");
                navOptions2.f25589c = true;
                return p070h6.A.f22523a;
            case 27:
                p114n2.t it7 = (p114n2.t) obj;
                kotlin.jvm.internal.m.e(it7, "it");
                return java.lang.Integer.valueOf(it7.f25671i.f8482a);
            case 28:
                p114n2.C2649h navArgument = (p114n2.C2649h) obj;
                kotlin.jvm.internal.m.e(navArgument, "$this$navArgument");
                navArgument.f25622a.f24960c = p114n2.I.f25603h;
                navArgument.a(java.lang.Boolean.FALSE);
                return p070h6.A.f22523a;
            default:
                p154s.C2729o composable = (p154s.C2729o) obj;
                kotlin.jvm.internal.m.e(composable, "$this$composable");
                return p154s.K.c(p163t.AbstractC2750d.p(180, 0, null, 6), 2);
        }
    }
}
