package L6;

public abstract class k {

    public final p101l7.c f7085a;

    public final String f7086b;

    public k(String str, p101l7.c packageFqName) {
        kotlin.jvm.internal.m.e(packageFqName, "packageFqName");
        this.f7085a = packageFqName;
        this.f7086b = str;
    }

    public final p101l7.e a(int i3) {
        return p101l7.e.e(this.f7086b + i3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7085a);
        sb.append('.');
        return Y6.f.l(sb, this.f7086b, 'N');
    }
}
