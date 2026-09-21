package A1;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.List f134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f135e;

    public e(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list) {
        str.getClass();
        this.f131a = str;
        str2.getClass();
        this.f132b = str2;
        this.f133c = str3;
        list.getClass();
        this.f134d = list;
        this.f135e = str + "-" + str2 + "-" + str3;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f131a + ", mProviderPackage: " + this.f132b + ", mQuery: " + this.f133c + ", mCertificates:");
        int i3 = 0;
        while (true) {
            java.util.List list = this.f134d;
            if (i3 >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            java.util.List list2 = (java.util.List) list.get(i3);
            for (int i9 = 0; i9 < list2.size(); i9++) {
                sb.append(" \"");
                sb.append(android.util.Base64.encodeToString((byte[]) list2.get(i9), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i3++;
        }
    }
}
