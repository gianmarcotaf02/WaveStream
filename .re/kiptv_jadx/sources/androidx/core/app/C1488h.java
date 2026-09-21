package androidx.core.app;

/* JADX INFO: renamed from: androidx.core.app.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1488h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.core.graphics.drawable.IconCompat f16025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f16026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.app.PendingIntent f16027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f16028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final android.os.Bundle f16029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f16030f;
    public final boolean g;

    public C1488h(int i3, android.app.PendingIntent pendingIntent, java.lang.String str) {
        this(i3 != 0 ? androidx.core.graphics.drawable.IconCompat.e(null, "", i3) : null, str, pendingIntent, new android.os.Bundle());
    }

    public final androidx.core.app.C1489i a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = this.f16030f;
        if (arrayList3 != null) {
            java.util.Iterator it = arrayList3.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new java.lang.ClassCastException();
            }
        }
        return new androidx.core.app.C1489i(this.f16025a, this.f16026b, this.f16027c, this.f16029e, arrayList2.isEmpty() ? null : (androidx.core.app.M[]) arrayList2.toArray(new androidx.core.app.M[arrayList2.size()]), arrayList.isEmpty() ? null : (androidx.core.app.M[]) arrayList.toArray(new androidx.core.app.M[arrayList.size()]), this.f16028d, this.g);
    }

    public C1488h(androidx.core.graphics.drawable.IconCompat iconCompat, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent, android.os.Bundle bundle) {
        this.f16028d = true;
        this.g = true;
        this.f16025a = iconCompat;
        this.f16026b = androidx.core.app.n.b(charSequence);
        this.f16027c = pendingIntent;
        this.f16029e = bundle;
        this.f16030f = null;
        this.f16028d = true;
        this.g = true;
    }
}
