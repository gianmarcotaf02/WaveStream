package M;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7105a;

    public a(int i3) {
        this.f7105a = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof M.a) {
            return this.f7105a == ((M.a) obj).f7105a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7105a;
    }
}
