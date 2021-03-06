package com.askgps.personaltrackerround;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.askgps.personaltrackercore.ui.infoscreen.InfoFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "code", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 16})
/* compiled from: MainActivity.kt */
final class MainActivity$observeViewModel$2<T> implements Observer<Integer> {
    final /* synthetic */ MainActivity this$0;

    MainActivity$observeViewModel$2(MainActivity mainActivity) {
        this.this$0 = mainActivity;
    }

    public final void onChanged(Integer num) {
        if (Intrinsics.compare(num.intValue(), 0) <= 0) {
            InfoFragment.Companion companion = InfoFragment.Companion;
            FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "supportFragmentManager");
            InfoFragment.Companion.showSuccessDialog$default(companion, supportFragmentManager, false, null, 6, null);
            return;
        }
        InfoFragment.Companion companion2 = InfoFragment.Companion;
        FragmentManager supportFragmentManager2 = this.this$0.getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager2, "supportFragmentManager");
        Intrinsics.checkExpressionValueIsNotNull(num, "code");
        InfoFragment.Companion.showAuthErrorDialog$default(companion2, supportFragmentManager2, false, num.intValue(), new Function0<Unit>(this) {
            /* class com.askgps.personaltrackerround.MainActivity$observeViewModel$2.AnonymousClass1 */
            final /* synthetic */ MainActivity$observeViewModel$2 this$0;

            {
                this.this$0 = r1;
            }

            public final void invoke() {
                if (this.this$0.this$0.getViewModel().getAttemptCountLeft() > 0) {
                    this.this$0.this$0.startIdentification(false, false);
                }
            }
        }, 2, null);
    }
}
