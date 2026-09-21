package J5;

import io.ktor.utils.io.ByteReadChannelOperations_jvmKt;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import p020c0.C1673c0;

public final class P implements p194x6.j {

    public final int f6226h = 1;

    public final long f6227i;
    public final kotlin.jvm.internal.z j;

    public final Object f6228k;

    public P(long j, kotlin.jvm.internal.z zVar, WritableByteChannel writableByteChannel) {
        this.f6227i = j;
        this.j = zVar;
        this.f6228k = writableByteChannel;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f6226h) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                kotlin.jvm.internal.z zVar = this.j;
                if (jLongValue - zVar.f24556h >= 30000000) {
                    zVar.f24556h = jLongValue;
                    ((C1673c0) this.f6228k).h((jLongValue - this.f6227i) / 1.0E9f);
                }
                return p070h6.A.f22523a;
            default:
                return ByteReadChannelOperations_jvmKt.copyTo$lambda$3(this.f6227i, this.j, (WritableByteChannel) this.f6228k, (ByteBuffer) obj);
        }
    }

    public P(kotlin.jvm.internal.z zVar, long j, C1673c0 c1673c0) {
        this.j = zVar;
        this.f6227i = j;
        this.f6228k = c1673c0;
    }
}
