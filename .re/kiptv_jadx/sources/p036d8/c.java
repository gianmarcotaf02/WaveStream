package p036d8;

/* JADX INFO: loaded from: classes4.dex */
public final class c {
    public static p036d8.d a(long j, long j9) throws java.lang.Exception {
        try {
            j$.time.Instant instantOfEpochSecond = j$.time.Instant.ofEpochSecond(j, j9);
            kotlin.jvm.internal.m.d(instantOfEpochSecond, "ofEpochSecond(...)");
            return new p036d8.d(instantOfEpochSecond);
        } catch (java.lang.Exception e6) {
            if ((e6 instanceof java.lang.ArithmeticException) || (e6 instanceof j$.time.DateTimeException)) {
                return j > 0 ? p036d8.d.j : p036d8.d.f21302i;
            }
            throw e6;
        }
    }

    public final kotlinx.serialization.KSerializer serializer() {
        return p087j8.a.f24333a;
    }
}
