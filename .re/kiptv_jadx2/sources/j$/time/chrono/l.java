package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

public interface l extends Comparable {
    List C();

    boolean D(long j);

    ChronoLocalDate G(int i3, int i9, int i10);

    ChronoLocalDate N();

    m R(int i3);

    ChronoLocalDate T(Map map, j$.time.format.D d4);

    String V();

    j$.time.temporal.u X(j$.time.temporal.a aVar);

    boolean equals(Object obj);

    int hashCode();

    ChronoLocalDate q(long j);

    String s();

    ChronoLocalDate t(TemporalAccessor temporalAccessor);

    String toString();

    int v(m mVar, int i3);

    InterfaceC2502i x(Instant instant, ZoneId zoneId);

    ChronoLocalDate z(int i3, int i9);

    static l F(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        l lVar = (l) temporalAccessor.b(j$.time.temporal.r.f23803b);
        s sVar = s.f23629c;
        if (lVar != null) {
            return lVar;
        }
        Objects.requireNonNull(sVar, "defaultObj");
        return sVar;
    }

    static l O(String str) {
        ConcurrentHashMap concurrentHashMap = AbstractC2494a.f23598a;
        Objects.requireNonNull(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap2 = AbstractC2494a.f23598a;
            l lVar = (l) concurrentHashMap2.get(str);
            if (lVar == null) {
                lVar = (l) AbstractC2494a.f23599b.get(str);
            }
            if (lVar != null) {
                return lVar;
            }
            if (concurrentHashMap2.get("ISO") != null) {
                for (l lVar2 : ServiceLoader.load(l.class)) {
                    if (str.equals(lVar2.s()) || str.equals(lVar2.V())) {
                        return lVar2;
                    }
                }
                throw new DateTimeException("Unknown chronology: ".concat(str));
            }
            o oVar = o.f23615l;
            AbstractC2494a.r(oVar, oVar.s());
            v vVar = v.f23632c;
            AbstractC2494a.r(vVar, vVar.s());
            A a2 = A.f23587c;
            AbstractC2494a.r(a2, a2.s());
            G g = G.f23594c;
            AbstractC2494a.r(g, g.s());
            try {
                for (AbstractC2494a abstractC2494a : Arrays.asList(new AbstractC2494a[0])) {
                    if (!abstractC2494a.s().equals("ISO")) {
                        AbstractC2494a.r(abstractC2494a, abstractC2494a.s());
                    }
                }
                s sVar = s.f23629c;
                AbstractC2494a.r(sVar, sVar.s());
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    default InterfaceC2497d w(j$.time.i iVar) {
        try {
            return t(iVar).M(LocalTime.B(iVar));
        } catch (DateTimeException e6) {
            throw new DateTimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + j$.time.i.class, e6);
        }
    }
}
