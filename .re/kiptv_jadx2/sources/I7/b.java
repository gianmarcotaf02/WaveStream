package I7;

import p078i6.AbstractC2251b;

public final class b extends AbstractC2251b {
    public int j = -1;

    public final c f5548k;

    public b(c cVar) {
        this.f5548k = cVar;
    }

    @Override
    public final void a() {
        int i3;
        Object[] objArr;
        do {
            i3 = this.j + 1;
            this.j = i3;
            objArr = this.f5548k.f5549h;
            if (i3 >= objArr.length) {
                break;
            }
        } while (objArr[i3] == null);
        if (i3 >= objArr.length) {
            this.f23191h = 2;
            return;
        }
        Object obj = objArr[i3];
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
        this.f23192i = obj;
        this.f23191h = 1;
    }
}
