/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package mykidong.domain.avro.events;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
/** Event Log */
@org.apache.avro.specific.AvroGenerated
public class Events extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -181525618041090851L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Events\",\"namespace\":\"mykidong.domain.avro.events\",\"doc\":\"Event Log\",\"fields\":[{\"name\":\"eventTime\",\"type\":\"long\"},{\"name\":\"orderInfo\",\"type\":\"string\"},{\"name\":\"customerId\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public long eventTime;
  @Deprecated public java.lang.CharSequence orderInfo;
  @Deprecated public java.lang.CharSequence customerId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Events() {}

  /**
   * All-args constructor.
   * @param eventTime The new value for eventTime
   * @param orderInfo The new value for orderInfo
   * @param customerId The new value for customerId
   */
  public Events(java.lang.Long eventTime, java.lang.CharSequence orderInfo, java.lang.CharSequence customerId) {
    this.eventTime = eventTime;
    this.orderInfo = orderInfo;
    this.customerId = customerId;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return eventTime;
    case 1: return orderInfo;
    case 2: return customerId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: eventTime = (java.lang.Long)value$; break;
    case 1: orderInfo = (java.lang.CharSequence)value$; break;
    case 2: customerId = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'eventTime' field.
   * @return The value of the 'eventTime' field.
   */
  public java.lang.Long getEventTime() {
    return eventTime;
  }

  /**
   * Sets the value of the 'eventTime' field.
   * @param value the value to set.
   */
  public void setEventTime(java.lang.Long value) {
    this.eventTime = value;
  }

  /**
   * Gets the value of the 'orderInfo' field.
   * @return The value of the 'orderInfo' field.
   */
  public java.lang.CharSequence getOrderInfo() {
    return orderInfo;
  }

  /**
   * Sets the value of the 'orderInfo' field.
   * @param value the value to set.
   */
  public void setOrderInfo(java.lang.CharSequence value) {
    this.orderInfo = value;
  }

  /**
   * Gets the value of the 'customerId' field.
   * @return The value of the 'customerId' field.
   */
  public java.lang.CharSequence getCustomerId() {
    return customerId;
  }

  /**
   * Sets the value of the 'customerId' field.
   * @param value the value to set.
   */
  public void setCustomerId(java.lang.CharSequence value) {
    this.customerId = value;
  }

  /**
   * Creates a new Events RecordBuilder.
   * @return A new Events RecordBuilder
   */
  public static mykidong.domain.avro.events.Events.Builder newBuilder() {
    return new mykidong.domain.avro.events.Events.Builder();
  }

  /**
   * Creates a new Events RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Events RecordBuilder
   */
  public static mykidong.domain.avro.events.Events.Builder newBuilder(mykidong.domain.avro.events.Events.Builder other) {
    return new mykidong.domain.avro.events.Events.Builder(other);
  }

  /**
   * Creates a new Events RecordBuilder by copying an existing Events instance.
   * @param other The existing instance to copy.
   * @return A new Events RecordBuilder
   */
  public static mykidong.domain.avro.events.Events.Builder newBuilder(mykidong.domain.avro.events.Events other) {
    return new mykidong.domain.avro.events.Events.Builder(other);
  }

  /**
   * RecordBuilder for Events instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Events>
    implements org.apache.avro.data.RecordBuilder<Events> {

    private long eventTime;
    private java.lang.CharSequence orderInfo;
    private java.lang.CharSequence customerId;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(mykidong.domain.avro.events.Events.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.eventTime)) {
        this.eventTime = data().deepCopy(fields()[0].schema(), other.eventTime);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.orderInfo)) {
        this.orderInfo = data().deepCopy(fields()[1].schema(), other.orderInfo);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.customerId)) {
        this.customerId = data().deepCopy(fields()[2].schema(), other.customerId);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Events instance
     * @param other The existing instance to copy.
     */
    private Builder(mykidong.domain.avro.events.Events other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.eventTime)) {
        this.eventTime = data().deepCopy(fields()[0].schema(), other.eventTime);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.orderInfo)) {
        this.orderInfo = data().deepCopy(fields()[1].schema(), other.orderInfo);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.customerId)) {
        this.customerId = data().deepCopy(fields()[2].schema(), other.customerId);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'eventTime' field.
      * @return The value.
      */
    public java.lang.Long getEventTime() {
      return eventTime;
    }

    /**
      * Sets the value of the 'eventTime' field.
      * @param value The value of 'eventTime'.
      * @return This builder.
      */
    public mykidong.domain.avro.events.Events.Builder setEventTime(long value) {
      validate(fields()[0], value);
      this.eventTime = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'eventTime' field has been set.
      * @return True if the 'eventTime' field has been set, false otherwise.
      */
    public boolean hasEventTime() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'eventTime' field.
      * @return This builder.
      */
    public mykidong.domain.avro.events.Events.Builder clearEventTime() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'orderInfo' field.
      * @return The value.
      */
    public java.lang.CharSequence getOrderInfo() {
      return orderInfo;
    }

    /**
      * Sets the value of the 'orderInfo' field.
      * @param value The value of 'orderInfo'.
      * @return This builder.
      */
    public mykidong.domain.avro.events.Events.Builder setOrderInfo(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.orderInfo = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'orderInfo' field has been set.
      * @return True if the 'orderInfo' field has been set, false otherwise.
      */
    public boolean hasOrderInfo() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'orderInfo' field.
      * @return This builder.
      */
    public mykidong.domain.avro.events.Events.Builder clearOrderInfo() {
      orderInfo = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'customerId' field.
      * @return The value.
      */
    public java.lang.CharSequence getCustomerId() {
      return customerId;
    }

    /**
      * Sets the value of the 'customerId' field.
      * @param value The value of 'customerId'.
      * @return This builder.
      */
    public mykidong.domain.avro.events.Events.Builder setCustomerId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.customerId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'customerId' field has been set.
      * @return True if the 'customerId' field has been set, false otherwise.
      */
    public boolean hasCustomerId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'customerId' field.
      * @return This builder.
      */
    public mykidong.domain.avro.events.Events.Builder clearCustomerId() {
      customerId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public Events build() {
      try {
        Events record = new Events();
        record.eventTime = fieldSetFlags()[0] ? this.eventTime : (java.lang.Long) defaultValue(fields()[0]);
        record.orderInfo = fieldSetFlags()[1] ? this.orderInfo : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.customerId = fieldSetFlags()[2] ? this.customerId : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
