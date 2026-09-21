package p036d8;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements j$.time.temporal.TemporalQuery {
    @Override // j$.time.temporal.TemporalQuery
    public final java.lang.Object queryFrom(j$.time.temporal.TemporalAccessor temporalAccessor) {
        return j$.time.ZoneOffset.from(temporalAccessor);
    }
}
