package V7;

import U7.EnumC0955c;

public final class C0977c extends W7.g {

    public final p117n6.i f10445k;

    public final p117n6.i f10446l;

    public C0977c(p194x6.m mVar, p100l6.h hVar, int i3, EnumC0955c enumC0955c) {
        super(hVar, i3, enumC0955c);
        this.f10445k = (p117n6.i) mVar;
        this.f10446l = (p117n6.i) mVar;
    }

    @Override
    public final Object c(U7.A a2, p100l6.c cVar) {
        C0976b c0976b;
        if (cVar instanceof C0976b) {
            c0976b = (C0976b) cVar;
            int i3 = c0976b.f10442k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0976b.f10442k = i3 - Integer.MIN_VALUE;
            } else {
                c0976b = new C0976b(this, (p117n6.c) cVar);
            }
        } else {
            c0976b = new C0976b(this, (p117n6.c) cVar);
        }
        Object obj = c0976b.f10441i;
        Object obj2 = p109m6.a.f25430h;
        int i9 = c0976b.f10442k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            c0976b.f10440h = a2;
            c0976b.f10442k = 1;
            Object objInvoke = this.f10445k.invoke(a2, c0976b);
            if (objInvoke != p109m6.a.f25430h) {
                objInvoke = p070h6.A.f22523a;
            }
            if (objInvoke == obj2) {
                return obj2;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a2 = c0976b.f10440h;
            com.google.common.util.concurrent.P.u0(obj);
        }
        if (((U7.o) a2).f10216k.isClosedForSend()) {
            return p070h6.A.f22523a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    @Override
    public final W7.g d(p100l6.h hVar, int i3, EnumC0955c enumC0955c) {
        return new C0977c(this.f10446l, hVar, i3, enumC0955c);
    }

    @Override
    public final String toString() {
        return "block[" + this.f10445k + "] -> " + super.toString();
    }
}
