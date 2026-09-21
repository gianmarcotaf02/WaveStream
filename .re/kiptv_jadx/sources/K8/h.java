package K8;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f7009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f7011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f7012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f7013f;

    public h(boolean z6, java.lang.Integer num, boolean z9, java.lang.Integer num2, boolean z10, boolean z11) {
        this.f7008a = z6;
        this.f7009b = num;
        this.f7010c = z9;
        this.f7011d = num2;
        this.f7012e = z10;
        this.f7013f = z11;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K8.h)) {
            return false;
        }
        K8.h hVar = (K8.h) obj;
        return this.f7008a == hVar.f7008a && kotlin.jvm.internal.m.a(this.f7009b, hVar.f7009b) && this.f7010c == hVar.f7010c && kotlin.jvm.internal.m.a(this.f7011d, hVar.f7011d) && this.f7012e == hVar.f7012e && this.f7013f == hVar.f7013f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final int hashCode() {
        boolean z6 = this.f7008a;
        ?? r9 = z6;
        if (z6) {
            r9 = 1;
        }
        int i3 = r9 * 31;
        java.lang.Integer num = this.f7009b;
        int iHashCode = (i3 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z9 = this.f7010c;
        ?? r10 = z9;
        if (z9) {
            r10 = 1;
        }
        int i9 = (iHashCode + r10) * 31;
        java.lang.Integer num2 = this.f7011d;
        int iHashCode2 = (i9 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z10 = this.f7012e;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int i10 = (iHashCode2 + r11) * 31;
        boolean z11 = this.f7013f;
        return i10 + (z11 ? 1 : z11);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb.append(this.f7008a);
        sb.append(", clientMaxWindowBits=");
        sb.append(this.f7009b);
        sb.append(", clientNoContextTakeover=");
        sb.append(this.f7010c);
        sb.append(", serverMaxWindowBits=");
        sb.append(this.f7011d);
        sb.append(", serverNoContextTakeover=");
        sb.append(this.f7012e);
        sb.append(", unknownValues=");
        return v5.L.a(sb, this.f7013f, ')');
    }
}
