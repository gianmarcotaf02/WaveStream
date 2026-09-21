package p150r5;

import android.graphics.Bitmap;
import kotlin.jvm.internal.m;
import p121o0.p;

public final class c {

    public final String f26863a;

    public final Bitmap f26864b;

    public final int f26865c;

    public final boolean f26866d;

    public final String f26867e;

    public final boolean f26868f;

    public c(int i3) {
        this(null, null, 0, true, null, false);
    }

    public static c a(c cVar, String str, Bitmap bitmap, int i3, String str2, int i9) {
        if ((i9 & 1) != 0) {
            str = cVar.f26863a;
        }
        String str3 = str;
        if ((i9 & 2) != 0) {
            bitmap = cVar.f26864b;
        }
        Bitmap bitmap2 = bitmap;
        if ((i9 & 4) != 0) {
            i3 = cVar.f26865c;
        }
        int i10 = i3;
        boolean z6 = (i9 & 8) != 0 ? cVar.f26866d : false;
        if ((i9 & 16) != 0) {
            str2 = cVar.f26867e;
        }
        String str4 = str2;
        boolean z9 = (i9 & 32) != 0 ? cVar.f26868f : true;
        cVar.getClass();
        return new c(str3, bitmap2, i10, z6, str4, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return m.a(this.f26863a, cVar.f26863a) && m.a(this.f26864b, cVar.f26864b) && this.f26865c == cVar.f26865c && this.f26866d == cVar.f26866d && m.a(this.f26867e, cVar.f26867e) && this.f26868f == cVar.f26868f;
    }

    public final int hashCode() {
        String str = this.f26863a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Bitmap bitmap = this.f26864b;
        int iF = p.f(p.d(this.f26865c, (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31, 31), 31, this.f26866d);
        String str2 = this.f26867e;
        return Boolean.hashCode(this.f26868f) + ((iF + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TvPairingUiState(code=" + this.f26863a + ", qrBitmap=" + this.f26864b + ", secondsRemaining=" + this.f26865c + ", isLoading=" + this.f26866d + ", errorMessage=" + this.f26867e + ", isAuthenticated=" + this.f26868f + ")";
    }

    public c(String str, Bitmap bitmap, int i3, boolean z6, String str2, boolean z9) {
        this.f26863a = str;
        this.f26864b = bitmap;
        this.f26865c = i3;
        this.f26866d = z6;
        this.f26867e = str2;
        this.f26868f = z9;
    }
}
