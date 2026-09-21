package androidx.core.app;

/* JADX INFO: renamed from: androidx.core.app.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1489i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.os.Bundle f16031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.core.graphics.drawable.IconCompat f16032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.core.app.M[] f16033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f16034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16036f;
    public final java.lang.CharSequence g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.app.PendingIntent f16037h;

    public C1489i(int i3, android.app.PendingIntent pendingIntent, java.lang.String str) {
        this(i3 != 0 ? androidx.core.graphics.drawable.IconCompat.e(null, "", i3) : null, str, pendingIntent);
    }

    public final androidx.core.graphics.drawable.IconCompat a() {
        int i3;
        if (this.f16032b == null && (i3 = this.f16036f) != 0) {
            this.f16032b = androidx.core.graphics.drawable.IconCompat.e(null, "", i3);
        }
        return this.f16032b;
    }

    public C1489i(androidx.core.graphics.drawable.IconCompat iconCompat, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
        this(iconCompat, charSequence, pendingIntent, new android.os.Bundle(), null, null, true, true);
    }

    public C1489i(androidx.core.graphics.drawable.IconCompat iconCompat, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent, android.os.Bundle bundle, androidx.core.app.M[] mArr, androidx.core.app.M[] mArr2, boolean z6, boolean z9) {
        this.f16035e = true;
        this.f16032b = iconCompat;
        if (iconCompat != null) {
            int i3 = iconCompat.f16077a;
            if ((i3 == -1 ? com.google.common.util.concurrent.P.e0(iconCompat.f16078b) : i3) == 2) {
                this.f16036f = iconCompat.f();
            }
        }
        this.g = androidx.core.app.n.b(charSequence);
        this.f16037h = pendingIntent;
        this.f16031a = bundle == null ? new android.os.Bundle() : bundle;
        this.f16033c = mArr;
        this.f16034d = z6;
        this.f16035e = z9;
    }
}
