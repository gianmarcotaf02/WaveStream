package p072i;

/* JADX INFO: loaded from: classes.dex */
public final class l implements p103m.InterfaceC2563f0, p095l.w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p072i.v f22654h;

    public /* synthetic */ l(p072i.v vVar) {
        this.f22654h = vVar;
    }

    @Override // p095l.w
    public void c(p095l.l lVar, boolean z6) {
        p072i.u uVar;
        p095l.l lVarK = lVar.k();
        int i3 = 0;
        boolean z9 = lVarK != lVar;
        if (z9) {
            lVar = lVarK;
        }
        p072i.v vVar = this.f22654h;
        p072i.u[] uVarArr = vVar.f22694L;
        int length = uVarArr != null ? uVarArr.length : 0;
        while (true) {
            if (i3 < length) {
                uVar = uVarArr[i3];
                if (uVar != null && uVar.f22673h == lVar) {
                    break;
                } else {
                    i3++;
                }
            } else {
                uVar = null;
                break;
            }
        }
        if (uVar != null) {
            if (!z9) {
                vVar.h(uVar, z6);
            } else {
                vVar.f(uVar.f22667a, uVar, lVarK);
                vVar.h(uVar, true);
            }
        }
    }

    @Override // p095l.w
    public boolean j(p095l.l lVar) {
        android.view.Window.Callback callback;
        if (lVar != lVar.k()) {
            return true;
        }
        p072i.v vVar = this.f22654h;
        if (!vVar.f22689F || (callback = vVar.f22715m.getCallback()) == null || vVar.f22699Q) {
            return true;
        }
        callback.onMenuOpened(108, lVar);
        return true;
    }
}
