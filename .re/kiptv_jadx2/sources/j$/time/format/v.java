package j$.time.format;

import j$.time.ZoneId;
import java.util.ArrayList;
import java.util.Objects;

public final class v {

    public final DateTimeFormatter f23737a;

    public boolean f23738b = true;

    public boolean f23739c = true;

    public final ArrayList f23740d;

    public ArrayList f23741e;

    public v(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.f23740d = arrayList;
        this.f23741e = null;
        this.f23737a = dateTimeFormatter;
        arrayList.add(new C());
    }

    public final j$.time.chrono.l d() {
        j$.time.chrono.l lVar = c().f23656c;
        if (lVar != null) {
            return lVar;
        }
        j$.time.chrono.s sVar = this.f23737a.f23668e;
        return sVar == null ? j$.time.chrono.s.f23629c : sVar;
    }

    public final boolean a(char c9, char c10) {
        if (this.f23738b) {
            return c9 == c10;
        }
        return b(c9, c10);
    }

    public final boolean h(CharSequence charSequence, int i3, CharSequence charSequence2, int i9, int i10) {
        if (i3 + i10 <= charSequence.length() && i9 + i10 <= charSequence2.length()) {
            if (this.f23738b) {
                for (int i11 = 0; i11 < i10; i11++) {
                    if (charSequence.charAt(i3 + i11) == charSequence2.charAt(i9 + i11)) {
                    }
                }
                return true;
            }
            for (int i12 = 0; i12 < i10; i12++) {
                char cCharAt = charSequence.charAt(i3 + i12);
                char cCharAt2 = charSequence2.charAt(i9 + i12);
                if (cCharAt == cCharAt2 || Character.toUpperCase(cCharAt) == Character.toUpperCase(cCharAt2) || Character.toLowerCase(cCharAt) == Character.toLowerCase(cCharAt2)) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean b(char c9, char c10) {
        return c9 == c10 || Character.toUpperCase(c9) == Character.toUpperCase(c10) || Character.toLowerCase(c9) == Character.toLowerCase(c10);
    }

    public final C c() {
        ArrayList arrayList = this.f23740d;
        return (C) arrayList.get(arrayList.size() - 1);
    }

    public final Long e(j$.time.temporal.a aVar) {
        return (Long) c().f23654a.get(aVar);
    }

    public final int g(j$.time.temporal.q qVar, long j, int i3, int i9) {
        Objects.requireNonNull(qVar, "field");
        Long l2 = (Long) c().f23654a.put(qVar, Long.valueOf(j));
        return (l2 == null || l2.longValue() == j) ? i9 : ~i3;
    }

    public final void f(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        c().f23655b = zoneId;
    }

    public final String toString() {
        return c().toString();
    }
}
