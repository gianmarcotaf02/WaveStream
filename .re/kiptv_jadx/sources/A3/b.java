package A3;

/* JADX INFO: loaded from: classes.dex */
public final class b extends android.view.View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.cast.framework.media.widget.CastSeekBar f217a;

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(android.widget.SeekBar.class.getName());
        com.google.android.gms.cast.framework.media.widget.CastSeekBar castSeekBar = this.f217a;
        castSeekBar.f18673h.getClass();
        accessibilityEvent.setItemCount(1);
        accessibilityEvent.setCurrentItemIndex(castSeekBar.getProgress());
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(android.widget.SeekBar.class.getName());
        if (view.isEnabled()) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(android.view.View view, int i3, android.os.Bundle bundle) {
        if (view.isEnabled()) {
            if (super.performAccessibilityAction(view, i3, bundle)) {
                return true;
            }
            if (i3 == 4096 || i3 == 8192) {
                int i9 = com.google.android.gms.cast.framework.media.widget.CastSeekBar.f18672q;
                com.google.android.gms.cast.framework.media.widget.CastSeekBar castSeekBar = this.f217a;
                castSeekBar.f18673h.getClass();
                castSeekBar.getProgress();
                castSeekBar.f18673h.getClass();
                return false;
            }
        }
        return false;
    }
}
