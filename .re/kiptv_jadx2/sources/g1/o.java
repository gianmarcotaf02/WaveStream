package g1;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

public final class o extends n {
    @Override
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            yVar.performHandwritingGesture(handwritingGesture, executor, intConsumer);
        }
    }

    @Override
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }
}
