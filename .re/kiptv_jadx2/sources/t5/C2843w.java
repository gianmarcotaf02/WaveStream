package t5;

public final class C2843w implements p194x6.j {

    public final int f28427h;

    public final p194x6.j f28428i;
    public final Object j;

    public final p194x6.j f28429k;

    public C2843w(p194x6.j jVar, Object obj, p194x6.j jVar2, int i3) {
        this.f28427h = i3;
        this.f28428i = jVar;
        this.j = obj;
        this.f28429k = jVar2;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f28427h) {
            case 0:
                p020c0.I DisposableEffect = (p020c0.I) obj;
                kotlin.jvm.internal.m.e(DisposableEffect, "$this$DisposableEffect");
                p194x6.j jVar = this.f28428i;
                Object obj2 = this.j;
                jVar.invoke(obj2);
                return new C2841v(this.f28429k, 0, obj2);
            default:
                p020c0.I DisposableEffect2 = (p020c0.I) obj;
                kotlin.jvm.internal.m.e(DisposableEffect2, "$this$DisposableEffect");
                p194x6.j jVar2 = this.f28428i;
                Object obj3 = this.j;
                jVar2.invoke(obj3);
                return new C2841v(this.f28429k, 1, obj3);
        }
    }
}
