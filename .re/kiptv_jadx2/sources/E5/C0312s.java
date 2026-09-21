package E5;

import kotlin.jvm.functions.Function0;
import t5.C2785b;

public final class C0312s implements Function0 {

    public final C2785b f3143h;

    public final boolean f3144i;
    public final Function0 j;

    public final p194x6.j f3145k;

    public final String f3146l;

    public C0312s(C2785b c2785b, boolean z6, Function0 function0, p194x6.j jVar, String str) {
        this.f3143h = c2785b;
        this.f3144i = z6;
        this.j = function0;
        this.f3145k = jVar;
        this.f3146l = str;
    }

    @Override
    public final Object invoke() {
        if (!this.f3143h.f28131d || this.f3144i) {
            this.f3145k.invoke(this.f3146l);
        } else {
            this.j.invoke();
        }
        return p070h6.A.f22523a;
    }
}
