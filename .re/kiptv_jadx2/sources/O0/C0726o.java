package O0;

import java.io.Serializable;

public final class C0726o {

    public final int f7665a;

    public final C0725n f7666b;

    public final C0725n f7667c;

    public final C0725n f7668d;

    public final C0725n f7669e;

    public final Serializable f7670f;

    public C0726o(String str) {
        this.f7665a = 1;
        this.f7670f = str;
        this.f7666b = new C0725n(1, null);
        this.f7667c = new C0725n(0, null);
        this.f7668d = new C0725n(1, null);
        this.f7669e = new C0725n(0, null);
    }

    public final C0725n a() {
        switch (this.f7665a) {
            case 0:
                break;
        }
        return this.f7669e;
    }

    public final C0725n b() {
        switch (this.f7665a) {
            case 0:
                break;
        }
        return this.f7666b;
    }

    public final C0725n c() {
        switch (this.f7665a) {
            case 0:
                break;
        }
        return this.f7668d;
    }

    public final C0725n d() {
        switch (this.f7665a) {
            case 0:
                break;
        }
        return this.f7667c;
    }

    public final String toString() {
        switch (this.f7665a) {
            case 0:
                return p078i6.m.v0((C0726o[]) this.f7670f, null, "innermostOf(", ")", null, 57);
            default:
                String str = (String) this.f7670f;
                return str != null ? B2.a.i(')', "RectRulers(", str) : super.toString();
        }
    }

    public C0726o(C0726o[] c0726oArr) {
        this.f7665a = 0;
        this.f7670f = c0726oArr;
        int length = c0726oArr.length;
        C0725n[] c0725nArr = new C0725n[length];
        for (int i3 = 0; i3 < length; i3++) {
            c0725nArr[i3] = ((C0726o[]) this.f7670f)[i3].b();
        }
        this.f7666b = new C0725n(1, new u0(c0725nArr, 0));
        int length2 = ((C0726o[]) this.f7670f).length;
        C0725n[] c0725nArr2 = new C0725n[length2];
        for (int i9 = 0; i9 < length2; i9++) {
            c0725nArr2[i9] = ((C0726o[]) this.f7670f)[i9].d();
        }
        this.f7667c = new C0725n(0, new C0724m(c0725nArr2, 0));
        int length3 = ((C0726o[]) this.f7670f).length;
        C0725n[] c0725nArr3 = new C0725n[length3];
        for (int i10 = 0; i10 < length3; i10++) {
            c0725nArr3[i10] = ((C0726o[]) this.f7670f)[i10].c();
        }
        this.f7668d = new C0725n(1, new u0(c0725nArr3, 1));
        int length4 = ((C0726o[]) this.f7670f).length;
        C0725n[] c0725nArr4 = new C0725n[length4];
        for (int i11 = 0; i11 < length4; i11++) {
            c0725nArr4[i11] = ((C0726o[]) this.f7670f)[i11].a();
        }
        this.f7669e = new C0725n(0, new C0724m(c0725nArr4, 1));
    }
}
