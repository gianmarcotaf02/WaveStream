package io.ktor.client.plugins.observer;

import com.google.common.util.concurrent.P;
import io.ktor.client.statement.HttpResponse;
import kotlin.Metadata;
import p070h6.A;
import p100l6.c;
import p117n6.e;
import p117n6.i;
import p194x6.m;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/ktor/client/statement/HttpResponse;", "it", "Lh6/A;", "<anonymous>", "(Lio/ktor/client/statement/HttpResponse;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.client.plugins.observer.ResponseObserverConfig$responseHandler$1", f = "ResponseObserver.kt", l = {}, m = "invokeSuspend")
public final class ResponseObserverConfig$responseHandler$1 extends i implements m {
    int label;

    public ResponseObserverConfig$responseHandler$1(c cVar) {
        super(2, cVar);
    }

    @Override
    public final c create(Object obj, c cVar) {
        return new ResponseObserverConfig$responseHandler$1(cVar);
    }

    @Override
    public final Object invoke(HttpResponse httpResponse, c cVar) {
        return ((ResponseObserverConfig$responseHandler$1) create(httpResponse, cVar)).invokeSuspend(A.f22523a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        p109m6.a aVar = p109m6.a.f25430h;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        P.u0(obj);
        return A.f22523a;
    }
}
