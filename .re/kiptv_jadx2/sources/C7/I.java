package C7;

import java.util.Iterator;
import java.util.List;

public final class I extends I7.d {

    public static final S.p f1547i = new S.p(4);
    public static final I j = new I(p078i6.w.f23205h);

    public I(List list) {
        this.f5551h = I7.k.f5569h;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0176h c0176h = (C0176h) it.next();
            c0176h.getClass();
            String strG = kotlin.jvm.internal.B.f24540a.b(C0176h.class).g();
            kotlin.jvm.internal.m.b(strG);
            int iL = f1547i.l(strG);
            int iD = this.f5551h.d();
            if (iD != 0) {
                if (iD == 1) {
                    I7.a aVar = this.f5551h;
                    try {
                        kotlin.jvm.internal.m.c(aVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                        I7.q qVar = (I7.q) aVar;
                        int i3 = qVar.f5582i;
                        if (i3 == iL) {
                            this.f5551h = new I7.q(iL, c0176h);
                        } else {
                            I7.c cVar = new I7.c();
                            cVar.f5549h = new Object[20];
                            cVar.f5550i = 0;
                            this.f5551h = cVar;
                            cVar.e(i3, qVar.f5581h);
                        }
                    } catch (ClassCastException e6) {
                        throw new IllegalStateException(I7.d.d(aVar, 1, "OneElementArrayMap"), e6);
                    }
                }
                this.f5551h.e(iL, c0176h);
            } else {
                I7.a aVar2 = this.f5551h;
                if (!(aVar2 instanceof I7.k)) {
                    throw new IllegalStateException(I7.d.d(aVar2, 0, "EmptyArrayMap"));
                }
                this.f5551h = new I7.q(iL, c0176h);
            }
        }
    }
}
