/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.server.appenders.cassandra.config.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class CassandraCredential extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CassandraCredential\",\"namespace\":\"org.kaaproject.kaa.server.appenders.cassandra.config.gen\",\"fields\":[{\"name\":\"user\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"displayName\":\"User\",\"weight\":0.5,\"by_default\":\"user\"},{\"name\":\"password\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"displayName\":\"Password\",\"weight\":0.5,\"by_default\":\"password\"}],\"optional\":true}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String user;
   private java.lang.String password;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public CassandraCredential() {}

  /**
   * All-args constructor.
   */
  public CassandraCredential(java.lang.String user, java.lang.String password) {
    this.user = user;
    this.password = password;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return user;
    case 1: return password;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: user = (java.lang.String)value$; break;
    case 1: password = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'user' field.
   */
  public java.lang.String getUser() {
    return user;
  }

  /**
   * Sets the value of the 'user' field.
   * @param value the value to set.
   */
  public void setUser(java.lang.String value) {
    this.user = value;
  }

  /**
   * Gets the value of the 'password' field.
   */
  public java.lang.String getPassword() {
    return password;
  }

  /**
   * Sets the value of the 'password' field.
   * @param value the value to set.
   */
  public void setPassword(java.lang.String value) {
    this.password = value;
  }

  /** Creates a new CassandraCredential RecordBuilder */
  public static org.kaaproject.kaa.server.appenders.cassandra.config.gen.CassandraCredential.Builder newBuilder() {
    return new org.kaaproject.kaa.server.appenders.cassandra.config.gen.CassandraCredential.Builder();
  }
  
  /** Creates a new CassandraCredential RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.server.appenders.cassandra.config.gen.CassandraCredential.Builder newBuilder(org.kaaproject.kaa.server.appenders.cassandra.config.gen.CassandraCredential.Builder other) {
    return new org.kaaproject.kaa.server.appenders.cassandra.config.gen.CassandraCredential.Builder(other);
  }
  
  /** Creates a new CassandraCredential RecordBuilder by copying an existing CassandraCredential instance */
  public static org.kaaproject.kaa.server.appenders.cassandra.config.gen.CassandraCredential.Builder newBuilder(org.kaaproject.kaa.server.appenders.cassandra.config.gen.CassandraCredential other) {
    return new org.kaaproject.kaa.server.appenders.cassandra.config.gen.CassandraCredential.Builder(other);
  }
  
  /**
   * RecordBuilder for CassandraCredential instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CassandraCredential>
    implements org.apache.avro.data.RecordBuilder<CassandraCredential> {

    private java.lang.String user;
    private java.lang.String password;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.server.appenders.cassandra.config.gen.CassandraCredential.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.server.appenders.cassandra.config.gen.CassandraCredential.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.user)) {
        this.user = data().deepCopy(fields()[0].schema(), other.user);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.password)) {
        this.password = data().deepCopy(fields()[1].schema(), other.password);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing CassandraCredential instance */
    private Builder(org.kaaproject.kaa.server.appenders.cassandra.config.gen.CassandraCredential other) {
            super(org.kaaproject.kaa.server.appenders.cassandra.config.gen.CassandraCredential.SCHEMA$);
      if (isValidValue(fields()[0], other.user)) {
        this.user = data().deepCopy(fields()[0].schema(), other.user);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.password)) {
        this.password = data().deepCopy(fields()[1].schema(), other.password);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'user' field */
    public java.lang.String getUser() {
      return user;
    }
    
    /** Sets the value of the 'user' field */
    public org.kaaproject.kaa.server.appenders.cassandra.config.gen.CassandraCredential.Builder setUser(java.lang.String value) {
      validate(fields()[0], value);
      this.user = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'user' field has been set */
    public boolean hasUser() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'user' field */
    public org.kaaproject.kaa.server.appenders.cassandra.config.gen.CassandraCredential.Builder clearUser() {
      user = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'password' field */
    public java.lang.String getPassword() {
      return password;
    }
    
    /** Sets the value of the 'password' field */
    public org.kaaproject.kaa.server.appenders.cassandra.config.gen.CassandraCredential.Builder setPassword(java.lang.String value) {
      validate(fields()[1], value);
      this.password = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'password' field has been set */
    public boolean hasPassword() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'password' field */
    public org.kaaproject.kaa.server.appenders.cassandra.config.gen.CassandraCredential.Builder clearPassword() {
      password = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public CassandraCredential build() {
      try {
        CassandraCredential record = new CassandraCredential();
        record.user = fieldSetFlags()[0] ? this.user : (java.lang.String) defaultValue(fields()[0]);
        record.password = fieldSetFlags()[1] ? this.password : (java.lang.String) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
