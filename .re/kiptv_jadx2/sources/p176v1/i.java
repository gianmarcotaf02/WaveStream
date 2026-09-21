package p176v1;

import android.content.res.Resources;
import java.util.Objects;

public final class i {

    public final Resources f29134a;

    public final Resources.Theme f29135b;

    public i(Resources resources, Resources.Theme theme) {
        this.f29134a = resources;
        this.f29135b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f29134a.equals(iVar.f29134a) && Objects.equals(this.f29135b, iVar.f29135b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f29134a, this.f29135b);
    }
}
