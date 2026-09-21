package B7;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends B7.j {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f828l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(B7.m mVar, java.util.concurrent.ConcurrentHashMap concurrentHashMap, p194x6.j jVar, int i3) {
        super(mVar, concurrentHashMap, jVar);
        this.f828l = i3;
    }

    public static /* synthetic */ void a(int i3) {
        java.lang.String str = i3 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i3 != 3 ? 3 : 2];
        if (i3 == 1) {
            objArr[0] = "map";
        } else if (i3 == 2) {
            objArr[0] = "computation";
        } else if (i3 != 3) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
        }
        if (i3 != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
        } else {
            objArr[1] = "computeIfAbsent";
        }
        if (i3 == 2) {
            objArr[2] = "computeIfAbsent";
        } else if (i3 != 3) {
            objArr[2] = "<init>";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i3 == 3) {
            throw new java.lang.IllegalStateException(str2);
        }
    }

    @Override // B7.j, p194x6.j
    public java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f828l) {
            case 1:
                java.lang.Object objInvoke = super.invoke(obj);
                if (objInvoke != null) {
                    return objInvoke;
                }
                throw new java.lang.IllegalStateException(java.lang.String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull", "invoke"));
            default:
                return super.invoke(obj);
        }
    }
}
