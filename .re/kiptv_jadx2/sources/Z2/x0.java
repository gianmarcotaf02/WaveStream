package Z2;

import android.graphics.Canvas;
import android.graphics.Path;

public final class x0 extends y0 {

    public final Path f12967q;

    public final C0 f12968r;

    public x0(C0 c9, Path path, float f9) {
        super(c9, f9, 0.0f);
        this.f12968r = c9;
        this.f12967q = path;
    }

    @Override
    public final void A(String str) {
        C0 c9 = this.f12968r;
        if (c9.c0()) {
            A0 a2 = (A0) c9.f12657c;
            if (a2.f12641b) {
                ((Canvas) c9.f12655a).drawTextOnPath(str, this.f12967q, this.f12969n, this.f12970o, a2.f12643d);
            }
            A0 a9 = (A0) c9.f12657c;
            if (a9.f12642c) {
                ((Canvas) c9.f12655a).drawTextOnPath(str, this.f12967q, this.f12969n, this.f12970o, a9.f12644e);
            }
        }
        this.f12969n = ((A0) c9.f12657c).f12643d.measureText(str) + this.f12969n;
    }
}
