package X0;

import kotlin.jvm.internal.o;
import p070h6.A;
import p113n1.l;

public final class d extends o implements p194x6.j {

    public static final d f10796i = new d(1, 0);
    public static final d j = new d(1, 1);

    public static final d f10797k = new d(1, 2);

    public final int f10798h;

    public d(int i3, int i9) {
        super(i3);
        this.f10798h = i9;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f10798h) {
            case 0:
                ((Number) obj).longValue();
                return A.f22523a;
            case 1:
                return Integer.valueOf(((j) obj).f10814b);
            default:
                l lVar = ((j) obj).f10815c;
                return Integer.valueOf(lVar.f25564d - lVar.f25562b);
        }
    }
}
