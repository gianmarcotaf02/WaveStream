package D1;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2054b;

    public /* synthetic */ r(int i3, int i9) {
        this.f2053a = i3;
        this.f2054b = i9;
    }

    public void a(androidx.recyclerview.widget.X x9) {
        android.view.View view = x9.itemView;
        this.f2053a = view.getLeft();
        this.f2054b = view.getTop();
        view.getRight();
        view.getBottom();
    }
}
