package androidx.media3.exoplayer.source;

import java.util.List;
import p076i4.AbstractC2186b0;
import p076i4.S0;
import p076i4.Z;

public final class DefaultCompositeSequenceableLoaderFactory implements CompositeSequenceableLoaderFactory {
    @Override
    public SequenceableLoader create(List<? extends SequenceableLoader> list, List<List<Integer>> list2) {
        return new CompositeSequenceableLoader(list, list2);
    }

    @Override
    @Deprecated
    public SequenceableLoader createCompositeSequenceableLoader(SequenceableLoader... sequenceableLoaderArr) {
        return new CompositeSequenceableLoader(sequenceableLoaderArr);
    }

    @Override
    public SequenceableLoader empty() {
        Z z6 = AbstractC2186b0.f22868i;
        S0 s9 = S0.f22832l;
        return new CompositeSequenceableLoader(s9, s9);
    }
}
