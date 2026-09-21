package p076i4;

import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.util.Objects;

public final class S0 extends AbstractC2186b0 {

    public static final S0 f22832l = new S0(new Object[0], 0);
    public final transient Object[] j;

    public final transient int f22833k;

    public S0(Object[] objArr, int i3) {
        this.j = objArr;
        this.f22833k = i3;
    }

    @Override
    public final int e(Object[] objArr, int i3) {
        Object[] objArr2 = this.j;
        int i9 = this.f22833k;
        System.arraycopy(objArr2, 0, objArr, i3, i9);
        return i3 + i9;
    }

    @Override
    public final Object[] f() {
        return this.j;
    }

    @Override
    public final Object get(int i3) {
        AbstractC1864o0.R(i3, this.f22833k);
        Object obj = this.j[i3];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int n() {
        return this.f22833k;
    }

    @Override
    public final int o() {
        return 0;
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final int size() {
        return this.f22833k;
    }
}
