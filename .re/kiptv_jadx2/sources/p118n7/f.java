package p118n7;

import C7.AbstractC0191x;
import C7.P;
import C7.b0;
import java.io.IOException;
import kotlin.jvm.internal.m;
import p194x6.j;

public final class f implements j {

    public final int f25858h;

    public final g f25859i;

    public f(g gVar, int i3) {
        this.f25858h = i3;
        this.f25859i = gVar;
    }

    @Override
    public final Object invoke(Object obj) throws IOException {
        switch (this.f25858h) {
            case 0:
                P it = (P) obj;
                m.e(it, "it");
                if (it.c()) {
                    return "*";
                }
                AbstractC0191x abstractC0191xB = it.b();
                m.d(abstractC0191xB, "getType(...)");
                String strW = this.f25859i.W(abstractC0191xB);
                if (it.a() == b0.j) {
                    return strW;
                }
                return it.a() + ' ' + strW;
            default:
                AbstractC0191x abstractC0191x = (AbstractC0191x) obj;
                m.b(abstractC0191x);
                return this.f25859i.W(abstractC0191x);
        }
    }
}
