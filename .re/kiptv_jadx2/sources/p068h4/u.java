package p068h4;

import N6.A;
import androidx.media3.common.util.Log;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p020c0.C1704s0;

public final class u {

    public final t f22509b;

    public final b f22508a = b.f22488m;

    public final int f22510c = Log.LOG_LEVEL_OFF;

    public u(t tVar) {
        this.f22509b = tVar;
    }

    public static u a(char c9) {
        return new u(new C1704s0(7, new e(c9, 0)));
    }

    public static u b(String str) {
        AbstractC1864o0.M(str.length() != 0, "The separator may not be the empty string.");
        return str.length() == 1 ? a(str.charAt(0)) : new u(new A(str, 4));
    }

    public final List c(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itL = this.f22509b.l(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            s sVar = (s) itL;
            if (!sVar.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) sVar.next());
        }
    }
}
