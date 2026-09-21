package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0003\bÊ\u0001\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012R\u001a\u0010\u001b\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012R\u001a\u0010\u001d\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012R\u001a\u0010\u001f\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010\u0012R\u001a\u0010!\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b!\u0010\u0010\u001a\u0004\b\"\u0010\u0012R\u001a\u0010#\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b#\u0010\u0010\u001a\u0004\b$\u0010\u0012R\u001a\u0010%\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b%\u0010\u0010\u001a\u0004\b&\u0010\u0012R\u001a\u0010'\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b'\u0010\u0010\u001a\u0004\b(\u0010\u0012R\u001a\u0010)\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b)\u0010\u0010\u001a\u0004\b*\u0010\u0012R\u001a\u0010+\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b+\u0010\u0010\u001a\u0004\b,\u0010\u0012R\u001a\u0010-\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b-\u0010\u0010\u001a\u0004\b.\u0010\u0012R\u001a\u0010/\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b/\u0010\u0010\u001a\u0004\b0\u0010\u0012R\u001a\u00101\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b1\u0010\u0010\u001a\u0004\b2\u0010\u0012R\u001a\u00103\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b3\u0010\u0010\u001a\u0004\b4\u0010\u0012R\u001a\u00105\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b5\u0010\u0010\u001a\u0004\b6\u0010\u0012R\u001a\u00107\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b7\u0010\u0010\u001a\u0004\b8\u0010\u0012R\u001a\u00109\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b9\u0010\u0010\u001a\u0004\b:\u0010\u0012R\u001a\u0010;\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b;\u0010\u0010\u001a\u0004\b<\u0010\u0012R\u001a\u0010=\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b=\u0010\u0010\u001a\u0004\b>\u0010\u0012R\u001a\u0010?\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b?\u0010\u0010\u001a\u0004\b@\u0010\u0012R\u001a\u0010A\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\bA\u0010\u0010\u001a\u0004\bB\u0010\u0012R\u001a\u0010C\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\bC\u0010\u0010\u001a\u0004\bD\u0010\u0012R\u001a\u0010E\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\bE\u0010\u0010\u001a\u0004\bF\u0010\u0012R\u001a\u0010G\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\bG\u0010\u0010\u001a\u0004\bH\u0010\u0012R\u001a\u0010I\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\bI\u0010\u0010\u001a\u0004\bJ\u0010\u0012R\u001a\u0010K\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\bK\u0010\u0010\u001a\u0004\bL\u0010\u0012R\u001a\u0010M\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\bM\u0010\u0010\u001a\u0004\bN\u0010\u0012R\u001a\u0010O\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\bO\u0010\u0010\u001a\u0004\bP\u0010\u0012R\u001a\u0010Q\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\bQ\u0010\u0010\u001a\u0004\bR\u0010\u0012R\u001a\u0010S\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\bS\u0010\u0010\u001a\u0004\bT\u0010\u0012R\u001a\u0010U\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\bU\u0010\u0010\u001a\u0004\bV\u0010\u0012R\u001a\u0010W\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\bW\u0010\u0010\u001a\u0004\bX\u0010\u0012R\u001a\u0010Y\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\bY\u0010\u0010\u001a\u0004\bZ\u0010\u0012R\u001a\u0010[\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b[\u0010\u0010\u001a\u0004\b\\\u0010\u0012R\u001a\u0010]\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b]\u0010\u0010\u001a\u0004\b^\u0010\u0012R\u001a\u0010_\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b_\u0010\u0010\u001a\u0004\b`\u0010\u0012R\u001a\u0010a\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\ba\u0010\u0010\u001a\u0004\bb\u0010\u0012R\u001a\u0010c\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\bc\u0010\u0010\u001a\u0004\bd\u0010\u0012R\u001a\u0010e\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\be\u0010\u0010\u001a\u0004\bf\u0010\u0012R\u001a\u0010g\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\bg\u0010\u0010\u001a\u0004\bh\u0010\u0012R\u001a\u0010i\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\bi\u0010\u0010\u001a\u0004\bj\u0010\u0012R\u001a\u0010k\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\bk\u0010\u0010\u001a\u0004\bl\u0010\u0012R\u001a\u0010m\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\bm\u0010\u0010\u001a\u0004\bn\u0010\u0012R\u001a\u0010o\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\bo\u0010\u0010\u001a\u0004\bp\u0010\u0012R\u001a\u0010q\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\bq\u0010\u0010\u001a\u0004\br\u0010\u0012R\u001a\u0010s\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\bs\u0010\u0010\u001a\u0004\bt\u0010\u0012R\u001a\u0010u\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\bu\u0010\u0010\u001a\u0004\bv\u0010\u0012R\u001a\u0010w\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\bw\u0010\u0010\u001a\u0004\bx\u0010\u0012R\u001a\u0010y\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\by\u0010\u0010\u001a\u0004\bz\u0010\u0012R\u001a\u0010{\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b{\u0010\u0010\u001a\u0004\b|\u0010\u0012R\u001a\u0010}\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b}\u0010\u0010\u001a\u0004\b~\u0010\u0012R\u001b\u0010\u007f\u001a\u00020\u00048\u0006X\u0086D¢\u0006\r\n\u0004\b\u007f\u0010\u0010\u001a\u0005\b\u0080\u0001\u0010\u0012R\u001d\u0010\u0081\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\u0010\u001a\u0005\b\u0082\u0001\u0010\u0012R\u001d\u0010\u0083\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010\u0010\u001a\u0005\b\u0084\u0001\u0010\u0012R\u001d\u0010\u0085\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\u0010\u001a\u0005\b\u0086\u0001\u0010\u0012R\u001d\u0010\u0087\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\u0010\u001a\u0005\b\u0088\u0001\u0010\u0012R\u001d\u0010\u0089\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010\u0010\u001a\u0005\b\u008a\u0001\u0010\u0012R\u001d\u0010\u008b\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\u0010\u001a\u0005\b\u008c\u0001\u0010\u0012R\u001d\u0010\u008d\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010\u0010\u001a\u0005\b\u008e\u0001\u0010\u0012R\u001d\u0010\u008f\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010\u0010\u001a\u0005\b\u0090\u0001\u0010\u0012R\u001d\u0010\u0091\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010\u0010\u001a\u0005\b\u0092\u0001\u0010\u0012R\u001d\u0010\u0093\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010\u0010\u001a\u0005\b\u0094\u0001\u0010\u0012R\u001d\u0010\u0095\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010\u0010\u001a\u0005\b\u0096\u0001\u0010\u0012R\u001d\u0010\u0097\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010\u0010\u001a\u0005\b\u0098\u0001\u0010\u0012R\u001d\u0010\u0099\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010\u0010\u001a\u0005\b\u009a\u0001\u0010\u0012R\u001d\u0010\u009b\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010\u0010\u001a\u0005\b\u009c\u0001\u0010\u0012R\u001d\u0010\u009d\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010\u0010\u001a\u0005\b\u009e\u0001\u0010\u0012R\u001d\u0010\u009f\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010\u0010\u001a\u0005\b \u0001\u0010\u0012R\u001d\u0010¡\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\b¡\u0001\u0010\u0010\u001a\u0005\b¢\u0001\u0010\u0012R\u001d\u0010£\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\b£\u0001\u0010\u0010\u001a\u0005\b¤\u0001\u0010\u0012R\u001d\u0010¥\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\b¥\u0001\u0010\u0010\u001a\u0005\b¦\u0001\u0010\u0012R\u001d\u0010§\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\b§\u0001\u0010\u0010\u001a\u0005\b¨\u0001\u0010\u0012R\u001d\u0010©\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\b©\u0001\u0010\u0010\u001a\u0005\bª\u0001\u0010\u0012R\u001d\u0010«\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\b«\u0001\u0010\u0010\u001a\u0005\b¬\u0001\u0010\u0012R\u001d\u0010\u00ad\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u00ad\u0001\u0010\u0010\u001a\u0005\b®\u0001\u0010\u0012R\u001d\u0010¯\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\b¯\u0001\u0010\u0010\u001a\u0005\b°\u0001\u0010\u0012R\u001d\u0010±\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\b±\u0001\u0010\u0010\u001a\u0005\b²\u0001\u0010\u0012R\u001d\u0010³\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\b³\u0001\u0010\u0010\u001a\u0005\b´\u0001\u0010\u0012R\u001d\u0010µ\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\bµ\u0001\u0010\u0010\u001a\u0005\b¶\u0001\u0010\u0012R\u001d\u0010·\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\b·\u0001\u0010\u0010\u001a\u0005\b¸\u0001\u0010\u0012R\u001d\u0010¹\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\b¹\u0001\u0010\u0010\u001a\u0005\bº\u0001\u0010\u0012R\u001d\u0010»\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\b»\u0001\u0010\u0010\u001a\u0005\b¼\u0001\u0010\u0012R\u001d\u0010½\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\b½\u0001\u0010\u0010\u001a\u0005\b¾\u0001\u0010\u0012R\u001d\u0010¿\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\b¿\u0001\u0010\u0010\u001a\u0005\bÀ\u0001\u0010\u0012R\u001d\u0010Á\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\bÁ\u0001\u0010\u0010\u001a\u0005\bÂ\u0001\u0010\u0012R\u001d\u0010Ã\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\bÃ\u0001\u0010\u0010\u001a\u0005\bÄ\u0001\u0010\u0012R\u001d\u0010Å\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\bÅ\u0001\u0010\u0010\u001a\u0005\bÆ\u0001\u0010\u0012R\u001d\u0010Ç\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\bÇ\u0001\u0010\u0010\u001a\u0005\bÈ\u0001\u0010\u0012R\u001d\u0010É\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\bÉ\u0001\u0010\u0010\u001a\u0005\bÊ\u0001\u0010\u0012R\u001d\u0010Ë\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\bË\u0001\u0010\u0010\u001a\u0005\bÌ\u0001\u0010\u0012R\u001d\u0010Í\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\bÍ\u0001\u0010\u0010\u001a\u0005\bÎ\u0001\u0010\u0012R\u001d\u0010Ï\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\bÏ\u0001\u0010\u0010\u001a\u0005\bÐ\u0001\u0010\u0012R\u001d\u0010Ñ\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\bÑ\u0001\u0010\u0010\u001a\u0005\bÒ\u0001\u0010\u0012R\u001d\u0010Ó\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u000e\n\u0005\bÓ\u0001\u0010\u0010\u001a\u0005\bÔ\u0001\u0010\u0012R\u001e\u0010Ö\u0001\u001a\t\u0012\u0004\u0012\u00020\u00040Õ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R#\u0010Ù\u0001\u001a\t\u0012\u0004\u0012\u00020\u00040Ø\u00018\u0006¢\u0006\u0010\n\u0006\bÙ\u0001\u0010Ú\u0001\u001a\u0006\bÛ\u0001\u0010Ü\u0001R%\u0010à\u0001\u001a\t\u0012\u0004\u0012\u00020\u00040Õ\u00018FX\u0087\u0004¢\u0006\u000f\u0012\u0005\bß\u0001\u0010\u0003\u001a\u0006\bÝ\u0001\u0010Þ\u0001¨\u0006á\u0001"}, d2 = {"Lio/ktor/http/HttpHeaders;", "", "<init>", "()V", "", "header", "", "isUnsafe", "(Ljava/lang/String;)Z", "name", "Lh6/A;", "checkHeaderName", "(Ljava/lang/String;)V", "value", "checkHeaderValue", "Accept", "Ljava/lang/String;", "getAccept", "()Ljava/lang/String;", "AcceptCharset", "getAcceptCharset", "AcceptEncoding", "getAcceptEncoding", "AcceptLanguage", "getAcceptLanguage", "AcceptRanges", "getAcceptRanges", "Age", "getAge", "Allow", "getAllow", "ALPN", "getALPN", "AuthenticationInfo", "getAuthenticationInfo", "Authorization", "getAuthorization", "CacheControl", "getCacheControl", "Connection", "getConnection", "ContentDisposition", "getContentDisposition", "ContentEncoding", "getContentEncoding", "ContentLanguage", "getContentLanguage", "ContentLength", "getContentLength", "ContentLocation", "getContentLocation", "ContentRange", "getContentRange", "ContentType", "getContentType", io.sentry.util.HttpUtils.COOKIE_HEADER_NAME, "getCookie", "DASL", "getDASL", "Date", "getDate", "DAV", "getDAV", "Depth", "getDepth", "Destination", "getDestination", "ETag", "getETag", "Expect", "getExpect", "Expires", "getExpires", "From", "getFrom", "Forwarded", "getForwarded", "Host", "getHost", "HTTP2Settings", "getHTTP2Settings", "If", "getIf", "IfMatch", "getIfMatch", "IfModifiedSince", "getIfModifiedSince", "IfNoneMatch", "getIfNoneMatch", "IfRange", "getIfRange", "IfScheduleTagMatch", "getIfScheduleTagMatch", "IfUnmodifiedSince", "getIfUnmodifiedSince", "LastModified", "getLastModified", "Location", "getLocation", "LockToken", "getLockToken", "Link", "getLink", "MaxForwards", "getMaxForwards", "MIMEVersion", "getMIMEVersion", "OrderingType", "getOrderingType", "Origin", "getOrigin", "Overwrite", "getOverwrite", "Position", "getPosition", "Pragma", "getPragma", io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder.HEADER_PREFER, "getPrefer", "PreferenceApplied", "getPreferenceApplied", "ProxyAuthenticate", "getProxyAuthenticate", "ProxyAuthenticationInfo", "getProxyAuthenticationInfo", "ProxyAuthorization", "getProxyAuthorization", "PublicKeyPins", "getPublicKeyPins", "PublicKeyPinsReportOnly", "getPublicKeyPinsReportOnly", "Range", "getRange", "Referrer", "getReferrer", "RetryAfter", "getRetryAfter", "ScheduleReply", "getScheduleReply", "ScheduleTag", "getScheduleTag", "SecWebSocketAccept", "getSecWebSocketAccept", "SecWebSocketExtensions", "getSecWebSocketExtensions", "SecWebSocketKey", "getSecWebSocketKey", "SecWebSocketProtocol", "getSecWebSocketProtocol", "SecWebSocketVersion", "getSecWebSocketVersion", "Server", "getServer", "SetCookie", "getSetCookie", "SLUG", "getSLUG", "StrictTransportSecurity", "getStrictTransportSecurity", "TE", "getTE", "Timeout", "getTimeout", "Trailer", "getTrailer", "TransferEncoding", "getTransferEncoding", "Upgrade", "getUpgrade", "UserAgent", "getUserAgent", "Vary", "getVary", "Via", "getVia", "Warning", "getWarning", "WWWAuthenticate", "getWWWAuthenticate", "AccessControlAllowOrigin", "getAccessControlAllowOrigin", "AccessControlAllowMethods", "getAccessControlAllowMethods", "AccessControlAllowCredentials", "getAccessControlAllowCredentials", "AccessControlAllowHeaders", "getAccessControlAllowHeaders", "AccessControlRequestMethod", "getAccessControlRequestMethod", "AccessControlRequestHeaders", "getAccessControlRequestHeaders", "AccessControlExposeHeaders", "getAccessControlExposeHeaders", "AccessControlMaxAge", "getAccessControlMaxAge", "XHttpMethodOverride", "getXHttpMethodOverride", "XForwardedHost", "getXForwardedHost", "XForwardedServer", "getXForwardedServer", "XForwardedProto", "getXForwardedProto", "XForwardedFor", "getXForwardedFor", "XForwardedPort", "getXForwardedPort", "XRequestId", "getXRequestId", "XCorrelationId", "getXCorrelationId", "XTotalCount", "getXTotalCount", "", "UnsafeHeadersArray", "[Ljava/lang/String;", "", "UnsafeHeadersList", "Ljava/util/List;", "getUnsafeHeadersList", "()Ljava/util/List;", "getUnsafeHeaders", "()[Ljava/lang/String;", "getUnsafeHeaders$annotations", "UnsafeHeaders", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HttpHeaders {
    private static final java.lang.String[] UnsafeHeadersArray;
    private static final java.util.List<java.lang.String> UnsafeHeadersList;
    public static final io.ktor.http.HttpHeaders INSTANCE = new io.ktor.http.HttpHeaders();
    private static final java.lang.String Accept = "Accept";
    private static final java.lang.String AcceptCharset = "Accept-Charset";
    private static final java.lang.String AcceptEncoding = "Accept-Encoding";
    private static final java.lang.String AcceptLanguage = "Accept-Language";
    private static final java.lang.String AcceptRanges = "Accept-Ranges";
    private static final java.lang.String Age = "Age";
    private static final java.lang.String Allow = "Allow";
    private static final java.lang.String ALPN = "ALPN";
    private static final java.lang.String AuthenticationInfo = "Authentication-Info";
    private static final java.lang.String Authorization = "Authorization";
    private static final java.lang.String CacheControl = "Cache-Control";
    private static final java.lang.String Connection = "Connection";
    private static final java.lang.String ContentDisposition = "Content-Disposition";
    private static final java.lang.String ContentEncoding = "Content-Encoding";
    private static final java.lang.String ContentLanguage = "Content-Language";
    private static final java.lang.String ContentLength = "Content-Length";
    private static final java.lang.String ContentLocation = "Content-Location";
    private static final java.lang.String ContentRange = "Content-Range";
    private static final java.lang.String ContentType = "Content-Type";
    private static final java.lang.String Cookie = io.sentry.util.HttpUtils.COOKIE_HEADER_NAME;
    private static final java.lang.String DASL = "DASL";
    private static final java.lang.String Date = "Date";
    private static final java.lang.String DAV = "DAV";
    private static final java.lang.String Depth = "Depth";
    private static final java.lang.String Destination = "Destination";
    private static final java.lang.String ETag = "ETag";
    private static final java.lang.String Expect = "Expect";
    private static final java.lang.String Expires = "Expires";
    private static final java.lang.String From = "From";
    private static final java.lang.String Forwarded = "Forwarded";
    private static final java.lang.String Host = "Host";
    private static final java.lang.String HTTP2Settings = "HTTP2-Settings";
    private static final java.lang.String If = "If";
    private static final java.lang.String IfMatch = "If-Match";
    private static final java.lang.String IfModifiedSince = "If-Modified-Since";
    private static final java.lang.String IfNoneMatch = "If-None-Match";
    private static final java.lang.String IfRange = "If-Range";
    private static final java.lang.String IfScheduleTagMatch = "If-Schedule-Tag-Match";
    private static final java.lang.String IfUnmodifiedSince = "If-Unmodified-Since";
    private static final java.lang.String LastModified = "Last-Modified";
    private static final java.lang.String Location = "Location";
    private static final java.lang.String LockToken = "Lock-Token";
    private static final java.lang.String Link = "Link";
    private static final java.lang.String MaxForwards = "Max-Forwards";
    private static final java.lang.String MIMEVersion = "MIME-Version";
    private static final java.lang.String OrderingType = "Ordering-Type";
    private static final java.lang.String Origin = "Origin";
    private static final java.lang.String Overwrite = "Overwrite";
    private static final java.lang.String Position = "Position";
    private static final java.lang.String Pragma = "Pragma";
    private static final java.lang.String Prefer = io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder.HEADER_PREFER;
    private static final java.lang.String PreferenceApplied = "Preference-Applied";
    private static final java.lang.String ProxyAuthenticate = "Proxy-Authenticate";
    private static final java.lang.String ProxyAuthenticationInfo = "Proxy-Authentication-Info";
    private static final java.lang.String ProxyAuthorization = "Proxy-Authorization";
    private static final java.lang.String PublicKeyPins = "Public-Key-Pins";
    private static final java.lang.String PublicKeyPinsReportOnly = "Public-Key-Pins-Report-Only";
    private static final java.lang.String Range = "Range";
    private static final java.lang.String Referrer = "Referer";
    private static final java.lang.String RetryAfter = "Retry-After";
    private static final java.lang.String ScheduleReply = "Schedule-Reply";
    private static final java.lang.String ScheduleTag = "Schedule-Tag";
    private static final java.lang.String SecWebSocketAccept = "Sec-WebSocket-Accept";
    private static final java.lang.String SecWebSocketExtensions = "Sec-WebSocket-Extensions";
    private static final java.lang.String SecWebSocketKey = "Sec-WebSocket-Key";
    private static final java.lang.String SecWebSocketProtocol = "Sec-WebSocket-Protocol";
    private static final java.lang.String SecWebSocketVersion = "Sec-WebSocket-Version";
    private static final java.lang.String Server = "Server";
    private static final java.lang.String SetCookie = "Set-Cookie";
    private static final java.lang.String SLUG = "SLUG";
    private static final java.lang.String StrictTransportSecurity = "Strict-Transport-Security";
    private static final java.lang.String TE = "TE";
    private static final java.lang.String Timeout = "Timeout";
    private static final java.lang.String Trailer = "Trailer";
    private static final java.lang.String TransferEncoding = "Transfer-Encoding";
    private static final java.lang.String Upgrade = "Upgrade";
    private static final java.lang.String UserAgent = "User-Agent";
    private static final java.lang.String Vary = "Vary";
    private static final java.lang.String Via = "Via";
    private static final java.lang.String Warning = "Warning";
    private static final java.lang.String WWWAuthenticate = "WWW-Authenticate";
    private static final java.lang.String AccessControlAllowOrigin = "Access-Control-Allow-Origin";
    private static final java.lang.String AccessControlAllowMethods = "Access-Control-Allow-Methods";
    private static final java.lang.String AccessControlAllowCredentials = "Access-Control-Allow-Credentials";
    private static final java.lang.String AccessControlAllowHeaders = "Access-Control-Allow-Headers";
    private static final java.lang.String AccessControlRequestMethod = "Access-Control-Request-Method";
    private static final java.lang.String AccessControlRequestHeaders = "Access-Control-Request-Headers";
    private static final java.lang.String AccessControlExposeHeaders = "Access-Control-Expose-Headers";
    private static final java.lang.String AccessControlMaxAge = "Access-Control-Max-Age";
    private static final java.lang.String XHttpMethodOverride = "X-Http-Method-Override";
    private static final java.lang.String XForwardedHost = "X-Forwarded-Host";
    private static final java.lang.String XForwardedServer = "X-Forwarded-Server";
    private static final java.lang.String XForwardedProto = "X-Forwarded-Proto";
    private static final java.lang.String XForwardedFor = "X-Forwarded-For";
    private static final java.lang.String XForwardedPort = "X-Forwarded-Port";
    private static final java.lang.String XRequestId = "X-Request-ID";
    private static final java.lang.String XCorrelationId = "X-Correlation-ID";
    private static final java.lang.String XTotalCount = "X-Total-Count";

    static {
        java.lang.String[] strArr = {"Transfer-Encoding", "Upgrade"};
        UnsafeHeadersArray = strArr;
        UnsafeHeadersList = p078i6.m.S(strArr);
    }

    private HttpHeaders() {
    }

    @p070h6.c
    public static /* synthetic */ void getUnsafeHeaders$annotations() {
    }

    public final void checkHeaderName(java.lang.String name) {
        kotlin.jvm.internal.m.e(name, "name");
        int i3 = 0;
        int i9 = 0;
        while (i3 < name.length()) {
            char cCharAt = name.charAt(i3);
            int i10 = i9 + 1;
            if (kotlin.jvm.internal.m.f(cCharAt, 32) <= 0 || io.ktor.http.HttpHeadersKt.isDelimiter(cCharAt)) {
                throw new io.ktor.http.IllegalHeaderNameException(name, i9);
            }
            i3++;
            i9 = i10;
        }
    }

    public final void checkHeaderValue(java.lang.String value) {
        kotlin.jvm.internal.m.e(value, "value");
        int i3 = 0;
        int i9 = 0;
        while (i3 < value.length()) {
            char cCharAt = value.charAt(i3);
            int i10 = i9 + 1;
            if (kotlin.jvm.internal.m.f(cCharAt, 32) < 0 && cCharAt != '\t') {
                throw new io.ktor.http.IllegalHeaderValueException(value, i9);
            }
            i3++;
            i9 = i10;
        }
    }

    public final java.lang.String getALPN() {
        return ALPN;
    }

    public final java.lang.String getAccept() {
        return Accept;
    }

    public final java.lang.String getAcceptCharset() {
        return AcceptCharset;
    }

    public final java.lang.String getAcceptEncoding() {
        return AcceptEncoding;
    }

    public final java.lang.String getAcceptLanguage() {
        return AcceptLanguage;
    }

    public final java.lang.String getAcceptRanges() {
        return AcceptRanges;
    }

    public final java.lang.String getAccessControlAllowCredentials() {
        return AccessControlAllowCredentials;
    }

    public final java.lang.String getAccessControlAllowHeaders() {
        return AccessControlAllowHeaders;
    }

    public final java.lang.String getAccessControlAllowMethods() {
        return AccessControlAllowMethods;
    }

    public final java.lang.String getAccessControlAllowOrigin() {
        return AccessControlAllowOrigin;
    }

    public final java.lang.String getAccessControlExposeHeaders() {
        return AccessControlExposeHeaders;
    }

    public final java.lang.String getAccessControlMaxAge() {
        return AccessControlMaxAge;
    }

    public final java.lang.String getAccessControlRequestHeaders() {
        return AccessControlRequestHeaders;
    }

    public final java.lang.String getAccessControlRequestMethod() {
        return AccessControlRequestMethod;
    }

    public final java.lang.String getAge() {
        return Age;
    }

    public final java.lang.String getAllow() {
        return Allow;
    }

    public final java.lang.String getAuthenticationInfo() {
        return AuthenticationInfo;
    }

    public final java.lang.String getAuthorization() {
        return Authorization;
    }

    public final java.lang.String getCacheControl() {
        return CacheControl;
    }

    public final java.lang.String getConnection() {
        return Connection;
    }

    public final java.lang.String getContentDisposition() {
        return ContentDisposition;
    }

    public final java.lang.String getContentEncoding() {
        return ContentEncoding;
    }

    public final java.lang.String getContentLanguage() {
        return ContentLanguage;
    }

    public final java.lang.String getContentLength() {
        return ContentLength;
    }

    public final java.lang.String getContentLocation() {
        return ContentLocation;
    }

    public final java.lang.String getContentRange() {
        return ContentRange;
    }

    public final java.lang.String getContentType() {
        return ContentType;
    }

    public final java.lang.String getCookie() {
        return Cookie;
    }

    public final java.lang.String getDASL() {
        return DASL;
    }

    public final java.lang.String getDAV() {
        return DAV;
    }

    public final java.lang.String getDate() {
        return Date;
    }

    public final java.lang.String getDepth() {
        return Depth;
    }

    public final java.lang.String getDestination() {
        return Destination;
    }

    public final java.lang.String getETag() {
        return ETag;
    }

    public final java.lang.String getExpect() {
        return Expect;
    }

    public final java.lang.String getExpires() {
        return Expires;
    }

    public final java.lang.String getForwarded() {
        return Forwarded;
    }

    public final java.lang.String getFrom() {
        return From;
    }

    public final java.lang.String getHTTP2Settings() {
        return HTTP2Settings;
    }

    public final java.lang.String getHost() {
        return Host;
    }

    public final java.lang.String getIf() {
        return If;
    }

    public final java.lang.String getIfMatch() {
        return IfMatch;
    }

    public final java.lang.String getIfModifiedSince() {
        return IfModifiedSince;
    }

    public final java.lang.String getIfNoneMatch() {
        return IfNoneMatch;
    }

    public final java.lang.String getIfRange() {
        return IfRange;
    }

    public final java.lang.String getIfScheduleTagMatch() {
        return IfScheduleTagMatch;
    }

    public final java.lang.String getIfUnmodifiedSince() {
        return IfUnmodifiedSince;
    }

    public final java.lang.String getLastModified() {
        return LastModified;
    }

    public final java.lang.String getLink() {
        return Link;
    }

    public final java.lang.String getLocation() {
        return Location;
    }

    public final java.lang.String getLockToken() {
        return LockToken;
    }

    public final java.lang.String getMIMEVersion() {
        return MIMEVersion;
    }

    public final java.lang.String getMaxForwards() {
        return MaxForwards;
    }

    public final java.lang.String getOrderingType() {
        return OrderingType;
    }

    public final java.lang.String getOrigin() {
        return Origin;
    }

    public final java.lang.String getOverwrite() {
        return Overwrite;
    }

    public final java.lang.String getPosition() {
        return Position;
    }

    public final java.lang.String getPragma() {
        return Pragma;
    }

    public final java.lang.String getPrefer() {
        return Prefer;
    }

    public final java.lang.String getPreferenceApplied() {
        return PreferenceApplied;
    }

    public final java.lang.String getProxyAuthenticate() {
        return ProxyAuthenticate;
    }

    public final java.lang.String getProxyAuthenticationInfo() {
        return ProxyAuthenticationInfo;
    }

    public final java.lang.String getProxyAuthorization() {
        return ProxyAuthorization;
    }

    public final java.lang.String getPublicKeyPins() {
        return PublicKeyPins;
    }

    public final java.lang.String getPublicKeyPinsReportOnly() {
        return PublicKeyPinsReportOnly;
    }

    public final java.lang.String getRange() {
        return Range;
    }

    public final java.lang.String getReferrer() {
        return Referrer;
    }

    public final java.lang.String getRetryAfter() {
        return RetryAfter;
    }

    public final java.lang.String getSLUG() {
        return SLUG;
    }

    public final java.lang.String getScheduleReply() {
        return ScheduleReply;
    }

    public final java.lang.String getScheduleTag() {
        return ScheduleTag;
    }

    public final java.lang.String getSecWebSocketAccept() {
        return SecWebSocketAccept;
    }

    public final java.lang.String getSecWebSocketExtensions() {
        return SecWebSocketExtensions;
    }

    public final java.lang.String getSecWebSocketKey() {
        return SecWebSocketKey;
    }

    public final java.lang.String getSecWebSocketProtocol() {
        return SecWebSocketProtocol;
    }

    public final java.lang.String getSecWebSocketVersion() {
        return SecWebSocketVersion;
    }

    public final java.lang.String getServer() {
        return Server;
    }

    public final java.lang.String getSetCookie() {
        return SetCookie;
    }

    public final java.lang.String getStrictTransportSecurity() {
        return StrictTransportSecurity;
    }

    public final java.lang.String getTE() {
        return TE;
    }

    public final java.lang.String getTimeout() {
        return Timeout;
    }

    public final java.lang.String getTrailer() {
        return Trailer;
    }

    public final java.lang.String getTransferEncoding() {
        return TransferEncoding;
    }

    public final java.lang.String[] getUnsafeHeaders() {
        java.lang.String[] strArr = UnsafeHeadersArray;
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(strArr, strArr.length);
        kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
        return (java.lang.String[]) objArrCopyOf;
    }

    public final java.util.List<java.lang.String> getUnsafeHeadersList() {
        return UnsafeHeadersList;
    }

    public final java.lang.String getUpgrade() {
        return Upgrade;
    }

    public final java.lang.String getUserAgent() {
        return UserAgent;
    }

    public final java.lang.String getVary() {
        return Vary;
    }

    public final java.lang.String getVia() {
        return Via;
    }

    public final java.lang.String getWWWAuthenticate() {
        return WWWAuthenticate;
    }

    public final java.lang.String getWarning() {
        return Warning;
    }

    public final java.lang.String getXCorrelationId() {
        return XCorrelationId;
    }

    public final java.lang.String getXForwardedFor() {
        return XForwardedFor;
    }

    public final java.lang.String getXForwardedHost() {
        return XForwardedHost;
    }

    public final java.lang.String getXForwardedPort() {
        return XForwardedPort;
    }

    public final java.lang.String getXForwardedProto() {
        return XForwardedProto;
    }

    public final java.lang.String getXForwardedServer() {
        return XForwardedServer;
    }

    public final java.lang.String getXHttpMethodOverride() {
        return XHttpMethodOverride;
    }

    public final java.lang.String getXRequestId() {
        return XRequestId;
    }

    public final java.lang.String getXTotalCount() {
        return XTotalCount;
    }

    public final boolean isUnsafe(java.lang.String header) {
        kotlin.jvm.internal.m.e(header, "header");
        for (java.lang.String str : UnsafeHeadersArray) {
            if (O7.x.r0(str, header, true)) {
                return true;
            }
        }
        return false;
    }
}
