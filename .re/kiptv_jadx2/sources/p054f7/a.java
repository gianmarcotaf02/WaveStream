package p054f7;

import V1.b;
import com.google.crypto.tink.shaded.protobuf.q0;
import java.util.LinkedHashMap;
import p078i6.D;

public final class a {
    UNKNOWN(0),
    CLASS(1),
    FILE_FACADE(2),
    SYNTHETIC_CLASS(3),
    MULTIFILE_CLASS(4),
    MULTIFILE_CLASS_PART(5);


    public static final b f21723i;
    public static final LinkedHashMap j;

    public final int f21731h;

    static {
        q0.t(new a[]{r0, r1, r2, r3, r4, r5});
        f21723i = new b(18);
        a[] aVarArrValues = values();
        int iI0 = D.I0(aVarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iI0 < 16 ? 16 : iI0);
        for (a aVar : aVarArrValues) {
            linkedHashMap.put(Integer.valueOf(aVar.f21731h), aVar);
        }
        j = linkedHashMap;
    }

    public a(int i3) {
        super(str, i);
        this.f21731h = i3;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f21730q.clone();
    }
}
