package j$.time.format;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class C2504a extends A {

    public final z f23688d;

    public C2504a(z zVar) {
        this.f23688d = zVar;
    }

    @Override
    public final String b(j$.time.chrono.l lVar, j$.time.temporal.q qVar, long j, F f9, Locale locale) {
        return this.f23688d.a(j, f9);
    }

    @Override
    public final String c(j$.time.temporal.q qVar, long j, F f9, Locale locale) {
        return this.f23688d.a(j, f9);
    }

    @Override
    public final Iterator d(j$.time.chrono.l lVar, j$.time.temporal.q qVar, F f9, Locale locale) {
        List list = (List) this.f23688d.f23750b.get(f9);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }

    @Override
    public final Iterator e(j$.time.temporal.q qVar, F f9, Locale locale) {
        List list = (List) this.f23688d.f23750b.get(f9);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
