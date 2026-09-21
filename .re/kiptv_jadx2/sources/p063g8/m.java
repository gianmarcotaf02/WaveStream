package p063g8;

import Y6.f;
import com.google.common.util.concurrent.P;
import h8.a;
import java.util.List;
import p020c0.C1704s0;
import p078i6.w;
import p080i8.p;
import p080i8.v;

public abstract class m implements j {

    public final u f22383a;

    public final List f22384b;

    public final String f22385c;

    public m(u field, List list, String str) {
        kotlin.jvm.internal.m.e(field, "field");
        this.f22383a = field;
        this.f22384b = list;
        this.f22385c = str;
        int size = list.size();
        int i3 = (field.f22397c - field.f22396b) + 1;
        if (size == i3) {
            return;
        }
        StringBuilder sb = new StringBuilder("The number of values (");
        sb.append(list.size());
        sb.append(") in ");
        sb.append(list);
        sb.append(" does not match the range of the field (");
        throw new IllegalArgumentException(f.j(sb, i3, ')').toString());
    }

    @Override
    public final a a() {
        return new a();
    }

    @Override
    public final p b() {
        C1704s0 c1704s0 = new C1704s0(6, this);
        StringBuilder sb = new StringBuilder("one of ");
        List list = this.f22384b;
        sb.append(list);
        sb.append(" for ");
        sb.append(this.f22385c);
        return new p(P.i0(new v(list, c1704s0, sb.toString())), w.f23205h);
    }

    @Override
    public final a c() {
        return this.f22383a;
    }
}
