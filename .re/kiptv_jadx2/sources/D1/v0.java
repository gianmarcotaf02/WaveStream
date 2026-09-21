package D1;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

public class v0 extends u0 {
    public v0(E0 e6, WindowInsets windowInsets) {
        super(e6, windowInsets);
    }

    @Override
    public E0 a() {
        return E0.c(null, this.f2061c.consumeDisplayCutout());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return Objects.equals(this.f2061c, v0Var.f2061c) && Objects.equals(this.g, v0Var.g) && t0.C(this.f2065h, v0Var.f2065h);
    }

    @Override
    public C0227l f() {
        DisplayCutout displayCutout = this.f2061c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0227l(displayCutout);
    }

    @Override
    public int hashCode() {
        return this.f2061c.hashCode();
    }

    public v0(E0 e6, v0 v0Var) {
        super(e6, v0Var);
    }
}
