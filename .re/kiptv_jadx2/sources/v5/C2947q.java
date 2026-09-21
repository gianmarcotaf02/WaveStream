package v5;

import com.kiptv.core.model.XtreamLiveStream;
import kotlin.jvm.functions.Function0;

public final class C2947q implements Function0 {

    public final int f29572h;

    public final XtreamLiveStream f29573i;
    public final p020c0.X j;

    public C2947q(XtreamLiveStream xtreamLiveStream, p020c0.X x9, int i3) {
        this.f29572h = i3;
        this.f29573i = xtreamLiveStream;
        this.j = x9;
    }

    @Override
    public final Object invoke() {
        switch (this.f29572h) {
            case 0:
                this.j.setValue(this.f29573i);
                break;
            default:
                this.j.setValue(this.f29573i);
                break;
        }
        return p070h6.A.f22523a;
    }
}
