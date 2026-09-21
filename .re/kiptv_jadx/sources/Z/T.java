package Z;

/* JADX INFO: loaded from: classes.dex */
public final class T extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12324h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.functions.Function0 f12325i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(int i3, kotlin.jvm.functions.Function0 function0) {
        super(1);
        this.f12324h = i3;
        this.f12325i = function0;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        p070h6.A a2 = p070h6.A.f22523a;
        kotlin.jvm.functions.Function0 function0 = this.f12325i;
        switch (this.f12324h) {
            case 0:
                Y0.h hVar = new Y0.h(((java.lang.Number) function0.invoke()).floatValue(), new D6.d(0.0f, 1.0f));
                E6.u[] uVarArr = Y0.v.f11144a;
                Y0.w wVar = Y0.t.f11121c;
                E6.u uVar = Y0.v.f11144a[1];
                ((Y0.x) obj).d(wVar, hVar);
                break;
            default:
                if (((p175v0.D) ((p175v0.C) obj)).b()) {
                    function0.invoke();
                }
                break;
        }
        return a2;
    }
}
