package p075i2;

/* JADX INFO: loaded from: classes.dex */
public final class c extends java.util.concurrent.FutureTask {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p075i2.a f22761h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p075i2.a aVar, V3.b bVar) {
        super(bVar);
        this.f22761h = aVar;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        p075i2.a aVar = this.f22761h;
        try {
            java.lang.Object obj = get();
            if (aVar.f22756l.get()) {
                return;
            }
            aVar.a(obj);
        } catch (java.lang.InterruptedException e6) {
            android.util.Log.w("AsyncTask", e6);
        } catch (java.util.concurrent.CancellationException unused) {
            if (aVar.f22756l.get()) {
                return;
            }
            aVar.a(null);
        } catch (java.util.concurrent.ExecutionException e9) {
            throw new java.lang.RuntimeException("An error occurred while executing doInBackground()", e9.getCause());
        } catch (java.lang.Throwable th) {
            throw new java.lang.RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
