package p146r1;

/* JADX INFO: loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f26757h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p146r1.A f26758i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(p146r1.A a2, int i3) {
        super(1);
        this.f26757h = i3;
        this.f26758i = a2;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f26757h) {
            case 0:
                O0.InterfaceC0732v interfaceC0732vF = ((O0.InterfaceC0732v) obj).F();
                kotlin.jvm.internal.m.b(interfaceC0732vF);
                this.f26758i.l(interfaceC0732vF);
                break;
            case 1:
                p113n1.m mVar = new p113n1.m(((p113n1.m) obj).f25565a);
                p146r1.A a2 = this.f26758i;
                a2.m523setPopupContentSizefhxjrPA(mVar);
                a2.m();
                break;
            default:
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) obj;
                p146r1.A a9 = this.f26758i;
                android.os.Handler handler = a9.getHandler();
                if ((handler != null ? handler.getLooper() : null) == android.os.Looper.myLooper()) {
                    function0.invoke();
                } else {
                    android.os.Handler handler2 = a9.getHandler();
                    if (handler2 != null) {
                        handler2.post(new O.c(9, function0));
                    }
                }
                break;
        }
        return p070h6.A.f22523a;
    }
}
