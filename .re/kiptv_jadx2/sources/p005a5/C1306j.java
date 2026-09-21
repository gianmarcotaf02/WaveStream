package p005a5;

import Y6.f;
import kotlin.jvm.internal.m;

public final class C1306j extends AbstractC1346n {

    public final String f14642a;

    public C1306j(String message) {
        m.e(message, "message");
        this.f14642a = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1306j) && m.a(this.f14642a, ((C1306j) obj).f14642a);
    }

    public final int hashCode() {
        return this.f14642a.hashCode();
    }

    public final String toString() {
        return f.m(new StringBuilder("Error(message="), this.f14642a, ")");
    }
}
