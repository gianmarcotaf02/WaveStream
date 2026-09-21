package K0;

/* JADX INFO: loaded from: classes.dex */
public final class E extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ K0.F f6649i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(K0.F f9, int i3) {
        super(1);
        this.f6648h = i3;
        this.f6649i = f9;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f6648h) {
            case 0:
                android.view.MotionEvent motionEvent = (android.view.MotionEvent) obj;
                K0.G g = this.f6649i.f6650b;
                if (g != null) {
                    g.invoke(motionEvent);
                    return p070h6.A.f22523a;
                }
                kotlin.jvm.internal.m.k("onTouchEvent");
                throw null;
            default:
                android.view.MotionEvent motionEvent2 = (android.view.MotionEvent) obj;
                K0.G g9 = this.f6649i.f6650b;
                if (g9 != null) {
                    g9.invoke(motionEvent2);
                    return p070h6.A.f22523a;
                }
                kotlin.jvm.internal.m.k("onTouchEvent");
                throw null;
        }
    }
}
