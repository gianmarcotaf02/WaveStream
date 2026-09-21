package g1;

/* JADX INFO: loaded from: classes.dex */
public class n extends g1.m {
    @Override // g1.m, android.view.inputmethod.InputConnection
    public final boolean commitContent(android.view.inputmethod.InputContentInfo inputContentInfo, int i3, android.os.Bundle bundle) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.commitContent(inputContentInfo, i3, bundle);
        }
        return false;
    }
}
