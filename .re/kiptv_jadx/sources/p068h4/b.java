package p068h4;

/* JADX INFO: loaded from: classes.dex */
public final class b extends p068h4.g {
    public static final p068h4.b j = new p068h4.b("CharMatcher.any()", 0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p068h4.b f22486k = new p068h4.b("CharMatcher.ascii()", 1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p068h4.b f22487l = new p068h4.b("CharMatcher.javaIsoControl()", 2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p068h4.b f22488m = new p068h4.b("CharMatcher.none()", 3);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22489i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(java.lang.String str, int i3) {
        super(str);
        this.f22489i = i3;
    }

    @Override // p068h4.i
    public final boolean c(char c9) {
        switch (this.f22489i) {
            case 0:
                return true;
            case 1:
                return c9 <= 127;
            case 2:
                return c9 <= 31 || (c9 >= 127 && c9 <= 159);
            default:
                return false;
        }
    }

    @Override // p068h4.d, p068h4.i
    public p068h4.i d() {
        switch (this.f22489i) {
            case 0:
                return f22488m;
            case 3:
                return j;
            default:
                return super.d();
        }
    }
}
