package Z2;

public final class C1200l {

    public C1204n f12895a;

    public V f12896b;

    public int f12897c;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.f12895a));
        sb.append(" {...} (src=");
        int i3 = this.f12897c;
        if (i3 != 1) {
            str = i3 != 2 ? "null" : "RenderOptions";
        } else {
            str = "Document";
        }
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
