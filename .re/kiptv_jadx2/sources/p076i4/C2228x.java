package p076i4;

import java.io.Serializable;
import java.util.Arrays;
import p068h4.j;

public final class C2228x extends O0 implements Serializable {

    public final j f22947h;

    public final O0 f22948i;

    public C2228x(j jVar, O0 o8) {
        this.f22947h = jVar;
        this.f22948i = o8;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        j jVar = this.f22947h;
        return this.f22948i.compare(jVar.apply(obj), jVar.apply(obj2));
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2228x) {
            C2228x c2228x = (C2228x) obj;
            if (this.f22947h.equals(c2228x.f22947h) && this.f22948i.equals(c2228x.f22948i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22947h, this.f22948i});
    }

    public final String toString() {
        return this.f22948i + ".onResultOf(" + this.f22947h + ")";
    }
}
