package p007a7;

import B2.a;
import C7.AbstractC0191x;
import com.google.android.gms.internal.play_billing.M0;
import java.util.ArrayList;
import java.util.List;
import p121o0.p;

public final class y {

    public final AbstractC0191x f15512a;

    public final List f15513b;

    public final ArrayList f15514c;

    public final List f15515d;

    public y(AbstractC0191x abstractC0191x, List list, ArrayList arrayList, List list2) {
        this.f15512a = abstractC0191x;
        this.f15513b = list;
        this.f15514c = arrayList;
        this.f15515d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f15512a.equals(yVar.f15512a) && this.f15513b.equals(yVar.f15513b) && this.f15514c.equals(yVar.f15514c) && this.f15515d.equals(yVar.f15515d);
    }

    public final int hashCode() {
        return this.f15515d.hashCode() + p.f((this.f15514c.hashCode() + a.b(this.f15512a.hashCode() * 961, 31, this.f15513b)) * 31, 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MethodSignatureData(returnType=");
        sb.append(this.f15512a);
        sb.append(", receiverType=null, valueParameters=");
        sb.append(this.f15513b);
        sb.append(", typeParameters=");
        sb.append(this.f15514c);
        sb.append(", hasStableParameterNames=false, errors=");
        return M0.n(sb, this.f15515d, ')');
    }
}
