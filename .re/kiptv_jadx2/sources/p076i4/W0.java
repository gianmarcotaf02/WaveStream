package p076i4;

import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.util.Objects;

public final class W0 extends AbstractC2186b0 {
    public final transient Object[] j;

    public final transient int f22844k;

    public final transient int f22845l;

    public W0(Object[] objArr, int i3, int i9) {
        this.j = objArr;
        this.f22844k = i3;
        this.f22845l = i9;
    }

    @Override
    public final Object get(int i3) {
        AbstractC1864o0.R(i3, this.f22845l);
        Object obj = this.j[(i3 * 2) + this.f22844k];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final boolean p() {
        return true;
    }

    @Override
    public final int size() {
        return this.f22845l;
    }
}
