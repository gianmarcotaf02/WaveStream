package D1;

import android.view.WindowInsets;

public abstract class D0 {
    public static int a(int i3) {
        int iStatusBars;
        int i9 = 0;
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i3 & i10) != 0) {
                if (i10 == 1) {
                    iStatusBars = WindowInsets.Type.statusBars();
                } else if (i10 == 2) {
                    iStatusBars = WindowInsets.Type.navigationBars();
                } else if (i10 == 4) {
                    iStatusBars = WindowInsets.Type.captionBar();
                } else if (i10 == 8) {
                    iStatusBars = WindowInsets.Type.ime();
                } else if (i10 == 16) {
                    iStatusBars = WindowInsets.Type.systemGestures();
                } else if (i10 == 32) {
                    iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i10 == 64) {
                    iStatusBars = WindowInsets.Type.tappableElement();
                } else if (i10 == 128) {
                    iStatusBars = WindowInsets.Type.displayCutout();
                } else if (i10 == 512) {
                    iStatusBars = WindowInsets.Type.systemOverlays();
                }
                i9 |= iStatusBars;
            }
        }
        return i9;
    }
}
