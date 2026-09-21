package C1;

import io.ktor.sse.ServerSentEventKt;
import java.util.Objects;

public final class b {

    public final Object f867a;

    public final Object f868b;

    public b(Object obj, Object obj2) {
        this.f867a = obj;
        this.f868b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(bVar.f867a, this.f867a) && Objects.equals(bVar.f868b, this.f868b);
    }

    public final int hashCode() {
        Object obj = this.f867a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f868b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.f867a + ServerSentEventKt.SPACE + this.f868b + "}";
    }
}
