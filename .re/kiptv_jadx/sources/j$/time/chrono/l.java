package j$.time.chrono;

/* JADX INFO: loaded from: classes3.dex */
public interface l extends java.lang.Comparable {
    java.util.List C();

    boolean D(long j);

    j$.time.chrono.ChronoLocalDate G(int i3, int i9, int i10);

    j$.time.chrono.ChronoLocalDate N();

    j$.time.chrono.m R(int i3);

    j$.time.chrono.ChronoLocalDate T(java.util.Map map, j$.time.format.D d4);

    java.lang.String V();

    j$.time.temporal.u X(j$.time.temporal.a aVar);

    boolean equals(java.lang.Object obj);

    int hashCode();

    j$.time.chrono.ChronoLocalDate q(long j);

    java.lang.String s();

    j$.time.chrono.ChronoLocalDate t(j$.time.temporal.TemporalAccessor temporalAccessor);

    java.lang.String toString();

    int v(j$.time.chrono.m mVar, int i3);

    j$.time.chrono.InterfaceC2502i x(j$.time.Instant instant, j$.time.ZoneId zoneId);

    j$.time.chrono.ChronoLocalDate z(int i3, int i9);

    static j$.time.chrono.l F(j$.time.temporal.TemporalAccessor temporalAccessor) {
        java.util.Objects.requireNonNull(temporalAccessor, "temporal");
        j$.time.chrono.l lVar = (j$.time.chrono.l) temporalAccessor.b(j$.time.temporal.r.f23803b);
        j$.time.chrono.s sVar = j$.time.chrono.s.f23629c;
        if (lVar != null) {
            return lVar;
        }
        java.util.Objects.requireNonNull(sVar, "defaultObj");
        return sVar;
    }

    static j$.time.chrono.l O(java.lang.String str) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = j$.time.chrono.AbstractC2494a.f23598a;
        java.util.Objects.requireNonNull(str, "id");
        while (true) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = j$.time.chrono.AbstractC2494a.f23598a;
            j$.time.chrono.l lVar = (j$.time.chrono.l) concurrentHashMap2.get(str);
            if (lVar == null) {
                lVar = (j$.time.chrono.l) j$.time.chrono.AbstractC2494a.f23599b.get(str);
            }
            if (lVar != null) {
                return lVar;
            }
            if (concurrentHashMap2.get("ISO") != null) {
                for (j$.time.chrono.l lVar2 : java.util.ServiceLoader.load(j$.time.chrono.l.class)) {
                    if (str.equals(lVar2.s()) || str.equals(lVar2.V())) {
                        return lVar2;
                    }
                }
                throw new j$.time.DateTimeException("Unknown chronology: ".concat(str));
            }
            j$.time.chrono.o oVar = j$.time.chrono.o.f23615l;
            j$.time.chrono.AbstractC2494a.r(oVar, oVar.s());
            j$.time.chrono.v vVar = j$.time.chrono.v.f23632c;
            j$.time.chrono.AbstractC2494a.r(vVar, vVar.s());
            j$.time.chrono.A a2 = j$.time.chrono.A.f23587c;
            j$.time.chrono.AbstractC2494a.r(a2, a2.s());
            j$.time.chrono.G g = j$.time.chrono.G.f23594c;
            j$.time.chrono.AbstractC2494a.r(g, g.s());
            try {
                for (j$.time.chrono.AbstractC2494a abstractC2494a : java.util.Arrays.asList(new j$.time.chrono.AbstractC2494a[0])) {
                    if (!abstractC2494a.s().equals("ISO")) {
                        j$.time.chrono.AbstractC2494a.r(abstractC2494a, abstractC2494a.s());
                    }
                }
                j$.time.chrono.s sVar = j$.time.chrono.s.f23629c;
                j$.time.chrono.AbstractC2494a.r(sVar, sVar.s());
            } catch (java.lang.Throwable th) {
                throw new java.util.ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    default j$.time.chrono.InterfaceC2497d w(j$.time.i iVar) {
        try {
            return t(iVar).M(j$.time.LocalTime.B(iVar));
        } catch (j$.time.DateTimeException e6) {
            throw new j$.time.DateTimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + j$.time.i.class, e6);
        }
    }
}
