package kotlinx.coroutines.channels;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u00032'\u0010\u0007\u001a#\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00030\u000fHH"}, d2 = {"filterIndexedTo", "", ExifInterface.LONGITUDE_EAST, "C", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlinx/coroutines/channels/ReceiveChannel;", FirebaseAnalytics.Param.DESTINATION, "predicate", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, FirebaseAnalytics.Param.INDEX, "", "continuation", "Lkotlin/coroutines/Continuation;"}, k = 3, mv = {1, 1, 16})
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {2642, 818}, m = "filterIndexedTo", n = {"$this$filterIndexedTo", FirebaseAnalytics.Param.DESTINATION, "predicate", "$this$consumeEachIndexed$iv", "index$iv", "$this$consumeEach$iv$iv", "$this$consume$iv$iv$iv", "cause$iv$iv$iv", "$this$consume$iv$iv", "$this$filterIndexedTo", FirebaseAnalytics.Param.DESTINATION, "predicate", "$this$consumeEachIndexed$iv", "index$iv", "$this$consumeEach$iv$iv", "$this$consume$iv$iv$iv", "cause$iv$iv$iv", "$this$consume$iv$iv", "e$iv$iv", "it$iv", "$dstr$index$element", FirebaseAnalytics.Param.INDEX, "element"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$10", "L$11", "L$12", "I$0", "L$13"})
/* compiled from: Channels.common.kt */
public final class ChannelsKt__Channels_commonKt$filterIndexedTo$3 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;

    public ChannelsKt__Channels_commonKt$filterIndexedTo$3(Continuation continuation) {
        super(continuation);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ChannelsKt.filterIndexedTo((ReceiveChannel) null, (SendChannel) null, (Function2) null, this);
    }
}
