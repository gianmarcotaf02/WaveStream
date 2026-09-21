package p104m1;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p104m1.s f25189c = new p104m1.s(2, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p104m1.s f25190d = new p104m1.s(1, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25192b;

    public s(int i3, boolean z6) {
        this.f25191a = i3;
        this.f25192b = z6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p104m1.s)) {
            return false;
        }
        p104m1.s sVar = (p104m1.s) obj;
        return this.f25191a == sVar.f25191a && this.f25192b == sVar.f25192b;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f25192b) + (java.lang.Integer.hashCode(this.f25191a) * 31);
    }

    public final java.lang.String toString() {
        if (equals(f25189c)) {
            return "TextMotion.Static";
        }
        return equals(f25190d) ? "TextMotion.Animated" : "Invalid";
    }
}
