package B7;

/* JADX INFO: loaded from: classes4.dex */
public class i extends B7.h implements B7.n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(B7.m mVar, kotlin.jvm.functions.Function0 function0) {
        super(mVar, function0);
        if (mVar != null) {
        } else {
            a(0);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i3) {
        java.lang.String str = i3 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i3 != 2 ? 3 : 2];
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
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i3 == 2) {
            throw new java.lang.IllegalStateException(str2);
        }
    }

    @Override // B7.h, kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() throws java.lang.Throwable {
        java.lang.Object objInvoke = super.invoke();
        if (objInvoke != null) {
            return objInvoke;
        }
        a(2);
        throw null;
    }
}
