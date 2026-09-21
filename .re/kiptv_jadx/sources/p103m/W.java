package p103m;

/* JADX INFO: loaded from: classes.dex */
public class W extends p008a8.c {
    public final /* synthetic */ p103m.Y j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(p103m.Y y) {
        super(11, y);
        this.j = y;
    }

    @Override // p008a8.c, p103m.V
    public final void H(int i3) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i3);
    }

    @Override // p008a8.c, p103m.V
    public final void y(int i3) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i3);
    }
}
