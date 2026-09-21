package p020c0;

import Y6.f;

public final class C1668a {

    public int f18215a;

    public C1668a(int i3) {
        this.f18215a = i3;
    }

    public final boolean a() {
        return this.f18215a != Integer.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{ location = ");
        return f.k(sb, this.f18215a, " }");
    }
}
