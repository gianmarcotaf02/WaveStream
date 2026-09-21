package p063g8;

import Y6.f;
import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import h8.a;
import kotlin.jvm.internal.m;
import p080i8.p;

public abstract class v implements j {

    public final u f22401a;

    public final int f22402b;

    public final Integer f22403c;

    public final int f22404d;

    public v(u field, int i3, Integer num) {
        m.e(field, "field");
        this.f22401a = field;
        this.f22402b = i3;
        this.f22403c = num;
        int i9 = field.g;
        this.f22404d = i9;
        if (i3 < 0) {
            throw new IllegalArgumentException(f.f(i3, "The minimum number of digits (", ") is negative").toString());
        }
        if (i9 < i3) {
            throw new IllegalArgumentException(("The maximum number of digits (" + i9 + ") is less than the minimum number of digits (" + i3 + ')').toString());
        }
        if (num == null || num.intValue() > i3) {
            return;
        }
        throw new IllegalArgumentException(("The space padding (" + num + ") should be more than the minimum number of digits (" + i3 + ')').toString());
    }

    @Override
    public final a a() {
        r rVar = this.f22401a.f22395a;
        a aVar = new a();
        int i3 = this.f22402b;
        if (i3 < 0) {
            throw new IllegalArgumentException(f.f(i3, "The minimum number of digits (", ") is negative").toString());
        }
        if (i3 <= 9) {
            return this.f22403c != null ? new a() : aVar;
        }
        throw new IllegalArgumentException(f.f(i3, "The minimum number of digits (", ") exceeds the length of an Int").toString());
    }

    @Override
    public final p b() {
        Integer numValueOf = Integer.valueOf(this.f22402b);
        Integer numValueOf2 = Integer.valueOf(this.f22404d);
        u uVar = this.f22401a;
        return AbstractC1833d1.S(numValueOf, numValueOf2, this.f22403c, uVar.f22395a, uVar.f22398d, false);
    }

    @Override
    public final a c() {
        return this.f22401a;
    }
}
