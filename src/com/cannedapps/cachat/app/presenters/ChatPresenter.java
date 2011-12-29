package com.cannedapps.cachat.app.presenters;

import com.cannedapps.cachat.app.views.interfaces.IChatView;

public class ChatPresenter {
  
  private IChatView chatView;

  public ChatPresenter(IChatView chatView) {
    this.chatView = chatView;
  }

  public void addMessage(String message) {
    chatView.addMessage(message);
  }
  
  
  
}
