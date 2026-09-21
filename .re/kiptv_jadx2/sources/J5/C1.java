package J5;

import O0.InterfaceC0732v;
import java.util.Map;

public final class C1 extends kotlin.jvm.internal.j implements p194x6.j {

    public final int f6063h;

    public final Object f6064i;

    public C1(S.s sVar) {
        super(1, kotlin.jvm.internal.l.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f6063h = 2;
        this.f6064i = sVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f6063h) {
            case 0:
                String p2 = (String) obj;
                kotlin.jvm.internal.m.e(p2, "p0");
                Map map = (Map) this.f6064i;
                Object yVar = map.get(p2);
                if (yVar == null) {
                    yVar = new p175v0.y();
                    map.put(p2, yVar);
                }
                return (p175v0.y) yVar;
            case 1:
                String p9 = (String) obj;
                kotlin.jvm.internal.m.e(p9, "p0");
                Map map2 = (Map) this.f6064i;
                Object yVar2 = map2.get(p9);
                if (yVar2 == null) {
                    yVar2 = new p175v0.y();
                    map2.put(p9, yVar2);
                }
                return (p175v0.y) yVar2;
            default:
                float[] fArr = ((p188x0.E) obj).f31047a;
                InterfaceC0732v interfaceC0732v = (InterfaceC0732v) ((S.s) this.f6064i).y.getValue();
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

    public C1(Map map, int i3) {
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
