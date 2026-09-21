package I7;

import C7.C0176h;
import java.util.Arrays;
import java.util.Iterator;

public final class c extends a {

    public Object[] f5549h;

    public int f5550i;

    @Override
    public final int d() {
        return this.f5550i;
    }

    @Override
    public final void e(int i3, C0176h c0176h) {
        Object[] objArr = this.f5549h;
        if (objArr.length <= i3) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i3);
            Object[] objArrCopyOf = Arrays.copyOf(this.f5549h, length);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            this.f5549h = objArrCopyOf;
        }
        Object[] objArr2 = this.f5549h;
        if (objArr2[i3] == null) {
            this.f5550i++;
        }
        objArr2[i3] = c0176h;
    }

    @Override
    public final Object get(int i3) {
        return p078i6.m.r0(this.f5549h, i3);
    }

    @Override
    public final Iterator iterator() {
        return new b(this);
    }
}
