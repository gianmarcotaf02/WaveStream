package p145r0;

import android.view.ViewStructure;
import p070h6.A;

public final class o extends kotlin.jvm.internal.o implements p194x6.o {

    public final ViewStructure f26696h;

    public o(ViewStructure viewStructure) {
        super(4);
        this.f26696h = viewStructure;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue() - iIntValue2;
        this.f26696h.setDimens(iIntValue, iIntValue2, 0, 0, iIntValue3 - iIntValue, iIntValue4);
        return A.f22523a;
    }
}
