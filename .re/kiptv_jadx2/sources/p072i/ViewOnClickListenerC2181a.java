package p072i;

import N6.i0;
import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import p095l.n;
import p103m.T0;

public final class ViewOnClickListenerC2181a implements View.OnClickListener {

    public final int f22597h;

    public final Object f22598i;

    public ViewOnClickListenerC2181a(int i3, Object obj) {
        this.f22597h = i3;
        this.f22598i = obj;
    }

    @Override
    public final void onClick(View view) {
        Message messageObtain;
        Message message;
        Message message2;
        Message message3;
        switch (this.f22597h) {
            case 0:
                f fVar = (f) this.f22598i;
                if (view == fVar.f22627h && (message3 = fVar.j) != null) {
                    messageObtain = Message.obtain(message3);
                } else if (view != fVar.f22629k || (message2 = fVar.f22631m) == null) {
                    messageObtain = (view != fVar.f22632n || (message = fVar.f22634p) == null) ? null : Message.obtain(message);
                } else {
                    messageObtain = Message.obtain(message2);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                fVar.f22619D.obtainMessage(1, fVar.f22622b).sendToTarget();
                break;
            case 1:
                ((i0) this.f22598i).b();
                break;
            default:
                T0 t9 = ((Toolbar) this.f22598i).f15756S;
                n nVar = t9 == null ? null : t9.f24965i;
                if (nVar != null) {
                    nVar.collapseActionView();
                }
                break;
        }
    }
}
