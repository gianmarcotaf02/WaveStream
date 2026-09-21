package p169t7;

import p101l7.c;

public final class b {

    public final String f28530a;

    public b(String str) {
        if (str != null) {
            this.f28530a = str;
        } else {
            a(7);
            throw null;
        }
    }

    public static void a(int i3) {
        String str;
        int i9;
        if (i3 != 3 && i3 != 5) {
            switch (i3) {
                case 8:
                case 9:
                case 10:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i3 != 3 && i3 != 5) {
            switch (i3) {
                case 8:
                case 9:
                case 10:
                    i9 = 2;
                    break;
                default:
                    i9 = 3;
                    break;
            }
        } else {
            i9 = 2;
        }
        Object[] objArr = new Object[i9];
        switch (i3) {
            case 1:
            case 2:
                objArr[0] = "classId";
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 4:
            case 6:
                objArr[0] = "fqName";
                break;
            case 7:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i3 == 3) {
            objArr[1] = "internalNameByClassId";
        } else if (i3 != 5) {
            switch (i3) {
                case 8:
                    objArr[1] = "getFqNameForClassNameWithoutDollars";
                    break;
                case 9:
                    objArr[1] = "getPackageFqName";
                    break;
                case 10:
                    objArr[1] = "getInternalName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                    break;
            }
        } else {
            objArr[1] = "byFqNameWithoutInnerClasses";
        }
        switch (i3) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
                objArr[2] = "internalNameByClassId";
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
                break;
            case 4:
            case 6:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i3 != 3 && i3 != 5) {
            switch (i3) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static b b(c cVar) {
        if (cVar != null) {
            return new b(cVar.f24829a.f24832a.replace('.', '/'));
        }
        a(4);
        throw null;
    }

    public static b c(String str) {
        if (str != null) {
            return new b(str);
        }
        a(0);
        throw null;
    }

    public static String e(p101l7.b bVar) {
        String strReplace = bVar.f24826b.f24829a.f24832a.replace('.', '$');
        c cVar = bVar.f24825a;
        if (!cVar.f24829a.c()) {
            strReplace = cVar.f24829a.f24832a.replace('.', '/') + "/" + strReplace;
        }
        if (strReplace != null) {
            return strReplace;
        }
        a(3);
        throw null;
    }

    public final String d() {
        String str = this.f28530a;
        if (str != null) {
            return str;
        }
        a(10);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return this.f28530a.equals(((b) obj).f28530a);
    }

    public final int hashCode() {
        return this.f28530a.hashCode();
    }

    public final String toString() {
        return this.f28530a;
    }
}
