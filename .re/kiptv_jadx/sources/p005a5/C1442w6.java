package p005a5;

/* JADX INFO: renamed from: a5.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1442w6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f15253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f15254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f15255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f15256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Integer f15257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Integer f15258f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f15259h;

    public C1442w6(java.lang.String str, java.lang.String str2, java.lang.String name, java.lang.String str3, java.lang.Integer num, java.lang.Integer num2, boolean z6, boolean z9) {
        kotlin.jvm.internal.m.e(name, "name");
        this.f15253a = str;
        this.f15254b = str2;
        this.f15255c = name;
        this.f15256d = str3;
        this.f15257e = num;
        this.f15258f = num2;
        this.g = z6;
        this.f15259h = z9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.C1442w6)) {
            return false;
        }
        p005a5.C1442w6 c1442w6 = (p005a5.C1442w6) obj;
        return kotlin.jvm.internal.m.a(this.f15253a, c1442w6.f15253a) && kotlin.jvm.internal.m.a(this.f15254b, c1442w6.f15254b) && kotlin.jvm.internal.m.a(this.f15255c, c1442w6.f15255c) && kotlin.jvm.internal.m.a(this.f15256d, c1442w6.f15256d) && kotlin.jvm.internal.m.a(this.f15257e, c1442w6.f15257e) && kotlin.jvm.internal.m.a(this.f15258f, c1442w6.f15258f) && this.g == c1442w6.g && this.f15259h == c1442w6.f15259h;
    }

    public final int hashCode() {
        int iA = B2.a.a(B2.a.a(this.f15253a.hashCode() * 31, 31, this.f15254b), 31, this.f15255c);
        java.lang.String str = this.f15256d;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Integer num = this.f15257e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.f15258f;
        return java.lang.Boolean.hashCode(this.f15259h) + p121o0.p.f((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.g);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ListRef(id=");
        sb.append(this.f15253a);
        sb.append(", owner=");
        sb.append(this.f15254b);
        sb.append(", name=");
        sb.append(this.f15255c);
        sb.append(", ownerName=");
        sb.append(this.f15256d);
        sb.append(", itemCount=");
        sb.append(this.f15257e);
        sb.append(", likes=");
        sb.append(this.f15258f);
        sb.append(", isOfficial=");
        sb.append(this.g);
        sb.append(", isMine=");
        return com.google.android.gms.internal.play_billing.M0.o(sb, this.f15259h, ")");
    }
}
