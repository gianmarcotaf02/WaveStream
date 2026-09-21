package p068h4;

/* JADX INFO: loaded from: classes.dex */
public final class e extends p068h4.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f22492h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final char f22493i;

    public /* synthetic */ e(char c9, int i3) {
        this.f22492h = i3;
        this.f22493i = c9;
    }

    @Override // p068h4.i
    public final boolean c(char c9) {
        switch (this.f22492h) {
            case 0:
                return c9 == this.f22493i;
            default:
                return c9 != this.f22493i;
        }
    }

    @Override // p068h4.d, p068h4.i
    public final p068h4.i d() {
        switch (this.f22492h) {
            case 0:
                return new p068h4.e(this.f22493i, 1);
            default:
                return new p068h4.e(this.f22493i, 0);
        }
    }

    public final java.lang.String toString() {
        switch (this.f22492h) {
            case 0:
                return "CharMatcher.is('" + p068h4.i.a(this.f22493i) + "')";
            default:
                return "CharMatcher.isNot('" + p068h4.i.a(this.f22493i) + "')";
        }
    }
}
