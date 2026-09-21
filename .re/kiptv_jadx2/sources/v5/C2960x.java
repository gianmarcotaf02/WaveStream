package v5;

import com.kiptv.core.model.CustomFeedDefinition;
import java.util.List;
import kotlin.jvm.functions.Function0;
import p186w5.EnumC2976d;

public final class C2960x implements Function0 {

    public final int f29630h;

    public final p020c0.X f29631i;

    public C2960x(int i3, p020c0.X x9) {
        this.f29630h = i3;
        this.f29631i = x9;
    }

    @Override
    public final Object invoke() {
        p070h6.A a2 = p070h6.A.f22523a;
        p020c0.X x9 = this.f29631i;
        switch (this.f29630h) {
            case 0:
                x9.setValue(null);
                break;
            case 1:
                x9.setValue(null);
                break;
            case 2:
                x9.setValue(null);
                break;
            case 3:
                x9.setValue(Boolean.FALSE);
                break;
            case 4:
                x9.setValue(Boolean.FALSE);
                break;
            case 5:
                x9.setValue(Boolean.FALSE);
                break;
            case 6:
                x9.setValue(null);
                break;
            case 7:
                com.google.common.util.concurrent.U.T(-1, x9);
                break;
            case 8:
                x9.setValue(Boolean.TRUE);
                break;
            case 9:
                com.google.common.util.concurrent.U.T(-1, x9);
                break;
            case 10:
                x9.setValue(Boolean.TRUE);
                break;
            case 11:
                com.google.common.util.concurrent.U.T(-1, x9);
                break;
            case 12:
                x9.setValue(Boolean.TRUE);
                break;
            case 13:
                com.google.common.util.concurrent.U.T(-1, x9);
                break;
            case 14:
                com.google.common.util.concurrent.U.T(-1, x9);
                break;
            case 15:
                x9.setValue(null);
                break;
            case 16:
                x9.setValue(null);
                break;
            case 17:
                x9.setValue(null);
                break;
            case 18:
                x9.setValue(null);
                break;
            case 19:
                x9.setValue(null);
                break;
            case 20:
                x9.setValue(null);
                break;
            case 21:
                List list = p186w5.G.f30071a;
                x9.setValue(CustomFeedDefinition.a((CustomFeedDefinition) x9.getValue(), null, ((CustomFeedDefinition) x9.getValue()).b() ? "tv" : "movie", null, null, null, null, null, null, 0, 2045));
                break;
            case 22:
                EnumC2976d enumC2976d = EnumC2976d.f30206h;
                List list2 = p186w5.G.f30071a;
                x9.setValue(enumC2976d);
                break;
            case 23:
                EnumC2976d enumC2976d2 = EnumC2976d.f30207i;
                List list3 = p186w5.G.f30071a;
                x9.setValue(enumC2976d2);
                break;
            case 24:
                EnumC2976d enumC2976d3 = EnumC2976d.j;
                List list4 = p186w5.G.f30071a;
                x9.setValue(enumC2976d3);
                break;
            case 25:
                EnumC2976d enumC2976d4 = EnumC2976d.f30208k;
                List list5 = p186w5.G.f30071a;
                x9.setValue(enumC2976d4);
                break;
            case 26:
                EnumC2976d enumC2976d5 = EnumC2976d.f30209l;
                List list6 = p186w5.G.f30071a;
                x9.setValue(enumC2976d5);
                break;
            case 27:
                EnumC2976d enumC2976d6 = EnumC2976d.f30210m;
                List list7 = p186w5.G.f30071a;
                x9.setValue(enumC2976d6);
                break;
            case 28:
                x9.setValue(null);
                break;
            default:
                x9.setValue(null);
                break;
        }
        return a2;
    }
}
