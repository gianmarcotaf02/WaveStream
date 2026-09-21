package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class O0 extends p005a5.Q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f13724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f13725b;

    public O0(java.lang.String str, java.lang.Integer num) {
        this.f13724a = str;
        this.f13725b = num;
    }

    public static p005a5.O0 a(p005a5.O0 o8, java.lang.Integer num) {
        java.lang.String str = o8.f13724a;
        o8.getClass();
        return new p005a5.O0(str, num);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.O0)) {
            return false;
        }
        p005a5.O0 o8 = (p005a5.O0) obj;
        return kotlin.jvm.internal.m.a(this.f13724a, o8.f13724a) && kotlin.jvm.internal.m.a(this.f13725b, o8.f13725b);
    }

    public final int hashCode() {
        int iHashCode = this.f13724a.hashCode() * 31;
        java.lang.Integer num = this.f13725b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final java.lang.String toString() {
        return "LoggedIn(username=" + this.f13724a + ", remainingDownloads=" + this.f13725b + ")";
    }
}
