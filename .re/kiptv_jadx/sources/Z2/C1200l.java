package Z2;

/* JADX INFO: renamed from: Z2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1200l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Z2.C1204n f12895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Z2.V f12896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12897c;

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(java.lang.String.valueOf(this.f12895a));
        sb.append(" {...} (src=");
        int i3 = this.f12897c;
        if (i3 != 1) {
            str = i3 != 2 ? "null" : "RenderOptions";
        } else {
            str = "Document";
        }
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
