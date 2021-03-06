/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package br.natividade.estoque.schema;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Produto extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4366615519275224525L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Produto\",\"namespace\":\"br.natividade.estoque.schema\",\"fields\":[{\"name\":\"descricao\",\"type\":\"string\"},{\"name\":\"quantidadeEstoque\",\"type\":\"int\"},{\"name\":\"valorUnitario\",\"type\":\"double\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Produto> ENCODER =
      new BinaryMessageEncoder<Produto>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Produto> DECODER =
      new BinaryMessageDecoder<Produto>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Produto> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Produto> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Produto> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Produto>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Produto to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Produto from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Produto instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Produto fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence descricao;
   private int quantidadeEstoque;
   private double valorUnitario;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Produto() {}

  /**
   * All-args constructor.
   * @param descricao The new value for descricao
   * @param quantidadeEstoque The new value for quantidadeEstoque
   * @param valorUnitario The new value for valorUnitario
   */
  public Produto(java.lang.CharSequence descricao, java.lang.Integer quantidadeEstoque, java.lang.Double valorUnitario) {
    this.descricao = descricao;
    this.quantidadeEstoque = quantidadeEstoque;
    this.valorUnitario = valorUnitario;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return descricao;
    case 1: return quantidadeEstoque;
    case 2: return valorUnitario;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: descricao = (java.lang.CharSequence)value$; break;
    case 1: quantidadeEstoque = (java.lang.Integer)value$; break;
    case 2: valorUnitario = (java.lang.Double)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'descricao' field.
   * @return The value of the 'descricao' field.
   */
  public java.lang.CharSequence getDescricao() {
    return descricao;
  }


  /**
   * Sets the value of the 'descricao' field.
   * @param value the value to set.
   */
  public void setDescricao(java.lang.CharSequence value) {
    this.descricao = value;
  }

  /**
   * Gets the value of the 'quantidadeEstoque' field.
   * @return The value of the 'quantidadeEstoque' field.
   */
  public int getQuantidadeEstoque() {
    return quantidadeEstoque;
  }


  /**
   * Sets the value of the 'quantidadeEstoque' field.
   * @param value the value to set.
   */
  public void setQuantidadeEstoque(int value) {
    this.quantidadeEstoque = value;
  }

  /**
   * Gets the value of the 'valorUnitario' field.
   * @return The value of the 'valorUnitario' field.
   */
  public double getValorUnitario() {
    return valorUnitario;
  }


  /**
   * Sets the value of the 'valorUnitario' field.
   * @param value the value to set.
   */
  public void setValorUnitario(double value) {
    this.valorUnitario = value;
  }

  /**
   * Creates a new Produto RecordBuilder.
   * @return A new Produto RecordBuilder
   */
  public static br.natividade.estoque.schema.Produto.Builder newBuilder() {
    return new br.natividade.estoque.schema.Produto.Builder();
  }

  /**
   * Creates a new Produto RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Produto RecordBuilder
   */
  public static br.natividade.estoque.schema.Produto.Builder newBuilder(br.natividade.estoque.schema.Produto.Builder other) {
    if (other == null) {
      return new br.natividade.estoque.schema.Produto.Builder();
    } else {
      return new br.natividade.estoque.schema.Produto.Builder(other);
    }
  }

  /**
   * Creates a new Produto RecordBuilder by copying an existing Produto instance.
   * @param other The existing instance to copy.
   * @return A new Produto RecordBuilder
   */
  public static br.natividade.estoque.schema.Produto.Builder newBuilder(br.natividade.estoque.schema.Produto other) {
    if (other == null) {
      return new br.natividade.estoque.schema.Produto.Builder();
    } else {
      return new br.natividade.estoque.schema.Produto.Builder(other);
    }
  }

  /**
   * RecordBuilder for Produto instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Produto>
    implements org.apache.avro.data.RecordBuilder<Produto> {

    private java.lang.CharSequence descricao;
    private int quantidadeEstoque;
    private double valorUnitario;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(br.natividade.estoque.schema.Produto.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.descricao)) {
        this.descricao = data().deepCopy(fields()[0].schema(), other.descricao);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.quantidadeEstoque)) {
        this.quantidadeEstoque = data().deepCopy(fields()[1].schema(), other.quantidadeEstoque);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.valorUnitario)) {
        this.valorUnitario = data().deepCopy(fields()[2].schema(), other.valorUnitario);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing Produto instance
     * @param other The existing instance to copy.
     */
    private Builder(br.natividade.estoque.schema.Produto other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.descricao)) {
        this.descricao = data().deepCopy(fields()[0].schema(), other.descricao);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.quantidadeEstoque)) {
        this.quantidadeEstoque = data().deepCopy(fields()[1].schema(), other.quantidadeEstoque);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.valorUnitario)) {
        this.valorUnitario = data().deepCopy(fields()[2].schema(), other.valorUnitario);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'descricao' field.
      * @return The value.
      */
    public java.lang.CharSequence getDescricao() {
      return descricao;
    }


    /**
      * Sets the value of the 'descricao' field.
      * @param value The value of 'descricao'.
      * @return This builder.
      */
    public br.natividade.estoque.schema.Produto.Builder setDescricao(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.descricao = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'descricao' field has been set.
      * @return True if the 'descricao' field has been set, false otherwise.
      */
    public boolean hasDescricao() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'descricao' field.
      * @return This builder.
      */
    public br.natividade.estoque.schema.Produto.Builder clearDescricao() {
      descricao = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'quantidadeEstoque' field.
      * @return The value.
      */
    public int getQuantidadeEstoque() {
      return quantidadeEstoque;
    }


    /**
      * Sets the value of the 'quantidadeEstoque' field.
      * @param value The value of 'quantidadeEstoque'.
      * @return This builder.
      */
    public br.natividade.estoque.schema.Produto.Builder setQuantidadeEstoque(int value) {
      validate(fields()[1], value);
      this.quantidadeEstoque = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'quantidadeEstoque' field has been set.
      * @return True if the 'quantidadeEstoque' field has been set, false otherwise.
      */
    public boolean hasQuantidadeEstoque() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'quantidadeEstoque' field.
      * @return This builder.
      */
    public br.natividade.estoque.schema.Produto.Builder clearQuantidadeEstoque() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'valorUnitario' field.
      * @return The value.
      */
    public double getValorUnitario() {
      return valorUnitario;
    }


    /**
      * Sets the value of the 'valorUnitario' field.
      * @param value The value of 'valorUnitario'.
      * @return This builder.
      */
    public br.natividade.estoque.schema.Produto.Builder setValorUnitario(double value) {
      validate(fields()[2], value);
      this.valorUnitario = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'valorUnitario' field has been set.
      * @return True if the 'valorUnitario' field has been set, false otherwise.
      */
    public boolean hasValorUnitario() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'valorUnitario' field.
      * @return This builder.
      */
    public br.natividade.estoque.schema.Produto.Builder clearValorUnitario() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Produto build() {
      try {
        Produto record = new Produto();
        record.descricao = fieldSetFlags()[0] ? this.descricao : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.quantidadeEstoque = fieldSetFlags()[1] ? this.quantidadeEstoque : (java.lang.Integer) defaultValue(fields()[1]);
        record.valorUnitario = fieldSetFlags()[2] ? this.valorUnitario : (java.lang.Double) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Produto>
    WRITER$ = (org.apache.avro.io.DatumWriter<Produto>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Produto>
    READER$ = (org.apache.avro.io.DatumReader<Produto>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.descricao);

    out.writeInt(this.quantidadeEstoque);

    out.writeDouble(this.valorUnitario);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.descricao = in.readString(this.descricao instanceof Utf8 ? (Utf8)this.descricao : null);

      this.quantidadeEstoque = in.readInt();

      this.valorUnitario = in.readDouble();

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.descricao = in.readString(this.descricao instanceof Utf8 ? (Utf8)this.descricao : null);
          break;

        case 1:
          this.quantidadeEstoque = in.readInt();
          break;

        case 2:
          this.valorUnitario = in.readDouble();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










