/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hbase.thrift2.generated;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * Specify Consistency:
 *  - STRONG means reads only from primary region
 *  - TIMELINE means reads might return values from secondary region replicas
 */
public enum TConsistency implements org.apache.thrift.TEnum {
  STRONG(1),
  TIMELINE(2);

  private final int value;

  private TConsistency(int value) {
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
  public static TConsistency findByValue(int value) { 
    switch (value) {
      case 1:
        return STRONG;
      case 2:
        return TIMELINE;
      default:
        return null;
    }
  }
}
