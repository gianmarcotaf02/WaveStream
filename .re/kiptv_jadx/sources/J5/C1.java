package J5;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1 extends kotlin.jvm.internal.j implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6063h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f6064i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1(S.s sVar) {
        super(1, kotlin.jvm.internal.l.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f6063h = 2;
        this.f6064i = sVar;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f6063h) {
            case 0:
                java.lang.String p2 = (java.lang.String) obj;
                kotlin.jvm.internal.m.e(p2, "p0");
                java.util.Map map = (java.util.Map) this.f6064i;
                java.lang.Object yVar = map.get(p2);
                if (yVar == null) {
                    yVar = new p175v0.y();
                    map.put(p2, yVar);
                }
                return (p175v0.y) yVar;
            case 1:
                java.lang.String p9 = (java.lang.String) obj;
                kotlin.jvm.internal.m.e(p9, "p0");
                java.util.Map map2 = (java.util.Map) this.f6064i;
                java.lang.Object yVar2 = map2.get(p9);
                if (yVar2 == null) {
                    yVar2 = new p175v0.y();
                    map2.put(p9, yVar2);
                }
                return (p175v0.y) yVar2;
            default:
                float[] fArr = ((p188x0.E) obj).f31047a;
                O0.InterfaceC0732v interfaceC0732v = (O0.InterfaceC0732v) ((S.s) this.f6064i).y.getValue();
                if (interfaceC0732v != null) {
                    if (!interfaceC0732v.i()) {
                        interfaceC0732v = null;
                    }
                    if (interfaceC0732v != null) {
                        interfaceC0732v.j(fArr);
                    }
                }
                return p070h6.A.f22523a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1(java.util.Map map, int i3) {
        super(1, kotlin.jvm.internal.l.class, "requesterFor", "TvPlaybackSettingsScreen$requesterFor(Ljava/util/Map;Ljava/lang/String;)Landroidx/compose/ui/focus/FocusRequester;", 0);
        this.f6063h = i3;
        switch (i3) {
            case 1:
                this.f6064i = map;
                super(1, kotlin.jvm.internal.l.class, "requesterFor", "TvSettingsScreen$requesterFor(Ljava/util/Map;Ljava/lang/String;)Landroidx/compose/ui/focus/FocusRequester;", 0);
                break;
            default:
                this.f6064i = map;
                break;
        }
    }
}
