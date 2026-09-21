package p036d8;

import j$.time.DateTimeException;
import j$.time.Instant;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import p087j8.a;

public final class c {
    public static d a(long j, long j9) throws Exception {
        try {
            Instant instantOfEpochSecond = Instant.ofEpochSecond(j, j9);
            m.d(instantOfEpochSecond, "ofEpochSecond(...)");
            return new d(instantOfEpochSecond);
        } catch (Exception e6) {
            if ((e6 instanceof ArithmeticException) || (e6 instanceof DateTimeException)) {
                return j > 0 ? d.j : d.f21302i;
            }
            throw e6;
        }
    }

    public final KSerializer serializer() {
        return a.f24333a;
    }
}
