package p110m7;

public final class C2640m implements Comparable {

    public final int f25495h;

    public final M f25496i;
    public final boolean j;

    public C2640m(int i3, M m8, boolean z6) {
        this.f25495h = i3;
        this.f25496i = m8;
        this.j = z6;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f25495h - ((C2640m) obj).f25495h;
    }
}
