package androidx.recyclerview.widget;

import android.view.View;
import androidx.media3.common.util.Log;
import java.util.List;

public final class C1637t {

    public boolean f17507a;

    public int f17508b;

    public int f17509c;

    public int f17510d;

    public int f17511e;

    public int f17512f;
    public int g;

    public int f17513h;

    public int f17514i;
    public int j;

    public List f17515k;

    public boolean f17516l;

    public final void a(View view) {
        int layoutPosition;
        int size = this.f17515k.size();
        View view2 = null;
        int i3 = Log.LOG_LEVEL_OFF;
        for (int i9 = 0; i9 < size; i9++) {
            View view3 = ((X) this.f17515k.get(i9)).itemView;
            J j = (J) view3.getLayoutParams();
            if (view3 != view && !j.f17217a.isRemoved() && (layoutPosition = (j.f17217a.getLayoutPosition() - this.f17510d) * this.f17511e) >= 0 && layoutPosition < i3) {
                view2 = view3;
                if (layoutPosition == 0) {
                    break;
                } else {
                    i3 = layoutPosition;
                }
            }
        }
        if (view2 == null) {
            this.f17510d = -1;
        } else {
            this.f17510d = ((J) view2.getLayoutParams()).f17217a.getLayoutPosition();
        }
    }

    public final View b(O o8) {
        List list = this.f17515k;
        if (list == null) {
            View view = o8.k(this.f17510d, Long.MAX_VALUE).itemView;
            this.f17510d += this.f17511e;
            return view;
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = ((X) this.f17515k.get(i3)).itemView;
            J j = (J) view2.getLayoutParams();
            if (!j.f17217a.isRemoved() && this.f17510d == j.f17217a.getLayoutPosition()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
