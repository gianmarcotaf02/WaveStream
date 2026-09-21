package androidx.browser.browseractions;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class BrowserActionsFallbackMenuView extends android.widget.LinearLayout {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f15780h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f15781i;

    public BrowserActionsFallbackMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15780h = getResources().getDimensionPixelOffset(com.kiptv.tv.R.dimen.browser_actions_context_menu_min_padding);
        this.f15781i = getResources().getDimensionPixelOffset(com.kiptv.tv.R.dimen.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i9) {
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(getResources().getDisplayMetrics().widthPixels - (this.f15780h * 2), this.f15781i), 1073741824), i9);
    }
}
