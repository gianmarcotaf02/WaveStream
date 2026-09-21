package j$.time.format;

/* JADX INFO: loaded from: classes3.dex */
public class t implements j$.time.format.InterfaceC2508e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile java.util.AbstractMap.SimpleImmutableEntry f23729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile java.util.AbstractMap.SimpleImmutableEntry f23730d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.time.temporal.TemporalQuery f23731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f23732b;

    public j$.time.format.n a(j$.time.format.v vVar) {
        java.util.Set<java.lang.String> set = j$.time.zone.i.f23865d;
        int size = set.size();
        java.util.AbstractMap.SimpleImmutableEntry simpleImmutableEntry = vVar.f23738b ? f23729c : f23730d;
        if (simpleImmutableEntry == null || ((java.lang.Integer) simpleImmutableEntry.getKey()).intValue() != size) {
            synchronized (this) {
                try {
                    simpleImmutableEntry = vVar.f23738b ? f23729c : f23730d;
                    if (simpleImmutableEntry == null || ((java.lang.Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                        java.lang.Integer numValueOf = java.lang.Integer.valueOf(size);
                        j$.time.format.n nVar = vVar.f23738b ? new j$.time.format.n("", null, null) : new j$.time.format.m("", null, null);
                        for (java.lang.String str : set) {
                            nVar.a(str, str);
                        }
                        simpleImmutableEntry = new java.util.AbstractMap.SimpleImmutableEntry(numValueOf, nVar);
                        if (vVar.f23738b) {
                            f23729c = simpleImmutableEntry;
                        } else {
                            f23730d = simpleImmutableEntry;
                        }
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return (j$.time.format.n) simpleImmutableEntry.getValue();
    }

    public t(j$.time.temporal.TemporalQuery temporalQuery, java.lang.String str) {
        this.f23731a = temporalQuery;
        this.f23732b = str;
    }

    @Override // j$.time.format.InterfaceC2508e
    public boolean p(j$.time.format.x xVar, java.lang.StringBuilder sb) {
        j$.time.ZoneId zoneId = (j$.time.ZoneId) xVar.b(this.f23731a);
        if (zoneId == null) {
            return false;
        }
        sb.append(zoneId.s());
        return true;
    }

    @Override // j$.time.format.InterfaceC2508e
    public final int r(j$.time.format.v vVar, java.lang.CharSequence charSequence, int i3) {
        int i9;
        int length = charSequence.length();
        if (i3 > length) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        if (i3 == length) {
            return ~i3;
        }
        char cCharAt = charSequence.charAt(i3);
        if (cCharAt == '+' || cCharAt == '-') {
            return b(vVar, charSequence, i3, i3, j$.time.format.k.f23704e);
        }
        int i10 = i3 + 2;
        if (length >= i10) {
            char cCharAt2 = charSequence.charAt(i3 + 1);
            if (vVar.a(cCharAt, 'U') && vVar.a(cCharAt2, 'T')) {
                int i11 = i3 + 3;
                if (length >= i11 && vVar.a(charSequence.charAt(i10), 'C')) {
                    return b(vVar, charSequence, i3, i11, j$.time.format.k.f23705f);
                }
                return b(vVar, charSequence, i3, i10, j$.time.format.k.f23705f);
            }
            if (vVar.a(cCharAt, 'G') && length >= (i9 = i3 + 3) && vVar.a(cCharAt2, io.ktor.util.date.GMTDateParser.MONTH) && vVar.a(charSequence.charAt(i10), 'T')) {
                int i12 = i3 + 4;
                if (length >= i12 && vVar.a(charSequence.charAt(i9), '0')) {
                    vVar.f(j$.time.ZoneId.B("GMT0", true));
                    return i12;
                }
                return b(vVar, charSequence, i3, i9, j$.time.format.k.f23705f);
            }
        }
        j$.time.format.n nVarA = a(vVar);
        java.text.ParsePosition parsePosition = new java.text.ParsePosition(i3);
        java.lang.String strC = nVarA.c(charSequence, parsePosition);
        if (strC == null) {
            if (!vVar.a(cCharAt, 'Z')) {
                return ~i3;
            }
            vVar.f(j$.time.ZoneOffset.UTC);
            return i3 + 1;
        }
        vVar.f(j$.time.ZoneId.B(strC, true));
        return parsePosition.getIndex();
    }

    public static int b(j$.time.format.v vVar, java.lang.CharSequence charSequence, int i3, int i9, j$.time.format.k kVar) {
        java.lang.String upperCase = charSequence.subSequence(i3, i9).toString().toUpperCase();
        if (i9 >= charSequence.length()) {
            vVar.f(j$.time.ZoneId.B(upperCase, true));
            return i9;
        }
        if (charSequence.charAt(i9) != '0' && !vVar.a(charSequence.charAt(i9), 'Z')) {
            j$.time.format.v vVar2 = new j$.time.format.v(vVar.f23737a);
            vVar2.f23738b = vVar.f23738b;
            vVar2.f23739c = vVar.f23739c;
            int iR = kVar.r(vVar2, charSequence, i9);
            try {
                if (iR < 0) {
                    if (kVar == j$.time.format.k.f23704e) {
                        return ~i3;
                    }
                    vVar.f(j$.time.ZoneId.B(upperCase, true));
                    return i9;
                }
                vVar.f(j$.time.ZoneId.J(upperCase, j$.time.ZoneOffset.ofTotalSeconds((int) vVar2.e(j$.time.temporal.a.OFFSET_SECONDS).longValue())));
                return iR;
            } catch (j$.time.DateTimeException unused) {
                return ~i3;
            }
        }
        vVar.f(j$.time.ZoneId.B(upperCase, true));
        return i9;
    }

    public final java.lang.String toString() {
        return this.f23732b;
    }
}
