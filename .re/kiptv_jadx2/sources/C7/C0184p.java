package C7;

public final class C0184p extends T {

    public final T f1597b;

    public final T f1598c;

    public C0184p(T t9, T t10) {
        this.f1597b = t9;
        this.f1598c = t10;
    }

    @Override
    public final boolean a() {
        return this.f1597b.a() || this.f1598c.a();
    }

    @Override
    public final boolean b() {
        return this.f1597b.b() || this.f1598c.b();
    }

    @Override
    public final O6.h c(O6.h annotations) {
        kotlin.jvm.internal.m.e(annotations, "annotations");
        return this.f1598c.c(this.f1597b.c(annotations));
    }

    @Override
    public final P d(AbstractC0191x abstractC0191x) {
        P pD = this.f1597b.d(abstractC0191x);
        return pD == null ? this.f1598c.d(abstractC0191x) : pD;
    }

    @Override
    public final AbstractC0191x f(AbstractC0191x topLevelType, b0 position) {
        kotlin.jvm.internal.m.e(topLevelType, "topLevelType");
        kotlin.jvm.internal.m.e(position, "position");
        return this.f1598c.f(this.f1597b.f(topLevelType, position), position);
    }
}
