package D1;

import android.view.DisplayCutout;
import java.util.Objects;

public final class C0227l {

    public final DisplayCutout f2036a;

    public C0227l(DisplayCutout displayCutout) {
        this.f2036a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0227l.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f2036a, ((C0227l) obj).f2036a);
    }

    public final int hashCode() {
        return this.f2036a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f2036a + "}";
    }
}
