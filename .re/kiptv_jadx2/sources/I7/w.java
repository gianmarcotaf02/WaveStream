package I7;

public abstract class w implements e {

    public final p194x6.j f5605a;

    public final String f5606b;

    public w(String str, p194x6.j jVar) {
        this.f5605a = jVar;
        this.f5606b = "must return ".concat(str);
    }

    @Override
    public final boolean a(Y6.g gVar) {
        return kotlin.jvm.internal.m.a(gVar.f8686n, this.f5605a.invoke(p161s7.d.e(gVar)));
    }

    @Override
    public final String b(Y6.g gVar) {
        return E8.d.S(this, gVar);
    }

    @Override
    public final String getDescription() {
        return this.f5606b;
    }
}
