package A3;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;

public final class b extends View.AccessibilityDelegate {

    public final CastSeekBar f217a;

    @Override
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(SeekBar.class.getName());
        CastSeekBar castSeekBar = this.f217a;
        castSeekBar.f18673h.getClass();
        accessibilityEvent.setItemCount(1);
        accessibilityEvent.setCurrentItemIndex(castSeekBar.getProgress());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(SeekBar.class.getName());
        if (view.isEnabled()) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    @Override
    public final boolean performAccessibilityAction(View view, int i3, Bundle bundle) {
        if (view.isEnabled()) {
            if (super.performAccessibilityAction(view, i3, bundle)) {
                return true;
            }
            if (i3 == 4096 || i3 == 8192) {
                int i9 = CastSeekBar.f18672q;
                CastSeekBar castSeekBar = this.f217a;
                castSeekBar.f18673h.getClass();
                castSeekBar.getProgress();
                castSeekBar.f18673h.getClass();
                return false;
            }
        }
        return false;
    }
}
