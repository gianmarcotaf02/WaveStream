package p127o7;

public final class i {

    public static final i f26151c = new i(1, "SUCCESS");

    public final int f26152a;

    public final String f26153b;

    public i(int i3, String str) {
        if (i3 == 0) {
            a(3);
            throw null;
        }
        this.f26152a = i3;
        this.f26153b = str;
    }

    public static void a(int i3) {
        String str = (i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4) ? 3 : 2];
        if (i3 == 1 || i3 == 2) {
            objArr[0] = "debugMessage";
        } else if (i3 == 3) {
            objArr[0] = "success";
        } else if (i3 != 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
        } else {
            objArr[0] = "debugMessage";
        }
        switch (i3) {
            case 1:
            case 2:
            case 3:
            case 4:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                break;
            case 5:
                objArr[1] = "getResult";
                break;
            case 6:
                objArr[1] = "getDebugMessage";
                break;
            default:
                objArr[1] = "success";
                break;
        }
        if (i3 == 1) {
            objArr[2] = "incompatible";
        } else if (i3 == 2) {
            objArr[2] = "conflict";
        } else if (i3 == 3 || i3 == 4) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    public static i c(String str) {
        return new i(2, str);
    }

    public final int b() {
        int i3 = this.f26152a;
        if (i3 != 0) {
            return i3;
        }
        a(5);
        throw null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i3 = this.f26152a;
        if (i3 == 1) {
            str = "OVERRIDABLE";
        } else if (i3 != 2) {
            str = i3 != 3 ? "null" : "CONFLICT";
        } else {
            str = "INCOMPATIBLE";
        }
        sb.append(str);
        sb.append(": ");
        sb.append(this.f26153b);
        return sb.toString();
    }
}
