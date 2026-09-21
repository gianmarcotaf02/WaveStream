package Z2;

/* JADX INFO: renamed from: Z2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1205o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f12905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.util.ArrayList f12906c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f12907d = null;

    public C1205o(int i3, java.lang.String str) {
        this.f12904a = 0;
        this.f12905b = null;
        this.f12904a = i3 == 0 ? 1 : i3;
        this.f12905b = str;
    }

    public final void a(int i3, java.lang.String str, java.lang.String str2) {
        if (this.f12906c == null) {
            this.f12906c = new java.util.ArrayList();
        }
        this.f12906c.add(new Z2.C1180b(str, i3, str2));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i3 = this.f12904a;
        if (i3 == 2) {
            sb.append("> ");
        } else if (i3 == 3) {
            sb.append("+ ");
        }
        java.lang.String str = this.f12905b;
        if (str == null) {
            str = "*";
        }
        sb.append(str);
        java.util.ArrayList<Z2.C1180b> arrayList = this.f12906c;
        if (arrayList != null) {
            for (Z2.C1180b c1180b : arrayList) {
                sb.append('[');
                sb.append(c1180b.f12856a);
                int iC = Z.AbstractC1149h0.c(c1180b.f12857b);
                java.lang.String str2 = c1180b.f12858c;
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
        java.util.ArrayList<Z2.InterfaceC1186e> arrayList2 = this.f12907d;
        if (arrayList2 != null) {
            for (Z2.InterfaceC1186e interfaceC1186e : arrayList2) {
                sb.append(':');
                sb.append(interfaceC1186e);
            }
        }
        return sb.toString();
    }
}
