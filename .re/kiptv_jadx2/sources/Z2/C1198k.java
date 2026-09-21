package Z2;

import java.util.Iterator;

public final class C1198k implements InterfaceC1186e {

    public final boolean f12891a;

    public final String f12892b;

    public C1198k(boolean z6, String str) {
        this.f12891a = z6;
        this.f12892b = str;
    }

    @Override
    public final boolean a(AbstractC1181b0 abstractC1181b0) {
        int i3;
        boolean z6 = this.f12891a;
        String strO = this.f12892b;
        if (z6 && strO == null) {
            strO = abstractC1181b0.o();
        }
        Z z9 = abstractC1181b0.f12870b;
        if (z9 != null) {
            Iterator it = z9.b().iterator();
            i3 = 0;
            while (it.hasNext()) {
                AbstractC1181b0 abstractC1181b1 = (AbstractC1181b0) ((AbstractC1185d0) it.next());
                if (strO == null || abstractC1181b1.o().equals(strO)) {
                    i3++;
                }
            }
        } else {
            i3 = 1;
        }
        return i3 == 1;
    }

    public final String toString() {
        return this.f12891a ? Y6.f.m(new StringBuilder("only-of-type <"), this.f12892b, ">") : "only-child";
    }
}
