package D1;

import android.os.Build;
import android.view.animation.Interpolator;

public final class m0 {

    public l0 f2041a;

    public m0(int i3, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2041a = new k0(A0.l.i(i3, interpolator, j));
        } else {
            this.f2041a = new i0(i3, interpolator, j);
        }
    }
}
