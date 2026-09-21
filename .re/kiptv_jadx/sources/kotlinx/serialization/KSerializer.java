package kotlinx.serialization;

/* JADX INFO: loaded from: classes4.dex */
public interface KSerializer {
    java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder);

    kotlinx.serialization.descriptors.SerialDescriptor getDescriptor();

    void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj);
}
