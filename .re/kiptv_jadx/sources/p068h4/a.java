package p068h4;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p068h4.i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p068h4.i f22484h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p068h4.i f22485i;

    public a(p068h4.i iVar, p068h4.i iVar2) {
        iVar.getClass();
        this.f22484h = iVar;
        iVar2.getClass();
        this.f22485i = iVar2;
    }

    @Override // p068h4.l
    public final boolean apply(java.lang.Object obj) {
        return c(((java.lang.Character) obj).charValue());
    }

    @Override // p068h4.i
    public final boolean c(char c9) {
        return this.f22484h.c(c9) && this.f22485i.c(c9);
    }

    public final java.lang.String toString() {
        return "CharMatcher.and(" + this.f22484h + ", " + this.f22485i + ")";
    }
}
