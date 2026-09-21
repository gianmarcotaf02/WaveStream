package B7;

import java.util.concurrent.ConcurrentHashMap;

public final class e extends j {

    public final int f828l;

    public e(m mVar, ConcurrentHashMap concurrentHashMap, p194x6.j jVar, int i3) {
        super(mVar, concurrentHashMap, jVar);
        this.f828l = i3;
    }

    public static void a(int i3) {
        String str = i3 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i3 != 3 ? 3 : 2];
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
        String str2 = String.format(str, objArr);
        if (i3 == 3) {
            throw new IllegalStateException(str2);
        }
    }

    @Override
    public Object invoke(Object obj) {
        switch (this.f828l) {
            case 1:
                Object objInvoke = super.invoke(obj);
                if (objInvoke != null) {
                    return objInvoke;
                }
                throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull", "invoke"));
            default:
                return super.invoke(obj);
        }
    }
}
