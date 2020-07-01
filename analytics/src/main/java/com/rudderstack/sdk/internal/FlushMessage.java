package com.rudder.analytics.internal;

import java.util.Date;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.rudder.analytics.messages.Message;

class FlushMessage implements Message {
  static final FlushMessage POISON = new FlushMessage();

  private FlushMessage() {}

  @Nonnull
  @Override
  public Type type() {
    throw new UnsupportedOperationException();
  }

  @Nonnull
  @Override
  public String messageId() {
    throw new UnsupportedOperationException();
  }

  @Nonnull
  @Override
  public Date timestamp() {
    throw new UnsupportedOperationException();
  }

  @Nullable
  @Override
  public Map<String, ?> context() {
    throw new UnsupportedOperationException();
  }

  @Nullable
  @Override
  public String anonymousId() {
    throw new UnsupportedOperationException();
  }

  @Nullable
  @Override
  public String userId() {
    throw new UnsupportedOperationException();
  }

  @Nullable
  @Override
  public Map<String, Object> integrations() {
    throw new UnsupportedOperationException();
  }

  @Override
  public String toString() {
    return "FlushMessage{}";
  }
}
