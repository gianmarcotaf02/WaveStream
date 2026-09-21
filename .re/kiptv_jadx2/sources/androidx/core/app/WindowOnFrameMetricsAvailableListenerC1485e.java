package androidx.core.app;

import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;

public final class WindowOnFrameMetricsAvailableListenerC1485e implements Window.OnFrameMetricsAvailableListener {

    public final B4.t f16023a;

    public WindowOnFrameMetricsAvailableListenerC1485e(B4.t tVar) {
        this.f16023a = tVar;
    }

    @Override
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i3) {
        B4.t tVar = this.f16023a;
        if ((tVar.f730h & 1) != 0) {
            B4.t.a(((SparseIntArray[]) tVar.j)[0], frameMetrics.getMetric(8));
        }
        if ((tVar.f730h & 2) != 0) {
            B4.t.a(((SparseIntArray[]) tVar.j)[1], frameMetrics.getMetric(1));
        }
        if ((tVar.f730h & 4) != 0) {
            B4.t.a(((SparseIntArray[]) tVar.j)[2], frameMetrics.getMetric(3));
        }
        if ((tVar.f730h & 8) != 0) {
            B4.t.a(((SparseIntArray[]) tVar.j)[3], frameMetrics.getMetric(4));
        }
        if ((tVar.f730h & 16) != 0) {
            B4.t.a(((SparseIntArray[]) tVar.j)[4], frameMetrics.getMetric(5));
        }
        if ((tVar.f730h & 64) != 0) {
            B4.t.a(((SparseIntArray[]) tVar.j)[6], frameMetrics.getMetric(7));
        }
        if ((tVar.f730h & 32) != 0) {
            B4.t.a(((SparseIntArray[]) tVar.j)[5], frameMetrics.getMetric(6));
        }
        if ((tVar.f730h & 128) != 0) {
            B4.t.a(((SparseIntArray[]) tVar.j)[7], frameMetrics.getMetric(0));
        }
        if ((tVar.f730h & 256) != 0) {
            B4.t.a(((SparseIntArray[]) tVar.j)[8], frameMetrics.getMetric(2));
        }
    }
}
