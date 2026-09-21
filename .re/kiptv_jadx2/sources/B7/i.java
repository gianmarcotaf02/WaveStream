package B7;

import kotlin.jvm.functions.Function0;

public class i extends h implements n {
    public i(m mVar, Function0 function0) {
        super(mVar, function0);
        if (mVar != null) {
        } else {
            a(0);
            throw null;
        }
    }

    public static void a(int i3) {
        String str = i3 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i3 != 2 ? 3 : 2];
        if (i3 == 1) {
            objArr[0] = "computable";
        } else if (i3 != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
        }
        if (i3 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
        } else {
            objArr[1] = "invoke";
        }
        if (i3 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i3 == 2) {
            throw new IllegalStateException(str2);
        }
    }

    @Override
    public final Object invoke() throws Throwable {
        Object objInvoke = super.invoke();
        if (objInvoke != null) {
            return objInvoke;
        }
        a(2);
        throw null;
    }
}
