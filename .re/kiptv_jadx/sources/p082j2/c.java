package p082j2;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f23902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23904c;

    public c(java.lang.String str, int i3, int i9) {
        this.f23902a = str;
        this.f23903b = i3;
        this.f23904c = i9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p082j2.c)) {
            return false;
        }
        p082j2.c cVar = (p082j2.c) obj;
        int i3 = this.f23904c;
        java.lang.String str = this.f23902a;
        int i9 = this.f23903b;
        if (i9 < 0 || cVar.f23903b < 0) {
            return android.text.TextUtils.equals(str, cVar.f23902a) && i3 == cVar.f23904c;
        }
        return android.text.TextUtils.equals(str, cVar.f23902a) && i9 == cVar.f23903b && i3 == cVar.f23904c;
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.f23902a, java.lang.Integer.valueOf(this.f23904c));
    }
}
