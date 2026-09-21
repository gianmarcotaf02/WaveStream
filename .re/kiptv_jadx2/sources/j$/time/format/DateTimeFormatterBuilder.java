package j$.time.format;

import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.extractor.ts.TsExtractor;
import dev.jdtech.mpv.MPVLib;
import io.ktor.util.date.GMTDateParser;
import io.sentry.protocol.Device;
import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;

public final class DateTimeFormatterBuilder {

    public static final j$.time.e f23670h = new j$.time.e(4);

    public static final HashMap f23671i;

    public DateTimeFormatterBuilder f23672a;

    public final DateTimeFormatterBuilder f23673b;

    public final ArrayList f23674c;

    public final boolean f23675d;

    public int f23676e;

    public char f23677f;
    public int g;

    static {
        HashMap map = new HashMap();
        f23671i = map;
        map.put('G', j$.time.temporal.a.ERA);
        map.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        map.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.h hVar = j$.time.temporal.j.f23791a;
        map.put('Q', hVar);
        map.put('q', hVar);
        Character chValueOf = Character.valueOf(GMTDateParser.MONTH);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        map.put(chValueOf, aVar);
        map.put('L', aVar);
        map.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        map.put(Character.valueOf(GMTDateParser.DAY_OF_MONTH), j$.time.temporal.a.DAY_OF_MONTH);
        map.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        map.put('E', aVar2);
        map.put('c', aVar2);
        map.put('e', aVar2);
        map.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        map.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        map.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        map.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        map.put(Character.valueOf(GMTDateParser.HOURS), j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        map.put(Character.valueOf(GMTDateParser.MINUTES), j$.time.temporal.a.MINUTE_OF_HOUR);
        map.put(Character.valueOf(GMTDateParser.SECONDS), j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        map.put('S', aVar3);
        map.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        map.put('n', aVar3);
        map.put('N', j$.time.temporal.a.NANO_OF_DAY);
        map.put('g', j$.time.temporal.l.f23799a);
    }

    public DateTimeFormatterBuilder() {
        this.f23672a = this;
        this.f23674c = new ArrayList();
        this.g = -1;
        this.f23673b = null;
        this.f23675d = false;
    }

    public DateTimeFormatterBuilder(DateTimeFormatterBuilder dateTimeFormatterBuilder) {
        this.f23672a = this;
        this.f23674c = new ArrayList();
        this.g = -1;
        this.f23673b = dateTimeFormatterBuilder;
        this.f23675d = true;
    }

    public DateTimeFormatterBuilder parseCaseInsensitive() {
        c(q.INSENSITIVE);
        return this;
    }

    public final void k(j$.time.temporal.q qVar) {
        j(new j(qVar, 1, 19, E.NORMAL));
    }

    public final void l(j$.time.temporal.q qVar, int i3) {
        Objects.requireNonNull(qVar, "field");
        if (i3 < 1 || i3 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i3);
        }
        j(new j(qVar, i3, i3, E.NOT_NEGATIVE));
    }

    public final void m(j$.time.temporal.q qVar, int i3, int i9, E e6) {
        if (i3 == i9 && e6 == E.NOT_NEGATIVE) {
            l(qVar, i9);
            return;
        }
        Objects.requireNonNull(qVar, "field");
        Objects.requireNonNull(e6, "signStyle");
        if (i3 < 1 || i3 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i3);
        }
        if (i9 < 1 || i9 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i9);
        }
        if (i9 < i3) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i9 + " < " + i3);
        }
        j(new j(qVar, i3, i9, e6));
    }

    public final void j(j jVar) {
        j jVarD;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f23672a;
        int i3 = dateTimeFormatterBuilder.g;
        if (i3 >= 0) {
            j jVar2 = (j) dateTimeFormatterBuilder.f23674c.get(i3);
            int i9 = jVar.f23699b;
            int i10 = jVar.f23700c;
            if (i9 == i10) {
                if (jVar.f23701d == E.NOT_NEGATIVE) {
                    jVarD = jVar2.e(i10);
                    c(jVar.d());
                    this.f23672a.g = i3;
                } else {
                    jVarD = jVar2.d();
                    this.f23672a.g = c(jVar);
                }
            } else {
                jVarD = jVar2.d();
                this.f23672a.g = c(jVar);
            }
            this.f23672a.f23674c.set(i3, jVarD);
            return;
        }
        dateTimeFormatterBuilder.g = c(jVar);
    }

    public final void b(j$.time.temporal.a aVar, int i3, int i9, boolean z6) {
        if (i3 == i9 && !z6) {
            j(new C2509f(aVar, i3, i9, z6));
        } else {
            c(new C2509f(aVar, i3, i9, z6));
        }
    }

    public final void i(j$.time.temporal.q qVar, F f9) {
        Objects.requireNonNull(f9, "textStyle");
        c(new r(qVar, f9, A.f23652c));
    }

    public final void h(j$.time.temporal.a aVar, HashMap map) {
        Objects.requireNonNull(aVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        F f9 = F.FULL;
        c(new r(aVar, f9, new C2504a(new z(Collections.singletonMap(f9, linkedHashMap)))));
    }

    public DateTimeFormatterBuilder appendOffsetId() {
        c(k.f23704e);
        return this;
    }

    public DateTimeFormatterBuilder appendOffset(String str, String str2) {
        c(new k(str, str2));
        return this;
    }

    public final void f(F f9) {
        Objects.requireNonNull(f9, "style");
        if (f9 != F.FULL && f9 != F.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        c(new h(f9, 0));
    }

    public final void d(char c9) {
        c(new C2506c(c9));
    }

    public final void e(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            c(new C2506c(str.charAt(0)));
        } else {
            c(new h(str, 1));
        }
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        c(dateTimeFormatter.b());
    }

    public final void g(String str) {
        String strSubstring;
        int i3;
        int i9;
        boolean z6;
        int i10;
        int i11;
        char c9;
        int i12;
        int i13;
        Objects.requireNonNull(str, "pattern");
        int i14 = 0;
        while (i14 < str.length()) {
            char cCharAt = str.charAt(i14);
            if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                int i15 = i14 + 1;
                while (i15 < str.length() && str.charAt(i15) == cCharAt) {
                    i15++;
                }
                int i16 = i15 - i14;
                if (cCharAt == 'p') {
                    if (i15 >= str.length() || (((cCharAt = str.charAt(i15)) < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z'))) {
                        i12 = i15;
                        i13 = i16;
                        i16 = 0;
                    } else {
                        i12 = i15 + 1;
                        while (i12 < str.length() && str.charAt(i12) == cCharAt) {
                            i12++;
                        }
                        i13 = i12 - i15;
                    }
                    if (i16 == 0) {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: ".concat(str));
                    }
                    if (i16 < 1) {
                        throw new IllegalArgumentException("The pad width must be at least one but was " + i16);
                    }
                    DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f23672a;
                    dateTimeFormatterBuilder.f23676e = i16;
                    dateTimeFormatterBuilder.f23677f = ' ';
                    dateTimeFormatterBuilder.g = -1;
                    i16 = i13;
                    i3 = i12;
                } else {
                    i3 = i15;
                }
                j$.time.temporal.q qVar = (j$.time.temporal.q) f23671i.get(Character.valueOf(cCharAt));
                if (qVar == null) {
                    char c10 = cCharAt;
                    if (c10 == 'z') {
                        if (i16 > 4) {
                            throw new IllegalArgumentException("Too many pattern letters: " + c10);
                        }
                        if (i16 == 4) {
                            c(new u(F.FULL, false));
                        } else {
                            c(new u(F.SHORT, false));
                        }
                    } else if (c10 == 'V') {
                        if (i16 != 2) {
                            throw new IllegalArgumentException("Pattern letter count must be 2: " + c10);
                        }
                        c(new t(j$.time.temporal.r.f23802a, "ZoneId()"));
                    } else if (c10 != 'v') {
                        String str2 = "+0000";
                        if (c10 == 'Z') {
                            if (i16 < 4) {
                                appendOffset("+HHMM", "+0000");
                            } else if (i16 == 4) {
                                f(F.FULL);
                            } else {
                                if (i16 != 5) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + c10);
                                }
                                appendOffset("+HH:MM:ss", "Z");
                            }
                        } else if (c10 == 'O') {
                            if (i16 == 1) {
                                f(F.SHORT);
                            } else {
                                if (i16 != 4) {
                                    throw new IllegalArgumentException("Pattern letter count must be 1 or 4: " + c10);
                                }
                                f(F.FULL);
                            }
                        } else if (c10 == 'X') {
                            if (i16 > 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + c10);
                            }
                            appendOffset(k.f23703d[i16 + (i16 == 1 ? 0 : 1)], "Z");
                        } else if (c10 == 'x') {
                            if (i16 > 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + c10);
                            }
                            if (i16 == 1) {
                                str2 = "+00";
                            } else if (i16 % 2 != 0) {
                                str2 = "+00:00";
                            }
                            appendOffset(k.f23703d[i16 + (i16 == 1 ? 0 : 1)], str2);
                        } else if (c10 != 'W') {
                            int i17 = i16;
                            if (c10 == 'w') {
                                if (i17 > 2) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + c10);
                                }
                                j(new s(c10, i17, i17, 2, 0));
                            } else {
                                if (c10 != 'Y') {
                                    throw new IllegalArgumentException("Unknown pattern letter: " + c10);
                                }
                                if (i17 == 2) {
                                    j(new s(c10, i17, i17, 2, 0));
                                } else {
                                    j(new s(c10, i17, i17, 19, 0));
                                }
                            }
                        } else {
                            if (i16 > 1) {
                                throw new IllegalArgumentException("Too many pattern letters: " + c10);
                            }
                            j(new s(c10, i16, i16, i16, 0));
                        }
                    } else if (i16 == 1) {
                        c(new u(F.SHORT, true));
                    } else {
                        if (i16 != 4) {
                            throw new IllegalArgumentException("Wrong number of  pattern letters: " + c10);
                        }
                        c(new u(F.FULL, true));
                    }
                } else if (cCharAt == 'A') {
                    m(qVar, i16, 19, E.NOT_NEGATIVE);
                } else if (cCharAt == 'Q') {
                    i9 = i16;
                    cCharAt = cCharAt;
                    z6 = false;
                    if (i9 == 1 || i9 == 2) {
                        if (cCharAt == 'e') {
                            j(new s(cCharAt, i9, i9, i9, 0));
                        } else {
                            i10 = i9;
                            if (cCharAt == 'E') {
                                i(qVar, F.SHORT);
                            } else if (i10 == 1) {
                                k(qVar);
                            } else {
                                l(qVar, 2);
                            }
                        }
                    } else if (i9 == 3) {
                        i(qVar, z6 ? F.SHORT_STANDALONE : F.SHORT);
                    } else if (i9 == 4) {
                        i(qVar, z6 ? F.FULL_STANDALONE : F.FULL);
                    } else {
                        if (i9 != 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        i(qVar, z6 ? F.NARROW_STANDALONE : F.NARROW);
                    }
                } else if (cCharAt == 'S') {
                    int i18 = i16;
                    b(j$.time.temporal.a.NANO_OF_SECOND, i18, i18, false);
                } else if (cCharAt == 'a') {
                    char c11 = cCharAt;
                    if (i16 != 1) {
                        throw new IllegalArgumentException("Too many pattern letters: " + c11);
                    }
                    i(qVar, F.SHORT);
                } else if (cCharAt == 'k') {
                    i11 = i16;
                    c9 = cCharAt;
                    if (i11 == 1) {
                        k(qVar);
                    } else {
                        if (i11 == 2) {
                            throw new IllegalArgumentException("Too many pattern letters: " + c9);
                        }
                        l(qVar, i11);
                    }
                } else if (cCharAt == 'q') {
                    i9 = i16;
                    z6 = true;
                    if (i9 == 1) {
                        if (cCharAt == 'e') {
                            j(new s(cCharAt, i9, i9, i9, 0));
                        } else {
                            i10 = i9;
                            if (cCharAt == 'E') {
                                i(qVar, F.SHORT);
                            } else if (i10 == 1) {
                                k(qVar);
                            } else {
                                l(qVar, 2);
                            }
                        }
                    } else if (cCharAt == 'e') {
                        j(new s(cCharAt, i9, i9, i9, 0));
                    } else {
                        i10 = i9;
                        if (cCharAt == 'E') {
                            i(qVar, F.SHORT);
                        } else if (i10 == 1) {
                            k(qVar);
                        } else {
                            l(qVar, 2);
                        }
                    }
                } else if (cCharAt == 's') {
                    i11 = i16;
                    c9 = cCharAt;
                    if (i11 == 1) {
                        k(qVar);
                    } else {
                        if (i11 == 2) {
                            throw new IllegalArgumentException("Too many pattern letters: " + c9);
                        }
                        l(qVar, i11);
                    }
                } else if (cCharAt == 'u' || cCharAt == 'y') {
                    int i19 = i16;
                    if (i19 == 2) {
                        LocalDate localDate = p.f23722h;
                        Objects.requireNonNull(localDate, "baseDate");
                        j(new p(qVar, 2, 2, localDate, 0));
                    } else if (i19 < 4) {
                        m(qVar, i19, 19, E.NORMAL);
                    } else {
                        m(qVar, i19, 19, E.EXCEEDS_PAD);
                    }
                } else if (cCharAt == 'g') {
                    m(qVar, i16, 19, E.NORMAL);
                } else if (cCharAt == 'h' || cCharAt == 'm') {
                    i11 = i16;
                    c9 = cCharAt;
                    if (i11 == 1) {
                        k(qVar);
                    } else {
                        if (i11 == 2) {
                            throw new IllegalArgumentException("Too many pattern letters: " + c9);
                        }
                        l(qVar, i11);
                    }
                } else if (cCharAt != 'n') {
                    switch (cCharAt) {
                        case 'D':
                            int i20 = i16;
                            char c12 = cCharAt;
                            if (i20 == 1) {
                                k(qVar);
                            } else {
                                if (i20 != 2 && i20 != 3) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + c12);
                                }
                                m(qVar, i20, 3, E.NOT_NEGATIVE);
                            }
                            break;
                        case 'E':
                            i9 = i16;
                            cCharAt = cCharAt;
                            z6 = false;
                            if (i9 == 1) {
                                if (cCharAt == 'e') {
                                    i10 = i9;
                                    if (cCharAt == 'E') {
                                        i(qVar, F.SHORT);
                                    } else if (i10 == 1) {
                                        l(qVar, 2);
                                    } else {
                                        k(qVar);
                                    }
                                } else {
                                    j(new s(cCharAt, i9, i9, i9, 0));
                                }
                            } else if (cCharAt == 'e') {
                                i10 = i9;
                                if (cCharAt == 'E') {
                                    i(qVar, F.SHORT);
                                } else if (i10 == 1) {
                                    l(qVar, 2);
                                } else {
                                    k(qVar);
                                }
                            } else {
                                j(new s(cCharAt, i9, i9, i9, 0));
                            }
                            break;
                        case MPVLib.MPV_LOG_LEVEL_TRACE:
                            char c13 = cCharAt;
                            if (i16 != 1) {
                                throw new IllegalArgumentException("Too many pattern letters: " + c13);
                            }
                            k(qVar);
                            break;
                            break;
                        case TsExtractor.TS_SYNC_BYTE:
                            int i21 = i16;
                            char c14 = cCharAt;
                            if (i21 == 1 || i21 == 2 || i21 == 3) {
                                i(qVar, F.SHORT);
                            } else if (i21 == 4) {
                                i(qVar, F.FULL);
                            } else {
                                if (i21 != 5) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + c14);
                                }
                                i(qVar, F.NARROW);
                            }
                            break;
                        case 'H':
                            i11 = i16;
                            c9 = cCharAt;
                            if (i11 == 1) {
                                k(qVar);
                            } else {
                                if (i11 == 2) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + c9);
                                }
                                l(qVar, i11);
                            }
                            break;
                        default:
                            switch (cCharAt) {
                                case MdtaMetadataEntry.TYPE_INDICATOR_8_BIT_UNSIGNED_INT:
                                    i11 = i16;
                                    c9 = cCharAt;
                                    if (i11 == 1) {
                                        k(qVar);
                                    } else {
                                        if (i11 == 2) {
                                            throw new IllegalArgumentException("Too many pattern letters: " + c9);
                                        }
                                        l(qVar, i11);
                                    }
                                    break;
                                case 'L':
                                    i9 = i16;
                                    z6 = true;
                                    if (i9 == 1) {
                                        if (cCharAt == 'e') {
                                            i10 = i9;
                                            if (cCharAt == 'E') {
                                                i(qVar, F.SHORT);
                                            } else if (i10 == 1) {
                                                l(qVar, 2);
                                            } else {
                                                k(qVar);
                                            }
                                        } else {
                                            j(new s(cCharAt, i9, i9, i9, 0));
                                        }
                                    } else if (cCharAt == 'e') {
                                        i10 = i9;
                                        if (cCharAt == 'E') {
                                            i(qVar, F.SHORT);
                                        } else if (i10 == 1) {
                                            l(qVar, 2);
                                        } else {
                                            k(qVar);
                                        }
                                    } else {
                                        j(new s(cCharAt, i9, i9, i9, 0));
                                    }
                                    break;
                                case 'M':
                                    i9 = i16;
                                    cCharAt = cCharAt;
                                    z6 = false;
                                    if (i9 == 1) {
                                        if (cCharAt == 'e') {
                                            i10 = i9;
                                            if (cCharAt == 'E') {
                                                i(qVar, F.SHORT);
                                            } else if (i10 == 1) {
                                                l(qVar, 2);
                                            } else {
                                                k(qVar);
                                            }
                                        } else {
                                            j(new s(cCharAt, i9, i9, i9, 0));
                                        }
                                    } else if (cCharAt == 'e') {
                                        i10 = i9;
                                        if (cCharAt == 'E') {
                                            i(qVar, F.SHORT);
                                        } else if (i10 == 1) {
                                            l(qVar, 2);
                                        } else {
                                            k(qVar);
                                        }
                                    } else {
                                        j(new s(cCharAt, i9, i9, i9, 0));
                                    }
                                    break;
                                case MdtaMetadataEntry.TYPE_INDICATOR_UNSIGNED_INT64:
                                    m(qVar, i16, 19, E.NOT_NEGATIVE);
                                    break;
                                default:
                                    switch (cCharAt) {
                                        case 'c':
                                            if (i16 != 1) {
                                                i9 = i16;
                                                if (i9 == 2) {
                                                    throw new IllegalArgumentException("Invalid pattern \"cc\"");
                                                }
                                                z6 = true;
                                                if (i9 == 1) {
                                                    if (cCharAt == 'e') {
                                                        i10 = i9;
                                                        if (cCharAt == 'E') {
                                                            i(qVar, F.SHORT);
                                                        } else if (i10 == 1) {
                                                            l(qVar, 2);
                                                        } else {
                                                            k(qVar);
                                                        }
                                                    } else {
                                                        j(new s(cCharAt, i9, i9, i9, 0));
                                                    }
                                                } else if (cCharAt == 'e') {
                                                    i10 = i9;
                                                    if (cCharAt == 'E') {
                                                        i(qVar, F.SHORT);
                                                    } else if (i10 == 1) {
                                                        l(qVar, 2);
                                                    } else {
                                                        k(qVar);
                                                    }
                                                } else {
                                                    j(new s(cCharAt, i9, i9, i9, 0));
                                                }
                                            } else {
                                                j(new s(cCharAt, i16, i16, i16, 0));
                                            }
                                            break;
                                        case 'd':
                                            i11 = i16;
                                            c9 = cCharAt;
                                            if (i11 == 1) {
                                                k(qVar);
                                            } else {
                                                if (i11 == 2) {
                                                    throw new IllegalArgumentException("Too many pattern letters: " + c9);
                                                }
                                                l(qVar, i11);
                                            }
                                            break;
                                        case 'e':
                                            i9 = i16;
                                            cCharAt = cCharAt;
                                            z6 = false;
                                            if (i9 == 1) {
                                                if (cCharAt == 'e') {
                                                    i10 = i9;
                                                    if (cCharAt == 'E') {
                                                        i(qVar, F.SHORT);
                                                    } else if (i10 == 1) {
                                                        l(qVar, 2);
                                                    } else {
                                                        k(qVar);
                                                    }
                                                } else {
                                                    j(new s(cCharAt, i9, i9, i9, 0));
                                                }
                                            } else if (cCharAt == 'e') {
                                                i10 = i9;
                                                if (cCharAt == 'E') {
                                                    i(qVar, F.SHORT);
                                                } else if (i10 == 1) {
                                                    l(qVar, 2);
                                                } else {
                                                    k(qVar);
                                                }
                                            } else {
                                                j(new s(cCharAt, i9, i9, i9, 0));
                                            }
                                            break;
                                        default:
                                            if (i16 != 1) {
                                                l(qVar, i16);
                                            } else {
                                                k(qVar);
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    m(qVar, i16, 19, E.NOT_NEGATIVE);
                }
                i14 = i3 - 1;
            } else if (cCharAt == '\'') {
                int i22 = i14 + 1;
                int i23 = i22;
                while (i23 < str.length()) {
                    if (str.charAt(i23) == '\'') {
                        int i24 = i23 + 1;
                        if (i24 < str.length() && str.charAt(i24) == '\'') {
                            i23 = i24;
                        } else {
                            if (i23 < str.length()) {
                                throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                            }
                            strSubstring = str.substring(i22, i23);
                            if (strSubstring.isEmpty()) {
                                d('\'');
                            } else {
                                e(strSubstring.replace("''", "'"));
                            }
                            i14 = i23;
                        }
                    }
                    i23++;
                }
                if (i23 < str.length()) {
                    throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                }
                strSubstring = str.substring(i22, i23);
                if (strSubstring.isEmpty()) {
                    d('\'');
                } else {
                    e(strSubstring.replace("''", "'"));
                }
                i14 = i23;
            } else if (cCharAt == '[') {
                o();
            } else if (cCharAt == ']') {
                if (this.f23672a.f23673b == null) {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                n();
            } else {
                if (cCharAt == '{' || cCharAt == '}' || cCharAt == '#') {
                    throw new IllegalArgumentException("Pattern includes reserved character: '" + cCharAt + "'");
                }
                d(cCharAt);
            }
            i14++;
        }
    }

    public final void o() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f23672a;
        dateTimeFormatterBuilder.g = -1;
        this.f23672a = new DateTimeFormatterBuilder(dateTimeFormatterBuilder);
    }

    public final void n() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f23672a;
        if (dateTimeFormatterBuilder.f23673b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (dateTimeFormatterBuilder.f23674c.size() > 0) {
            DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.f23672a;
            C2507d c2507d = new C2507d(dateTimeFormatterBuilder2.f23674c, dateTimeFormatterBuilder2.f23675d);
            this.f23672a = this.f23672a.f23673b;
            c(c2507d);
            return;
        }
        this.f23672a = this.f23672a.f23673b;
    }

    public final int c(InterfaceC2508e interfaceC2508e) {
        Objects.requireNonNull(interfaceC2508e, "pp");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f23672a;
        int i3 = dateTimeFormatterBuilder.f23676e;
        if (i3 > 0) {
            l lVar = new l(interfaceC2508e, i3, dateTimeFormatterBuilder.f23677f);
            dateTimeFormatterBuilder.f23676e = 0;
            dateTimeFormatterBuilder.f23677f = (char) 0;
            interfaceC2508e = lVar;
        }
        dateTimeFormatterBuilder.f23674c.add(interfaceC2508e);
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.f23672a;
        dateTimeFormatterBuilder2.g = -1;
        return dateTimeFormatterBuilder2.f23674c.size() - 1;
    }

    public DateTimeFormatter toFormatter() {
        return q(Locale.getDefault(), D.SMART, null);
    }

    public final DateTimeFormatter p(D d4, j$.time.chrono.s sVar) {
        return q(Locale.getDefault(), d4, sVar);
    }

    public final DateTimeFormatter q(Locale locale, D d4, j$.time.chrono.s sVar) {
        Objects.requireNonNull(locale, Device.JsonKeys.LOCALE);
        while (this.f23672a.f23673b != null) {
            n();
        }
        return new DateTimeFormatter(new C2507d(this.f23674c, false), locale, B.f23653a, d4, sVar, null);
    }
}
