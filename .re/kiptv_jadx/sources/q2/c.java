package q2;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p114n2.C2650i f26580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p114n2.t f26581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f26582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.EnumC1533o f26583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p114n2.C2654m f26584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f26585f;
    public final android.os.Bundle g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p079i7.f f26586h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f26587i;
    public final androidx.lifecycle.C1542y j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public androidx.lifecycle.EnumC1533o f26588k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final androidx.lifecycle.a0 f26589l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p070h6.p f26590m;

    public c(p114n2.C2650i entry) {
        kotlin.jvm.internal.m.e(entry, "entry");
        this.f26580a = entry;
        this.f26581b = entry.f25625i;
        this.f26582c = entry.j;
        this.f26583d = entry.f25626k;
        this.f26584e = entry.f25627l;
        this.f26585f = entry.f25628m;
        this.g = entry.f25629n;
        this.f26586h = new p079i7.f(new p177v2.a(entry, new p077i5.C2237d(23, entry)));
        p070h6.p pVarB = com.google.common.util.concurrent.D.B(new io.ktor.http.a(20));
        this.j = new androidx.lifecycle.C1542y(entry);
        this.f26588k = androidx.lifecycle.EnumC1533o.f16365i;
        this.f26589l = (androidx.lifecycle.a0) pVarB.getValue();
        this.f26590m = com.google.common.util.concurrent.D.B(new io.ktor.http.a(21));
    }

    public final android.os.Bundle a() {
        android.os.Bundle bundle = this.f26582c;
        if (bundle == null) {
            return null;
        }
        android.os.Bundle bundleI = com.google.android.gms.internal.play_billing.V0.i((p070h6.k[]) java.util.Arrays.copyOf(new p070h6.k[0], 0));
        bundleI.putAll(bundle);
        return bundleI;
    }

    public final void b() {
        if (!this.f26587i) {
            p079i7.f fVar = this.f26586h;
            fVar.O0();
            this.f26587i = true;
            if (this.f26584e != null) {
                androidx.lifecycle.X.c(this.f26580a);
            }
            fVar.P0(this.g);
        }
        int iOrdinal = this.f26583d.ordinal();
        int iOrdinal2 = this.f26588k.ordinal();
        androidx.lifecycle.C1542y c1542y = this.j;
        if (iOrdinal < iOrdinal2) {
            c1542y.g(this.f26583d);
        } else {
            c1542y.g(this.f26588k);
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlin.jvm.internal.B.f24540a.b(this.f26580a.getClass()).h());
        sb.append("(" + this.f26585f + ')');
        sb.append(" destination=");
        sb.append(this.f26581b);
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }
}
