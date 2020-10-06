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
public class Goal extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2885625295576616944L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Goal\",\"namespace\":\"io.carrera.fhir.avro.models\",\"fields\":[{\"name\":\"target\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Goal_Target\",\"fields\":[{\"name\":\"measure\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CodeableConcept\",\"fields\":[{\"name\":\"coding\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Coding\",\"fields\":[{\"name\":\"code\",\"type\":[\"null\",\"string\"]}]}}}]}]},{\"name\":\"detailQuantity\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Quantity\",\"fields\":[{\"name\":\"value\",\"type\":\"float\"},{\"name\":\"unit\",\"type\":\"string\"},{\"name\":\"system\",\"type\":\"string\"},{\"name\":\"code\",\"type\":\"string\"}]}]},{\"name\":\"detailRange\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Range\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"]},{\"name\":\"low\",\"type\":[\"null\",\"Quantity\"]},{\"name\":\"high\",\"type\":[\"null\",\"Quantity\"]}]}]},{\"name\":\"detailCodeableConcept\",\"type\":[\"null\",\"CodeableConcept\"]},{\"name\":\"detailString\",\"type\":[\"null\",\"string\"]},{\"name\":\"detailBoolean\",\"type\":[\"null\",\"boolean\"]},{\"name\":\"detailInteger\",\"type\":[\"null\",\"int\"]},{\"name\":\"detailRatio\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Ratio\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"]},{\"name\":\"numerator\",\"type\":[\"null\",\"Quantity\"]},{\"name\":\"denominator\",\"type\":[\"null\",\"Quantity\"]}]}]}]}}]},{\"name\":\"startDate\",\"type\":[\"null\",{\"type\":\"int\",\"logicalType\":\"date\"}]},{\"name\":\"startCodeableConcept\",\"type\":[\"null\",\"CodeableConcept\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.DateConversion());
  }

  private static final BinaryMessageEncoder<Goal> ENCODER =
      new BinaryMessageEncoder<Goal>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Goal> DECODER =
      new BinaryMessageDecoder<Goal>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Goal> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Goal> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Goal> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Goal>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Goal to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Goal from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Goal instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Goal fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.util.List<io.carrera.fhir.avro.models.Goal_Target> target;
   private java.time.LocalDate startDate;
   private io.carrera.fhir.avro.models.CodeableConcept startCodeableConcept;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Goal() {}

  /**
   * All-args constructor.
   * @param target The new value for target
   * @param startDate The new value for startDate
   * @param startCodeableConcept The new value for startCodeableConcept
   */
  public Goal(java.util.List<io.carrera.fhir.avro.models.Goal_Target> target, java.time.LocalDate startDate, io.carrera.fhir.avro.models.CodeableConcept startCodeableConcept) {
    this.target = target;
    this.startDate = startDate;
    this.startCodeableConcept = startCodeableConcept;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return target;
    case 1: return startDate;
    case 2: return startCodeableConcept;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: target = (java.util.List<io.carrera.fhir.avro.models.Goal_Target>)value$; break;
    case 1: startDate = (java.time.LocalDate)value$; break;
    case 2: startCodeableConcept = (io.carrera.fhir.avro.models.CodeableConcept)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'target' field.
   * @return The value of the 'target' field.
   */
  public java.util.List<io.carrera.fhir.avro.models.Goal_Target> getTarget() {
    return target;
  }


  /**
   * Sets the value of the 'target' field.
   * @param value the value to set.
   */
  public void setTarget(java.util.List<io.carrera.fhir.avro.models.Goal_Target> value) {
    this.target = value;
  }

  /**
   * Gets the value of the 'startDate' field.
   * @return The value of the 'startDate' field.
   */
  public java.time.LocalDate getStartDate() {
    return startDate;
  }


  /**
   * Sets the value of the 'startDate' field.
   * @param value the value to set.
   */
  public void setStartDate(java.time.LocalDate value) {
    this.startDate = value;
  }

  /**
   * Gets the value of the 'startCodeableConcept' field.
   * @return The value of the 'startCodeableConcept' field.
   */
  public io.carrera.fhir.avro.models.CodeableConcept getStartCodeableConcept() {
    return startCodeableConcept;
  }


  /**
   * Sets the value of the 'startCodeableConcept' field.
   * @param value the value to set.
   */
  public void setStartCodeableConcept(io.carrera.fhir.avro.models.CodeableConcept value) {
    this.startCodeableConcept = value;
  }

  /**
   * Creates a new Goal RecordBuilder.
   * @return A new Goal RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Goal.Builder newBuilder() {
    return new io.carrera.fhir.avro.models.Goal.Builder();
  }

  /**
   * Creates a new Goal RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Goal RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Goal.Builder newBuilder(io.carrera.fhir.avro.models.Goal.Builder other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Goal.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Goal.Builder(other);
    }
  }

  /**
   * Creates a new Goal RecordBuilder by copying an existing Goal instance.
   * @param other The existing instance to copy.
   * @return A new Goal RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Goal.Builder newBuilder(io.carrera.fhir.avro.models.Goal other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Goal.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Goal.Builder(other);
    }
  }

  /**
   * RecordBuilder for Goal instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Goal>
    implements org.apache.avro.data.RecordBuilder<Goal> {

    private java.util.List<io.carrera.fhir.avro.models.Goal_Target> target;
    private java.time.LocalDate startDate;
    private io.carrera.fhir.avro.models.CodeableConcept startCodeableConcept;
    private io.carrera.fhir.avro.models.CodeableConcept.Builder startCodeableConceptBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Goal.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.target)) {
        this.target = data().deepCopy(fields()[0].schema(), other.target);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.startDate)) {
        this.startDate = data().deepCopy(fields()[1].schema(), other.startDate);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.startCodeableConcept)) {
        this.startCodeableConcept = data().deepCopy(fields()[2].schema(), other.startCodeableConcept);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (other.hasStartCodeableConceptBuilder()) {
        this.startCodeableConceptBuilder = io.carrera.fhir.avro.models.CodeableConcept.newBuilder(other.getStartCodeableConceptBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing Goal instance
     * @param other The existing instance to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Goal other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.target)) {
        this.target = data().deepCopy(fields()[0].schema(), other.target);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.startDate)) {
        this.startDate = data().deepCopy(fields()[1].schema(), other.startDate);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.startCodeableConcept)) {
        this.startCodeableConcept = data().deepCopy(fields()[2].schema(), other.startCodeableConcept);
        fieldSetFlags()[2] = true;
      }
      this.startCodeableConceptBuilder = null;
    }

    /**
      * Gets the value of the 'target' field.
      * @return The value.
      */
    public java.util.List<io.carrera.fhir.avro.models.Goal_Target> getTarget() {
      return target;
    }


    /**
      * Sets the value of the 'target' field.
      * @param value The value of 'target'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Goal.Builder setTarget(java.util.List<io.carrera.fhir.avro.models.Goal_Target> value) {
      validate(fields()[0], value);
      this.target = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'target' field has been set.
      * @return True if the 'target' field has been set, false otherwise.
      */
    public boolean hasTarget() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'target' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Goal.Builder clearTarget() {
      target = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'startDate' field.
      * @return The value.
      */
    public java.time.LocalDate getStartDate() {
      return startDate;
    }


    /**
      * Sets the value of the 'startDate' field.
      * @param value The value of 'startDate'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Goal.Builder setStartDate(java.time.LocalDate value) {
      validate(fields()[1], value);
      this.startDate = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'startDate' field has been set.
      * @return True if the 'startDate' field has been set, false otherwise.
      */
    public boolean hasStartDate() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'startDate' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Goal.Builder clearStartDate() {
      startDate = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'startCodeableConcept' field.
      * @return The value.
      */
    public io.carrera.fhir.avro.models.CodeableConcept getStartCodeableConcept() {
      return startCodeableConcept;
    }


    /**
      * Sets the value of the 'startCodeableConcept' field.
      * @param value The value of 'startCodeableConcept'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Goal.Builder setStartCodeableConcept(io.carrera.fhir.avro.models.CodeableConcept value) {
      validate(fields()[2], value);
      this.startCodeableConceptBuilder = null;
      this.startCodeableConcept = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'startCodeableConcept' field has been set.
      * @return True if the 'startCodeableConcept' field has been set, false otherwise.
      */
    public boolean hasStartCodeableConcept() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'startCodeableConcept' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.CodeableConcept.Builder getStartCodeableConceptBuilder() {
      if (startCodeableConceptBuilder == null) {
        if (hasStartCodeableConcept()) {
          setStartCodeableConceptBuilder(io.carrera.fhir.avro.models.CodeableConcept.newBuilder(startCodeableConcept));
        } else {
          setStartCodeableConceptBuilder(io.carrera.fhir.avro.models.CodeableConcept.newBuilder());
        }
      }
      return startCodeableConceptBuilder;
    }

    /**
     * Sets the Builder instance for the 'startCodeableConcept' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.Goal.Builder setStartCodeableConceptBuilder(io.carrera.fhir.avro.models.CodeableConcept.Builder value) {
      clearStartCodeableConcept();
      startCodeableConceptBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'startCodeableConcept' field has an active Builder instance
     * @return True if the 'startCodeableConcept' field has an active Builder instance
     */
    public boolean hasStartCodeableConceptBuilder() {
      return startCodeableConceptBuilder != null;
    }

    /**
      * Clears the value of the 'startCodeableConcept' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Goal.Builder clearStartCodeableConcept() {
      startCodeableConcept = null;
      startCodeableConceptBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Goal build() {
      try {
        Goal record = new Goal();
        record.target = fieldSetFlags()[0] ? this.target : (java.util.List<io.carrera.fhir.avro.models.Goal_Target>) defaultValue(fields()[0]);
        record.startDate = fieldSetFlags()[1] ? this.startDate : (java.time.LocalDate) defaultValue(fields()[1]);
        if (startCodeableConceptBuilder != null) {
          try {
            record.startCodeableConcept = this.startCodeableConceptBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("startCodeableConcept"));
            throw e;
          }
        } else {
          record.startCodeableConcept = fieldSetFlags()[2] ? this.startCodeableConcept : (io.carrera.fhir.avro.models.CodeableConcept) defaultValue(fields()[2]);
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
  private static final org.apache.avro.io.DatumWriter<Goal>
    WRITER$ = (org.apache.avro.io.DatumWriter<Goal>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Goal>
    READER$ = (org.apache.avro.io.DatumReader<Goal>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










