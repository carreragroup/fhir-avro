/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.carrera.fhir.avro.models;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Range extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 637308771234289496L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Range\",\"namespace\":\"io.carrera.fhir.avro.models\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"]},{\"name\":\"low\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Quantity\",\"fields\":[{\"name\":\"value\",\"type\":\"float\"},{\"name\":\"unit\",\"type\":\"string\"},{\"name\":\"system\",\"type\":\"string\"},{\"name\":\"code\",\"type\":\"string\"}]}]},{\"name\":\"high\",\"type\":[\"null\",\"Quantity\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Range> ENCODER =
      new BinaryMessageEncoder<Range>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Range> DECODER =
      new BinaryMessageDecoder<Range>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Range> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Range> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Range> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Range>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Range to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Range from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Range instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Range fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence id;
  @Deprecated public io.carrera.fhir.avro.models.Quantity low;
  @Deprecated public io.carrera.fhir.avro.models.Quantity high;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Range() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param low The new value for low
   * @param high The new value for high
   */
  public Range(java.lang.CharSequence id, io.carrera.fhir.avro.models.Quantity low, io.carrera.fhir.avro.models.Quantity high) {
    this.id = id;
    this.low = low;
    this.high = high;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return low;
    case 2: return high;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: low = (io.carrera.fhir.avro.models.Quantity)value$; break;
    case 2: high = (io.carrera.fhir.avro.models.Quantity)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'low' field.
   * @return The value of the 'low' field.
   */
  public io.carrera.fhir.avro.models.Quantity getLow() {
    return low;
  }


  /**
   * Sets the value of the 'low' field.
   * @param value the value to set.
   */
  public void setLow(io.carrera.fhir.avro.models.Quantity value) {
    this.low = value;
  }

  /**
   * Gets the value of the 'high' field.
   * @return The value of the 'high' field.
   */
  public io.carrera.fhir.avro.models.Quantity getHigh() {
    return high;
  }


  /**
   * Sets the value of the 'high' field.
   * @param value the value to set.
   */
  public void setHigh(io.carrera.fhir.avro.models.Quantity value) {
    this.high = value;
  }

  /**
   * Creates a new Range RecordBuilder.
   * @return A new Range RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Range.Builder newBuilder() {
    return new io.carrera.fhir.avro.models.Range.Builder();
  }

  /**
   * Creates a new Range RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Range RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Range.Builder newBuilder(io.carrera.fhir.avro.models.Range.Builder other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Range.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Range.Builder(other);
    }
  }

  /**
   * Creates a new Range RecordBuilder by copying an existing Range instance.
   * @param other The existing instance to copy.
   * @return A new Range RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Range.Builder newBuilder(io.carrera.fhir.avro.models.Range other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Range.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Range.Builder(other);
    }
  }

  /**
   * RecordBuilder for Range instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Range>
    implements org.apache.avro.data.RecordBuilder<Range> {

    private java.lang.CharSequence id;
    private io.carrera.fhir.avro.models.Quantity low;
    private io.carrera.fhir.avro.models.Quantity.Builder lowBuilder;
    private io.carrera.fhir.avro.models.Quantity high;
    private io.carrera.fhir.avro.models.Quantity.Builder highBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Range.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.low)) {
        this.low = data().deepCopy(fields()[1].schema(), other.low);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasLowBuilder()) {
        this.lowBuilder = io.carrera.fhir.avro.models.Quantity.newBuilder(other.getLowBuilder());
      }
      if (isValidValue(fields()[2], other.high)) {
        this.high = data().deepCopy(fields()[2].schema(), other.high);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (other.hasHighBuilder()) {
        this.highBuilder = io.carrera.fhir.avro.models.Quantity.newBuilder(other.getHighBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing Range instance
     * @param other The existing instance to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Range other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.low)) {
        this.low = data().deepCopy(fields()[1].schema(), other.low);
        fieldSetFlags()[1] = true;
      }
      this.lowBuilder = null;
      if (isValidValue(fields()[2], other.high)) {
        this.high = data().deepCopy(fields()[2].schema(), other.high);
        fieldSetFlags()[2] = true;
      }
      this.highBuilder = null;
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Range.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Range.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'low' field.
      * @return The value.
      */
    public io.carrera.fhir.avro.models.Quantity getLow() {
      return low;
    }


    /**
      * Sets the value of the 'low' field.
      * @param value The value of 'low'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Range.Builder setLow(io.carrera.fhir.avro.models.Quantity value) {
      validate(fields()[1], value);
      this.lowBuilder = null;
      this.low = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'low' field has been set.
      * @return True if the 'low' field has been set, false otherwise.
      */
    public boolean hasLow() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'low' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.Quantity.Builder getLowBuilder() {
      if (lowBuilder == null) {
        if (hasLow()) {
          setLowBuilder(io.carrera.fhir.avro.models.Quantity.newBuilder(low));
        } else {
          setLowBuilder(io.carrera.fhir.avro.models.Quantity.newBuilder());
        }
      }
      return lowBuilder;
    }

    /**
     * Sets the Builder instance for the 'low' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.Range.Builder setLowBuilder(io.carrera.fhir.avro.models.Quantity.Builder value) {
      clearLow();
      lowBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'low' field has an active Builder instance
     * @return True if the 'low' field has an active Builder instance
     */
    public boolean hasLowBuilder() {
      return lowBuilder != null;
    }

    /**
      * Clears the value of the 'low' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Range.Builder clearLow() {
      low = null;
      lowBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'high' field.
      * @return The value.
      */
    public io.carrera.fhir.avro.models.Quantity getHigh() {
      return high;
    }


    /**
      * Sets the value of the 'high' field.
      * @param value The value of 'high'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Range.Builder setHigh(io.carrera.fhir.avro.models.Quantity value) {
      validate(fields()[2], value);
      this.highBuilder = null;
      this.high = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'high' field has been set.
      * @return True if the 'high' field has been set, false otherwise.
      */
    public boolean hasHigh() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'high' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.Quantity.Builder getHighBuilder() {
      if (highBuilder == null) {
        if (hasHigh()) {
          setHighBuilder(io.carrera.fhir.avro.models.Quantity.newBuilder(high));
        } else {
          setHighBuilder(io.carrera.fhir.avro.models.Quantity.newBuilder());
        }
      }
      return highBuilder;
    }

    /**
     * Sets the Builder instance for the 'high' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.Range.Builder setHighBuilder(io.carrera.fhir.avro.models.Quantity.Builder value) {
      clearHigh();
      highBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'high' field has an active Builder instance
     * @return True if the 'high' field has an active Builder instance
     */
    public boolean hasHighBuilder() {
      return highBuilder != null;
    }

    /**
      * Clears the value of the 'high' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Range.Builder clearHigh() {
      high = null;
      highBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Range build() {
      try {
        Range record = new Range();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        if (lowBuilder != null) {
          try {
            record.low = this.lowBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("low"));
            throw e;
          }
        } else {
          record.low = fieldSetFlags()[1] ? this.low : (io.carrera.fhir.avro.models.Quantity) defaultValue(fields()[1]);
        }
        if (highBuilder != null) {
          try {
            record.high = this.highBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("high"));
            throw e;
          }
        } else {
          record.high = fieldSetFlags()[2] ? this.high : (io.carrera.fhir.avro.models.Quantity) defaultValue(fields()[2]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Range>
    WRITER$ = (org.apache.avro.io.DatumWriter<Range>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Range>
    READER$ = (org.apache.avro.io.DatumReader<Range>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.id == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.id);
    }

    if (this.low == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.low.customEncode(out);
    }

    if (this.high == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.high.customEncode(out);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.id = null;
      } else {
        this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.low = null;
      } else {
        if (this.low == null) {
          this.low = new io.carrera.fhir.avro.models.Quantity();
        }
        this.low.customDecode(in);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.high = null;
      } else {
        if (this.high == null) {
          this.high = new io.carrera.fhir.avro.models.Quantity();
        }
        this.high.customDecode(in);
      }

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.id = null;
          } else {
            this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.low = null;
          } else {
            if (this.low == null) {
              this.low = new io.carrera.fhir.avro.models.Quantity();
            }
            this.low.customDecode(in);
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.high = null;
          } else {
            if (this.high == null) {
              this.high = new io.carrera.fhir.avro.models.Quantity();
            }
            this.high.customDecode(in);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










