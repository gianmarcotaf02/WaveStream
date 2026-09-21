package p072i;

/* JADX INFO: renamed from: i.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC2181a implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f22597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f22598i;

    public /* synthetic */ ViewOnClickListenerC2181a(int i3, java.lang.Object obj) {
        this.f22597h = i3;
        this.f22598i = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.os.Message messageObtain;
        android.os.Message message;
        android.os.Message message2;
        android.os.Message message3;
        switch (this.f22597h) {
            case 0:
                p072i.f fVar = (p072i.f) this.f22598i;
                if (view == fVar.f22627h && (message3 = fVar.j) != null) {
                    messageObtain = android.os.Message.obtain(message3);
                } else if (view != fVar.f22629k || (message2 = fVar.f22631m) == null) {
                    messageObtain = (view != fVar.f22632n || (message = fVar.f22634p) == null) ? null : android.os.Message.obtain(message);
                } else {
                    messageObtain = android.os.Message.obtain(message2);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                fVar.f22619D.obtainMessage(1, fVar.f22622b).sendToTarget();
                break;
            case 1:
                ((N6.i0) this.f22598i).b();
                break;
            default:
                p103m.T0 t9 = ((androidx.appcompat.widget.Toolbar) this.f22598i).f15756S;
                p095l.n nVar = t9 == null ? null : t9.f24965i;
                if (nVar != null) {
                    nVar.collapseActionView();
                }
                break;
        }
    }
}
