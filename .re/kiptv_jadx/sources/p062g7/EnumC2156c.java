package p062g7;

/* JADX INFO: renamed from: g7.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC2156c implements p110m7.p {
    BYTE(0),
    CHAR(1),
    SHORT(2),
    INT(3),
    LONG(4),
    FLOAT(5),
    DOUBLE(6),
    BOOLEAN(7),
    STRING(8),
    CLASS(9),
    ENUM(10),
    ANNOTATION(11),
    ARRAY(12);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f22145h;

    EnumC2156c(int i3) {
        this.f22145h = i3;
    }

    public static p062g7.EnumC2156c b(int i3) {
        switch (i3) {
            case 0:
                return BYTE;
            case 1:
                return CHAR;
            case 2:
                return SHORT;
            case 3:
                return INT;
            case 4:
                return LONG;
            case 5:
                return FLOAT;
            case 6:
                return DOUBLE;
            case 7:
                return BOOLEAN;
            case 8:
                return STRING;
            case 9:
                return CLASS;
            case 10:
                return ENUM;
            case 11:
                return ANNOTATION;
            case 12:
                return ARRAY;
            default:
                return null;
        }
    }

    @Override // p110m7.p
    public final int a() {
        return this.f22145h;
    }
}
