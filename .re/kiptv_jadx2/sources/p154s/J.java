package p154s;

import kotlin.jvm.internal.o;
import p113n1.k;
import p113n1.m;
import p194x6.j;

public final class J extends o implements j {

    public final int f27067h;

    public final j f27068i;

    public J(int i3, j jVar) {
        super(1);
        this.f27067h = i3;
        this.f27068i = jVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f27067h) {
            case 0:
                return new k((((long) ((Number) this.f27068i.invoke(Integer.valueOf((int) (((m) obj).f25565a >> 32)))).intValue()) << 32) | (((long) 0) & 4294967295L));
            case 1:
                return new k((((long) 0) << 32) | (4294967295L & ((long) ((Number) this.f27068i.invoke(Integer.valueOf((int) (((m) obj).f25565a & 4294967295L)))).intValue())));
            case 2:
                return new k((((long) ((Number) this.f27068i.invoke(Integer.valueOf((int) (((m) obj).f25565a >> 32)))).intValue()) << 32) | (((long) 0) & 4294967295L));
            default:
                return new k((((long) 0) << 32) | (4294967295L & ((long) ((Number) this.f27068i.invoke(Integer.valueOf((int) (((m) obj).f25565a & 4294967295L)))).intValue())));
        }
    }
}
