package p155s1;

public final class j extends g {

    public final k f27250o;

    public j(k kVar) {
        this.f27250o = kVar;
    }

    @Override
    public final String g() {
        h hVar = (h) this.f27250o.f27251h.get();
        if (hVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + hVar.f27246a + "]";
    }
}
