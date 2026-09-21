package D5;

import p175v0.C2906a;

public final class U implements p194x6.j {

    public final int f2232h;

    public final p175v0.y f2233i;

    public U(p175v0.y yVar, int i3) {
        this.f2232h = i3;
        this.f2233i = yVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f2232h) {
            case 0:
                p175v0.r focusProperties = (p175v0.r) obj;
                kotlin.jvm.internal.m.e(focusProperties, "$this$focusProperties");
                focusProperties.a(new U(this.f2233i, 1));
                break;
            case 1:
                C2906a c2906a = (C2906a) obj;
                kotlin.jvm.internal.m.e(c2906a, "<this>");
                int i3 = c2906a.f29060a;
                if (i3 == 5) {
                    p175v0.y yVar = this.f2233i;
                    if (yVar != null) {
                        p175v0.y.a(yVar);
                    }
                } else if (i3 == 3 || i3 == 4) {
                    c2906a.f29061b = true;
                }
                break;
            default:
                p175v0.r focusProperties2 = (p175v0.r) obj;
                kotlin.jvm.internal.m.e(focusProperties2, "$this$focusProperties");
                focusProperties2.d(this.f2233i);
                break;
        }
        return p070h6.A.f22523a;
    }
}
