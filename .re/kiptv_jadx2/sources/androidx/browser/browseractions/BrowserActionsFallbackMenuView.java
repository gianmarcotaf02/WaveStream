package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.kiptv.tv.R;

@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    public final int f15780h;

    public final int f15781i;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15780h = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_min_padding);
        this.f15781i = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_max_width);
    }

    @Override
    public final void onMeasure(int i3, int i9) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f15780h * 2), this.f15781i), 1073741824), i9);
    }
}
