// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qqgroup.proto

package com.bean;

public final class QQGroupBean {
  private QQGroupBean() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface GroupOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string groupName = 1;
    /**
     * <code>required string groupName = 1;</code>
     */
    boolean hasGroupName();
    /**
     * <code>required string groupName = 1;</code>
     */
    java.lang.String getGroupName();
    /**
     * <code>required string groupName = 1;</code>
     */
    com.google.protobuf.ByteString
        getGroupNameBytes();

    // required string groupNumber = 2;
    /**
     * <code>required string groupNumber = 2;</code>
     */
    boolean hasGroupNumber();
    /**
     * <code>required string groupNumber = 2;</code>
     */
    java.lang.String getGroupNumber();
    /**
     * <code>required string groupNumber = 2;</code>
     */
    com.google.protobuf.ByteString
        getGroupNumberBytes();

    // required string groupWeb = 3;
    /**
     * <code>required string groupWeb = 3;</code>
     */
    boolean hasGroupWeb();
    /**
     * <code>required string groupWeb = 3;</code>
     */
    java.lang.String getGroupWeb();
    /**
     * <code>required string groupWeb = 3;</code>
     */
    com.google.protobuf.ByteString
        getGroupWebBytes();
  }
  /**
   * Protobuf type {@code Group}
   */
  public static final class Group extends
      com.google.protobuf.GeneratedMessage
      implements GroupOrBuilder {
    // Use Group.newBuilder() to construct.
    private Group(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Group(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Group defaultInstance;
    public static Group getDefaultInstance() {
      return defaultInstance;
    }

    public Group getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Group(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              groupName_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              groupNumber_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              groupWeb_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bean.QQGroupBean.internal_static_Group_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bean.QQGroupBean.internal_static_Group_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bean.QQGroupBean.Group.class, com.bean.QQGroupBean.Group.Builder.class);
    }

    public static com.google.protobuf.Parser<Group> PARSER =
        new com.google.protobuf.AbstractParser<Group>() {
      public Group parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Group(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Group> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string groupName = 1;
    public static final int GROUPNAME_FIELD_NUMBER = 1;
    private java.lang.Object groupName_;
    /**
     * <code>required string groupName = 1;</code>
     */
    public boolean hasGroupName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string groupName = 1;</code>
     */
    public java.lang.String getGroupName() {
      java.lang.Object ref = groupName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          groupName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string groupName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getGroupNameBytes() {
      java.lang.Object ref = groupName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        groupName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required string groupNumber = 2;
    public static final int GROUPNUMBER_FIELD_NUMBER = 2;
    private java.lang.Object groupNumber_;
    /**
     * <code>required string groupNumber = 2;</code>
     */
    public boolean hasGroupNumber() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string groupNumber = 2;</code>
     */
    public java.lang.String getGroupNumber() {
      java.lang.Object ref = groupNumber_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          groupNumber_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string groupNumber = 2;</code>
     */
    public com.google.protobuf.ByteString
        getGroupNumberBytes() {
      java.lang.Object ref = groupNumber_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        groupNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required string groupWeb = 3;
    public static final int GROUPWEB_FIELD_NUMBER = 3;
    private java.lang.Object groupWeb_;
    /**
     * <code>required string groupWeb = 3;</code>
     */
    public boolean hasGroupWeb() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required string groupWeb = 3;</code>
     */
    public java.lang.String getGroupWeb() {
      java.lang.Object ref = groupWeb_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          groupWeb_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string groupWeb = 3;</code>
     */
    public com.google.protobuf.ByteString
        getGroupWebBytes() {
      java.lang.Object ref = groupWeb_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        groupWeb_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      groupName_ = "";
      groupNumber_ = "";
      groupWeb_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasGroupName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasGroupNumber()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasGroupWeb()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getGroupNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getGroupNumberBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getGroupWebBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getGroupNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getGroupNumberBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getGroupWebBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.bean.QQGroupBean.Group parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.bean.QQGroupBean.Group parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.bean.QQGroupBean.Group parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.bean.QQGroupBean.Group parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.bean.QQGroupBean.Group parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.bean.QQGroupBean.Group parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.bean.QQGroupBean.Group parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.bean.QQGroupBean.Group parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.bean.QQGroupBean.Group parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.bean.QQGroupBean.Group parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.bean.QQGroupBean.Group prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Group}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.bean.QQGroupBean.GroupOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.bean.QQGroupBean.internal_static_Group_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.bean.QQGroupBean.internal_static_Group_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.bean.QQGroupBean.Group.class, com.bean.QQGroupBean.Group.Builder.class);
      }

      // Construct using com.bean.QQGroupBean.Group.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        groupName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        groupNumber_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        groupWeb_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.bean.QQGroupBean.internal_static_Group_descriptor;
      }

      public com.bean.QQGroupBean.Group getDefaultInstanceForType() {
        return com.bean.QQGroupBean.Group.getDefaultInstance();
      }

      public com.bean.QQGroupBean.Group build() {
        com.bean.QQGroupBean.Group result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.bean.QQGroupBean.Group buildPartial() {
        com.bean.QQGroupBean.Group result = new com.bean.QQGroupBean.Group(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.groupName_ = groupName_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.groupNumber_ = groupNumber_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.groupWeb_ = groupWeb_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.bean.QQGroupBean.Group) {
          return mergeFrom((com.bean.QQGroupBean.Group)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.bean.QQGroupBean.Group other) {
        if (other == com.bean.QQGroupBean.Group.getDefaultInstance()) return this;
        if (other.hasGroupName()) {
          bitField0_ |= 0x00000001;
          groupName_ = other.groupName_;
          onChanged();
        }
        if (other.hasGroupNumber()) {
          bitField0_ |= 0x00000002;
          groupNumber_ = other.groupNumber_;
          onChanged();
        }
        if (other.hasGroupWeb()) {
          bitField0_ |= 0x00000004;
          groupWeb_ = other.groupWeb_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasGroupName()) {
          
          return false;
        }
        if (!hasGroupNumber()) {
          
          return false;
        }
        if (!hasGroupWeb()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.bean.QQGroupBean.Group parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.bean.QQGroupBean.Group) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string groupName = 1;
      private java.lang.Object groupName_ = "";
      /**
       * <code>required string groupName = 1;</code>
       */
      public boolean hasGroupName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string groupName = 1;</code>
       */
      public java.lang.String getGroupName() {
        java.lang.Object ref = groupName_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          groupName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string groupName = 1;</code>
       */
      public com.google.protobuf.ByteString
          getGroupNameBytes() {
        java.lang.Object ref = groupName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          groupName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string groupName = 1;</code>
       */
      public Builder setGroupName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        groupName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string groupName = 1;</code>
       */
      public Builder clearGroupName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        groupName_ = getDefaultInstance().getGroupName();
        onChanged();
        return this;
      }
      /**
       * <code>required string groupName = 1;</code>
       */
      public Builder setGroupNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        groupName_ = value;
        onChanged();
        return this;
      }

      // required string groupNumber = 2;
      private java.lang.Object groupNumber_ = "";
      /**
       * <code>required string groupNumber = 2;</code>
       */
      public boolean hasGroupNumber() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string groupNumber = 2;</code>
       */
      public java.lang.String getGroupNumber() {
        java.lang.Object ref = groupNumber_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          groupNumber_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string groupNumber = 2;</code>
       */
      public com.google.protobuf.ByteString
          getGroupNumberBytes() {
        java.lang.Object ref = groupNumber_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          groupNumber_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string groupNumber = 2;</code>
       */
      public Builder setGroupNumber(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        groupNumber_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string groupNumber = 2;</code>
       */
      public Builder clearGroupNumber() {
        bitField0_ = (bitField0_ & ~0x00000002);
        groupNumber_ = getDefaultInstance().getGroupNumber();
        onChanged();
        return this;
      }
      /**
       * <code>required string groupNumber = 2;</code>
       */
      public Builder setGroupNumberBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        groupNumber_ = value;
        onChanged();
        return this;
      }

      // required string groupWeb = 3;
      private java.lang.Object groupWeb_ = "";
      /**
       * <code>required string groupWeb = 3;</code>
       */
      public boolean hasGroupWeb() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required string groupWeb = 3;</code>
       */
      public java.lang.String getGroupWeb() {
        java.lang.Object ref = groupWeb_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          groupWeb_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string groupWeb = 3;</code>
       */
      public com.google.protobuf.ByteString
          getGroupWebBytes() {
        java.lang.Object ref = groupWeb_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          groupWeb_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string groupWeb = 3;</code>
       */
      public Builder setGroupWeb(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        groupWeb_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string groupWeb = 3;</code>
       */
      public Builder clearGroupWeb() {
        bitField0_ = (bitField0_ & ~0x00000004);
        groupWeb_ = getDefaultInstance().getGroupWeb();
        onChanged();
        return this;
      }
      /**
       * <code>required string groupWeb = 3;</code>
       */
      public Builder setGroupWebBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        groupWeb_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Group)
    }

    static {
      defaultInstance = new Group(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Group)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_Group_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Group_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rqqgroup.proto\"A\n\005Group\022\021\n\tgroupName\030\001 " +
      "\002(\t\022\023\n\013groupNumber\030\002 \002(\t\022\020\n\010groupWeb\030\003 \002" +
      "(\tB\027\n\010com.beanB\013QQGroupBean"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_Group_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_Group_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_Group_descriptor,
              new java.lang.String[] { "GroupName", "GroupNumber", "GroupWeb", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
