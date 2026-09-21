package p145r0;

import Y6.f;

public final class d {

    public final int f26684a;

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f26684a == ((d) obj).f26684a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26684a);
    }

    public final String toString() {
        return f.j(new StringBuilder("AndroidContentDataType(androidAutofillType="), this.f26684a, ')');
    }
}
