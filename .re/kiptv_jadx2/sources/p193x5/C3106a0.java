package p193x5;

import com.kiptv.core.model.XtreamCategory;
import kotlin.jvm.functions.Function0;
import p070h6.A;
import p194x6.j;

public final class C3106a0 implements Function0 {

    public final int f31420h;

    public final j f31421i;
    public final XtreamCategory j;

    public C3106a0(j jVar, XtreamCategory xtreamCategory, int i3) {
        this.f31420h = i3;
        this.f31421i = jVar;
        this.j = xtreamCategory;
    }

    @Override
    public final Object invoke() {
        switch (this.f31420h) {
            case 0:
                this.f31421i.invoke(this.j);
                break;
            default:
                this.f31421i.invoke(new C3129m(this.j.f20649a));
                break;
        }
        return A.f22523a;
    }
}
