package p021c1;

import android.text.Layout;
import kotlin.jvm.internal.m;

public abstract class g {

    public static final Layout.Alignment f18465a;

    public static final Layout.Alignment f18466b;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (m.a(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (m.a(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f18465a = alignment;
        f18466b = alignment2;
    }
}
