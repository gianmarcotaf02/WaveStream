package p150r5;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f26863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.graphics.Bitmap f26864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f26866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f26867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f26868f;

    public /* synthetic */ c(int i3) {
        this(null, null, 0, true, null, false);
    }

    public static p150r5.c a(p150r5.c cVar, java.lang.String str, android.graphics.Bitmap bitmap, int i3, java.lang.String str2, int i9) {
        if ((i9 & 1) != 0) {
            str = cVar.f26863a;
        }
        java.lang.String str3 = str;
        if ((i9 & 2) != 0) {
            bitmap = cVar.f26864b;
        }
        android.graphics.Bitmap bitmap2 = bitmap;
        if ((i9 & 4) != 0) {
            i3 = cVar.f26865c;
        }
        int i10 = i3;
        boolean z6 = (i9 & 8) != 0 ? cVar.f26866d : false;
        if ((i9 & 16) != 0) {
            str2 = cVar.f26867e;
        }
        java.lang.String str4 = str2;
        boolean z9 = (i9 & 32) != 0 ? cVar.f26868f : true;
        cVar.getClass();
        return new p150r5.c(str3, bitmap2, i10, z6, str4, z9);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p150r5.c)) {
            return false;
        }
        p150r5.c cVar = (p150r5.c) obj;
        return kotlin.jvm.internal.m.a(this.f26863a, cVar.f26863a) && kotlin.jvm.internal.m.a(this.f26864b, cVar.f26864b) && this.f26865c == cVar.f26865c && this.f26866d == cVar.f26866d && kotlin.jvm.internal.m.a(this.f26867e, cVar.f26867e) && this.f26868f == cVar.f26868f;
    }

    public final int hashCode() {
        java.lang.String str = this.f26863a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        android.graphics.Bitmap bitmap = this.f26864b;
        int iF = p121o0.p.f(p121o0.p.d(this.f26865c, (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31, 31), 31, this.f26866d);
        java.lang.String str2 = this.f26867e;
        return java.lang.Boolean.hashCode(this.f26868f) + ((iF + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final java.lang.String toString() {
        return "TvPairingUiState(code=" + this.f26863a + ", qrBitmap=" + this.f26864b + ", secondsRemaining=" + this.f26865c + ", isLoading=" + this.f26866d + ", errorMessage=" + this.f26867e + ", isAuthenticated=" + this.f26868f + ")";
    }

    public c(java.lang.String str, android.graphics.Bitmap bitmap, int i3, boolean z6, java.lang.String str2, boolean z9) {
        this.f26863a = str;
        this.f26864b = bitmap;
        this.f26865c = i3;
        this.f26866d = z6;
        this.f26867e = str2;
        this.f26868f = z9;
    }
}
