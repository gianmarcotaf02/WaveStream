package M;

import p194x6.j;

public final class d extends b {

    public final String f7109b;

    public final int f7110c;

    public final j f7111d;

    public d(Object obj, String str, int i3, j jVar) {
        super(obj);
        this.f7109b = str;
        this.f7110c = i3;
        this.f7111d = jVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.f7106a);
        sb.append(", label=\"");
        sb.append(this.f7109b);
        sb.append("\", leadingIcon=");
        return Y6.f.j(sb, this.f7110c, ')');
    }
}
