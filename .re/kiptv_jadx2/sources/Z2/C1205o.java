package Z2;

import Z.AbstractC1149h0;
import java.util.ArrayList;

public final class C1205o {

    public final int f12904a;

    public final String f12905b;

    public ArrayList f12906c = null;

    public ArrayList f12907d = null;

    public C1205o(int i3, String str) {
        this.f12904a = 0;
        this.f12905b = null;
        this.f12904a = i3 == 0 ? 1 : i3;
        this.f12905b = str;
    }

    public final void a(int i3, String str, String str2) {
        if (this.f12906c == null) {
            this.f12906c = new ArrayList();
        }
        this.f12906c.add(new C1180b(str, i3, str2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i3 = this.f12904a;
        if (i3 == 2) {
            sb.append("> ");
        } else if (i3 == 3) {
            sb.append("+ ");
        }
        String str = this.f12905b;
        if (str == null) {
            str = "*";
        }
        sb.append(str);
        ArrayList<C1180b> arrayList = this.f12906c;
        if (arrayList != null) {
            for (C1180b c1180b : arrayList) {
                sb.append('[');
                sb.append(c1180b.f12856a);
                int iC = AbstractC1149h0.c(c1180b.f12857b);
                String str2 = c1180b.f12858c;
                if (iC == 1) {
                    sb.append('=');
                    sb.append(str2);
                } else if (iC == 2) {
                    sb.append("~=");
                    sb.append(str2);
                } else if (iC == 3) {
                    sb.append("|=");
                    sb.append(str2);
                }
                sb.append(']');
            }
        }
        ArrayList<InterfaceC1186e> arrayList2 = this.f12907d;
        if (arrayList2 != null) {
            for (InterfaceC1186e interfaceC1186e : arrayList2) {
                sb.append(':');
                sb.append(interfaceC1186e);
            }
        }
        return sb.toString();
    }
}
