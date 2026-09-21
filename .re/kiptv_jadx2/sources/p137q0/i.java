package p137q0;

import kotlin.jvm.internal.o;
import p194x6.m;

public final class i extends o implements m {

    public static final i f26469h = new i(2);

    @Override
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        n nVar = (n) obj2;
        if (str.length() == 0) {
            return nVar.toString();
        }
        return str + ", " + nVar;
    }
}
