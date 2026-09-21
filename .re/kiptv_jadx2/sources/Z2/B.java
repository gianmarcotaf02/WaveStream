package Z2;

import android.graphics.Matrix;
import java.util.HashSet;
import java.util.Set;

public abstract class B extends AbstractC1179a0 implements D, X {

    public HashSet f12647i = null;
    public String j = null;

    public HashSet f12648k = null;

    public HashSet f12649l = null;

    public HashSet f12650m = null;

    public Matrix f12651n;

    @Override
    public final Set c() {
        return this.f12648k;
    }

    @Override
    public final String d() {
        return this.j;
    }

    @Override
    public final void f(HashSet hashSet) {
        this.f12647i = hashSet;
    }

    @Override
    public final Set g() {
        return this.f12647i;
    }

    @Override
    public final void h(HashSet hashSet) {
        this.f12650m = hashSet;
    }

    @Override
    public final void i(String str) {
        this.j = str;
    }

    @Override
    public final void j(HashSet hashSet) {
        this.f12649l = hashSet;
    }

    @Override
    public final void k(HashSet hashSet) {
        this.f12648k = hashSet;
    }

    @Override
    public final void l(Matrix matrix) {
        this.f12651n = matrix;
    }

    @Override
    public final Set m() {
        return this.f12649l;
    }

    @Override
    public final Set n() {
        return this.f12650m;
    }
}
