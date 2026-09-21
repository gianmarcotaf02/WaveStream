package C7;

public final class C0189v implements p194x6.j {

    public static final C0189v f1607i = new C0189v(0);

    public final int f1608h;

    public C0189v(int i3) {
        this.f1608h = i3;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f1608h) {
            case 0:
                AbstractC0191x it = (AbstractC0191x) obj;
                kotlin.jvm.internal.m.e(it, "it");
                return it.toString();
            default:
                p101l7.c cVar = (p101l7.c) obj;
                if (cVar != null) {
                    return Boolean.valueOf(!cVar.equals(K6.o.y));
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
        }
    }
}
