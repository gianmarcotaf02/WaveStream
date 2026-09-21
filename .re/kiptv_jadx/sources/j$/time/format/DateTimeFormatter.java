package j$.time.format;

/* JADX INFO: loaded from: classes3.dex */
public final class DateTimeFormatter {
    public static final j$.time.format.DateTimeFormatter ISO_LOCAL_DATE;
    public static final j$.time.format.DateTimeFormatter g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j$.time.format.DateTimeFormatter f23662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j$.time.format.DateTimeFormatter f23663i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.time.format.C2507d f23664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.Locale f23665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j$.time.format.B f23666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j$.time.format.D f23667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j$.time.chrono.s f23668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j$.time.ZoneId f23669f;

    public static j$.time.format.DateTimeFormatter ofPattern(java.lang.String str) {
        j$.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder = new j$.time.format.DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.g(str);
        return dateTimeFormatterBuilder.toFormatter();
    }

    public static j$.time.format.DateTimeFormatter ofLocalizedDate(j$.time.format.FormatStyle formatStyle) {
        java.util.Objects.requireNonNull(formatStyle, "dateStyle");
        j$.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder = new j$.time.format.DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.c(new j$.time.format.i(formatStyle));
        return dateTimeFormatterBuilder.p(j$.time.format.D.SMART, j$.time.chrono.s.f23629c);
    }

