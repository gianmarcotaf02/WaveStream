package Z2;

import java.util.Iterator;

public final class C1188f implements InterfaceC1186e {

    public final int f12871a;

    public final int f12872b;

    public final boolean f12873c;

    public final boolean f12874d;

    public final String f12875e;

    public C1188f(int i3, int i9, boolean z6, boolean z9, String str) {
        this.f12871a = i3;
        this.f12872b = i9;
        this.f12873c = z6;
        this.f12874d = z9;
        this.f12875e = str;
    }

    @Override
    public final boolean a(AbstractC1181b0 abstractC1181b0) {
        int i3;
        int i9;
        boolean z6 = this.f12874d;
        String strO = this.f12875e;
        if (z6 && strO == null) {
            strO = abstractC1181b0.o();
        }
        Z z9 = abstractC1181b0.f12870b;
        if (z9 != null) {
            Iterator it = z9.b().iterator();
            i9 = 0;
            i3 = 0;
            while (it.hasNext()) {
                AbstractC1181b0 abstractC1181b1 = (AbstractC1181b0) ((AbstractC1185d0) it.next());
                if (abstractC1181b1 == abstractC1181b0) {
                    i9 = i3;
                }
                if (strO == null || abstractC1181b1.o().equals(strO)) {
                    i3++;
                }
            }
        } else {
            i3 = 1;
            i9 = 0;
        }
        int i10 = this.f12873c ? i9 + 1 : i3 - i9;
        int i11 = this.f12871a;
        int i12 = this.f12872b;
        if (i11 == 0) {
            if (i10 == i12) {
                return true;
            }
            return false;
        }
        int i13 = i10 - i12;
        if (i13 % i11 == 0 && (Integer.signum(i13) == 0 || Integer.signum(i13) == Integer.signum(i11))) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str = this.f12873c ? "" : "last-";
        boolean z6 = this.f12874d;
        int i3 = this.f12872b;
        int i9 = this.f12871a;
        return z6 ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(i9), Integer.valueOf(i3), this.f12875e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(i9), Integer.valueOf(i3));
    }
}
