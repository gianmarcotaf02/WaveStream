package Z7;

import S7.AbstractC0906w;

public final class e extends h {
    public static final e j;

    static {
        int i3 = k.f13051c;
        int i9 = k.f13052d;
        long j9 = k.f13053e;
        String str = k.f13049a;
        e eVar = new e();
        eVar.f13046i = new c(i3, i9, j9, str);
        j = eVar;
    }

    @Override
    public final AbstractC0906w Y(int i3) {
        X7.a.a(i3);
        return i3 >= k.f13051c ? this : super.Y(i3);
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override
    public final String toString() {
        return "Dispatchers.Default";
    }
}