    static {
        j$.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder = new j$.time.format.DateTimeFormatterBuilder();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        j$.time.format.E e6 = j$.time.format.E.EXCEEDS_PAD;
        dateTimeFormatterBuilder.m(aVar, 4, 10, e6);
        dateTimeFormatterBuilder.d('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        dateTimeFormatterBuilder.l(aVar2, 2);
        dateTimeFormatterBuilder.d('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        dateTimeFormatterBuilder.l(aVar3, 2);
        j$.time.format.D d4 = j$.time.format.D.STRICT;
        j$.time.chrono.s sVar = j$.time.chrono.s.f23629c;
        j$.time.format.DateTimeFormatter dateTimeFormatterP = dateTimeFormatterBuilder.p(d4, sVar);
        ISO_LOCAL_DATE = dateTimeFormatterP;
        j$.time.format.DateTimeFormatterBuilder caseInsensitive = new j$.time.format.DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive.a(dateTimeFormatterP);
        caseInsensitive.appendOffsetId().p(d4, sVar);
        j$.time.format.DateTimeFormatterBuilder caseInsensitive2 = new j$.time.format.DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive2.a(dateTimeFormatterP);
        caseInsensitive2.o();
        caseInsensitive2.appendOffsetId().p(d4, sVar);
        j$.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new j$.time.format.DateTimeFormatterBuilder();
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
        j$.time.format.DateTimeFormatter dateTimeFormatterP2 = dateTimeFormatterBuilder2.p(d4, null);
        g = dateTimeFormatterP2;
        j$.time.format.DateTimeFormatterBuilder caseInsensitive3 = new j$.time.format.DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive3.a(dateTimeFormatterP2);
        caseInsensitive3.appendOffsetId().p(d4, null);
        j$.time.format.DateTimeFormatterBuilder caseInsensitive4 = new j$.time.format.DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive4.a(dateTimeFormatterP2);
        caseInsensitive4.o();
        caseInsensitive4.appendOffsetId().p(d4, null);
        j$.time.format.DateTimeFormatterBuilder caseInsensitive5 = new j$.time.format.DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive5.a(dateTimeFormatterP);
        caseInsensitive5.d('T');
        caseInsensitive5.a(dateTimeFormatterP2);
        j$.time.format.DateTimeFormatter dateTimeFormatterP3 = caseInsensitive5.p(d4, sVar);
        j$.time.format.DateTimeFormatterBuilder caseInsensitive6 = new j$.time.format.DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive6.a(dateTimeFormatterP3);
        j$.time.format.q qVar = j$.time.format.q.LENIENT;
        caseInsensitive6.c(qVar);
        j$.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffsetId = caseInsensitive6.appendOffsetId();
        j$.time.format.q qVar2 = j$.time.format.q.STRICT;
        dateTimeFormatterBuilderAppendOffsetId.c(qVar2);
        j$.time.format.DateTimeFormatter dateTimeFormatterP4 = dateTimeFormatterBuilderAppendOffsetId.p(d4, sVar);
        f23662h = dateTimeFormatterP4;
        j$.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new j$.time.format.DateTimeFormatterBuilder();
        dateTimeFormatterBuilder3.a(dateTimeFormatterP4);
        dateTimeFormatterBuilder3.o();
        dateTimeFormatterBuilder3.d('[');
        j$.time.format.q qVar3 = j$.time.format.q.SENSITIVE;
        dateTimeFormatterBuilder3.c(qVar3);
        j$.time.e eVar = j$.time.format.DateTimeFormatterBuilder.f23670h;
        dateTimeFormatterBuilder3.c(new j$.time.format.t(eVar, "ZoneRegionId()"));
        dateTimeFormatterBuilder3.d(']');
        dateTimeFormatterBuilder3.p(d4, sVar);
        j$.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new j$.time.format.DateTimeFormatterBuilder();
        dateTimeFormatterBuilder4.a(dateTimeFormatterP3);
        dateTimeFormatterBuilder4.o();
        j$.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffsetId2 = dateTimeFormatterBuilder4.appendOffsetId();
        dateTimeFormatterBuilderAppendOffsetId2.o();
        dateTimeFormatterBuilderAppendOffsetId2.d('[');
        dateTimeFormatterBuilderAppendOffsetId2.c(qVar3);
        dateTimeFormatterBuilderAppendOffsetId2.c(new j$.time.format.t(eVar, "ZoneRegionId()"));
        dateTimeFormatterBuilderAppendOffsetId2.d(']');
        dateTimeFormatterBuilderAppendOffsetId2.p(d4, sVar);
        j$.time.format.DateTimeFormatterBuilder caseInsensitive7 = new j$.time.format.DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive7.m(aVar, 4, 10, e6);
        caseInsensitive7.d('-');
        caseInsensitive7.l(j$.time.temporal.a.DAY_OF_YEAR, 3);
        caseInsensitive7.o();
        caseInsensitive7.appendOffsetId().p(d4, sVar);
        j$.time.format.DateTimeFormatterBuilder caseInsensitive8 = new j$.time.format.DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive8.m(j$.time.temporal.j.f23793c, 4, 10, e6);
        caseInsensitive8.e("-W");
        caseInsensitive8.l(j$.time.temporal.j.f23792b, 2);
        caseInsensitive8.d('-');
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        caseInsensitive8.l(aVar7, 1);
        caseInsensitive8.o();
        caseInsensitive8.appendOffsetId().p(d4, sVar);
        j$.time.format.DateTimeFormatterBuilder caseInsensitive9 = new j$.time.format.DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive9.getClass();
        caseInsensitive9.c(new j$.time.format.C2510g());
        f23663i = caseInsensitive9.p(d4, null);
        j$.time.format.DateTimeFormatterBuilder caseInsensitive10 = new j$.time.format.DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive10.l(aVar, 4);
        caseInsensitive10.l(aVar2, 2);
        caseInsensitive10.l(aVar3, 2);
        caseInsensitive10.o();
        caseInsensitive10.c(qVar);
        j$.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffset = caseInsensitive10.appendOffset("+HHMMss", "Z");
        dateTimeFormatterBuilderAppendOffset.c(qVar2);
        dateTimeFormatterBuilderAppendOffset.p(d4, sVar);
        java.util.HashMap map = new java.util.HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        java.util.HashMap map2 = new java.util.HashMap();
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
        j$.time.format.DateTimeFormatterBuilder caseInsensitive11 = new j$.time.format.DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive11.c(qVar);
        caseInsensitive11.o();
        caseInsensitive11.h(aVar7, map);
        caseInsensitive11.e(", ");
        caseInsensitive11.n();
        caseInsensitive11.m(aVar3, 1, 2, j$.time.format.E.NOT_NEGATIVE);
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
        caseInsensitive11.appendOffset("+HHMM", "GMT").p(j$.time.format.D.SMART, sVar);
    }

    public DateTimeFormatter(j$.time.format.C2507d c2507d, java.util.Locale locale, j$.time.format.B b9, j$.time.format.D d4, j$.time.chrono.s sVar, j$.time.ZoneId zoneId) {
        java.util.Objects.requireNonNull(c2507d, "printerParser");
        this.f23664a = c2507d;
        java.util.Objects.requireNonNull(locale, io.sentry.protocol.Device.JsonKeys.LOCALE);
        this.f23665b = locale;
        java.util.Objects.requireNonNull(b9, "decimalStyle");
        this.f23666c = b9;
        java.util.Objects.requireNonNull(d4, "resolverStyle");
        this.f23667d = d4;
        this.f23668e = sVar;
        this.f23669f = zoneId;
    }

    public j$.time.format.DateTimeFormatter withZone(j$.time.ZoneId zoneId) {
        if (java.util.Objects.equals(this.f23669f, zoneId)) {
            return this;
        }
        return new j$.time.format.DateTimeFormatter(this.f23664a, this.f23665b, this.f23666c, this.f23667d, this.f23668e, zoneId);
    }

    public java.lang.String format(j$.time.temporal.TemporalAccessor temporalAccessor) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(32);
        java.util.Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            this.f23664a.p(new j$.time.format.x(temporalAccessor, this), sb);
            return sb.toString();
        } catch (java.io.IOException e6) {
            throw new j$.time.DateTimeException(e6.getMessage(), e6);
        }
    }

