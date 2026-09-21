package N8;

import M8.E;
import java.io.IOException;
import kotlin.jvm.internal.A;
import p194x6.m;

public final class h implements m {

    public final int f7502h = 0;

    public final A f7503i;
    public final E j;

    public final A f7504k;

    public final A f7505l;

    public h(E e6, A a2, A a9, A a10) {
        this.j = e6;
        this.f7503i = a2;
        this.f7504k = a9;
        this.f7505l = a10;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i3 = this.f7502h;
        int iIntValue = ((Integer) obj).intValue();
        Long l2 = (Long) obj2;
        switch (i3) {
            case 0:
                long jLongValue = l2.longValue();
                if (iIntValue == 21589) {
                    if (jLongValue < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    E e6 = this.j;
                    byte b9 = e6.readByte();
                    boolean z6 = (b9 & 1) == 1;
                    boolean z9 = (b9 & 2) == 2;
                    boolean z10 = (b9 & 4) == 4;
                    long j = z6 ? 5L : 1L;
                    if (z9) {
                        j += 4;
                    }
                    if (z10) {
                        j += 4;
                    }
                    if (jLongValue < j) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z6) {
                        this.f7503i.f24539h = Integer.valueOf(e6.e());
                    }
                    if (z9) {
                        this.f7504k.f24539h = Integer.valueOf(e6.e());
                    }
                    if (z10) {
                        this.f7505l.f24539h = Integer.valueOf(e6.e());
                    }
                }
                return p070h6.A.f22523a;
            default:
                long jLongValue2 = l2.longValue();
                if (iIntValue == 1) {
                    A a2 = this.f7503i;
                    if (a2.f24539h != null) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (jLongValue2 != 24) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    E e9 = this.j;
                    a2.f24539h = Long.valueOf(e9.i());
                    this.f7504k.f24539h = Long.valueOf(e9.i());
                    this.f7505l.f24539h = Long.valueOf(e9.i());
                }
                return p070h6.A.f22523a;
        }
    }

    public h(A a2, E e6, A a9, A a10) {
        this.f7503i = a2;
        this.j = e6;
        this.f7504k = a9;
        this.f7505l = a10;
    }
}
