package O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7514h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ O.i f7515i;

    public /* synthetic */ a(O.i iVar, int i3) {
        this.f7514h = i3;
        this.f7515i = iVar;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f7514h) {
            case 0:
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) obj;
                O.i iVar = this.f7515i;
                android.os.Handler handler = iVar.f7533a.getHandler();
                if ((handler != null ? handler.getLooper() : null) == android.os.Looper.myLooper()) {
                    function0.invoke();
                } else {
                    android.os.Handler handler2 = iVar.f7533a.getHandler();
                    if (handler2 != null) {
                        handler2.post(new O.c(0, function0));
                    }
                }
                return p070h6.A.f22523a;
            case 1:
                android.view.ActionMode actionMode = this.f7515i.f7539h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return p070h6.A.f22523a;
            case 2:
                android.view.ActionMode actionMode2 = this.f7515i.f7539h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return p070h6.A.f22523a;
            default:
                O.i iVar2 = this.f7515i;
                iVar2.f7537e.e();
                return new C5.F0(7, iVar2);
        }
    }
}
