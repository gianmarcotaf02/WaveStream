package p138q1;

/* JADX INFO: loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f26515h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p138q1.y f26516i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(p138q1.y yVar, int i3) {
        super(0);
        this.f26515h = i3;
        this.f26516i = yVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f26515h) {
            case 0:
                this.f26516i.getLayoutNode().F();
                return p070h6.A.f22523a;
            case 1:
                p138q1.y yVar = this.f26516i;
                if (yVar.f26527l && yVar.isAttachedToWindow() && yVar.getView().getParent() == yVar) {
                    Q0.q0 snapshotObserver = yVar.getSnapshotObserver();
                    snapshotObserver.f8460a.d(yVar, p138q1.c.f26499i, yVar.getUpdate());
                }
                return p070h6.A.f22523a;
            case 2:
                android.util.SparseArray<android.os.Parcelable> sparseArray = new android.util.SparseArray<>();
                this.f26516i.H.saveHierarchyState(sparseArray);
                return sparseArray;
            case 3:
                p138q1.y yVar2 = this.f26516i;
                yVar2.getReleaseBlock().invoke(yVar2.H);
                p138q1.y.m(yVar2);
                return p070h6.A.f22523a;
            case 4:
                p138q1.y yVar3 = this.f26516i;
                yVar3.getResetBlock().invoke(yVar3.H);
                return p070h6.A.f22523a;
            default:
                p138q1.y yVar4 = this.f26516i;
                yVar4.getUpdateBlock().invoke(yVar4.H);
                return p070h6.A.f22523a;
        }
    }
}
