package p082j2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p082j2.c f23901a;

    public a(java.lang.String str, int i3, int i9) {
        if (str == null) {
            throw new java.lang.NullPointerException("package shouldn't be null");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("packageName should be nonempty");
        }
        if (android.os.Build.VERSION.SDK_INT < 28) {
            this.f23901a = new p082j2.c(str, i3, i9);
            return;
        }
        p082j2.b bVar = new p082j2.b(str, i3, i9);
        androidx.media3.common.audio.e.h(i3, i9, str);
        this.f23901a = bVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p082j2.a)) {
            return false;
        }
        return this.f23901a.equals(((p082j2.a) obj).f23901a);
    }

    public final int hashCode() {
        return this.f23901a.hashCode();
    }
}
