package p070h6;

import kotlin.jvm.internal.m;

public final class t implements Comparable {

    public final int f22551h;

    public t(int i3) {
        this.f22551h = i3;
    }

    public static String a(int i3) {
        return String.valueOf(((long) i3) & 4294967295L);
    }

    @Override
    public final int compareTo(Object obj) {
        return m.f(this.f22551h ^ Integer.MIN_VALUE, ((t) obj).f22551h ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.f22551h == ((t) obj).f22551h;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22551h);
    }

    public final String toString() {
        return a(this.f22551h);
    }
}
