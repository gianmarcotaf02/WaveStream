package I0;

import android.view.KeyEvent;
import kotlin.jvm.internal.m;

public final class b {

    public final KeyEvent f4568a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return m.a(this.f4568a, ((b) obj).f4568a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4568a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f4568a + ')';
    }
}
