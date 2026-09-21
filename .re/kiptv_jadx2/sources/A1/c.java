package A1;

import java.util.List;
import java.util.Objects;

public final class c {

    public String f126a;

    public String f127b;

    public List f128c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Objects.equals(this.f126a, cVar.f126a) && Objects.equals(this.f127b, cVar.f127b) && Objects.equals(this.f128c, cVar.f128c);
    }

    public final int hashCode() {
        return Objects.hash(this.f126a, this.f127b, this.f128c);
    }
}
