package Y2;

/* JADX INFO: renamed from: Y2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1040j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.String f11479c;

    public static D8.x a() {
        D8.x xVar = new D8.x(3);
        xVar.j = 0;
        xVar.f2610k = "";
        return xVar;
    }

    public final java.lang.String toString() {
        int i3 = this.f11477a;
        int i9 = com.google.android.gms.internal.play_billing.AbstractC1872t.f19388a;
        com.google.android.gms.internal.play_billing.A a2 = com.google.android.gms.internal.play_billing.EnumC1843h.j;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i3);
        return B2.a.m("Response Code: ", (!a2.containsKey(numValueOf) ? com.google.android.gms.internal.play_billing.EnumC1843h.RESPONSE_CODE_UNSPECIFIED : (com.google.android.gms.internal.play_billing.EnumC1843h) a2.get(numValueOf)).toString(), ", Debug Message: ", this.f11479c);
    }
}
