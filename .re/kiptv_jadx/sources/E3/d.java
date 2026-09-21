package E3;

/* JADX INFO: loaded from: classes.dex */
public class d extends java.lang.Exception {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.google.android.gms.common.api.Status f2825h;

    public d(com.google.android.gms.common.api.Status status) {
        int i3 = status.f18690h;
        java.lang.String str = status.f18691i;
        str = str == null ? "" : str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i3).length() + 2 + java.lang.String.valueOf(str).length());
        sb.append(i3);
        sb.append(": ");
        sb.append(str);
        super(sb.toString());
        this.f2825h = status;
    }
}
