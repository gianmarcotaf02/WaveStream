package I0;

import android.view.KeyEvent;
import p137q0.o;
import p194x6.j;

public final class f extends o implements e {

    public j f4571v;

    public j f4572w;

    @Override
    public final boolean f(KeyEvent keyEvent) {
        j jVar = this.f4572w;
        if (jVar != null) {
            return ((Boolean) jVar.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override
    public final boolean z(KeyEvent keyEvent) {
        j jVar = this.f4571v;
        if (jVar != null) {
            return ((Boolean) jVar.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }
}
