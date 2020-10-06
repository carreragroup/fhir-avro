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
public class RiskAssessment extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5084516094481884944L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RiskAssessment\",\"namespace\":\"io.carrera.fhir.avro.models\",\"fields\":[{\"name\":\"prediction\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"RiskAssessment_Prediction\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"]},{\"name\":\"outcome\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CodeableConcept\",\"fields\":[{\"name\":\"coding\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Coding\",\"fields\":[{\"name\":\"code\",\"type\":[\"null\",\"string\"]}]}}}]}]},{\"name\":\"probabilityDecimal\",\"type\":[\"null\",\"double\"]},{\"name\":\"probabilityRange\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Range\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"]},{\"name\":\"low\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Quantity\",\"fields\":[{\"name\":\"value\",\"type\":\"float\"},{\"name\":\"unit\",\"type\":\"string\"},{\"name\":\"system\",\"type\":\"string\"},{\"name\":\"code\",\"type\":\"string\"}]}]},{\"name\":\"high\",\"type\":[\"null\",\"Quantity\"]}]}]},{\"name\":\"qualitativeRisk\",\"type\":[\"null\",\"CodeableConcept\"]},{\"name\":\"relativeRisk\",\"type\":[\"null\",\"double\"]},{\"name\":\"whenPeriod\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Period\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"]},{\"name\":\"start\",\"type\":[\"null\",{\"type\":\"int\",\"logicalType\":\"date\"},{\"type\":\"long\",\"logicalType\":\"local-timestamp-micros\"}]},{\"name\":\"end\",\"type\":[\"null\",{\"type\":\"int\",\"logicalType\":\"date\"},{\"type\":\"long\",\"logicalType\":\"local-timestamp-micros\"}]}]}]},{\"name\":\"whenRange\",\"type\":[\"null\",\"Range\"]},{\"name\":\"rationale\",\"type\":[\"null\",\"string\"]}]}}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.DateConversion());
  }

  private static final BinaryMessageEncoder<RiskAssessment> ENCODER =
      new BinaryMessageEncoder<RiskAssessment>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<RiskAssessment> DECODER =
      new BinaryMessageDecoder<RiskAssessment>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<RiskAssessment> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<RiskAssessment> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<RiskAssessment> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<RiskAssessment>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this RiskAssessment to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a RiskAssessment from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a RiskAssessment instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static RiskAssessment fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.util.List<io.carrera.fhir.avro.models.RiskAssessment_Prediction> prediction;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public RiskAssessment() {}

  /**
   * All-args constructor.
   * @param prediction The new value for prediction
   */
  public RiskAssessment(java.util.List<io.carrera.fhir.avro.models.RiskAssessment_Prediction> prediction) {
    this.prediction = prediction;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return prediction;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: prediction = (java.util.List<io.carrera.fhir.avro.models.RiskAssessment_Prediction>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'prediction' field.
   * @return The value of the 'prediction' field.
   */
  public java.util.List<io.carrera.fhir.avro.models.RiskAssessment_Prediction> getPrediction() {
    return prediction;
  }


  /**
   * Sets the value of the 'prediction' field.
   * @param value the value to set.
   */
  public void setPrediction(java.util.List<io.carrera.fhir.avro.models.RiskAssessment_Prediction> value) {
    this.prediction = value;
  }

  /**
   * Creates a new RiskAssessment RecordBuilder.
   * @return A new RiskAssessment RecordBuilder
   */
  public static io.carrera.fhir.avro.models.RiskAssessment.Builder newBuilder() {
    return new io.carrera.fhir.avro.models.RiskAssessment.Builder();
  }

  /**
   * Creates a new RiskAssessment RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new RiskAssessment RecordBuilder
   */
  public static io.carrera.fhir.avro.models.RiskAssessment.Builder newBuilder(io.carrera.fhir.avro.models.RiskAssessment.Builder other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.RiskAssessment.Builder();
    } else {
      return new io.carrera.fhir.avro.models.RiskAssessment.Builder(other);
    }
  }

  /**
   * Creates a new RiskAssessment RecordBuilder by copying an existing RiskAssessment instance.
   * @param other The existing instance to copy.
   * @return A new RiskAssessment RecordBuilder
   */
  public static io.carrera.fhir.avro.models.RiskAssessment.Builder newBuilder(io.carrera.fhir.avro.models.RiskAssessment other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.RiskAssessment.Builder();
    } else {
      return new io.carrera.fhir.avro.models.RiskAssessment.Builder(other);
    }
  }

  /**
   * RecordBuilder for RiskAssessment instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RiskAssessment>
    implements org.apache.avro.data.RecordBuilder<RiskAssessment> {

    private java.util.List<io.carrera.fhir.avro.models.RiskAssessment_Prediction> prediction;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.carrera.fhir.avro.models.RiskAssessment.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.prediction)) {
        this.prediction = data().deepCopy(fields()[0].schema(), other.prediction);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing RiskAssessment instance
     * @param other The existing instance to copy.
     */
    private Builder(io.carrera.fhir.avro.models.RiskAssessment other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.prediction)) {
        this.prediction = data().deepCopy(fields()[0].schema(), other.prediction);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'prediction' field.
      * @return The value.
      */
    public java.util.List<io.carrera.fhir.avro.models.RiskAssessment_Prediction> getPrediction() {
      return prediction;
    }


    /**
      * Sets the value of the 'prediction' field.
      * @param value The value of 'prediction'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.RiskAssessment.Builder setPrediction(java.util.List<io.carrera.fhir.avro.models.RiskAssessment_Prediction> value) {
      validate(fields()[0], value);
      this.prediction = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'prediction' field has been set.
      * @return True if the 'prediction' field has been set, false otherwise.
      */
    public boolean hasPrediction() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'prediction' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.RiskAssessment.Builder clearPrediction() {
      prediction = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public RiskAssessment build() {
      try {
        RiskAssessment record = new RiskAssessment();
        record.prediction = fieldSetFlags()[0] ? this.prediction : (java.util.List<io.carrera.fhir.avro.models.RiskAssessment_Prediction>) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<RiskAssessment>
    WRITER$ = (org.apache.avro.io.DatumWriter<RiskAssessment>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<RiskAssessment>
    READER$ = (org.apache.avro.io.DatumReader<RiskAssessment>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










