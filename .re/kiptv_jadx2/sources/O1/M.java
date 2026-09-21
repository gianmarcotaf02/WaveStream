package O1;

import java.util.concurrent.atomic.AtomicInteger;

public final class M extends p117n6.i implements p194x6.m {

    public kotlin.jvm.internal.y f7769h;

    public int f7770i;
    public Object j;

    public final kotlin.jvm.internal.y f7771k;

    public final N f7772l;

    public final Object f7773m;

    public final boolean f7774n;

    public M(kotlin.jvm.internal.y yVar, N n3, Object obj, boolean z6, p100l6.c cVar) {
        super(2, cVar);
        this.f7771k = yVar;
        this.f7772l = n3;
        this.f7773m = obj;
        this.f7774n = z6;
    }

    @Override
    public final p100l6.c create(Object obj, p100l6.c cVar) {
        M m8 = new M(this.f7771k, this.f7772l, this.f7773m, this.f7774n, cVar);
        m8.j = obj;
        return m8;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((M) create((Q1.k) obj, (p100l6.c) obj2)).invokeSuspend(p070h6.A.f22523a);
    }

    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Q1.k kVar;
        kotlin.jvm.internal.y yVar;
        p109m6.a aVar = p109m6.a.f25430h;
        int i3 = this.f7770i;
        kotlin.jvm.internal.y yVar2 = this.f7771k;
        Object obj2 = this.f7773m;
        N n3 = this.f7772l;
        if (i3 != 0) {
            if (i3 == 1) {
                yVar = this.f7769h;
                kVar = (Q1.k) this.j;
                com.google.common.util.concurrent.P.u0(obj);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
            }
            if (this.f7774n) {
                n3.f7781h.G(new C0739c(obj2, obj2 != null ? obj2.hashCode() : 0, yVar2.f24555h));
            }
            return p070h6.A.f22523a;
        }
        com.google.common.util.concurrent.P.u0(obj);
        Q1.k kVar2 = (Q1.k) this.j;
        X xG = n3.g();
        this.j = kVar2;
        this.f7769h = yVar2;
        this.f7770i = 1;
        Integer num = new Integer(((AtomicInteger) xG.f7806b.f9i).incrementAndGet());
        if (num != aVar) {
            kVar = kVar2;
            obj = num;
            yVar = yVar2;
        }
        return aVar;
        yVar.f24555h = ((Number) obj).intValue();
        this.j = null;
        this.f7769h = null;
        this.f7770i = 2;
    }
}
