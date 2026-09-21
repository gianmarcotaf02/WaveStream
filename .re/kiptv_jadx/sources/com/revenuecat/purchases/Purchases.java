package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000²\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 ²\u00022\u00020\u0001:\u0002²\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J;\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ;\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001e\u0010\u001dJA\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\u001e\u0010!J\u0015\u0010#\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020%¢\u0006\u0004\b&\u0010'J\u0018\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020\u0015H\u0087@¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,H\u0087@¢\u0006\u0004\b-\u0010.J\u0018\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020\u0015H\u0087@¢\u0006\u0004\b1\u0010+J#\u00105\u001a\u00020\u00062\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u0015022\u0006\u0010\u000b\u001a\u000204¢\u0006\u0004\b5\u00106J/\u00105\u001a\u00020\u00062\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u0015022\n\b\u0002\u00108\u001a\u0004\u0018\u0001072\u0006\u0010\u000b\u001a\u000204¢\u0006\u0004\b5\u00109J\u001d\u0010=\u001a\u00020\u00062\u0006\u0010;\u001a\u00020:2\u0006\u0010\u000b\u001a\u00020<¢\u0006\u0004\b=\u0010>J'\u0010C\u001a\u00020\u00062\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020A2\u0006\u0010\u000b\u001a\u00020<H\u0007¢\u0006\u0004\bC\u0010DJ'\u0010G\u001a\u00020\u00062\u0006\u0010@\u001a\u00020?2\u0006\u0010F\u001a\u00020E2\u0006\u0010\u0012\u001a\u00020<H\u0007¢\u0006\u0004\bG\u0010HJ\u0015\u0010J\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020I¢\u0006\u0004\bJ\u0010KJ#\u0010N\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\u00152\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010MH\u0007¢\u0006\u0004\bN\u0010OJ\u001b\u0010P\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010IH\u0007¢\u0006\u0004\bP\u0010KJ\r\u0010Q\u001a\u00020\u0006¢\u0006\u0004\bQ\u0010\bJ\u0015\u0010R\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020I¢\u0006\u0004\bR\u0010KJ\u001d\u0010R\u001a\u00020\u00062\u0006\u0010T\u001a\u00020S2\u0006\u0010\u000b\u001a\u00020I¢\u0006\u0004\bR\u0010UJ\u0015\u0010W\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020V¢\u0006\u0004\bW\u0010XJ\r\u0010Y\u001a\u00020\u0006¢\u0006\u0004\bY\u0010\bJ\r\u0010Z\u001a\u00020\u0006¢\u0006\u0004\bZ\u0010\bJ'\u0010]\u001a\u00020\u00062\u0006\u0010@\u001a\u00020?2\u000e\b\u0002\u0010\\\u001a\b\u0012\u0004\u0012\u00020[02H\u0007¢\u0006\u0004\b]\u0010^J\r\u0010_\u001a\u00020\u0006¢\u0006\u0004\b_\u0010\bJ\u0017\u0010b\u001a\u00020\u00062\u0006\u0010a\u001a\u00020`H\u0007¢\u0006\u0004\bb\u0010cJ\u0019\u0010f\u001a\u00020\u00062\b\b\u0002\u0010e\u001a\u00020dH\u0007¢\u0006\u0004\bf\u0010gJ\u0017\u0010k\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020hH\u0000¢\u0006\u0004\bi\u0010jJG\u0010s\u001a\u00020\u00062\u0006\u0010l\u001a\u00020\u00152\u0006\u0010m\u001a\u00020\u00152\u0012\u0010p\u001a\u000e\u0012\u0004\u0012\u00020o\u0012\u0004\u0012\u00020\u00060n2\u0012\u0010r\u001a\u000e\u0012\u0004\u0012\u00020q\u0012\u0004\u0012\u00020\u00060nH\u0007¢\u0006\u0004\bs\u0010tJ\u0017\u0010w\u001a\u00020v2\u0006\u0010u\u001a\u00020\u0015H\u0007¢\u0006\u0004\bw\u0010xJ\u001f\u0010{\u001a\u00020\u00062\u0006\u0010y\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020zH\u0007¢\u0006\u0004\b{\u0010|J@\u0010{\u001a\u00020\u007f2\u0006\u0010y\u001a\u00020\u00152$\u0010\u0081\u0001\u001a\u001f\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u007f0~\u0012\u0007\u0012\u0005\u0018\u00010\u0080\u00010}H\u0080@¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J#\u0010\u0087\u0001\u001a\u00020\u00062\u0006\u0010y\u001a\u00020\u00152\u0007\u0010\u000b\u001a\u00030\u0084\u0001H\u0000¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J(\u0010\u008a\u0001\u001a\u00020\u00062\u0016\u0010\u0089\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0088\u0001¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u001a\u0010\u008c\u0001\u001a\u00020\u00062\b\u0010l\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u001b\u0010\u008f\u0001\u001a\u00020\u00062\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\b\u008f\u0001\u0010\u008d\u0001J\u001b\u0010\u0091\u0001\u001a\u00020\u00062\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\b\u0091\u0001\u0010\u008d\u0001J\u001b\u0010\u0093\u0001\u001a\u00020\u00062\t\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\b\u0093\u0001\u0010\u008d\u0001J\u001b\u0010\u0095\u0001\u001a\u00020\u00062\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\b\u0095\u0001\u0010\u008d\u0001J\u001b\u0010\u0097\u0001\u001a\u00020\u00062\t\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\b\u0097\u0001\u0010\u008d\u0001J\u001b\u0010\u0099\u0001\u001a\u00020\u00062\t\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\b\u0099\u0001\u0010\u008d\u0001J\u001b\u0010\u009b\u0001\u001a\u00020\u00062\t\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\b\u009b\u0001\u0010\u008d\u0001J\u001b\u0010\u009d\u0001\u001a\u00020\u00062\t\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\b\u009d\u0001\u0010\u008d\u0001J\u001b\u0010\u009f\u0001\u001a\u00020\u00062\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\b\u009f\u0001\u0010\u008d\u0001J\u001b\u0010¡\u0001\u001a\u00020\u00062\t\u0010 \u0001\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\b¡\u0001\u0010\u008d\u0001J\u000f\u0010¢\u0001\u001a\u00020\u0006¢\u0006\u0005\b¢\u0001\u0010\bJ\u001b\u0010¤\u0001\u001a\u00020\u00062\t\u0010£\u0001\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\b¤\u0001\u0010\u008d\u0001J\u001b\u0010¦\u0001\u001a\u00020\u00062\t\u0010¥\u0001\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\b¦\u0001\u0010\u008d\u0001J\u001b\u0010¨\u0001\u001a\u00020\u00062\t\u0010§\u0001\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\b¨\u0001\u0010\u008d\u0001J\u001b\u0010ª\u0001\u001a\u00020\u00062\t\u0010©\u0001\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\bª\u0001\u0010\u008d\u0001J\u001b\u0010¬\u0001\u001a\u00020\u00062\t\u0010«\u0001\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\b¬\u0001\u0010\u008d\u0001J\u001b\u0010®\u0001\u001a\u00020\u00062\t\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\b®\u0001\u0010\u008d\u0001J\u001b\u0010°\u0001\u001a\u00020\u00062\t\u0010¯\u0001\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\b°\u0001\u0010\u008d\u0001J\u001b\u0010²\u0001\u001a\u00020\u00062\t\u0010±\u0001\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\b²\u0001\u0010\u008d\u0001J\u001b\u0010´\u0001\u001a\u00020\u00062\t\u0010³\u0001\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\b´\u0001\u0010\u008d\u0001J\u001b\u0010¶\u0001\u001a\u00020\u00062\t\u0010µ\u0001\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\b¶\u0001\u0010\u008d\u0001J$\u0010¸\u0001\u001a\u00020\u00062\u0012\u0010·\u0001\u001a\r\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0088\u0001¢\u0006\u0006\b¸\u0001\u0010\u008b\u0001J.\u0010¹\u0001\u001a\u00020\u00062\u0014\u0010·\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0088\u00012\u0006\u0010\u000b\u001a\u00020\"¢\u0006\u0006\b¹\u0001\u0010º\u0001J\u001b\u0010¼\u0001\u001a\u00020\u00062\t\u0010»\u0001\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\b¼\u0001\u0010\u008d\u0001J\u001b\u0010¾\u0001\u001a\u00020\u00062\t\u0010½\u0001\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\b¾\u0001\u0010\u008d\u0001J\u001b\u0010À\u0001\u001a\u00020\u00062\t\u0010¿\u0001\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\bÀ\u0001\u0010\u008d\u0001J\u001b\u0010Â\u0001\u001a\u00020\u00062\t\u0010Á\u0001\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\bÂ\u0001\u0010\u008d\u0001J\u001b\u0010Ä\u0001\u001a\u00020\u00062\t\u0010Ã\u0001\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\bÄ\u0001\u0010\u008d\u0001J\u001b\u0010Æ\u0001\u001a\u00020\u00062\t\u0010Å\u0001\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\bÆ\u0001\u0010\u008d\u0001J\u001f\u0010Ê\u0001\u001a\u0005\u0018\u00010É\u00012\b\u0010È\u0001\u001a\u00030Ç\u0001H\u0007¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001J\u001b\u0010Í\u0001\u001a\u00020o2\t\u0010Ì\u0001\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\bÍ\u0001\u0010Î\u0001J'\u0010Ï\u0001\u001a\u00020\u00062\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u0015022\u0006\u0010\u000b\u001a\u000204H\u0007¢\u0006\u0005\bÏ\u0001\u00106J'\u0010Ð\u0001\u001a\u00020\u00062\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u0015022\u0006\u0010\u000b\u001a\u000204H\u0007¢\u0006\u0005\bÐ\u0001\u00106J\u0019\u0010Ò\u0001\u001a\u00020\u00062\u0007\u0010\u000b\u001a\u00030Ñ\u0001¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001J#\u0010×\u0001\u001a\u00020\u00062\b\u0010Õ\u0001\u001a\u00030Ô\u00012\u0007\u0010\u0012\u001a\u00030Ö\u0001¢\u0006\u0006\b×\u0001\u0010Ø\u0001J\u0011\u0010Ù\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\bÙ\u0001\u0010\bJ\u001a\u0010Ú\u0001\u001a\u00020o2\u0006\u0010y\u001a\u00020\u0015H\u0082@¢\u0006\u0005\bÚ\u0001\u0010+R\u001d\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0003\u0010Û\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001R\u0018\u0010ß\u0001\u001a\u00030Þ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bß\u0001\u0010à\u0001R\u0015\u0010ä\u0001\u001a\u00030á\u00018F¢\u0006\b\u001a\u0006\bâ\u0001\u0010ã\u0001R1\u0010ë\u0001\u001a\u00020o2\u0007\u0010å\u0001\u001a\u00020o8F@FX\u0087\u000e¢\u0006\u0017\u0012\u0005\bê\u0001\u0010\b\u001a\u0006\bæ\u0001\u0010ç\u0001\"\u0006\bè\u0001\u0010é\u0001R,\u0010ñ\u0001\u001a\u00030ì\u00012\b\u0010å\u0001\u001a\u00030ì\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bí\u0001\u0010î\u0001\"\u0006\bï\u0001\u0010ð\u0001R\u0014\u0010ô\u0001\u001a\u00020\u00158F¢\u0006\b\u001a\u0006\bò\u0001\u0010ó\u0001R\u0015\u0010õ\u0001\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0007\u001a\u0005\b\f\u0010ó\u0001R \u0010ù\u0001\u001a\u0005\u0018\u00010ö\u00018FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bø\u0001\u0010\b\u001a\u0005\b\u000f\u0010÷\u0001R0\u0010ÿ\u0001\u001a\u0005\u0018\u00010ú\u00012\n\u0010å\u0001\u001a\u0005\u0018\u00010ú\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bû\u0001\u0010ü\u0001\"\u0006\bý\u0001\u0010þ\u0001R9\u0010\u0088\u0002\u001a\u0005\u0018\u00010\u0080\u00022\n\u0010\u0081\u0002\u001a\u0005\u0018\u00010\u0080\u00028F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b\u0082\u0002\u0010\u0083\u0002\"\u0006\b\u0084\u0002\u0010\u0085\u0002*\u0006\b\u0086\u0002\u0010\u0087\u0002R@\u0010\u0090\u0002\u001a\u0005\u0018\u00010\u0089\u00022\n\u0010\u0081\u0002\u001a\u0005\u0018\u00010\u0089\u00028F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b\u008e\u0002\u0010\b\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002\"\u0006\b\u008c\u0002\u0010\u008d\u0002*\u0006\b\u008f\u0002\u0010\u0087\u0002R@\u0010\u0098\u0002\u001a\u0005\u0018\u00010\u0091\u00022\n\u0010\u0081\u0002\u001a\u0005\u0018\u00010\u0091\u00028F@FX\u0087\u008e\u0002¢\u0006\u001f\u0012\u0005\b\u0096\u0002\u0010\b\u001a\u0006\b\u0092\u0002\u0010\u0093\u0002\"\u0006\b\u0094\u0002\u0010\u0095\u0002*\u0006\b\u0097\u0002\u0010\u0087\u0002R\u0014\u0010\u0099\u0002\u001a\u00020o8F¢\u0006\b\u001a\u0006\b\u0099\u0002\u0010ç\u0001R\u0015\u0010\u009d\u0002\u001a\u00030\u009a\u00028F¢\u0006\b\u001a\u0006\b\u009b\u0002\u0010\u009c\u0002R\u001f\u0010¢\u0002\u001a\u00030\u009e\u00028FX\u0087\u0004¢\u0006\u000f\u0012\u0005\b¡\u0002\u0010\b\u001a\u0006\b\u009f\u0002\u0010 \u0002R\u001f\u0010§\u0002\u001a\u00030£\u00028FX\u0087\u0004¢\u0006\u000f\u0012\u0005\b¦\u0002\u0010\b\u001a\u0006\b¤\u0002\u0010¥\u0002R\u0017\u0010«\u0002\u001a\u0005\u0018\u00010¨\u00028F¢\u0006\b\u001a\u0006\b©\u0002\u0010ª\u0002R1\u0010¯\u0002\u001a\u00020o2\u0007\u0010å\u0001\u001a\u00020o8F@FX\u0087\u000e¢\u0006\u0017\u0012\u0005\b®\u0002\u0010\b\u001a\u0006\b¬\u0002\u0010ç\u0001\"\u0006\b\u00ad\u0002\u0010é\u0001R\u0016\u0010±\u0002\u001a\u0004\u0018\u00010\u00158F¢\u0006\b\u001a\u0006\b°\u0002\u0010ó\u0001¨\u0006³\u0002"}, d2 = {"Lcom/revenuecat/purchases/Purchases;", "Lcom/revenuecat/purchases/LifecycleDelegate;", "Lcom/revenuecat/purchases/PurchasesOrchestrator;", "purchasesOrchestrator", "<init>", "(Lcom/revenuecat/purchases/PurchasesOrchestrator;)V", "Lh6/A;", "onAppBackgrounded", "()V", "onAppForegrounded", "Lcom/revenuecat/purchases/interfaces/GetStorefrontCallback;", "callback", "getStorefrontCountryCode", "(Lcom/revenuecat/purchases/interfaces/GetStorefrontCallback;)V", "Lcom/revenuecat/purchases/interfaces/GetStorefrontLocaleCallback;", "getStorefrontLocale", "(Lcom/revenuecat/purchases/interfaces/GetStorefrontLocaleCallback;)V", "Lcom/revenuecat/purchases/interfaces/SyncPurchasesCallback;", "listener", "syncPurchases", "(Lcom/revenuecat/purchases/interfaces/SyncPurchasesCallback;)V", "", "productID", "receiptID", "amazonUserID", "isoCurrencyCode", "", "price", "syncObserverModeAmazonPurchase", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "syncAmazonPurchase", "", "purchaseTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;J)V", "Lcom/revenuecat/purchases/interfaces/SyncAttributesAndOfferingsCallback;", "syncAttributesAndOfferingsIfNeeded", "(Lcom/revenuecat/purchases/interfaces/SyncAttributesAndOfferingsCallback;)V", "Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;", "getOfferings", "(Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;)V", "workflowId", "Lcom/revenuecat/purchases/common/workflows/PublishedWorkflow;", "awaitGetWorkflow", "(Ljava/lang/String;Ll6/c;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/UiConfig;", "awaitGetUiConfig", "(Ll6/c;)Ljava/lang/Object;", "offeringId", "Lcom/revenuecat/purchases/common/workflows/WorkflowResolution;", "resolveWorkflow", "", "productIds", "Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;", "getProducts", "(Ljava/util/List;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V", "Lcom/revenuecat/purchases/ProductType;", "type", "(Ljava/util/List;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V", "Lcom/revenuecat/purchases/PurchaseParams;", "purchaseParams", "Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "purchase", "(Lcom/revenuecat/purchases/PurchaseParams;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V", "Landroid/app/Activity;", "activity", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProduct", "purchaseProduct", "(Landroid/app/Activity;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V", "Lcom/revenuecat/purchases/Package;", "packageToPurchase", "purchasePackage", "(Landroid/app/Activity;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V", "Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "restorePurchases", "(Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "newAppUserID", "Lcom/revenuecat/purchases/interfaces/LogInCallback;", "logIn", "(Ljava/lang/String;Lcom/revenuecat/purchases/interfaces/LogInCallback;)V", "logOut", "close", "getCustomerInfo", "Lcom/revenuecat/purchases/CacheFetchPolicy;", "fetchPolicy", "(Lcom/revenuecat/purchases/CacheFetchPolicy;Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "Lcom/revenuecat/purchases/interfaces/GetVirtualCurrenciesCallback;", "getVirtualCurrencies", "(Lcom/revenuecat/purchases/interfaces/GetVirtualCurrenciesCallback;)V", "invalidateVirtualCurrenciesCache", "removeUpdatedCustomerInfoListener", "Lcom/revenuecat/purchases/models/InAppMessageType;", "inAppMessageTypes", "showInAppMessagesIfNeeded", "(Landroid/app/Activity;Ljava/util/List;)V", "invalidateCustomerInfoCache", "Lcom/revenuecat/purchases/common/events/FeatureEvent;", "event", "track", "(Lcom/revenuecat/purchases/common/events/FeatureEvent;)V", "Lcom/revenuecat/purchases/paywalls/events/CustomPaywallImpressionParams;", io.sentry.protocol.Message.JsonKeys.PARAMS, "trackCustomPaywallImpression", "(Lcom/revenuecat/purchases/paywalls/events/CustomPaywallImpressionParams;)V", "Lcom/revenuecat/purchases/interfaces/GetCustomerCenterConfigCallback;", "getCustomerCenterConfigData$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/interfaces/GetCustomerCenterConfigCallback;)V", "getCustomerCenterConfigData", "email", "description", "Lkotlin/Function1;", "", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "createSupportTicket", "(Ljava/lang/String;Ljava/lang/String;Lx6/j;Lx6/j;)V", "impressionId", "Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationToken;", "generateRewardVerificationToken", "(Ljava/lang/String;)Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationToken;", "clientTransactionId", "Lcom/revenuecat/purchases/interfaces/PollRewardVerificationCallback;", "pollRewardVerification", "(Ljava/lang/String;Lcom/revenuecat/purchases/interfaces/PollRewardVerificationCallback;)V", "Lkotlin/Function2;", "Ll6/c;", "Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationResult;", "", "poll", "pollRewardVerification$purchases_defaultsRelease", "(Ljava/lang/String;Lx6/m;Ll6/c;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/interfaces/GetRewardVerificationResultCallback;", "getRewardVerificationResult$purchases_defaultsRelease", "(Ljava/lang/String;Lcom/revenuecat/purchases/interfaces/GetRewardVerificationResultCallback;)V", "getRewardVerificationResult", "", "attributes", "setAttributes", "(Ljava/util/Map;)V", "setEmail", "(Ljava/lang/String;)V", "phoneNumber", "setPhoneNumber", "displayName", "setDisplayName", "fcmToken", "setPushToken", "mixpanelDistinctID", "setMixpanelDistinctID", "onesignalID", "setOnesignalID", "onesignalUserID", "setOnesignalUserID", "airshipChannelID", "setAirshipChannelID", "firebaseAppInstanceID", "setFirebaseAppInstanceID", "tenjinAnalyticsInstallationID", "setTenjinAnalyticsInstallationID", "postHogUserId", "setPostHogUserId", "collectDeviceIdentifiers", "adjustID", "setAdjustID", "appsflyerID", "setAppsflyerID", "fbAnonymousID", "setFBAnonymousID", "mparticleID", "setMparticleID", "cleverTapID", "setCleverTapID", "kochavaDeviceID", "setKochavaDeviceID", "airbridgeDeviceID", "setAirbridgeDeviceID", "solarEngineDistinctId", "setSolarEngineDistinctId", "solarEngineAccountId", "setSolarEngineAccountId", "solarEngineVisitorId", "setSolarEngineVisitorId", "data", "setAppsFlyerConversionData", "setAppstackAttributionParams", "(Ljava/util/Map;Lcom/revenuecat/purchases/interfaces/SyncAttributesAndOfferingsCallback;)V", "mediaSource", "setMediaSource", "campaign", "setCampaign", "adGroup", "setAdGroup", "ad", "setAd", "keyword", "setKeyword", "creative", "setCreative", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;", "fontInfo", "Lcom/revenuecat/purchases/paywalls/DownloadedFontFamily;", "getCachedFontFamilyOrStartDownload", "(Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;)Lcom/revenuecat/purchases/paywalls/DownloadedFontFamily;", "localeString", "overridePreferredUILocale", "(Ljava/lang/String;)Z", "getSubscriptionSkus", "getNonSubscriptionSkus", "Lcom/revenuecat/purchases/interfaces/GetAmazonLWAConsentStatusCallback;", "getAmazonLWAConsentStatus", "(Lcom/revenuecat/purchases/interfaces/GetAmazonLWAConsentStatusCallback;)V", "Lcom/revenuecat/purchases/WebPurchaseRedemption;", "webPurchaseRedemption", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener;", "redeemWebPurchase", "(Lcom/revenuecat/purchases/WebPurchaseRedemption;Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener;)V", "notifyLifecycleClosed", "refreshCustomerInfoAfterEntitlementGrant", "Lcom/revenuecat/purchases/PurchasesOrchestrator;", "getPurchasesOrchestrator$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/PurchasesOrchestrator;", "Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationPollLauncher;", "rewardVerificationPollLauncher", "Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationPollLauncher;", "Lcom/revenuecat/purchases/PurchasesConfiguration;", "getCurrentConfiguration", "()Lcom/revenuecat/purchases/PurchasesConfiguration;", "currentConfiguration", "value", "getFinishTransactions", "()Z", "setFinishTransactions", "(Z)V", "getFinishTransactions$annotations", "finishTransactions", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "getPurchasesAreCompletedBy", "()Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "setPurchasesAreCompletedBy", "(Lcom/revenuecat/purchases/PurchasesAreCompletedBy;)V", "purchasesAreCompletedBy", "getAppUserID", "()Ljava/lang/String;", "appUserID", "storefrontCountryCode", "Ljava/util/Locale;", "()Ljava/util/Locale;", "getStorefrontLocale$annotations", "storefrontLocale", "Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;", "getUpdatedCustomerInfoListener", "()Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;", "setUpdatedCustomerInfoListener", "(Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;)V", "updatedCustomerInfoListener", "Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;", "<set-?>", "getCustomerCenterListener", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;", "setCustomerCenterListener", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;)V", "getCustomerCenterListener$delegate", "(Lcom/revenuecat/purchases/Purchases;)Ljava/lang/Object;", "customerCenterListener", "Lcom/revenuecat/purchases/TrackedEventListener;", "getTrackedEventListener", "()Lcom/revenuecat/purchases/TrackedEventListener;", "setTrackedEventListener", "(Lcom/revenuecat/purchases/TrackedEventListener;)V", "getTrackedEventListener$annotations", "getTrackedEventListener$delegate", "trackedEventListener", "Lcom/revenuecat/purchases/DebugEventListener;", "getDebugEventListener", "()Lcom/revenuecat/purchases/DebugEventListener;", "setDebugEventListener", "(Lcom/revenuecat/purchases/DebugEventListener;)V", "getDebugEventListener$annotations", "getDebugEventListener$delegate", "debugEventListener", "isAnonymous", "Lcom/revenuecat/purchases/Store;", "getStore", "()Lcom/revenuecat/purchases/Store;", com.revenuecat.purchases.common.responses.ProductResponseJsonKeys.STORE, "Lcom/revenuecat/purchases/storage/FileRepository;", "getFileRepository", "()Lcom/revenuecat/purchases/storage/FileRepository;", "getFileRepository$annotations", "fileRepository", "Lcom/revenuecat/purchases/ads/events/AdTracker;", "getAdTracker", "()Lcom/revenuecat/purchases/ads/events/AdTracker;", "getAdTracker$annotations", "adTracker", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "getCachedVirtualCurrencies", "()Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "cachedVirtualCurrencies", "getAllowSharingPlayStoreAccount", "setAllowSharingPlayStoreAccount", "getAllowSharingPlayStoreAccount$annotations", "allowSharingPlayStoreAccount", "getPreferredUILocaleOverride", "preferredUILocaleOverride", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class Purchases implements com.revenuecat.purchases.LifecycleDelegate {
    private static final int MAX_ENTITLEMENT_REFRESH_ATTEMPTS = 3;
    private static /* synthetic */ com.revenuecat.purchases.Purchases backingFieldSharedInstance;
    private final com.revenuecat.purchases.PurchasesOrchestrator purchasesOrchestrator;
    private final com.revenuecat.purchases.ads.rewardverification.RewardVerificationPollLauncher rewardVerificationPollLauncher;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.Purchases.Companion INSTANCE = new com.revenuecat.purchases.Purchases.Companion(null);
    private static com.revenuecat.purchases.PurchasesServiceDispatcher serviceDispatcher = com.revenuecat.purchases.PurchasesServices.INSTANCE.m74default();
    private static final java.lang.String frameworkVersion = "10.15.1";

    @kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000b\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0007¢\u0006\u0004\b\u001c\u0010\u001dR(\u0010\u001f\u001a\u00020\u001e8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001f\u0010 \u0012\u0004\b%\u0010\u0003\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010-\u001a\u00020&2\u0006\u0010'\u001a\u00020&8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b,\u0010\u0003\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u00103\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u00198F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b2\u0010\u0003\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R*\u0010:\u001a\u0002042\u0006\u0010'\u001a\u0002048F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b9\u0010\u0003\u001a\u0004\b5\u00106\"\u0004\b7\u00108R*\u0010A\u001a\u00020;2\u0006\u0010'\u001a\u00020;8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b@\u0010\u0003\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010B\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR*\u0010K\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00128F@AX\u0087\u000e¢\u0006\u0012\u0012\u0004\bJ\u0010\u0003\u001a\u0004\bH\u0010E\"\u0004\bI\u0010GR \u0010L\u001a\u00020\r8\u0006X\u0087D¢\u0006\u0012\n\u0004\bL\u0010M\u0012\u0004\bP\u0010\u0003\u001a\u0004\bN\u0010OR.\u0010W\u001a\u0004\u0018\u00010Q2\b\u0010'\u001a\u0004\u0018\u00010Q8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\bV\u0010\u0003\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001a\u0010X\u001a\u00020\u00198FX\u0087\u0004¢\u0006\f\u0012\u0004\bY\u0010\u0003\u001a\u0004\bX\u0010/R\u0014\u0010[\u001a\u00020Z8\u0002X\u0082T¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006]"}, d2 = {"Lcom/revenuecat/purchases/Purchases$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "getImageLoader", "(Landroid/content/Context;)Ljava/lang/Object;", "Landroid/content/Intent;", "intent", "Lcom/revenuecat/purchases/WebPurchaseRedemption;", "parseAsWebPurchaseRedemption", "(Landroid/content/Intent;)Lcom/revenuecat/purchases/WebPurchaseRedemption;", "", "string", "(Ljava/lang/String;)Lcom/revenuecat/purchases/WebPurchaseRedemption;", "Lcom/revenuecat/purchases/PurchasesConfiguration;", "configuration", "Lcom/revenuecat/purchases/Purchases;", "configure", "(Lcom/revenuecat/purchases/PurchasesConfiguration;)Lcom/revenuecat/purchases/Purchases;", "", "Lcom/revenuecat/purchases/models/BillingFeature;", "features", "Lcom/revenuecat/purchases/interfaces/Callback;", "", "callback", "Lh6/A;", "canMakePayments", "(Landroid/content/Context;Ljava/util/List;Lcom/revenuecat/purchases/interfaces/Callback;)V", "Lcom/revenuecat/purchases/PurchasesServiceDispatcher;", "serviceDispatcher", "Lcom/revenuecat/purchases/PurchasesServiceDispatcher;", "getServiceDispatcher$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/PurchasesServiceDispatcher;", "setServiceDispatcher$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/PurchasesServiceDispatcher;)V", "getServiceDispatcher$purchases_defaultsRelease$annotations", "Lcom/revenuecat/purchases/common/PlatformInfo;", "value", "getPlatformInfo", "()Lcom/revenuecat/purchases/common/PlatformInfo;", "setPlatformInfo", "(Lcom/revenuecat/purchases/common/PlatformInfo;)V", "getPlatformInfo$annotations", "platformInfo", "getDebugLogsEnabled", "()Z", "setDebugLogsEnabled", "(Z)V", "getDebugLogsEnabled$annotations", "debugLogsEnabled", "Lcom/revenuecat/purchases/LogLevel;", "getLogLevel", "()Lcom/revenuecat/purchases/LogLevel;", "setLogLevel", "(Lcom/revenuecat/purchases/LogLevel;)V", "getLogLevel$annotations", "logLevel", "Lcom/revenuecat/purchases/LogHandler;", "getLogHandler", "()Lcom/revenuecat/purchases/LogHandler;", "setLogHandler", "(Lcom/revenuecat/purchases/LogHandler;)V", "getLogHandler$annotations", "logHandler", "backingFieldSharedInstance", "Lcom/revenuecat/purchases/Purchases;", "getBackingFieldSharedInstance$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/Purchases;", "setBackingFieldSharedInstance$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/Purchases;)V", "getSharedInstance", "setSharedInstance$purchases_defaultsRelease", "getSharedInstance$annotations", "sharedInstance", "frameworkVersion", "Ljava/lang/String;", "getFrameworkVersion", "()Ljava/lang/String;", "getFrameworkVersion$annotations", "Ljava/net/URL;", "getProxyURL", "()Ljava/net/URL;", "setProxyURL", "(Ljava/net/URL;)V", "getProxyURL$annotations", "proxyURL", "isConfigured", "isConfigured$annotations", "", "MAX_ENTITLEMENT_REFRESH_ATTEMPTS", "I", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void canMakePayments$default(com.revenuecat.purchases.Purchases.Companion companion, android.content.Context context, java.util.List list, com.revenuecat.purchases.interfaces.Callback callback, int i3, java.lang.Object obj) {
            if ((i3 & 2) != 0) {
                list = p078i6.w.f23205h;
            }
            companion.canMakePayments(context, list, callback);
        }

        @p070h6.c
        public static /* synthetic */ void getDebugLogsEnabled$annotations() {
        }

        public static /* synthetic */ void getFrameworkVersion$annotations() {
        }

        public static /* synthetic */ void getLogHandler$annotations() {
        }

        public static /* synthetic */ void getLogLevel$annotations() {
        }

        public static /* synthetic */ void getPlatformInfo$annotations() {
        }

        public static /* synthetic */ void getProxyURL$annotations() {
        }

        public static /* synthetic */ void getServiceDispatcher$purchases_defaultsRelease$annotations() {
        }

        public static /* synthetic */ void getSharedInstance$annotations() {
        }

        public static /* synthetic */ void isConfigured$annotations() {
        }

        public final void canMakePayments(android.content.Context context, com.revenuecat.purchases.interfaces.Callback<java.lang.Boolean> callback) {
            kotlin.jvm.internal.m.e(context, "context");
            kotlin.jvm.internal.m.e(callback, "callback");
            canMakePayments$default(this, context, null, callback, 2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final com.revenuecat.purchases.Purchases configure(com.revenuecat.purchases.PurchasesConfiguration configuration) {
            com.revenuecat.purchases.PurchasesOrchestrator purchasesOrchestrator;
            kotlin.jvm.internal.m.e(configuration, "configuration");
            com.revenuecat.purchases.APIKeyValidator aPIKeyValidator = null;
            java.lang.Object[] objArr = 0;
            if (isConfigured()) {
                com.revenuecat.purchases.Purchases backingFieldSharedInstance$purchases_defaultsRelease = getBackingFieldSharedInstance$purchases_defaultsRelease();
                if (kotlin.jvm.internal.m.a((backingFieldSharedInstance$purchases_defaultsRelease == null || (purchasesOrchestrator = backingFieldSharedInstance$purchases_defaultsRelease.getPurchasesOrchestrator()) == null) ? null : purchasesOrchestrator.getCurrentConfiguration(), configuration)) {
                    com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.i("[Purchases] - " + logLevel.name(), com.revenuecat.purchases.strings.ConfigureStrings.INSTANCE_ALREADY_EXISTS_WITH_SAME_CONFIG);
                    }
                    return getSharedInstance();
                }
                com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.i("[Purchases] - " + logLevel2.name(), com.revenuecat.purchases.strings.ConfigureStrings.INSTANCE_ALREADY_EXISTS);
                }
            }
            com.revenuecat.purchases.Purchases purchasesCreatePurchases$default = com.revenuecat.purchases.PurchasesFactory.createPurchases$default(new com.revenuecat.purchases.PurchasesFactory(new com.revenuecat.purchases.utils.DefaultIsDebugBuildProvider(configuration.getContext()), aPIKeyValidator, 2, objArr == true ? 1 : 0), configuration, getPlatformInfo(), getProxyURL(), null, null, false, false, null, 248, null);
            com.revenuecat.purchases.Purchases.Companion companion = com.revenuecat.purchases.Purchases.INSTANCE;
            companion.setSharedInstance$purchases_defaultsRelease(purchasesCreatePurchases$default);
            companion.getServiceDispatcher$purchases_defaultsRelease().initialize(purchasesCreatePurchases$default);
            return purchasesCreatePurchases$default;
        }

        public final com.revenuecat.purchases.Purchases getBackingFieldSharedInstance$purchases_defaultsRelease() {
            return com.revenuecat.purchases.Purchases.backingFieldSharedInstance;
        }

        public final boolean getDebugLogsEnabled() {
            return com.revenuecat.purchases.PurchasesOrchestrator.INSTANCE.getDebugLogsEnabled();
        }

        public final java.lang.String getFrameworkVersion() {
            return com.revenuecat.purchases.Purchases.frameworkVersion;
        }

        public final java.lang.Object getImageLoader(android.content.Context context) {
            kotlin.jvm.internal.m.e(context, "context");
            return com.revenuecat.purchases.PurchasesOrchestrator.INSTANCE.getImageLoader(context);
        }

        public final synchronized com.revenuecat.purchases.LogHandler getLogHandler() {
            return com.revenuecat.purchases.PurchasesOrchestrator.INSTANCE.getLogHandler();
        }

        public final com.revenuecat.purchases.LogLevel getLogLevel() {
            return com.revenuecat.purchases.PurchasesOrchestrator.INSTANCE.getLogLevel();
        }

        public final com.revenuecat.purchases.common.PlatformInfo getPlatformInfo() {
            return com.revenuecat.purchases.PurchasesOrchestrator.INSTANCE.getPlatformInfo();
        }

        public final java.net.URL getProxyURL() {
            return com.revenuecat.purchases.PurchasesOrchestrator.INSTANCE.getProxyURL();
        }

        public final com.revenuecat.purchases.PurchasesServiceDispatcher getServiceDispatcher$purchases_defaultsRelease() {
            return com.revenuecat.purchases.Purchases.serviceDispatcher;
        }

        public final com.revenuecat.purchases.Purchases getSharedInstance() {
            com.revenuecat.purchases.Purchases backingFieldSharedInstance$purchases_defaultsRelease = getBackingFieldSharedInstance$purchases_defaultsRelease();
            if (backingFieldSharedInstance$purchases_defaultsRelease != null) {
                return backingFieldSharedInstance$purchases_defaultsRelease;
            }
            throw new I3.b(com.revenuecat.purchases.strings.ConfigureStrings.NO_SINGLETON_INSTANCE);
        }

        public final boolean isConfigured() {
            return getBackingFieldSharedInstance$purchases_defaultsRelease() != null;
        }

        public final com.revenuecat.purchases.WebPurchaseRedemption parseAsWebPurchaseRedemption(android.content.Intent intent) {
            kotlin.jvm.internal.m.e(intent, "intent");
            android.net.Uri data = intent.getData();
            if (data == null) {
                return null;
            }
            return com.revenuecat.purchases.deeplinks.DeepLinkParser.INSTANCE.parseWebPurchaseRedemption(data);
        }

        public final void setBackingFieldSharedInstance$purchases_defaultsRelease(com.revenuecat.purchases.Purchases purchases) {
            com.revenuecat.purchases.Purchases.backingFieldSharedInstance = purchases;
        }

        public final void setDebugLogsEnabled(boolean z6) {
            com.revenuecat.purchases.PurchasesOrchestrator.INSTANCE.setDebugLogsEnabled(z6);
        }

        public final synchronized void setLogHandler(com.revenuecat.purchases.LogHandler value) {
            kotlin.jvm.internal.m.e(value, "value");
            com.revenuecat.purchases.PurchasesOrchestrator.INSTANCE.setLogHandler(value);
        }

        public final void setLogLevel(com.revenuecat.purchases.LogLevel value) {
            kotlin.jvm.internal.m.e(value, "value");
            com.revenuecat.purchases.PurchasesOrchestrator.INSTANCE.setLogLevel(value);
        }

        public final void setPlatformInfo(com.revenuecat.purchases.common.PlatformInfo value) {
            kotlin.jvm.internal.m.e(value, "value");
            com.revenuecat.purchases.PurchasesOrchestrator.INSTANCE.setPlatformInfo(value);
        }

        public final void setProxyURL(java.net.URL url) {
            com.revenuecat.purchases.PurchasesOrchestrator.INSTANCE.setProxyURL(url);
        }

        public final void setServiceDispatcher$purchases_defaultsRelease(com.revenuecat.purchases.PurchasesServiceDispatcher purchasesServiceDispatcher) {
            kotlin.jvm.internal.m.e(purchasesServiceDispatcher, "<set-?>");
            com.revenuecat.purchases.Purchases.serviceDispatcher = purchasesServiceDispatcher;
        }

        public final void setSharedInstance$purchases_defaultsRelease(com.revenuecat.purchases.Purchases value) {
            kotlin.jvm.internal.m.e(value, "value");
            com.revenuecat.purchases.Purchases backingFieldSharedInstance$purchases_defaultsRelease = getBackingFieldSharedInstance$purchases_defaultsRelease();
            if (backingFieldSharedInstance$purchases_defaultsRelease != null) {
                backingFieldSharedInstance$purchases_defaultsRelease.close();
            }
            setBackingFieldSharedInstance$purchases_defaultsRelease(value);
        }

        private Companion() {
        }

        public final void canMakePayments(android.content.Context context, java.util.List<? extends com.revenuecat.purchases.models.BillingFeature> features, com.revenuecat.purchases.interfaces.Callback<java.lang.Boolean> callback) {
            com.revenuecat.purchases.LogHandler currentLogHandler;
            java.lang.String strM;
            java.lang.String str;
            kotlin.jvm.internal.m.e(context, "context");
            kotlin.jvm.internal.m.e(features, "features");
            kotlin.jvm.internal.m.e(callback, "callback");
            if (getSharedInstance().getPurchasesOrchestrator().getAppConfig().getStore() == com.revenuecat.purchases.Store.PLAY_STORE) {
                com.revenuecat.purchases.PurchasesOrchestrator.INSTANCE.canMakePayments(context, features, callback);
                return;
            }
            com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.RC_ERROR;
            com.revenuecat.purchases.Purchases$Companion$canMakePayments$$inlined$log$1 purchases$Companion$canMakePayments$$inlined$log$1 = new com.revenuecat.purchases.Purchases$Companion$canMakePayments$$inlined$log$1(logIntent);
            switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) purchases$Companion$canMakePayments$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 2:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) purchases$Companion$canMakePayments$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) purchases$Companion$canMakePayments$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i(com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) purchases$Companion$canMakePayments$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel4, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) purchases$Companion$canMakePayments$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 6:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) purchases$Companion$canMakePayments$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i(com.google.android.gms.internal.play_billing.M0.m(logLevel5, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) purchases$Companion$canMakePayments$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel6, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) purchases$Companion$canMakePayments$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 9:
                    com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel7, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) purchases$Companion$canMakePayments$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 10:
                    com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w(com.google.android.gms.internal.play_billing.M0.m(logLevel8, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) purchases$Companion$canMakePayments$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w(com.google.android.gms.internal.play_billing.M0.m(logLevel9, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) purchases$Companion$canMakePayments$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) purchases$Companion$canMakePayments$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w(com.google.android.gms.internal.play_billing.M0.m(logLevel10, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) purchases$Companion$canMakePayments$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) purchases$Companion$canMakePayments$$inlined$log$1.invoke(), null);
                    break;
            }
            callback.onReceived(java.lang.Boolean.TRUE);
        }

        public final com.revenuecat.purchases.WebPurchaseRedemption parseAsWebPurchaseRedemption(java.lang.String string) {
            kotlin.jvm.internal.m.e(string, "string");
            try {
                android.net.Uri uri = android.net.Uri.parse(string);
                com.revenuecat.purchases.deeplinks.DeepLinkParser deepLinkParser = com.revenuecat.purchases.deeplinks.DeepLinkParser.INSTANCE;
                kotlin.jvm.internal.m.d(uri, "uri");
                return deepLinkParser.parseWebPurchaseRedemption(uri);
            } catch (java.lang.Throwable th) {
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error parsing URL: ".concat(string), th);
                return null;
            }
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.revenuecat.purchases.PurchasesAreCompletedBy.values().length];
            try {
                iArr[com.revenuecat.purchases.PurchasesAreCompletedBy.REVENUECAT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.revenuecat.purchases.PurchasesAreCompletedBy.MY_APP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$pollRewardVerification$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationResult;"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "com.revenuecat.purchases.Purchases$pollRewardVerification$1", f = "Purchases.kt", l = {807}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p117n6.i implements p194x6.j {
        final /* synthetic */ java.lang.String $clientTransactionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(java.lang.String str, p100l6.c cVar) {
            super(1, cVar);
            this.$clientTransactionId = str;
        }

        @Override // p117n6.a
        public final p100l6.c create(p100l6.c cVar) {
            return com.revenuecat.purchases.Purchases.this.new AnonymousClass1(this.$clientTransactionId, cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            p109m6.a aVar = p109m6.a.f25430h;
            int i3 = this.label;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
                return obj;
            }
            com.google.common.util.concurrent.P.u0(obj);
            com.revenuecat.purchases.Purchases purchases = com.revenuecat.purchases.Purchases.this;
            java.lang.String str = this.$clientTransactionId;
            this.label = 1;
            java.lang.Object objPollRewardVerification$purchases_defaultsRelease = purchases.pollRewardVerification$purchases_defaultsRelease(str, new com.revenuecat.purchases.CoroutinesExtensionsKt.AnonymousClass2(null), this);
            return objPollRewardVerification$purchases_defaultsRelease == aVar ? aVar : objPollRewardVerification$purchases_defaultsRelease;
        }

        @Override // p194x6.j
        public final java.lang.Object invoke(p100l6.c cVar) {
            return ((com.revenuecat.purchases.Purchases.AnonymousClass1) create(cVar)).invokeSuspend(p070h6.A.f22523a);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$pollRewardVerification$2, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationResult;", "it", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationResult;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends kotlin.jvm.internal.o implements p194x6.j {
        final /* synthetic */ com.revenuecat.purchases.interfaces.PollRewardVerificationCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(com.revenuecat.purchases.interfaces.PollRewardVerificationCallback pollRewardVerificationCallback) {
            super(1);
            this.$callback = pollRewardVerificationCallback;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult it) {
            kotlin.jvm.internal.m.e(it, "it");
            this.$callback.onCompleted(it);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$pollRewardVerification$3, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "com.revenuecat.purchases.Purchases", f = "Purchases.kt", l = {817, 826}, m = "pollRewardVerification$purchases_defaultsRelease")
    public static final class AnonymousClass3 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public AnonymousClass3(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.revenuecat.purchases.Purchases.this.pollRewardVerification$purchases_defaultsRelease(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$refreshCustomerInfoAfterEntitlementGrant$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "com.revenuecat.purchases.Purchases", f = "Purchases.kt", l = {841, 848}, m = "refreshCustomerInfoAfterEntitlementGrant")
    public static final class C19891 extends p117n6.c {
        int I$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public C19891(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.revenuecat.purchases.Purchases.this.refreshCustomerInfoAfterEntitlementGrant(null, this);
        }
    }

    public Purchases(com.revenuecat.purchases.PurchasesOrchestrator purchasesOrchestrator) {
        kotlin.jvm.internal.m.e(purchasesOrchestrator, "purchasesOrchestrator");
        this.purchasesOrchestrator = purchasesOrchestrator;
        this.rewardVerificationPollLauncher = new com.revenuecat.purchases.ads.rewardverification.RewardVerificationPollLauncher(null, 1, null);
    }

    public static final void canMakePayments(android.content.Context context, com.revenuecat.purchases.interfaces.Callback<java.lang.Boolean> callback) {
        INSTANCE.canMakePayments(context, callback);
    }

    public static final com.revenuecat.purchases.Purchases configure(com.revenuecat.purchases.PurchasesConfiguration purchasesConfiguration) {
        return INSTANCE.configure(purchasesConfiguration);
    }

    public static /* synthetic */ void getAdTracker$annotations() {
    }

    @p070h6.c
    public static /* synthetic */ void getAllowSharingPlayStoreAccount$annotations() {
    }

    public static /* synthetic */ void getDebugEventListener$annotations() {
    }

    public static final boolean getDebugLogsEnabled() {
        return INSTANCE.getDebugLogsEnabled();
    }

    public static /* synthetic */ void getFileRepository$annotations() {
    }

    @p070h6.c
    public static /* synthetic */ void getFinishTransactions$annotations() {
    }

    public static final java.lang.String getFrameworkVersion() {
        return INSTANCE.getFrameworkVersion();
    }

    public static final synchronized com.revenuecat.purchases.LogHandler getLogHandler() {
        return INSTANCE.getLogHandler();
    }

    public static final com.revenuecat.purchases.LogLevel getLogLevel() {
        return INSTANCE.getLogLevel();
    }

    public static final com.revenuecat.purchases.common.PlatformInfo getPlatformInfo() {
        return INSTANCE.getPlatformInfo();
    }

    public static /* synthetic */ void getProducts$default(com.revenuecat.purchases.Purchases purchases, java.util.List list, com.revenuecat.purchases.ProductType productType, com.revenuecat.purchases.interfaces.GetStoreProductsCallback getStoreProductsCallback, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            productType = null;
        }
        purchases.getProducts(list, productType, getStoreProductsCallback);
    }

    public static final java.net.URL getProxyURL() {
        return INSTANCE.getProxyURL();
    }

    public static final com.revenuecat.purchases.Purchases getSharedInstance() {
        return INSTANCE.getSharedInstance();
    }

    public static /* synthetic */ void getStorefrontLocale$annotations() {
    }

    public static /* synthetic */ void getTrackedEventListener$annotations() {
    }

    public static final boolean isConfigured() {
        return INSTANCE.isConfigured();
    }

    public static /* synthetic */ void logIn$default(com.revenuecat.purchases.Purchases purchases, java.lang.String str, com.revenuecat.purchases.interfaces.LogInCallback logInCallback, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            logInCallback = null;
        }
        purchases.logIn(str, logInCallback);
    }

    public static /* synthetic */ void logOut$default(com.revenuecat.purchases.Purchases purchases, com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            receiveCustomerInfoCallback = null;
        }
        purchases.logOut(receiveCustomerInfoCallback);
    }

    private final void notifyLifecycleClosed() {
        serviceDispatcher.close(this);
    }

    public static final com.revenuecat.purchases.WebPurchaseRedemption parseAsWebPurchaseRedemption(android.content.Intent intent) {
        return INSTANCE.parseAsWebPurchaseRedemption(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(4:47|25|(1:28)|39) */
    /* JADX WARN: Code duplicated, block: B:28:0x009c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:37:0x00af  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a0, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
    
        r2 = r12;
        r12 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bb, code lost:
    
        if (com.revenuecat.purchases.ads.rewardverification.RewardVerificationRetryKt.rewardVerificationRetryDelay(r0) == r1) goto L39;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x00d3, please report this as an issue */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00ad -> B:40:0x00be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00bb -> B:40:0x00be). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object refreshCustomerInfoAfterEntitlementGrant(java.lang.String str, p100l6.c cVar) {
        com.revenuecat.purchases.Purchases.C19891 c19891;
        java.lang.String str2;
        int i3;
        com.revenuecat.purchases.Purchases purchases;
        java.lang.String str3;
        com.revenuecat.purchases.LogLevel logLevel;
        com.revenuecat.purchases.LogHandler currentLogHandler;
        com.revenuecat.purchases.CacheFetchPolicy cacheFetchPolicy;
        if (cVar instanceof com.revenuecat.purchases.Purchases.C19891) {
            c19891 = (com.revenuecat.purchases.Purchases.C19891) cVar;
            int i9 = c19891.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c19891.label = i9 - Integer.MIN_VALUE;
            } else {
                c19891 = new com.revenuecat.purchases.Purchases.C19891(cVar);
            }
        } else {
            c19891 = new com.revenuecat.purchases.Purchases.C19891(cVar);
        }
        java.lang.Object obj = c19891.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = c19891.label;
        if (i10 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.DEBUG;
            com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                currentLogHandler2.d(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), "Reward verification granted an entitlement; refreshing CustomerInfo (transactionId=" + str + ").");
            }
            str2 = str;
            i3 = 0;
            purchases = this;
            if (i3 < 3) {
                cacheFetchPolicy = com.revenuecat.purchases.CacheFetchPolicy.FETCH_CURRENT;
                c19891.L$0 = purchases;
                c19891.L$1 = str2;
                c19891.I$0 = i3;
                c19891.label = 1;
                if (com.revenuecat.purchases.CoroutinesExtensionsKt.awaitCustomerInfo(purchases, cacheFetchPolicy, c19891) != aVar) {
                    str3 = str2;
                }
                return aVar;
            }
            logLevel = com.revenuecat.purchases.LogLevel.WARN;
            currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.w(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), "Reward verification could not refresh CustomerInfo after an entitlement grant (transactionId=" + str2 + "). The grant persists server-side and will sync on a later fetch.");
            }
            return java.lang.Boolean.FALSE;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c19891.I$0;
            str3 = (java.lang.String) c19891.L$1;
            purchases = (com.revenuecat.purchases.Purchases) c19891.L$0;
            com.google.common.util.concurrent.P.u0(obj);
            str2 = str3;
            if (i3 < 3) {
                cacheFetchPolicy = com.revenuecat.purchases.CacheFetchPolicy.FETCH_CURRENT;
                c19891.L$0 = purchases;
                c19891.L$1 = str2;
                c19891.I$0 = i3;
                c19891.label = 1;
                if (com.revenuecat.purchases.CoroutinesExtensionsKt.awaitCustomerInfo(purchases, cacheFetchPolicy, c19891) != aVar) {
                    str3 = str2;
                }
                return aVar;
            }
            logLevel = com.revenuecat.purchases.LogLevel.WARN;
            currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.w(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), "Reward verification could not refresh CustomerInfo after an entitlement grant (transactionId=" + str2 + "). The grant persists server-side and will sync on a later fetch.");
            }
            return java.lang.Boolean.FALSE;
        }
        i3 = c19891.I$0;
        str3 = (java.lang.String) c19891.L$1;
        purchases = (com.revenuecat.purchases.Purchases) c19891.L$0;
        try {
            com.google.common.util.concurrent.P.u0(obj);
        } catch (com.revenuecat.purchases.PurchasesException e6) {
            com.revenuecat.purchases.PurchasesException e9 = e6;
            if (e9.getCode() == com.revenuecat.purchases.PurchasesErrorCode.NetworkError) {
                i3++;
                if (i3 < 3) {
                    c19891.L$0 = purchases;
                    c19891.L$1 = str3;
                    c19891.I$0 = i3;
                    c19891.label = 2;
                }
                str2 = str3;
                if (i3 < 3) {
                    cacheFetchPolicy = com.revenuecat.purchases.CacheFetchPolicy.FETCH_CURRENT;
                    c19891.L$0 = purchases;
                    c19891.L$1 = str2;
                    c19891.I$0 = i3;
                    c19891.label = 1;
                    if (com.revenuecat.purchases.CoroutinesExtensionsKt.awaitCustomerInfo(purchases, cacheFetchPolicy, c19891) != aVar) {
                        str3 = str2;
                    }
                    return aVar;
                }
            } else {
                str2 = str3;
            }
            logLevel = com.revenuecat.purchases.LogLevel.WARN;
            currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.w(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), "Reward verification could not refresh CustomerInfo after an entitlement grant (transactionId=" + str2 + "). The grant persists server-side and will sync on a later fetch.");
            }
            return java.lang.Boolean.FALSE;
        }
        return java.lang.Boolean.TRUE;
    }

    public static final void setDebugLogsEnabled(boolean z6) {
        INSTANCE.setDebugLogsEnabled(z6);
    }

    public static final synchronized void setLogHandler(com.revenuecat.purchases.LogHandler logHandler) {
        INSTANCE.setLogHandler(logHandler);
    }

    public static final void setLogLevel(com.revenuecat.purchases.LogLevel logLevel) {
        INSTANCE.setLogLevel(logLevel);
    }

    public static final void setPlatformInfo(com.revenuecat.purchases.common.PlatformInfo platformInfo) {
        INSTANCE.setPlatformInfo(platformInfo);
    }

    public static final void setProxyURL(java.net.URL url) {
        INSTANCE.setProxyURL(url);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showInAppMessagesIfNeeded$default(com.revenuecat.purchases.Purchases purchases, android.app.Activity activity, java.util.List list, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            list = com.google.common.util.concurrent.P.i0(com.revenuecat.purchases.models.InAppMessageType.BILLING_ISSUES);
        }
        purchases.showInAppMessagesIfNeeded(activity, list);
    }

    public static /* synthetic */ void syncPurchases$default(com.revenuecat.purchases.Purchases purchases, com.revenuecat.purchases.interfaces.SyncPurchasesCallback syncPurchasesCallback, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            syncPurchasesCallback = null;
        }
        purchases.syncPurchases(syncPurchasesCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackCustomPaywallImpression$default(com.revenuecat.purchases.Purchases purchases, com.revenuecat.purchases.paywalls.events.CustomPaywallImpressionParams customPaywallImpressionParams, int i3, java.lang.Object obj) {
        int i9 = 1;
        if ((i3 & 1) != 0) {
            customPaywallImpressionParams = new com.revenuecat.purchases.paywalls.events.CustomPaywallImpressionParams((java.lang.String) null, i9, (kotlin.jvm.internal.AbstractC2541f) (0 == true ? 1 : 0));
        }
        purchases.trackCustomPaywallImpression(customPaywallImpressionParams);
    }

    public final /* synthetic */ java.lang.Object awaitGetUiConfig(p100l6.c cVar) {
        return this.purchasesOrchestrator.getUiConfig(cVar);
    }

    public final /* synthetic */ java.lang.Object awaitGetWorkflow(java.lang.String str, p100l6.c cVar) {
        return this.purchasesOrchestrator.getWorkflow(str, cVar);
    }

    public final void close() {
        notifyLifecycleClosed();
        this.purchasesOrchestrator.close();
        this.rewardVerificationPollLauncher.close();
        backingFieldSharedInstance = null;
    }

    public final void collectDeviceIdentifiers() {
        this.purchasesOrchestrator.collectDeviceIdentifiers();
    }

    public final void createSupportTicket(java.lang.String email, java.lang.String description, p194x6.j onSuccess, p194x6.j onError) {
        kotlin.jvm.internal.m.e(email, "email");
        kotlin.jvm.internal.m.e(description, "description");
        kotlin.jvm.internal.m.e(onSuccess, "onSuccess");
        kotlin.jvm.internal.m.e(onError, "onError");
        this.purchasesOrchestrator.createSupportTicket(email, description, onSuccess, onError);
    }

    public final com.revenuecat.purchases.ads.rewardverification.RewardVerificationToken generateRewardVerificationToken(java.lang.String impressionId) {
        kotlin.jvm.internal.m.e(impressionId, "impressionId");
        java.lang.String string = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.m.d(string, "randomUUID().toString()");
        java.lang.String string2 = new org.json.JSONObject().put("api_key", this.purchasesOrchestrator.getCurrentConfiguration().getApiKey()).put("client_transaction_id", string).put("impression_id", impressionId).toString();
        kotlin.jvm.internal.m.d(string2, "JSONObject()\n           …)\n            .toString()");
        return new com.revenuecat.purchases.ads.rewardverification.RewardVerificationToken(string2, string, this.purchasesOrchestrator.getAppUserID());
    }

    public final /* synthetic */ com.revenuecat.purchases.ads.events.AdTracker getAdTracker() {
        return this.purchasesOrchestrator.getAdTracker();
    }

    public final synchronized boolean getAllowSharingPlayStoreAccount() {
        return this.purchasesOrchestrator.getAllowSharingPlayStoreAccount();
    }

    public final void getAmazonLWAConsentStatus(com.revenuecat.purchases.interfaces.GetAmazonLWAConsentStatusCallback callback) {
        kotlin.jvm.internal.m.e(callback, "callback");
        this.purchasesOrchestrator.getAmazonLWAConsentStatus(callback);
    }

    public final synchronized java.lang.String getAppUserID() {
        return this.purchasesOrchestrator.getAppUserID();
    }

    public final com.revenuecat.purchases.paywalls.DownloadedFontFamily getCachedFontFamilyOrStartDownload(com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo.Name fontInfo) {
        kotlin.jvm.internal.m.e(fontInfo, "fontInfo");
        return this.purchasesOrchestrator.getCachedFontFamilyOrStartDownload(fontInfo);
    }

    public final com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies getCachedVirtualCurrencies() {
        return this.purchasesOrchestrator.getCachedVirtualCurrencies();
    }

    public final com.revenuecat.purchases.PurchasesConfiguration getCurrentConfiguration() {
        return this.purchasesOrchestrator.getCurrentConfiguration();
    }

    public final void getCustomerCenterConfigData$purchases_defaultsRelease(com.revenuecat.purchases.interfaces.GetCustomerCenterConfigCallback callback) {
        kotlin.jvm.internal.m.e(callback, "callback");
        this.purchasesOrchestrator.getCustomerCenterConfig(callback);
    }

    public final com.revenuecat.purchases.customercenter.CustomerCenterListener getCustomerCenterListener() {
        return this.purchasesOrchestrator.getCustomerCenterListener();
    }

    public final void getCustomerInfo(com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback callback) {
        kotlin.jvm.internal.m.e(callback, "callback");
        this.purchasesOrchestrator.getCustomerInfo(com.revenuecat.purchases.CacheFetchPolicy.INSTANCE.m16default(), true, callback);
    }

    public final /* synthetic */ com.revenuecat.purchases.DebugEventListener getDebugEventListener() {
        return this.purchasesOrchestrator.getDebugEventListener();
    }

    public final /* synthetic */ com.revenuecat.purchases.storage.FileRepository getFileRepository() {
        return this.purchasesOrchestrator.getFileRepository();
    }

    public final synchronized boolean getFinishTransactions() {
        return this.purchasesOrchestrator.getFinishTransactions();
    }

    @p070h6.c
    public final void getNonSubscriptionSkus(java.util.List<java.lang.String> productIds, com.revenuecat.purchases.interfaces.GetStoreProductsCallback callback) {
        kotlin.jvm.internal.m.e(productIds, "productIds");
        kotlin.jvm.internal.m.e(callback, "callback");
        this.purchasesOrchestrator.getProductsOfTypes(p078i6.o.R1(productIds), com.google.crypto.tink.shaded.protobuf.AbstractC1909d.h0(com.revenuecat.purchases.ProductType.INAPP), callback);
    }

    public final void getOfferings(com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback listener) {
        kotlin.jvm.internal.m.e(listener, "listener");
        com.revenuecat.purchases.PurchasesOrchestrator.getOfferings$default(this.purchasesOrchestrator, listener, false, 2, null);
    }

    public final synchronized java.lang.String getPreferredUILocaleOverride() {
        return this.purchasesOrchestrator.get_preferredUILocaleOverride();
    }

    public final void getProducts(java.util.List<java.lang.String> productIds, com.revenuecat.purchases.interfaces.GetStoreProductsCallback callback) {
        kotlin.jvm.internal.m.e(productIds, "productIds");
        kotlin.jvm.internal.m.e(callback, "callback");
        getProducts(productIds, null, callback);
    }

    public final synchronized com.revenuecat.purchases.PurchasesAreCompletedBy getPurchasesAreCompletedBy() {
        try {
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return this.purchasesOrchestrator.getFinishTransactions() ? com.revenuecat.purchases.PurchasesAreCompletedBy.REVENUECAT : com.revenuecat.purchases.PurchasesAreCompletedBy.MY_APP;
    }

    /* JADX INFO: renamed from: getPurchasesOrchestrator$purchases_defaultsRelease, reason: from getter */
    public final /* synthetic */ com.revenuecat.purchases.PurchasesOrchestrator getPurchasesOrchestrator() {
        return this.purchasesOrchestrator;
    }

    public final void getRewardVerificationResult$purchases_defaultsRelease(java.lang.String clientTransactionId, com.revenuecat.purchases.interfaces.GetRewardVerificationResultCallback callback) {
        kotlin.jvm.internal.m.e(clientTransactionId, "clientTransactionId");
        kotlin.jvm.internal.m.e(callback, "callback");
        this.purchasesOrchestrator.getRewardVerificationResult(clientTransactionId, callback);
    }

    public final com.revenuecat.purchases.Store getStore() {
        return this.purchasesOrchestrator.getStore();
    }

    public final synchronized java.lang.String getStorefrontCountryCode() {
        return this.purchasesOrchestrator.getStorefrontCountryCode();
    }

    public final java.util.Locale getStorefrontLocale() {
        return this.purchasesOrchestrator.getStorefrontLocale();
    }

    @p070h6.c
    public final void getSubscriptionSkus(java.util.List<java.lang.String> productIds, com.revenuecat.purchases.interfaces.GetStoreProductsCallback callback) {
        kotlin.jvm.internal.m.e(productIds, "productIds");
        kotlin.jvm.internal.m.e(callback, "callback");
        this.purchasesOrchestrator.getProductsOfTypes(p078i6.o.R1(productIds), com.google.crypto.tink.shaded.protobuf.AbstractC1909d.h0(com.revenuecat.purchases.ProductType.SUBS), callback);
    }

    public final /* synthetic */ com.revenuecat.purchases.TrackedEventListener getTrackedEventListener() {
        return this.purchasesOrchestrator.getTrackedEventListener();
    }

    public final synchronized com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener getUpdatedCustomerInfoListener() {
        return this.purchasesOrchestrator.getUpdatedCustomerInfoListener();
    }

    public final void getVirtualCurrencies(com.revenuecat.purchases.interfaces.GetVirtualCurrenciesCallback callback) {
        kotlin.jvm.internal.m.e(callback, "callback");
        this.purchasesOrchestrator.getVirtualCurrencies(callback);
    }

    public final void invalidateCustomerInfoCache() {
        this.purchasesOrchestrator.invalidateCustomerInfoCache();
    }

    public final void invalidateVirtualCurrenciesCache() {
        this.purchasesOrchestrator.invalidateVirtualCurrenciesCache();
    }

    public final boolean isAnonymous() {
        return this.purchasesOrchestrator.isAnonymous();
    }

    public final void logIn(java.lang.String newAppUserID) {
        kotlin.jvm.internal.m.e(newAppUserID, "newAppUserID");
        logIn$default(this, newAppUserID, null, 2, null);
    }

    public final void logOut() {
        logOut$default(this, null, 1, null);
    }

    @Override // com.revenuecat.purchases.LifecycleDelegate
    @p070h6.c
    public void onAppBackgrounded() {
        this.purchasesOrchestrator.onAppBackgrounded();
    }

    @Override // com.revenuecat.purchases.LifecycleDelegate
    @p070h6.c
    public void onAppForegrounded() {
        this.purchasesOrchestrator.onAppForegrounded();
    }

    public final boolean overridePreferredUILocale(java.lang.String localeString) {
        return this.purchasesOrchestrator.overridePreferredUILocale(localeString);
    }

    public final void pollRewardVerification(java.lang.String clientTransactionId, com.revenuecat.purchases.interfaces.PollRewardVerificationCallback callback) {
        kotlin.jvm.internal.m.e(clientTransactionId, "clientTransactionId");
        kotlin.jvm.internal.m.e(callback, "callback");
        this.rewardVerificationPollLauncher.launch(new com.revenuecat.purchases.Purchases.AnonymousClass1(clientTransactionId, null), new com.revenuecat.purchases.Purchases.AnonymousClass2(callback));
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00be  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object pollRewardVerification$purchases_defaultsRelease(java.lang.String str, p194x6.m mVar, p100l6.c cVar) {
        com.revenuecat.purchases.Purchases.AnonymousClass3 anonymousClass3;
        com.revenuecat.purchases.Purchases purchases;
        com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult rewardVerificationResult;
        com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult rewardVerificationResult2;
        if (cVar instanceof com.revenuecat.purchases.Purchases.AnonymousClass3) {
            anonymousClass3 = (com.revenuecat.purchases.Purchases.AnonymousClass3) cVar;
            int i3 = anonymousClass3.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass3.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass3 = new com.revenuecat.purchases.Purchases.AnonymousClass3(cVar);
            }
        } else {
            anonymousClass3 = new com.revenuecat.purchases.Purchases.AnonymousClass3(cVar);
        }
        java.lang.Object objInvoke = anonymousClass3.result;
        java.lang.Object obj = p109m6.a.f25430h;
        int i9 = anonymousClass3.label;
        boolean z6 = true;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objInvoke);
            anonymousClass3.L$0 = this;
            anonymousClass3.L$1 = str;
            anonymousClass3.label = 1;
            objInvoke = mVar.invoke(str, anonymousClass3);
            if (objInvoke != obj) {
                purchases = this;
            }
            return obj;
        }
        if (i9 == 1) {
            str = (java.lang.String) anonymousClass3.L$1;
            purchases = (com.revenuecat.purchases.Purchases) anonymousClass3.L$0;
            com.google.common.util.concurrent.P.u0(objInvoke);
        } else {
            if (i9 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rewardVerificationResult2 = (com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult) anonymousClass3.L$0;
            com.google.common.util.concurrent.P.u0(objInvoke);
        }
        if (((java.lang.Boolean) objInvoke).booleanValue()) {
            rewardVerificationResult = rewardVerificationResult2;
            rewardVerificationResult2 = rewardVerificationResult;
        } else {
            z6 = false;
        }
        if (z6) {
            return rewardVerificationResult2;
        }
        return com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult.failed;
        rewardVerificationResult = (com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult) objInvoke;
        com.revenuecat.purchases.ads.rewardverification.VerifiedReward verifiedReward = rewardVerificationResult.getVerifiedReward();
        if (verifiedReward == null) {
            return rewardVerificationResult;
        }
        java.util.ArrayList arrayListA1 = p078i6.o.A1(com.google.common.util.concurrent.P.i0(verifiedReward), rewardVerificationResult.getMoreRewards());
        if (!arrayListA1.isEmpty()) {
            java.util.Iterator it = arrayListA1.iterator();
            while (it.hasNext()) {
                if (((com.revenuecat.purchases.ads.rewardverification.VerifiedReward) it.next()) instanceof com.revenuecat.purchases.ads.rewardverification.VerifiedReward.VirtualCurrency) {
                    purchases.purchasesOrchestrator.invalidateVirtualCurrenciesCache();
                    break;
                }
            }
        }
        if (!arrayListA1.isEmpty()) {
            java.util.Iterator it2 = arrayListA1.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((com.revenuecat.purchases.ads.rewardverification.VerifiedReward) it2.next()) instanceof com.revenuecat.purchases.ads.rewardverification.VerifiedReward.Entitlement) {
                        anonymousClass3.L$0 = rewardVerificationResult;
                        anonymousClass3.L$1 = null;
                        anonymousClass3.label = 2;
                        java.lang.Object objRefreshCustomerInfoAfterEntitlementGrant = purchases.refreshCustomerInfoAfterEntitlementGrant(str, anonymousClass3);
                        if (objRefreshCustomerInfoAfterEntitlementGrant != obj) {
                            objInvoke = objRefreshCustomerInfoAfterEntitlementGrant;
                            rewardVerificationResult2 = rewardVerificationResult;
                            if (((java.lang.Boolean) objInvoke).booleanValue()) {
                                rewardVerificationResult = rewardVerificationResult2;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                return rewardVerificationResult2;
                            }
                            return com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult.failed;
                        }
                        return obj;
                    }
                }
            }
        }
        rewardVerificationResult2 = rewardVerificationResult;
        if (z6) {
            return rewardVerificationResult2;
        }
        return com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult.failed;
    }

    public final void purchase(com.revenuecat.purchases.PurchaseParams purchaseParams, com.revenuecat.purchases.interfaces.PurchaseCallback callback) {
        kotlin.jvm.internal.m.e(purchaseParams, "purchaseParams");
        kotlin.jvm.internal.m.e(callback, "callback");
        this.purchasesOrchestrator.purchase(purchaseParams, callback);
    }

    @p070h6.c
    public final void purchasePackage(android.app.Activity activity, com.revenuecat.purchases.Package packageToPurchase, com.revenuecat.purchases.interfaces.PurchaseCallback listener) {
        kotlin.jvm.internal.m.e(activity, "activity");
        kotlin.jvm.internal.m.e(packageToPurchase, "packageToPurchase");
        kotlin.jvm.internal.m.e(listener, "listener");
        purchase(new com.revenuecat.purchases.PurchaseParams.Builder(activity, packageToPurchase).build(), listener);
    }

    @p070h6.c
    public final void purchaseProduct(android.app.Activity activity, com.revenuecat.purchases.models.StoreProduct storeProduct, com.revenuecat.purchases.interfaces.PurchaseCallback callback) {
        kotlin.jvm.internal.m.e(activity, "activity");
        kotlin.jvm.internal.m.e(storeProduct, "storeProduct");
        kotlin.jvm.internal.m.e(callback, "callback");
        purchase(new com.revenuecat.purchases.PurchaseParams.Builder(activity, storeProduct).build(), callback);
    }

    public final void redeemWebPurchase(com.revenuecat.purchases.WebPurchaseRedemption webPurchaseRedemption, com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener listener) {
        kotlin.jvm.internal.m.e(webPurchaseRedemption, "webPurchaseRedemption");
        kotlin.jvm.internal.m.e(listener, "listener");
        this.purchasesOrchestrator.redeemWebPurchase(webPurchaseRedemption, listener);
    }

    public final void removeUpdatedCustomerInfoListener() {
        this.purchasesOrchestrator.removeUpdatedCustomerInfoListener();
    }

    public final /* synthetic */ java.lang.Object resolveWorkflow(java.lang.String str, p100l6.c cVar) {
        return this.purchasesOrchestrator.resolveWorkflow(str, cVar);
    }

    public final void restorePurchases(com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback callback) {
        kotlin.jvm.internal.m.e(callback, "callback");
        this.purchasesOrchestrator.restorePurchases(callback);
    }

    public final void setAd(java.lang.String ad) {
        this.purchasesOrchestrator.setAd(ad);
    }

    public final void setAdGroup(java.lang.String adGroup) {
        this.purchasesOrchestrator.setAdGroup(adGroup);
    }

    public final void setAdjustID(java.lang.String adjustID) {
        this.purchasesOrchestrator.setAdjustID(adjustID);
    }

    public final void setAirbridgeDeviceID(java.lang.String airbridgeDeviceID) {
        this.purchasesOrchestrator.setAirbridgeDeviceID(airbridgeDeviceID);
    }

    public final void setAirshipChannelID(java.lang.String airshipChannelID) {
        this.purchasesOrchestrator.setAirshipChannelID(airshipChannelID);
    }

    public final synchronized void setAllowSharingPlayStoreAccount(boolean z6) {
        this.purchasesOrchestrator.setAllowSharingPlayStoreAccount(z6);
    }

    public final void setAppsFlyerConversionData(java.util.Map<?, ?> data) {
        this.purchasesOrchestrator.setAppsFlyerConversionData(data);
    }

    public final void setAppsflyerID(java.lang.String appsflyerID) {
        this.purchasesOrchestrator.setAppsflyerID(appsflyerID);
    }

    public final void setAppstackAttributionParams(java.util.Map<java.lang.String, java.lang.String> data, com.revenuecat.purchases.interfaces.SyncAttributesAndOfferingsCallback callback) {
        kotlin.jvm.internal.m.e(data, "data");
        kotlin.jvm.internal.m.e(callback, "callback");
        this.purchasesOrchestrator.setAppstackAttributionParams(data, callback);
    }

    public final void setAttributes(java.util.Map<java.lang.String, java.lang.String> attributes) {
        kotlin.jvm.internal.m.e(attributes, "attributes");
        this.purchasesOrchestrator.setAttributes(attributes);
    }

    public final void setCampaign(java.lang.String campaign) {
        this.purchasesOrchestrator.setCampaign(campaign);
    }

    public final void setCleverTapID(java.lang.String cleverTapID) {
        this.purchasesOrchestrator.setCleverTapID(cleverTapID);
    }

    public final void setCreative(java.lang.String creative) {
        this.purchasesOrchestrator.setCreative(creative);
    }

    public final void setCustomerCenterListener(com.revenuecat.purchases.customercenter.CustomerCenterListener customerCenterListener) {
        this.purchasesOrchestrator.setCustomerCenterListener(customerCenterListener);
    }

    public final /* synthetic */ void setDebugEventListener(com.revenuecat.purchases.DebugEventListener debugEventListener) {
        this.purchasesOrchestrator.setDebugEventListener(debugEventListener);
    }

    public final void setDisplayName(java.lang.String displayName) {
        this.purchasesOrchestrator.setDisplayName(displayName);
    }

    public final void setEmail(java.lang.String email) {
        this.purchasesOrchestrator.setEmail(email);
    }

    public final void setFBAnonymousID(java.lang.String fbAnonymousID) {
        this.purchasesOrchestrator.setFBAnonymousID(fbAnonymousID);
    }

    public final synchronized void setFinishTransactions(boolean z6) {
        this.purchasesOrchestrator.setFinishTransactions(z6);
    }

    public final void setFirebaseAppInstanceID(java.lang.String firebaseAppInstanceID) {
        this.purchasesOrchestrator.setFirebaseAppInstanceID(firebaseAppInstanceID);
    }

    public final void setKeyword(java.lang.String keyword) {
        this.purchasesOrchestrator.setKeyword(keyword);
    }

    public final void setKochavaDeviceID(java.lang.String kochavaDeviceID) {
        this.purchasesOrchestrator.setKochavaDeviceID(kochavaDeviceID);
    }

    public final void setMediaSource(java.lang.String mediaSource) {
        this.purchasesOrchestrator.setMediaSource(mediaSource);
    }

    public final void setMixpanelDistinctID(java.lang.String mixpanelDistinctID) {
        this.purchasesOrchestrator.setMixpanelDistinctID(mixpanelDistinctID);
    }

    public final void setMparticleID(java.lang.String mparticleID) {
        this.purchasesOrchestrator.setMparticleID(mparticleID);
    }

    public final void setOnesignalID(java.lang.String onesignalID) {
        this.purchasesOrchestrator.setOnesignalID(onesignalID);
    }

    public final void setOnesignalUserID(java.lang.String onesignalUserID) {
        this.purchasesOrchestrator.setOnesignalUserID(onesignalUserID);
    }

    public final void setPhoneNumber(java.lang.String phoneNumber) {
        this.purchasesOrchestrator.setPhoneNumber(phoneNumber);
    }

    public final void setPostHogUserId(java.lang.String postHogUserId) {
        this.purchasesOrchestrator.setPostHogUserId(postHogUserId);
    }

    public final synchronized void setPurchasesAreCompletedBy(com.revenuecat.purchases.PurchasesAreCompletedBy value) {
        try {
            kotlin.jvm.internal.m.e(value, "value");
            com.revenuecat.purchases.PurchasesOrchestrator purchasesOrchestrator = this.purchasesOrchestrator;
            int i3 = com.revenuecat.purchases.Purchases.WhenMappings.$EnumSwitchMapping$0[value.ordinal()];
            boolean z6 = true;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new I3.b();
                }
                z6 = false;
            }
            purchasesOrchestrator.setFinishTransactions(z6);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final void setPushToken(java.lang.String fcmToken) {
        this.purchasesOrchestrator.setPushToken(fcmToken);
    }

    public final void setSolarEngineAccountId(java.lang.String solarEngineAccountId) {
        this.purchasesOrchestrator.setSolarEngineAccountId(solarEngineAccountId);
    }

    public final void setSolarEngineDistinctId(java.lang.String solarEngineDistinctId) {
        this.purchasesOrchestrator.setSolarEngineDistinctId(solarEngineDistinctId);
    }

    public final void setSolarEngineVisitorId(java.lang.String solarEngineVisitorId) {
        this.purchasesOrchestrator.setSolarEngineVisitorId(solarEngineVisitorId);
    }

    public final void setTenjinAnalyticsInstallationID(java.lang.String tenjinAnalyticsInstallationID) {
        this.purchasesOrchestrator.setTenjinAnalyticsInstallationID(tenjinAnalyticsInstallationID);
    }

    public final /* synthetic */ void setTrackedEventListener(com.revenuecat.purchases.TrackedEventListener trackedEventListener) {
        this.purchasesOrchestrator.setTrackedEventListener(trackedEventListener);
    }

    public final synchronized void setUpdatedCustomerInfoListener(com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener updatedCustomerInfoListener) {
        this.purchasesOrchestrator.setUpdatedCustomerInfoListener(updatedCustomerInfoListener);
    }

    public final void showInAppMessagesIfNeeded(android.app.Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
        showInAppMessagesIfNeeded$default(this, activity, null, 2, null);
    }

    @p070h6.c
    public final void syncAmazonPurchase(java.lang.String productID, java.lang.String receiptID, java.lang.String amazonUserID, java.lang.String isoCurrencyCode, java.lang.Double price) {
        kotlin.jvm.internal.m.e(productID, "productID");
        kotlin.jvm.internal.m.e(receiptID, "receiptID");
        kotlin.jvm.internal.m.e(amazonUserID, "amazonUserID");
        this.purchasesOrchestrator.syncAmazonPurchase(productID, receiptID, amazonUserID, isoCurrencyCode, price, null);
    }

    public final void syncAttributesAndOfferingsIfNeeded(com.revenuecat.purchases.interfaces.SyncAttributesAndOfferingsCallback callback) {
        kotlin.jvm.internal.m.e(callback, "callback");
        this.purchasesOrchestrator.syncAttributesAndOfferingsIfNeeded(callback);
    }

    @p070h6.c
    public final void syncObserverModeAmazonPurchase(java.lang.String productID, java.lang.String receiptID, java.lang.String amazonUserID, java.lang.String isoCurrencyCode, java.lang.Double price) {
        kotlin.jvm.internal.m.e(productID, "productID");
        kotlin.jvm.internal.m.e(receiptID, "receiptID");
        kotlin.jvm.internal.m.e(amazonUserID, "amazonUserID");
        syncAmazonPurchase(productID, receiptID, amazonUserID, isoCurrencyCode, price);
    }

    public final void syncPurchases() {
        syncPurchases$default(this, null, 1, null);
    }

    public final /* synthetic */ void track(com.revenuecat.purchases.common.events.FeatureEvent event) {
        kotlin.jvm.internal.m.e(event, "event");
        this.purchasesOrchestrator.track(event);
    }

    public final void trackCustomPaywallImpression() {
        trackCustomPaywallImpression$default(this, null, 1, null);
    }

    public static final void canMakePayments(android.content.Context context, java.util.List<? extends com.revenuecat.purchases.models.BillingFeature> list, com.revenuecat.purchases.interfaces.Callback<java.lang.Boolean> callback) {
        INSTANCE.canMakePayments(context, list, callback);
    }

    public static final com.revenuecat.purchases.WebPurchaseRedemption parseAsWebPurchaseRedemption(java.lang.String str) {
        return INSTANCE.parseAsWebPurchaseRedemption(str);
    }

    public final void getCustomerInfo(com.revenuecat.purchases.CacheFetchPolicy fetchPolicy, com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback callback) {
        kotlin.jvm.internal.m.e(fetchPolicy, "fetchPolicy");
        kotlin.jvm.internal.m.e(callback, "callback");
        this.purchasesOrchestrator.getCustomerInfo(fetchPolicy, true, callback);
    }

    public final void getProducts(java.util.List<java.lang.String> productIds, com.revenuecat.purchases.ProductType type, com.revenuecat.purchases.interfaces.GetStoreProductsCallback callback) {
        kotlin.jvm.internal.m.e(productIds, "productIds");
        kotlin.jvm.internal.m.e(callback, "callback");
        this.purchasesOrchestrator.getProducts(productIds, type, callback);
    }

    public final void getStorefrontCountryCode(com.revenuecat.purchases.interfaces.GetStorefrontCallback callback) {
        kotlin.jvm.internal.m.e(callback, "callback");
        this.purchasesOrchestrator.getStorefrontCountryCode(callback);
    }

    public final void getStorefrontLocale(com.revenuecat.purchases.interfaces.GetStorefrontLocaleCallback callback) {
        kotlin.jvm.internal.m.e(callback, "callback");
        this.purchasesOrchestrator.getStorefrontLocale(callback);
    }

    public final void logIn(java.lang.String newAppUserID, com.revenuecat.purchases.interfaces.LogInCallback callback) {
        kotlin.jvm.internal.m.e(newAppUserID, "newAppUserID");
        this.purchasesOrchestrator.logIn(newAppUserID, callback);
    }

    public final void logOut(com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback callback) {
        this.purchasesOrchestrator.logOut(callback);
    }

    public final void showInAppMessagesIfNeeded(android.app.Activity activity, java.util.List<? extends com.revenuecat.purchases.models.InAppMessageType> inAppMessageTypes) {
        kotlin.jvm.internal.m.e(activity, "activity");
        kotlin.jvm.internal.m.e(inAppMessageTypes, "inAppMessageTypes");
        this.purchasesOrchestrator.showInAppMessagesIfNeeded(activity, inAppMessageTypes);
    }

    public final void syncAmazonPurchase(java.lang.String productID, java.lang.String receiptID, java.lang.String amazonUserID, java.lang.String isoCurrencyCode, java.lang.Double price, long purchaseTime) {
        kotlin.jvm.internal.m.e(productID, "productID");
        kotlin.jvm.internal.m.e(receiptID, "receiptID");
        kotlin.jvm.internal.m.e(amazonUserID, "amazonUserID");
        this.purchasesOrchestrator.syncAmazonPurchase(productID, receiptID, amazonUserID, isoCurrencyCode, price, java.lang.Long.valueOf(purchaseTime));
    }

    public final void syncPurchases(com.revenuecat.purchases.interfaces.SyncPurchasesCallback listener) {
        this.purchasesOrchestrator.syncPurchases(listener);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047 A[PHI: r1
  0x0047: PHI (r1v5 java.lang.String) = 
  (r1v3 java.lang.String)
  (r1v3 java.lang.String)
  (r1v3 java.lang.String)
  (r1v8 java.lang.String)
  (r1v8 java.lang.String)
  (r1v8 java.lang.String)
 binds: [B:25:0x005b, B:27:0x0061, B:29:0x0069, B:11:0x0032, B:13:0x0038, B:15:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void trackCustomPaywallImpression(com.revenuecat.purchases.paywalls.events.CustomPaywallImpressionParams params) {
        java.lang.String identifier;
        java.util.List<com.revenuecat.purchases.Package> availablePackages;
        com.revenuecat.purchases.Package r9;
        com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext;
        java.lang.String str;
        com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext2;
        java.util.List<com.revenuecat.purchases.Package> availablePackages2;
        com.revenuecat.purchases.Package r10;
        com.revenuecat.purchases.PresentedOfferingContext.TargetingContext targetingContext;
        com.revenuecat.purchases.PresentedOfferingContext.TargetingContext targetingContext2;
        kotlin.jvm.internal.m.e(params, "params");
        com.revenuecat.purchases.Offerings cachedOfferings = this.purchasesOrchestrator.getCachedOfferings();
        com.revenuecat.purchases.paywalls.events.CustomPaywallEvent.Impression.CreationData creationData = null;
        java.lang.Object[] objArr = 0;
        if (params.getPresentedOfferingContext() != null) {
            java.lang.String offeringId = params.getOfferingId();
            presentedOfferingContext2 = params.getPresentedOfferingContext();
            str = offeringId;
        } else {
            if (params.getOfferingId() != null) {
                com.revenuecat.purchases.Offering offering = cachedOfferings != null ? cachedOfferings.get(params.getOfferingId()) : null;
                identifier = params.getOfferingId();
                if (offering == null || (availablePackages2 = offering.getAvailablePackages()) == null || (r10 = (com.revenuecat.purchases.Package) p078i6.o.j1(availablePackages2)) == null) {
                    presentedOfferingContext = null;
                } else {
                    presentedOfferingContext = r10.getPresentedOfferingContext();
                }
            } else {
                com.revenuecat.purchases.Offering current = cachedOfferings != null ? cachedOfferings.getCurrent() : null;
                identifier = current != null ? current.getIdentifier() : null;
                if (current == null || (availablePackages = current.getAvailablePackages()) == null || (r9 = (com.revenuecat.purchases.Package) p078i6.o.j1(availablePackages)) == null) {
                    presentedOfferingContext = null;
                } else {
                    presentedOfferingContext = r9.getPresentedOfferingContext();
                }
            }
            str = identifier;
            presentedOfferingContext2 = presentedOfferingContext;
        }
        this.purchasesOrchestrator.track(new com.revenuecat.purchases.paywalls.events.CustomPaywallEvent.Impression(creationData, new com.revenuecat.purchases.paywalls.events.CustomPaywallEvent.Impression.Data(params.getPaywallId(), str, presentedOfferingContext2 != null ? presentedOfferingContext2.getPlacementIdentifier() : null, (presentedOfferingContext2 == null || (targetingContext2 = presentedOfferingContext2.getTargetingContext()) == null) ? null : java.lang.Integer.valueOf(targetingContext2.getRevision()), (presentedOfferingContext2 == null || (targetingContext = presentedOfferingContext2.getTargetingContext()) == null) ? null : targetingContext.getRuleId()), 1, objArr == true ? 1 : 0));
    }
}
