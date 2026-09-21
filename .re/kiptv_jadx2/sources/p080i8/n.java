package p080i8;

import Y6.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p194x6.j;

public final class n extends o implements j {

    public static final n f23274h = new n(1);

    @Override
    public final Object invoke(Object obj) {
        i it = (i) obj;
        m.e(it, "it");
        StringBuilder sb = new StringBuilder("position ");
        sb.append(it.f23267a);
        sb.append(": '");
        return f.l(sb, (String) it.f23268b.invoke(), '\'');
    }
}
