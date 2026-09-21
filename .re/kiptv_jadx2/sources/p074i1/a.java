package p074i1;

import java.util.Locale;
import kotlin.jvm.internal.m;

public final class a {

    public final Locale f22746a;

    public a(Locale locale) {
        this.f22746a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return m.a(this.f22746a.toLanguageTag(), ((a) obj).f22746a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f22746a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f22746a.toLanguageTag();
    }
}
