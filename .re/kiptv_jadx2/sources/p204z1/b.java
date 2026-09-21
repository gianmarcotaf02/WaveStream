package p204z1;

import android.os.LocaleList;
import java.util.Locale;

public final class b {

    public static final b f32139b = new b(new c(new LocaleList(new Locale[0])));

    public final c f32140a;

    public b(c cVar) {
        this.f32140a = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f32140a.equals(((b) obj).f32140a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32140a.f32141a.hashCode();
    }

    public final String toString() {
        return this.f32140a.f32141a.toString();
    }
}
