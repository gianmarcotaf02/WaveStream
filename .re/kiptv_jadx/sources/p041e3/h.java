package p041e3;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f21389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f21390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p041e3.k f21391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f21392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f21393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f21394f;

    public h(java.lang.String str, java.lang.Integer num, p041e3.k kVar, long j, long j9, java.util.HashMap map) {
        this.f21389a = str;
        this.f21390b = num;
        this.f21391c = kVar;
        this.f21392d = j;
        this.f21393e = j9;
        this.f21394f = map;
    }

    public final java.lang.String a(java.lang.String str) {
        java.lang.String str2 = (java.lang.String) this.f21394f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(java.lang.String str) {
        java.lang.String str2 = (java.lang.String) this.f21394f.get(str);
        if (str2 == null) {
            return 0;
        }
        return java.lang.Integer.valueOf(str2).intValue();
    }

    public final Z2.C0 c() {
        Z2.C0 c9 = new Z2.C0();
        java.lang.String str = this.f21389a;
        if (str == null) {
            throw new java.lang.NullPointerException("Null transportName");
        }
        c9.f12655a = str;
        c9.f12656b = this.f21390b;
        p041e3.k kVar = this.f21391c;
        if (kVar == null) {
            throw new java.lang.NullPointerException("Null encodedPayload");
        }
        c9.f12657c = kVar;
        c9.f12658d = java.lang.Long.valueOf(this.f21392d);
        c9.f12659e = java.lang.Long.valueOf(this.f21393e);
        c9.f12660f = new java.util.HashMap(this.f21394f);
        return c9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p041e3.h)) {
            return false;
        }
        p041e3.h hVar = (p041e3.h) obj;
        if (!this.f21389a.equals(hVar.f21389a)) {
            return false;
        }
        java.lang.Integer num = hVar.f21390b;
        java.lang.Integer num2 = this.f21390b;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        return this.f21391c.equals(hVar.f21391c) && this.f21392d == hVar.f21392d && this.f21393e == hVar.f21393e && this.f21394f.equals(hVar.f21394f);
    }

    public final int hashCode() {
        int iHashCode = (this.f21389a.hashCode() ^ 1000003) * 1000003;
        java.lang.Integer num = this.f21390b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f21391c.hashCode()) * 1000003;
        long j = this.f21392d;
        int i3 = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j9 = this.f21393e;
        return ((i3 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ this.f21394f.hashCode();
    }

    public final java.lang.String toString() {
        return "EventInternal{transportName=" + this.f21389a + ", code=" + this.f21390b + ", encodedPayload=" + this.f21391c + ", eventMillis=" + this.f21392d + ", uptimeMillis=" + this.f21393e + ", autoMetadata=" + this.f21394f + "}";
    }
}
