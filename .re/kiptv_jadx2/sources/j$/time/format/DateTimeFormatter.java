package j$.time.format;

import io.sentry.protocol.Device;
import j$.time.DateTimeException;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.InterfaceC2497d;
import j$.time.chrono.InterfaceC2502i;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter g;

    public static final DateTimeFormatter f23662h;

    public static final DateTimeFormatter f23663i;

    public final C2507d f23664a;

    public final Locale f23665b;

    public final B f23666c;

    public final D f23667d;

    public final j$.time.chrono.s f23668e;

    public final ZoneId f23669f;

    public static DateTimeFormatter ofPattern(String str) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.g(str);
        return dateTimeFormatterBuilder.toFormatter();
    }

    public static DateTimeFormatter ofLocalizedDate(FormatStyle formatStyle) {
        Objects.requireNonNull(formatStyle, "dateStyle");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.c(new i(formatStyle));
        return dateTimeFormatterBuilder.p(D.SMART, j$.time.chrono.s.f23629c);
    }

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        E e6 = E.EXCEEDS_PAD;
        dateTimeFormatterBuilder.m(aVar, 4, 10, e6);
        dateTimeFormatterBuilder.d('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        dateTimeFormatterBuilder.l(aVar2, 2);
        dateTimeFormatterBuilder.d('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        dateTimeFormatterBuilder.l(aVar3, 2);
        D d4 = D.STRICT;
        j$.time.chrono.s sVar = j$.time.chrono.s.f23629c;
        DateTimeFormatter dateTimeFormatterP = dateTimeFormatterBuilder.p(d4, sVar);
        ISO_LOCAL_DATE = dateTimeFormatterP;
        DateTimeFormatterBuilder caseInsensitive = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive.a(dateTimeFormatterP);
        caseInsensitive.appendOffsetId().p(d4, sVar);
        DateTimeFormatterBuilder caseInsensitive2 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive2.a(dateTimeFormatterP);
        caseInsensitive2.o();
        caseInsensitive2.appendOffsetId().p(d4, sVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new DateTimeFormatterBuilder();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        dateTimeFormatterBuilder2.l(aVar4, 2);
        dateTimeFormatterBuilder2.d(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        dateTimeFormatterBuilder2.l(aVar5, 2);
        dateTimeFormatterBuilder2.o();
        dateTimeFormatterBuilder2.d(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        dateTimeFormatterBuilder2.l(aVar6, 2);
        dateTimeFormatterBuilder2.o();
        dateTimeFormatterBuilder2.b(j$.time.temporal.a.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter dateTimeFormatterP2 = dateTimeFormatterBuilder2.p(d4, null);
        g = dateTimeFormatterP2;
        DateTimeFormatterBuilder caseInsensitive3 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive3.a(dateTimeFormatterP2);
        caseInsensitive3.appendOffsetId().p(d4, null);
        DateTimeFormatterBuilder caseInsensitive4 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive4.a(dateTimeFormatterP2);
        caseInsensitive4.o();
        caseInsensitive4.appendOffsetId().p(d4, null);
        DateTimeFormatterBuilder caseInsensitive5 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive5.a(dateTimeFormatterP);
        caseInsensitive5.d('T');
        caseInsensitive5.a(dateTimeFormatterP2);
        DateTimeFormatter dateTimeFormatterP3 = caseInsensitive5.p(d4, sVar);
        DateTimeFormatterBuilder caseInsensitive6 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive6.a(dateTimeFormatterP3);
        q qVar = q.LENIENT;
        caseInsensitive6.c(qVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffsetId = caseInsensitive6.appendOffsetId();
        q qVar2 = q.STRICT;
        dateTimeFormatterBuilderAppendOffsetId.c(qVar2);
        DateTimeFormatter dateTimeFormatterP4 = dateTimeFormatterBuilderAppendOffsetId.p(d4, sVar);
        f23662h = dateTimeFormatterP4;
        DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder3.a(dateTimeFormatterP4);
        dateTimeFormatterBuilder3.o();
        dateTimeFormatterBuilder3.d('[');
        q qVar3 = q.SENSITIVE;
        dateTimeFormatterBuilder3.c(qVar3);
        j$.time.e eVar = DateTimeFormatterBuilder.f23670h;
        dateTimeFormatterBuilder3.c(new t(eVar, "ZoneRegionId()"));
        dateTimeFormatterBuilder3.d(']');
        dateTimeFormatterBuilder3.p(d4, sVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder4.a(dateTimeFormatterP3);
        dateTimeFormatterBuilder4.o();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffsetId2 = dateTimeFormatterBuilder4.appendOffsetId();
        dateTimeFormatterBuilderAppendOffsetId2.o();
        dateTimeFormatterBuilderAppendOffsetId2.d('[');
        dateTimeFormatterBuilderAppendOffsetId2.c(qVar3);
        dateTimeFormatterBuilderAppendOffsetId2.c(new t(eVar, "ZoneRegionId()"));
        dateTimeFormatterBuilderAppendOffsetId2.d(']');
        dateTimeFormatterBuilderAppendOffsetId2.p(d4, sVar);
        DateTimeFormatterBuilder caseInsensitive7 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive7.m(aVar, 4, 10, e6);
        caseInsensitive7.d('-');
        caseInsensitive7.l(j$.time.temporal.a.DAY_OF_YEAR, 3);
        caseInsensitive7.o();
        caseInsensitive7.appendOffsetId().p(d4, sVar);
        DateTimeFormatterBuilder caseInsensitive8 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive8.m(j$.time.temporal.j.f23793c, 4, 10, e6);
        caseInsensitive8.e("-W");
        caseInsensitive8.l(j$.time.temporal.j.f23792b, 2);
        caseInsensitive8.d('-');
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        caseInsensitive8.l(aVar7, 1);
        caseInsensitive8.o();
        caseInsensitive8.appendOffsetId().p(d4, sVar);
        DateTimeFormatterBuilder caseInsensitive9 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive9.getClass();
        caseInsensitive9.c(new C2510g());
        f23663i = caseInsensitive9.p(d4, null);
        DateTimeFormatterBuilder caseInsensitive10 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive10.l(aVar, 4);
        caseInsensitive10.l(aVar2, 2);
        caseInsensitive10.l(aVar3, 2);
        caseInsensitive10.o();
        caseInsensitive10.c(qVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffset = caseInsensitive10.appendOffset("+HHMMss", "Z");
        dateTimeFormatterBuilderAppendOffset.c(qVar2);
        dateTimeFormatterBuilderAppendOffset.p(d4, sVar);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        DateTimeFormatterBuilder caseInsensitive11 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive11.c(qVar);
        caseInsensitive11.o();
        caseInsensitive11.h(aVar7, map);
        caseInsensitive11.e(", ");
        caseInsensitive11.n();
        caseInsensitive11.m(aVar3, 1, 2, E.NOT_NEGATIVE);
        caseInsensitive11.d(' ');
        caseInsensitive11.h(aVar2, map2);
        caseInsensitive11.d(' ');
        caseInsensitive11.l(aVar, 4);
        caseInsensitive11.d(' ');
        caseInsensitive11.l(aVar4, 2);
        caseInsensitive11.d(':');
        caseInsensitive11.l(aVar5, 2);
        caseInsensitive11.o();
        caseInsensitive11.d(':');
        caseInsensitive11.l(aVar6, 2);
        caseInsensitive11.n();
        caseInsensitive11.d(' ');
        caseInsensitive11.appendOffset("+HHMM", "GMT").p(D.SMART, sVar);
    }

    public DateTimeFormatter(C2507d c2507d, Locale locale, B b9, D d4, j$.time.chrono.s sVar, ZoneId zoneId) {
        Objects.requireNonNull(c2507d, "printerParser");
        this.f23664a = c2507d;
        Objects.requireNonNull(locale, Device.JsonKeys.LOCALE);
        this.f23665b = locale;
        Objects.requireNonNull(b9, "decimalStyle");
        this.f23666c = b9;
        Objects.requireNonNull(d4, "resolverStyle");
        this.f23667d = d4;
        this.f23668e = sVar;
        this.f23669f = zoneId;
    }

    public DateTimeFormatter withZone(ZoneId zoneId) {
        if (Objects.equals(this.f23669f, zoneId)) {
            return this;
        }
        return new DateTimeFormatter(this.f23664a, this.f23665b, this.f23666c, this.f23667d, this.f23668e, zoneId);
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb = new StringBuilder(32);
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            this.f23664a.p(new x(temporalAccessor, this), sb);
            return sb.toString();
        } catch (IOException e6) {
            throw new DateTimeException(e6.getMessage(), e6);
        }
    }

    public <T> T parse(CharSequence charSequence, TemporalQuery<T> temporalQuery) {
        String string;
        Objects.requireNonNull(charSequence, "text");
        Objects.requireNonNull(temporalQuery, "query");
        try {
            return (T) a(charSequence).b(temporalQuery);
        } catch (DateTimeParseException e6) {
            throw e6;
        } catch (RuntimeException e9) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            DateTimeParseException dateTimeParseException = new DateTimeParseException("Text '" + string + "' could not be parsed: " + e9.getMessage(), e9);
            charSequence.toString();
            throw dateTimeParseException;
        }
    }

    public final C a(CharSequence charSequence) {
        String string;
        long j;
        j$.time.temporal.q qVar;
        j$.time.temporal.q qVar2;
        int i3 = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        v vVar = new v(this);
        int iR = this.f23664a.r(vVar, charSequence, parsePosition.getIndex());
        if (iR < 0) {
            parsePosition.setErrorIndex(~iR);
            vVar = null;
        } else {
            parsePosition.setIndex(iR);
        }
        if (vVar != null && parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() >= charSequence.length()) {
            C c9 = vVar.c();
            c9.f23656c = vVar.d();
            ZoneId zoneId = c9.f23655b;
            if (zoneId == null) {
                zoneId = vVar.f23737a.f23669f;
            }
            c9.f23655b = zoneId;
            HashMap map = c9.f23654a;
            c9.f23658e = this.f23667d;
            c9.r();
            c9.x(c9.f23656c.T(map, c9.f23658e));
            c9.v();
            if (map.size() > 0) {
                loop0: while (i3 < 50) {
                    Iterator it = map.entrySet().iterator();
                    do {
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        qVar2 = (j$.time.temporal.q) ((Map.Entry) it.next()).getKey();
                        TemporalAccessor temporalAccessorJ = qVar2.J(map, c9, c9.f23658e);
                        if (temporalAccessorJ != null) {
                            if (temporalAccessorJ instanceof InterfaceC2502i) {
                                InterfaceC2502i interfaceC2502i = (InterfaceC2502i) temporalAccessorJ;
                                ZoneId zoneId2 = c9.f23655b;
                                if (zoneId2 == null) {
                                    c9.f23655b = interfaceC2502i.U();
                                } else if (!zoneId2.equals(interfaceC2502i.U())) {
                                    throw new DateTimeException("ChronoZonedDateTime must use the effective parsed zone: " + c9.f23655b);
                                }
                                temporalAccessorJ = interfaceC2502i.A();
                            }
                            if (temporalAccessorJ instanceof InterfaceC2497d) {
                                InterfaceC2497d interfaceC2497d = (InterfaceC2497d) temporalAccessorJ;
                                c9.w(interfaceC2497d.n(), j$.time.q.f23771d);
                                c9.x(interfaceC2497d.o());
                                break;
                            }
                            if (temporalAccessorJ instanceof ChronoLocalDate) {
                                c9.x((ChronoLocalDate) temporalAccessorJ);
                                break;
                            }
                            if (temporalAccessorJ instanceof LocalTime) {
                                c9.w((LocalTime) temporalAccessorJ, j$.time.q.f23771d);
                                break;
                            }
                            throw new DateTimeException("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                        }
                    } while (map.containsKey(qVar2));
                    i3++;
                }
                if (i3 == 50) {
                    throw new DateTimeException("One of the parsed fields has an incorrectly implemented resolve method");
                }
                if (i3 > 0) {
                    c9.r();
                    c9.x(c9.f23656c.T(map, c9.f23658e));
                    c9.v();
                }
            }
            long j9 = 1000000;
            if (c9.g == null) {
                j$.time.temporal.q qVar3 = j$.time.temporal.a.MILLI_OF_SECOND;
                if (map.containsKey(qVar3)) {
                    long jLongValue = ((Long) map.remove(qVar3)).longValue();
                    j$.time.temporal.a aVar = j$.time.temporal.a.MICRO_OF_SECOND;
                    if (map.containsKey(aVar)) {
                        long jLongValue2 = (((Long) map.get(aVar)).longValue() % 1000) + (jLongValue * 1000);
                        c9.z(qVar3, aVar, Long.valueOf(jLongValue2));
                        map.remove(aVar);
                        map.put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(jLongValue2 * 1000));
                    } else {
                        map.put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(jLongValue * 1000000));
                    }
                } else {
                    Object obj = j$.time.temporal.a.MICRO_OF_SECOND;
                    if (map.containsKey(obj)) {
                        map.put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(((Long) map.remove(obj)).longValue() * 1000));
                    }
                }
                Object obj2 = j$.time.temporal.a.HOUR_OF_DAY;
                Long l2 = (Long) map.get(obj2);
                if (l2 != null) {
                    Object obj3 = j$.time.temporal.a.MINUTE_OF_HOUR;
                    Long l9 = (Long) map.get(obj3);
                    Object obj4 = j$.time.temporal.a.SECOND_OF_MINUTE;
                    Long l10 = (Long) map.get(obj4);
                    Object obj5 = j$.time.temporal.a.NANO_OF_SECOND;
                    Long l11 = (Long) map.get(obj5);
                    if ((l9 != null || (l10 == null && l11 == null)) && (l9 == null || l10 != null || l11 == null)) {
                        j = 0;
                        c9.t(l2.longValue(), l9 != null ? l9.longValue() : 0L, l10 != null ? l10.longValue() : 0L, l11 != null ? l11.longValue() : 0L);
                        map.remove(obj2);
                        map.remove(obj3);
                        map.remove(obj4);
                        map.remove(obj5);
                    } else {
                        j9 = 1000000;
                        j = 0;
                    }
                } else {
                    j = 0;
                }
                if (c9.f23658e != D.LENIENT && map.size() > 0) {
                    for (Map.Entry entry : map.entrySet()) {
                        qVar = (j$.time.temporal.q) entry.getKey();
                        if (!(qVar instanceof j$.time.temporal.a) && ((j$.time.temporal.a) qVar).c0()) {
                            ((j$.time.temporal.a) qVar).b0(((Long) entry.getValue()).longValue());
                        }
                    }
                }
            } else {
                j = 0;
                if (c9.f23658e != D.LENIENT) {
                    while (r2.hasNext()) {
                        qVar = (j$.time.temporal.q) entry.getKey();
                        if (!(qVar instanceof j$.time.temporal.a)) {
                        }
                    }
                }
            }
            TemporalAccessor temporalAccessor = c9.f23659f;
            if (temporalAccessor != null) {
                c9.q(temporalAccessor);
            }
            TemporalAccessor temporalAccessor2 = c9.g;
            if (temporalAccessor2 != null) {
                c9.q(temporalAccessor2);
                if (c9.f23659f != null && map.size() > 0) {
                    c9.q(c9.f23659f.M(c9.g));
                }
            }
            if (c9.f23659f != null && c9.g != null) {
                j$.time.q qVar4 = c9.f23660h;
                qVar4.getClass();
                j$.time.q qVar5 = j$.time.q.f23771d;
                if (qVar4 != qVar5) {
                    c9.f23659f = c9.f23659f.P(c9.f23660h);
                    c9.f23660h = qVar5;
                }
            }
            if (c9.g == null && (map.containsKey(j$.time.temporal.a.INSTANT_SECONDS) || map.containsKey(j$.time.temporal.a.SECOND_OF_DAY) || map.containsKey(j$.time.temporal.a.SECOND_OF_MINUTE))) {
                j$.time.temporal.a aVar2 = j$.time.temporal.a.NANO_OF_SECOND;
                if (map.containsKey(aVar2)) {
                    long jLongValue3 = ((Long) map.get(aVar2)).longValue();
                    map.put(j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue3 / 1000));
                    map.put(j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(jLongValue3 / j9));
                } else {
                    map.put(aVar2, Long.valueOf(j));
                    map.put(j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(j));
                    map.put(j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(j));
                }
            }
            if (c9.f23659f != null && c9.g != null) {
                Long l12 = (Long) map.get(j$.time.temporal.a.OFFSET_SECONDS);
                if (l12 != null) {
                    map.put(j$.time.temporal.a.INSTANT_SECONDS, Long.valueOf(c9.f23659f.M(c9.g).H(ZoneOffset.ofTotalSeconds(l12.intValue())).S()));
                    return c9;
                }
                if (c9.f23655b != null) {
                    map.put(j$.time.temporal.a.INSTANT_SECONDS, Long.valueOf(c9.f23659f.M(c9.g).H(c9.f23655b).S()));
                }
            }
            return c9;
        }
        if (charSequence.length() > 64) {
            string = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            string = charSequence.toString();
        }
        if (parsePosition.getErrorIndex() >= 0) {
            String str = "Text '" + string + "' could not be parsed at index " + parsePosition.getErrorIndex();
            parsePosition.getErrorIndex();
            throw new DateTimeParseException(str, charSequence);
        }
        String str2 = "Text '" + string + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
        parsePosition.getIndex();
        throw new DateTimeParseException(str2, charSequence);
    }

    public final String toString() {
        String string = this.f23664a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }

    public final C2507d b() {
        C2507d c2507d = this.f23664a;
        return !c2507d.f23692b ? c2507d : new C2507d(c2507d.f23691a, false);
    }
}
