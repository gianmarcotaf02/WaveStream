package io.ktor.client.plugins.observer;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/ktor/client/statement/HttpResponse;", "it", "Lh6/A;", "<anonymous>", "(Lio/ktor/client/statement/HttpResponse;)V"}, k = 3, mv = {2, 1, 0})
@p117n6.e(c = "io.ktor.client.plugins.observer.ResponseObserverConfig$responseHandler$1", f = "ResponseObserver.kt", l = {}, m = "invokeSuspend")
public final class ResponseObserverConfig$responseHandler$1 extends p117n6.i implements p194x6.m {
    int label;

    public ResponseObserverConfig$responseHandler$1(p100l6.c cVar) {
        super(2, cVar);
    }

    @Override // p117n6.a
    public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
        return new io.ktor.client.plugins.observer.ResponseObserverConfig$responseHandler$1(cVar);
    }

    @Override // p194x6.m
    public final java.lang.Object invoke(io.ktor.client.statement.HttpResponse httpResponse, p100l6.c cVar) {
        return ((io.ktor.client.plugins.observer.ResponseObserverConfig$responseHandler$1) create(httpResponse, cVar)).invokeSuspend(p070h6.A.f22523a);
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        p109m6.a aVar = p109m6.a.f25430h;
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.google.common.util.concurrent.P.u0(obj);
        return p070h6.A.f22523a;
    }
}
