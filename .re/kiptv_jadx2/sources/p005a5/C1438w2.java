package p005a5;

import O7.x;
import Y6.f;
import kotlin.jvm.internal.m;
import p070h6.k;
import p194x6.j;

public final class C1438w2 implements j {

    public final int f15232h;

    public final k f15233i;

    public C1438w2(k kVar, int i3) {
        this.f15232h = i3;
        this.f15233i = kVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f15232h) {
            case 0:
                String filter = (String) obj;
                m.e(filter, "filter");
                boolean z6 = false;
                if (x.x0(filter, "(", false) && x.q0(filter, ")", false)) {
                    z6 = true;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((String) this.f15233i.f22539h);
                return f.m(sb, z6 ? "" : ".", filter);
            case 1:
                String filter2 = (String) obj;
                m.e(filter2, "filter");
                boolean z9 = false;
                if (x.x0(filter2, "(", false) && x.q0(filter2, ")", false)) {
                    z9 = true;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append((String) this.f15233i.f22539h);
                return f.m(sb2, z9 ? "" : ".", filter2);
            default:
                String filter3 = (String) obj;
                m.e(filter3, "filter");
                boolean z10 = false;
                if (x.x0(filter3, "(", false) && x.q0(filter3, ")", false)) {
                    z10 = true;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append((String) this.f15233i.f22539h);
                return f.m(sb3, z10 ? "" : ".", filter3);
        }
    }
}
