package p126o6;

import com.google.android.gms.internal.play_billing.M0;
import java.io.Serializable;
import kotlin.jvm.internal.m;
import p078i6.AbstractC2254e;

public final class b extends AbstractC2254e implements a, Serializable {

    public final Enum[] f26144h;

    public b(Enum[] entries) {
        m.e(entries, "entries");
        this.f26144h = entries;
    }

    @Override
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        m.e(element, "element");
        return ((Enum) p078i6.m.r0(this.f26144h, element.ordinal())) == element;
    }

    @Override
    public final int d() {
        return this.f26144h.length;
    }

    @Override
    public final Object get(int i3) {
        Enum[] enumArr = this.f26144h;
        int length = enumArr.length;
        if (i3 < 0 || i3 >= length) {
            throw new IndexOutOfBoundsException(M0.k(i3, length, "index: ", ", size: "));
        }
        return enumArr[i3];
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        m.e(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) p078i6.m.r0(this.f26144h, iOrdinal)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        m.e(element, "element");
        return indexOf(element);
    }
}
