/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.thriftfs.jobtracker.api;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;
public enum ThriftTaskState implements TEnum{
    RUNNING(0),
    SUCCEEDED(1),
    FAILED(2),
    UNASSIGNED(3),
    KILLED(4),
    COMMIT_PENDING(5),
    FAILED_UNCLEAN(6),
    KILLED_UNCLEAN(7);

  private static final Map<Integer, ThriftTaskState> BY_VALUE = new HashMap<Integer,ThriftTaskState>() {{
    for(ThriftTaskState val : ThriftTaskState.values()) {
      put(val.getValue(), val);
    }
  }};

  private final int value;

  private ThriftTaskState(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ThriftTaskState findByValue(int value) { 
    return BY_VALUE.get(value);
  }
}