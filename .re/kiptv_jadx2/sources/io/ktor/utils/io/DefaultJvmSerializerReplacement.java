package io.ktor.utils.io;

import androidx.media3.container.NalUnitUtil;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u0017*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0017B!\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\tJ\u000f\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016¨\u0006\u0018"}, d2 = {"Lio/ktor/utils/io/DefaultJvmSerializerReplacement;", "", "T", "Ljava/io/Externalizable;", "Lio/ktor/utils/io/JvmSerializer;", "serializer", "value", "<init>", "(Lio/ktor/utils/io/JvmSerializer;Ljava/lang/Object;)V", "()V", "readResolve", "()Ljava/lang/Object;", "Ljava/io/ObjectOutput;", "out", "Lh6/A;", "writeExternal", "(Ljava/io/ObjectOutput;)V", "Ljava/io/ObjectInput;", "in", "readExternal", "(Ljava/io/ObjectInput;)V", "Lio/ktor/utils/io/JvmSerializer;", "Ljava/lang/Object;", "Companion", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DefaultJvmSerializerReplacement<T> implements Externalizable {
    private static final long serialVersionUID = 0;
    private JvmSerializer<T> serializer;
    private T value;

    public DefaultJvmSerializerReplacement(JvmSerializer<T> jvmSerializer, T t9) {
        this.serializer = jvmSerializer;
        this.value = t9;
    }

    private final Object readResolve() {
        T t9 = this.value;
        m.b(t9);
        return t9;
    }

    @Override
    public void readExternal(ObjectInput in) throws ClassNotFoundException, IOException {
        m.e(in, "in");
        Object object = in.readObject();
        m.c(object, "null cannot be cast to non-null type io.ktor.utils.io.JvmSerializer<T of io.ktor.utils.io.DefaultJvmSerializerReplacement>");
        JvmSerializer<T> jvmSerializer = (JvmSerializer) object;
        this.serializer = jvmSerializer;
        Object object2 = in.readObject();
        m.c(object2, "null cannot be cast to non-null type kotlin.ByteArray");
        this.value = jvmSerializer.jvmDeserialize((byte[]) object2);
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        m.e(out, "out");
        out.writeObject(this.serializer);
        JvmSerializer<T> jvmSerializer = this.serializer;
        m.b(jvmSerializer);
        T t9 = this.value;
        m.b(t9);
        out.writeObject(jvmSerializer.jvmSerialize(t9));
    }

    public DefaultJvmSerializerReplacement() {
        this(null, null);
    }
}
