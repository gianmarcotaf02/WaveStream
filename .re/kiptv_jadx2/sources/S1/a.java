package S1;

import java.util.Map;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p194x6.j;

public final class a extends o implements j {

    public static final a f9199h = new a(1);

    @Override
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        m.e(entry, "entry");
        Object value = entry.getValue();
        return B2.a.o(new StringBuilder("  "), ((e) entry.getKey()).f9205a, " = ", value instanceof byte[] ? p078i6.m.u0((byte[]) value, ", ", null, 56) : String.valueOf(entry.getValue()));
    }
}
