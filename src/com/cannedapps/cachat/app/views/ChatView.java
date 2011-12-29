package com.cannedapps.cachat.app.views;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.cannedapps.cachat.R;
import com.cannedapps.cachat.app.presenters.ChatPresenter;
import com.cannedapps.cachat.app.views.interfaces.IChatView;

public class ChatView extends Activity implements IChatView, OnClickListener {

  private ChatPresenter chatPresenter;

  private TextView chatText;
  private Button sendButton;
  private EditText messageEditText;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.main);

    chatPresenter = new ChatPresenter(this);

    chatText = (TextView) findViewById(R.id.chat);
    sendButton = (Button) findViewById(R.id.send);
    messageEditText = (EditText) findViewById(R.id.message);

    sendButton.setOnClickListener(this);
  }

  @Override
  public void addMessage(String message) {
    chatText.append("\n");
    chatText.append(message);
  }

  @Override
  public String getLastMessage() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void onClick(View view) {
    switch (view.getId()) {
    case R.id.send:
      chatPresenter.addMessage(messageEditText.getText().toString());
      break;
    }
  }

}
