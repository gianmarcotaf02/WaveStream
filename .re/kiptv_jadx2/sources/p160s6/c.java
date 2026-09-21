package p160s6;

import B2.a;
import java.io.File;
import java.util.List;

public final class c {

    public final File f27359a;

    public final Object f27360b;

    public c(File file, List list) {
        this.f27359a = file;
        this.f27360b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f27359a.equals(cVar.f27359a) && this.f27360b.equals(cVar.f27360b);
    }

    public final int hashCode() {
        return this.f27360b.hashCode() + (this.f27359a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilePathComponents(root=");
        sb.append(this.f27359a);
        sb.append(", segments=");
        return a.n(sb, this.f27360b, ')');
    }
}
