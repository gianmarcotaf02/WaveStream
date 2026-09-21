package K6;

import com.google.common.util.concurrent.D;
import com.google.crypto.tink.shaded.protobuf.q0;
import java.util.Set;

public final class k {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");


    public static final Set f6878l;

    public final p101l7.e f6888h;

    public final p101l7.e f6889i;
    public final Object j;

    public final Object f6890k;

    static {
        k kVar = CHAR;
        k kVar2 = BYTE;
        k kVar3 = SHORT;
        k kVar4 = INT;
        k kVar5 = FLOAT;
        k kVar6 = LONG;
        k kVar7 = DOUBLE;
        q0.t(kVarArr);
        f6878l = p078i6.m.F0(new k[]{kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7});
    }

    public k(String str) {
        super(str, i);
        this.f6888h = p101l7.e.e(str);
        this.f6889i = p101l7.e.e(str.concat("Array"));
        p070h6.i iVar = p070h6.i.f22537i;
        this.j = D.A(iVar, new j(this, 0));
        this.f6890k = D.A(iVar, new j(this, 1));
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f6887u.clone();
    }
}
