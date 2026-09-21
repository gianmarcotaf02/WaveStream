package p045e8;

import java.util.List;
import kotlin.jvm.internal.m;
import p063g8.i;
import p078i6.p;

public final class C extends i {

    public static final List f21483d = p.B0(0, 0, 0, 0, 0, 0, 0, 0, 0);

    public final int f21484b;

    public final int f21485c;

    static {
        p.B0(2, 1, 0, 2, 1, 0, 2, 1, 0);
    }

    public C() {
        List zerosToAdd = f21483d;
        m.e(zerosToAdd, "zerosToAdd");
        super(j0.f21549d, zerosToAdd);
        this.f21484b = 1;
        this.f21485c = 9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C)) {
            return false;
        }
        C c9 = (C) obj;
        return this.f21484b == c9.f21484b && this.f21485c == c9.f21485c;
    }

    public final int hashCode() {
        return (this.f21484b * 31) + this.f21485c;
    }
}
