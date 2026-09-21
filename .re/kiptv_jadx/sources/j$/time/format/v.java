package j$.time.format;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.time.format.DateTimeFormatter f23737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23738b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23739c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f23740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f23741e;

    public v(j$.time.format.DateTimeFormatter dateTimeFormatter) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f23740d = arrayList;
        this.f23741e = null;
        this.f23737a = dateTimeFormatter;
        arrayList.add(new j$.time.format.C());
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

    public final boolean h(java.lang.CharSequence charSequence, int i3, java.lang.CharSequence charSequence2, int i9, int i10) {
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
                if (cCharAt == cCharAt2 || java.lang.Character.toUpperCase(cCharAt) == java.lang.Character.toUpperCase(cCharAt2) || java.lang.Character.toLowerCase(cCharAt) == java.lang.Character.toLowerCase(cCharAt2)) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean b(char c9, char c10) {
        return c9 == c10 || java.lang.Character.toUpperCase(c9) == java.lang.Character.toUpperCase(c10) || java.lang.Character.toLowerCase(c9) == java.lang.Character.toLowerCase(c10);
    }

    public final j$.time.format.C c() {
        java.util.ArrayList arrayList = this.f23740d;
        return (j$.time.format.C) arrayList.get(arrayList.size() - 1);
    }

    public final java.lang.Long e(j$.time.temporal.a aVar) {
        return (java.lang.Long) c().f23654a.get(aVar);
    }

    public final int g(j$.time.temporal.q qVar, long j, int i3, int i9) {
        java.util.Objects.requireNonNull(qVar, "field");
        java.lang.Long l2 = (java.lang.Long) c().f23654a.put(qVar, java.lang.Long.valueOf(j));
        return (l2 == null || l2.longValue() == j) ? i9 : ~i3;
    }

    public final void f(j$.time.ZoneId zoneId) {
        java.util.Objects.requireNonNull(zoneId, "zone");
        c().f23655b = zoneId;
    }

    public final java.lang.String toString() {
        return c().toString();
    }
}
