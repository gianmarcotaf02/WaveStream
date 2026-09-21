package p068h4;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p068h4.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final char f22494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final char f22495i;

    public f(char c9, char c10) {
        this.f22494h = c9;
        this.f22495i = c10;
    }

    @Override // p068h4.i
    public final boolean c(char c9) {
        return c9 == this.f22494h || c9 == this.f22495i;
    }

    public final java.lang.String toString() {
        return "CharMatcher.anyOf(\"" + p068h4.i.a(this.f22494h) + p068h4.i.a(this.f22495i) + "\")";
    }
}
