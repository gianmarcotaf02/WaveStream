package K1;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    /* JADX WARN: Code duplicated, block: B:12:? A[RETURN, SYNTHETIC] */
    public static void a(android.os.CancellationSignal cancellationSignal, kotlin.jvm.functions.Function0 function0) {
        boolean z6;
        if (cancellationSignal != null) {
            if (cancellationSignal.isCanceled()) {
                android.util.Log.i("PlayServicesImpl", "the flow has been canceled");
                z6 = true;
            }
            if (z6) {
            }
            function0.invoke();
        }
        android.util.Log.i("PlayServicesImpl", "No cancellationSignal found");
        z6 = false;
        if (z6) {
            function0.invoke();
        }
    }
}
