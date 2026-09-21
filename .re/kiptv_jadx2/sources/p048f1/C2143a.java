package p048f1;

import Y6.f;

public final class C2143a implements x {

    public final int f21633h;

    public C2143a(int i3) {
        this.f21633h = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2143a) && this.f21633h == ((C2143a) obj).f21633h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21633h);
    }

    public final String toString() {
        return f.j(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f21633h, ')');
    }
}
