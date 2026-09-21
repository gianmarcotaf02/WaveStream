package p005a5;

/* JADX INFO: renamed from: a5.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1326l extends p005a5.AbstractC1346n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.github.jan.supabase.auth.user.UserInfo f14711a;

    public C1326l(io.github.jan.supabase.auth.user.UserInfo userInfo) {
        this.f14711a = userInfo;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p005a5.C1326l) && kotlin.jvm.internal.m.a(this.f14711a, ((p005a5.C1326l) obj).f14711a);
    }

    public final int hashCode() {
        return this.f14711a.hashCode();
    }

    public final java.lang.String toString() {
        return "LoggedIn(user=" + this.f14711a + ")";
    }
}
