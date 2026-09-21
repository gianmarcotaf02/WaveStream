package g1;

/* JADX INFO: loaded from: classes.dex */
public final class o extends g1.n {
    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(android.view.inputmethod.HandwritingGesture handwritingGesture, java.util.concurrent.Executor executor, java.util.function.IntConsumer intConsumer) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            yVar.performHandwritingGesture(handwritingGesture, executor, intConsumer);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(android.view.inputmethod.PreviewableHandwritingGesture previewableHandwritingGesture, android.os.CancellationSignal cancellationSignal) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }
}
