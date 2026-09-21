package p068h4;

public final class a extends i {

    public final i f22484h;

    public final i f22485i;

    public a(i iVar, i iVar2) {
        iVar.getClass();
        this.f22484h = iVar;
        iVar2.getClass();
        this.f22485i = iVar2;
    }

    @Override
    public final boolean apply(Object obj) {
        return c(((Character) obj).charValue());
    }

    @Override
    public final boolean c(char c9) {
        return this.f22484h.c(c9) && this.f22485i.c(c9);
    }

    public final String toString() {
        return "CharMatcher.and(" + this.f22484h + ", " + this.f22485i + ")";
    }
}
