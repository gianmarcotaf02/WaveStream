package p013b3;

import Y6.f;

public final class b {

    public final String f17868a;

    public b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f17868a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f17868a.equals(((b) obj).f17868a);
    }

    public final int hashCode() {
        return this.f17868a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return f.m(new StringBuilder("Encoding{name=\""), this.f17868a, "\"}");
    }
}