    public <T> T parse(java.lang.CharSequence charSequence, j$.time.temporal.TemporalQuery<T> temporalQuery) {
        java.lang.String string;
        java.util.Objects.requireNonNull(charSequence, "text");
        java.util.Objects.requireNonNull(temporalQuery, "query");
        try {
            return (T) a(charSequence).b(temporalQuery);
        } catch (j$.time.format.DateTimeParseException e6) {
            throw e6;
        } catch (java.lang.RuntimeException e9) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            j$.time.format.DateTimeParseException dateTimeParseException = new j$.time.format.DateTimeParseException("Text '" + string + "' could not be parsed: " + e9.getMessage(), e9);
            charSequence.toString();
            throw dateTimeParseException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:88:0x0204  */
    /* JADX WARN: Code duplicated, block: B:96:0x0222  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final j$.time.format.C a(java.lang.CharSequence charSequence) {
        java.lang.String string;
        long j;
        j$.time.temporal.q qVar;
        j$.time.temporal.q qVar2;
        int i3 = 0;
        java.text.ParsePosition parsePosition = new java.text.ParsePosition(0);
        j$.time.format.v vVar = new j$.time.format.v(this);
        int iR = this.f23664a.r(vVar, charSequence, parsePosition.getIndex());
        if (iR < 0) {
            parsePosition.setErrorIndex(~iR);
            vVar = null;
        } else {
            parsePosition.setIndex(iR);
        }
        if (vVar != null && parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() >= charSequence.length()) {
            j$.time.format.C c9 = vVar.c();
            c9.f23656c = vVar.d();
            j$.time.ZoneId zoneId = c9.f23655b;
            if (zoneId == null) {
                zoneId = vVar.f23737a.f23669f;
            }
            c9.f23655b = zoneId;
            java.util.HashMap map = c9.f23654a;
            c9.f23658e = this.f23667d;
            c9.r();
            c9.x(c9.f23656c.T(map, c9.f23658e));
            c9.v();
            if (map.size() > 0) {
                loop0: while (i3 < 50) {
                    java.util.Iterator it = map.entrySet().iterator();
                    do {
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        qVar2 = (j$.time.temporal.q) ((java.util.Map.Entry) it.next()).getKey();
                        j$.time.temporal.TemporalAccessor temporalAccessorJ = qVar2.J(map, c9, c9.f23658e);
                        if (temporalAccessorJ != null) {
                            if (temporalAccessorJ instanceof j$.time.chrono.InterfaceC2502i) {
                                j$.time.chrono.InterfaceC2502i interfaceC2502i = (j$.time.chrono.InterfaceC2502i) temporalAccessorJ;
                                j$.time.ZoneId zoneId2 = c9.f23655b;
                                if (zoneId2 == null) {
                                    c9.f23655b = interfaceC2502i.U();
                                } else if (!zoneId2.equals(interfaceC2502i.U())) {
                                    throw new j$.time.DateTimeException("ChronoZonedDateTime must use the effective parsed zone: " + c9.f23655b);
                                }
                                temporalAccessorJ = interfaceC2502i.A();
                            }
                            if (temporalAccessorJ instanceof j$.time.chrono.InterfaceC2497d) {
                                j$.time.chrono.InterfaceC2497d interfaceC2497d = (j$.time.chrono.InterfaceC2497d) temporalAccessorJ;
                                c9.w(interfaceC2497d.n(), j$.time.q.f23771d);
                                c9.x(interfaceC2497d.o());
                                break;
                            }
                            if (temporalAccessorJ instanceof j$.time.chrono.ChronoLocalDate) {
                                c9.x((j$.time.chrono.ChronoLocalDate) temporalAccessorJ);
                                break;
                            }
                            if (temporalAccessorJ instanceof j$.time.LocalTime) {
                                c9.w((j$.time.LocalTime) temporalAccessorJ, j$.time.q.f23771d);
                                break;
                            }
                            throw new j$.time.DateTimeException("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                        }
                    } while (map.containsKey(qVar2));
                    i3++;
                }
                if (i3 == 50) {
                    throw new j$.time.DateTimeException("One of the parsed fields has an incorrectly implemented resolve method");
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
                    long jLongValue = ((java.lang.Long) map.remove(qVar3)).longValue();
                    j$.time.temporal.a aVar = j$.time.temporal.a.MICRO_OF_SECOND;
                    if (map.containsKey(aVar)) {
                        long jLongValue2 = (((java.lang.Long) map.get(aVar)).longValue() % 1000) + (jLongValue * 1000);
                        c9.z(qVar3, aVar, java.lang.Long.valueOf(jLongValue2));
                        map.remove(aVar);
                        map.put(j$.time.temporal.a.NANO_OF_SECOND, java.lang.Long.valueOf(jLongValue2 * 1000));
                    } else {
                        map.put(j$.time.temporal.a.NANO_OF_SECOND, java.lang.Long.valueOf(jLongValue * 1000000));
                    }
                } else {
                    java.lang.Object obj = j$.time.temporal.a.MICRO_OF_SECOND;
                    if (map.containsKey(obj)) {
                        map.put(j$.time.temporal.a.NANO_OF_SECOND, java.lang.Long.valueOf(((java.lang.Long) map.remove(obj)).longValue() * 1000));
                    }
                }
                java.lang.Object obj2 = j$.time.temporal.a.HOUR_OF_DAY;
                java.lang.Long l2 = (java.lang.Long) map.get(obj2);
                if (l2 != null) {
                    java.lang.Object obj3 = j$.time.temporal.a.MINUTE_OF_HOUR;
                    java.lang.Long l9 = (java.lang.Long) map.get(obj3);
                    java.lang.Object obj4 = j$.time.temporal.a.SECOND_OF_MINUTE;
                    java.lang.Long l10 = (java.lang.Long) map.get(obj4);
                    java.lang.Object obj5 = j$.time.temporal.a.NANO_OF_SECOND;
                    java.lang.Long l11 = (java.lang.Long) map.get(obj5);
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
                if (c9.f23658e != j$.time.format.D.LENIENT && map.size() > 0) {
                    for (java.util.Map.Entry entry : map.entrySet()) {
                        qVar = (j$.time.temporal.q) entry.getKey();
                        if (!(qVar instanceof j$.time.temporal.a) && ((j$.time.temporal.a) qVar).c0()) {
                            ((j$.time.temporal.a) qVar).b0(((java.lang.Long) entry.getValue()).longValue());
                        }
                    }
                }
            } else {
                j = 0;
                if (c9.f23658e != j$.time.format.D.LENIENT) {
                    while (r2.hasNext()) {
                        qVar = (j$.time.temporal.q) entry.getKey();
                        if (!(qVar instanceof j$.time.temporal.a)) {
                        }
                    }
                }
            }
            j$.time.temporal.TemporalAccessor temporalAccessor = c9.f23659f;
            if (temporalAccessor != null) {
                c9.q(temporalAccessor);
            }
            j$.time.temporal.TemporalAccessor temporalAccessor2 = c9.g;
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
                    long jLongValue3 = ((java.lang.Long) map.get(aVar2)).longValue();
                    map.put(j$.time.temporal.a.MICRO_OF_SECOND, java.lang.Long.valueOf(jLongValue3 / 1000));
                    map.put(j$.time.temporal.a.MILLI_OF_SECOND, java.lang.Long.valueOf(jLongValue3 / j9));
                } else {
                    map.put(aVar2, java.lang.Long.valueOf(j));
                    map.put(j$.time.temporal.a.MICRO_OF_SECOND, java.lang.Long.valueOf(j));
                    map.put(j$.time.temporal.a.MILLI_OF_SECOND, java.lang.Long.valueOf(j));
                }
            }
            if (c9.f23659f != null && c9.g != null) {
                java.lang.Long l12 = (java.lang.Long) map.get(j$.time.temporal.a.OFFSET_SECONDS);
                if (l12 != null) {
                    map.put(j$.time.temporal.a.INSTANT_SECONDS, java.lang.Long.valueOf(c9.f23659f.M(c9.g).H(j$.time.ZoneOffset.ofTotalSeconds(l12.intValue())).S()));
                    return c9;
                }
                if (c9.f23655b != null) {
                    map.put(j$.time.temporal.a.INSTANT_SECONDS, java.lang.Long.valueOf(c9.f23659f.M(c9.g).H(c9.f23655b).S()));
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
            java.lang.String str = "Text '" + string + "' could not be parsed at index " + parsePosition.getErrorIndex();
            parsePosition.getErrorIndex();
            throw new j$.time.format.DateTimeParseException(str, charSequence);
        }
        java.lang.String str2 = "Text '" + string + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
        parsePosition.getIndex();
        throw new j$.time.format.DateTimeParseException(str2, charSequence);
    }

    public final java.lang.String toString() {
        java.lang.String string = this.f23664a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }

    public final j$.time.format.C2507d b() {
        j$.time.format.C2507d c2507d = this.f23664a;
        return !c2507d.f23692b ? c2507d : new j$.time.format.C2507d(c2507d.f23691a, false);
    }
}
