package Y2;

import com.google.android.gms.internal.play_billing.AbstractC1872t;
import com.google.android.gms.internal.play_billing.EnumC1843h;

public final class C1040j {

    public int f11477a;

    public int f11478b;

    public String f11479c;

    public static D8.x a() {
        D8.x xVar = new D8.x(3);
        xVar.j = 0;
        xVar.f2610k = "";
        return xVar;
    }

    public final String toString() {
        int i3 = this.f11477a;
        int i9 = AbstractC1872t.f19388a;
        com.google.android.gms.internal.play_billing.A a2 = EnumC1843h.j;
        Integer numValueOf = Integer.valueOf(i3);
        return B2.a.m("Response Code: ", (!a2.containsKey(numValueOf) ? EnumC1843h.RESPONSE_CODE_UNSPECIFIED : (EnumC1843h) a2.get(numValueOf)).toString(), ", Debug Message: ", this.f11479c);
    }
}
