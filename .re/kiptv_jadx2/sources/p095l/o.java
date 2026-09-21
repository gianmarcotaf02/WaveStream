package p095l;

import android.view.ActionProvider;
import p020c0.C1704s0;

public final class o implements ActionProvider.VisibilityListener {

    public C1704s0 f24686a;

    public final ActionProvider f24687b;

    public final s f24688c;

    public o(s sVar, ActionProvider actionProvider) {
        this.f24688c = sVar;
        this.f24687b = actionProvider;
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z6) {
        C1704s0 c1704s0 = this.f24686a;
        if (c1704s0 != null) {
            l lVar = ((n) c1704s0.f18362i).f24674n;
            lVar.f24642h = true;
            lVar.p(true);
        }
    }
}
