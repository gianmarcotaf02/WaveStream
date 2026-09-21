package D1;

import android.view.View;

public final class r {

    public int f2053a;

    public int f2054b;

    public r(int i3, int i9) {
        this.f2053a = i3;
        this.f2054b = i9;
    }

    public void a(androidx.recyclerview.widget.X x9) {
        View view = x9.itemView;
        this.f2053a = view.getLeft();
        this.f2054b = view.getTop();
        view.getRight();
        view.getBottom();
    }
}
