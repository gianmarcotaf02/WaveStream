package H3;

public final class D {

    public final int f3940a;

    public final String f3941b;

    public final boolean f3942c;

    public D(int i3, String str, boolean z6) {
        this.f3940a = i3;
        this.f3941b = str;
        this.f3942c = z6;
    }

    public boolean a() {
        return this.f3942c;
    }

    public String toString() {
        switch (this.f3940a) {
            case 1:
                String str = this.f3941b;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
                sb.append("{");
                sb.append(str);
                sb.append("}");
                sb.append(this.f3942c);
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
