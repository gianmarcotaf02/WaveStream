package p127o7;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p127o7.i f26151c = new p127o7.i(1, "SUCCESS");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f26153b;

    public i(int i3, java.lang.String str) {
        if (i3 == 0) {
            a(3);
            throw null;
        }
        this.f26152a = i3;
        this.f26153b = str;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0031  */
    public static /* synthetic */ void a(int i3) {
        java.lang.String str = (i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[(i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4) ? 3 : 2];
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
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            throw new java.lang.IllegalStateException(str2);
        }
        throw new java.lang.IllegalArgumentException(str2);
    }

    public static p127o7.i c(java.lang.String str) {
        return new p127o7.i(2, str);
    }

    public final int b() {
        int i3 = this.f26152a;
        if (i3 != 0) {
            return i3;
        }
        a(5);
        throw null;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
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
