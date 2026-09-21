package io.ktor.utils.io.pool;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lio/ktor/utils/io/pool/NoPoolImpl;", "", "T", "Lio/ktor/utils/io/pool/ObjectPool;", "<init>", "()V", "instance", "Lh6/A;", "recycle", "(Ljava/lang/Object;)V", "dispose", "", "getCapacity", "()I", "capacity", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class NoPoolImpl<T> implements ObjectPool<T> {
    @Override
    public void close() {
        ObjectPool.DefaultImpls.close(this);
    }

    @Override
    public void dispose() {
    }

    @Override
    public int getCapacity() {
        return 0;
    }

    @Override
    public void recycle(T instance) {
        m.e(instance, "instance");
    }
}
