package D;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o extends kotlin.jvm.internal.v implements E6.r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1708h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i3, int i9, java.lang.Class cls, java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        super(obj, cls, str, str2, i3);
        this.f1708h = i9;
    }

    @Override // kotlin.jvm.internal.AbstractC2538c
    public final E6.InterfaceC0330c computeReflected() {
        return kotlin.jvm.internal.B.f24540a.g(this);
    }

    @Override // E6.r
    public final java.lang.Object get() {
        switch (this.f1708h) {
            case 0:
                return ((p020c0.e1) this.receiver).getValue();
            case 1:
                return ((p020c0.e1) this.receiver).getValue();
            default:
                return this.receiver.getClass().getSimpleName();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        return get();
    }

    @Override // E6.u
    public final E6.q getGetter() {
        return ((E6.r) getReflected()).getGetter();
    }
}
