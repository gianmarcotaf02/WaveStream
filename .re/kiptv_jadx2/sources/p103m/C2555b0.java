package p103m;

import android.text.StaticLayout;
import android.widget.TextView;

public final class C2555b0 extends C2553a0 {
    @Override
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
