package com.android.mms.ui;

import android.util.Log;
import com.android.mms.understand.UnderstandLoader.RequestCallback;

class BlockedConversationActivity$2
  implements UnderstandLoader.RequestCallback
{
  BlockedConversationActivity$2(BlockedConversationActivity paramBlockedConversationActivity) {}
  
  public void onRequestDone(boolean paramBoolean)
  {
    Log.v("BlockedConversationActivity", " request loading resources done");
    this$0.mWaitingResource = false;
    this$0.applyPendingCursor();
  }
}

/* Location:
 * Qualified Name:     com.android.mms.ui.BlockedConversationActivity.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */