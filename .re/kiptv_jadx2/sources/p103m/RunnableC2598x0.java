package p103m;

public final class RunnableC2598x0 implements Runnable {

    public final int f25148h;

    public final B0 f25149i;

    public RunnableC2598x0(B0 b9, int i3) {
        this.f25148h = i3;
        this.f25149i = b9;
    }

    @Override
    public final void run() {
        switch (this.f25148h) {
            case 0:
                C2581o0 c2581o0 = this.f25149i.j;
                if (c2581o0 != null) {
                    c2581o0.setListSelectionHidden(true);
                    c2581o0.requestLayout();
                }
                break;
            default:
                B0 b9 = this.f25149i;
                C2581o0 c2581o1 = b9.j;
                if (c2581o1 != null && c2581o1.isAttachedToWindow() && b9.j.getCount() > b9.j.getChildCount() && b9.j.getChildCount() <= b9.f24896t) {
                    b9.f24884F.setInputMethodMode(2);
                    b9.e();
                    break;
                }
                break;
        }
    }
}
