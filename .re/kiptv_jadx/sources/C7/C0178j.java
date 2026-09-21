package C7;

/* JADX INFO: renamed from: C7.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0178j extends C7.AbstractC0170b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q6.y f1591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.List f1592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.Collection f1593e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0178j(Q6.y yVar, java.util.List list, java.util.Collection collection, B7.m mVar) {
        super((B7.p) mVar);
        if (list == null) {
            l(1);
            throw null;
        }
        if (collection == null) {
            l(2);
            throw null;
        }
        if (mVar == null) {
            l(3);
            throw null;
        }
        this.f1591c = yVar;
        this.f1592d = java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
        this.f1593e = java.util.Collections.unmodifiableCollection(collection);
    }

    public static /* synthetic */ void l(int i3) {
        java.lang.String str = (i3 == 4 || i3 == 5 || i3 == 6 || i3 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i3 == 4 || i3 == 5 || i3 == 6 || i3 == 7) ? 2 : 3];
        switch (i3) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i3 == 4) {
            objArr[1] = "getParameters";
        } else if (i3 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i3 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i3 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i3 != 4 && i3 != 5 && i3 != 6 && i3 != 7) {
            objArr[2] = "<init>";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i3 != 4 && i3 != 5 && i3 != 6 && i3 != 7) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    @Override // C7.AbstractC0175g
    public final java.util.Collection b() {
        java.util.Collection collection = this.f1593e;
        if (collection != null) {
            return collection;
        }
        l(6);
        throw null;
    }

    @Override // C7.AbstractC0175g
    public final N6.Q d() {
        return N6.Q.j;
    }

    @Override // C7.M
    public final java.util.List getParameters() {
        java.util.List list = this.f1592d;
        if (list != null) {
            return list;
        }
        l(4);
        throw null;
    }

    @Override // C7.M
    public final boolean j() {
        return true;
    }

    @Override // C7.AbstractC0170b
    /* JADX INFO: renamed from: m */
    public final N6.InterfaceC0691e h() {
        Q6.y yVar = this.f1591c;
        if (yVar != null) {
            return yVar;
        }
        l(5);
        throw null;
    }

    public final java.lang.String toString() {
        return p127o7.d.g(this.f1591c).f24832a;
    }
}
