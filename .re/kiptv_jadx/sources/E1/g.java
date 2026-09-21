package E1;

/* JADX INFO: loaded from: classes.dex */
public class g extends android.view.accessibility.AccessibilityNodeProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A.a f2758a;

    public g(A.a aVar) {
        this.f2758a = aVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int i3) {
        E1.f fVarB = this.f2758a.B(i3);
        if (fVarB == null) {
            return null;
        }
        return fVarB.f2755a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final java.util.List findAccessibilityNodeInfosByText(java.lang.String str, int i3) {
        this.f2758a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final android.view.accessibility.AccessibilityNodeInfo findFocus(int i3) {
        E1.f fVarE = this.f2758a.E(i3);
        if (fVarE == null) {
            return null;
        }
        return fVarE.f2755a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i3, int i9, android.os.Bundle bundle) {
        return this.f2758a.H(i3, i9, bundle);
    }
}
