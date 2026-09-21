package p076i4;

import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class EnumC2223u0 implements Iterator {

    public static final EnumC2223u0 f22942h;

    public static final EnumC2223u0[] f22943i;

    static {
        EnumC2223u0 enumC2223u0 = new EnumC2223u0("INSTANCE", 0);
        f22942h = enumC2223u0;
        f22943i = new EnumC2223u0[]{enumC2223u0};
    }

    public static EnumC2223u0 valueOf(String str) {
        return (EnumC2223u0) Enum.valueOf(EnumC2223u0.class, str);
    }

    public static EnumC2223u0[] values() {
        return (EnumC2223u0[]) f22943i.clone();
    }

    @Override
    public final boolean hasNext() {
        return false;
    }

    @Override
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        AbstractC1864o0.Z(false, "no calls to next() since the last call to remove()");
    }
}
