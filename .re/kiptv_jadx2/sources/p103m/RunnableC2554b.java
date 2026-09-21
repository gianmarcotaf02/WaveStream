package p103m;

import androidx.appcompat.widget.ActionBarOverlayLayout;

public final class RunnableC2554b implements Runnable {

    public final int f25005h;

    public final ActionBarOverlayLayout f25006i;

    public RunnableC2554b(ActionBarOverlayLayout actionBarOverlayLayout, int i3) {
        this.f25005h = i3;
        this.f25006i = actionBarOverlayLayout;
    }

    @Override
    public final void run() {
        switch (this.f25005h) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f25006i;
                actionBarOverlayLayout.d();
                actionBarOverlayLayout.f15694D = actionBarOverlayLayout.f15701k.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f15695E);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f25006i;
                actionBarOverlayLayout2.d();
                actionBarOverlayLayout2.f15694D = actionBarOverlayLayout2.f15701k.animate().translationY(-actionBarOverlayLayout2.f15701k.getHeight()).setListener(actionBarOverlayLayout2.f15695E);
                break;
        }
    }
}
