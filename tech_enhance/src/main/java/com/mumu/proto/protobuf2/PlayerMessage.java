// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Fight.proto

package com.mumu.proto.protobuf2;

/**
 * <pre>
 * 小兵对象
 * </pre>
 *
 * Protobuf type {@code PlayerMessage}
 */
public  final class PlayerMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PlayerMessage)
    PlayerMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlayerMessage.newBuilder() to construct.
  private PlayerMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlayerMessage() {
    name_ = "";
    pic_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlayerMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            id_ = input.readInt32();
            break;
          }
          case 16: {

            index_ = input.readInt32();
            break;
          }
          case 24: {

            lv_ = input.readInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 40: {

            type_ = input.readInt32();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            pic_ = s;
            break;
          }
          case 56: {

            ability_ = input.readInt32();
            break;
          }
          case 64: {

            cd_ = input.readInt32();
            break;
          }
          case 72: {

            maxHp_ = input.readInt32();
            break;
          }
          case 80: {

            hp_ = input.readInt32();
            break;
          }
          case 88: {

            troopId_ = input.readInt32();
            break;
          }
          case 96: {

            troopType_ = input.readInt32();
            break;
          }
          case 104: {

            reloadTime_ = input.readInt32();
            break;
          }
          case 112: {

            pos_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.mumu.proto.protobuf2.FightMessages.internal_static_PlayerMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.mumu.proto.protobuf2.FightMessages.internal_static_PlayerMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.mumu.proto.protobuf2.PlayerMessage.class, com.mumu.proto.protobuf2.PlayerMessage.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <pre>
   * 主体Id
   * </pre>
   *
   * <code>int32 id = 1;</code>
   */
  public int getId() {
    return id_;
  }

  public static final int INDEX_FIELD_NUMBER = 2;
  private int index_;
  /**
   * <pre>
   * 下标
   * </pre>
   *
   * <code>int32 index = 2;</code>
   */
  public int getIndex() {
    return index_;
  }

  public static final int LV_FIELD_NUMBER = 3;
  private int lv_;
  /**
   * <pre>
   * 等级
   * </pre>
   *
   * <code>int32 lv = 3;</code>
   */
  public int getLv() {
    return lv_;
  }

  public static final int NAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * 名称
   * </pre>
   *
   * <code>string name = 4;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 名称
   * </pre>
   *
   * <code>string name = 4;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 5;
  private int type_;
  /**
   * <pre>
   * 类型
   * </pre>
   *
   * <code>int32 type = 5;</code>
   */
  public int getType() {
    return type_;
  }

  public static final int PIC_FIELD_NUMBER = 6;
  private volatile java.lang.Object pic_;
  /**
   * <pre>
   * 图片
   * </pre>
   *
   * <code>string pic = 6;</code>
   */
  public java.lang.String getPic() {
    java.lang.Object ref = pic_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pic_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 图片
   * </pre>
   *
   * <code>string pic = 6;</code>
   */
  public com.google.protobuf.ByteString
      getPicBytes() {
    java.lang.Object ref = pic_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pic_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ABILITY_FIELD_NUMBER = 7;
  private int ability_;
  /**
   * <pre>
   * 战力
   * </pre>
   *
   * <code>int32 ability = 7;</code>
   */
  public int getAbility() {
    return ability_;
  }

  public static final int CD_FIELD_NUMBER = 8;
  private int cd_;
  /**
   * <pre>
   * cd
   * </pre>
   *
   * <code>int32 cd = 8;</code>
   */
  public int getCd() {
    return cd_;
  }

  public static final int MAXHP_FIELD_NUMBER = 9;
  private int maxHp_;
  /**
   * <pre>
   * 最大血量
   * </pre>
   *
   * <code>int32 maxHp = 9;</code>
   */
  public int getMaxHp() {
    return maxHp_;
  }

  public static final int HP_FIELD_NUMBER = 10;
  private int hp_;
  /**
   * <pre>
   * 当前血量
   * </pre>
   *
   * <code>int32 hp = 10;</code>
   */
  public int getHp() {
    return hp_;
  }

  public static final int TROOPID_FIELD_NUMBER = 11;
  private int troopId_;
  /**
   * <pre>
   * 编队id
   * </pre>
   *
   * <code>int32 troopId = 11;</code>
   */
  public int getTroopId() {
    return troopId_;
  }

  public static final int TROOPTYPE_FIELD_NUMBER = 12;
  private int troopType_;
  /**
   * <pre>
   * 编队类型
   * </pre>
   *
   * <code>int32 troopType = 12;</code>
   */
  public int getTroopType() {
    return troopType_;
  }

  public static final int RELOADTIME_FIELD_NUMBER = 13;
  private int reloadTime_;
  /**
   * <pre>
   * 填弹时间
   * </pre>
   *
   * <code>int32 reloadTime = 13;</code>
   */
  public int getReloadTime() {
    return reloadTime_;
  }

  public static final int POS_FIELD_NUMBER = 14;
  private int pos_;
  /**
   * <pre>
   * 子队在编队中的位置 (1开始)
   * </pre>
   *
   * <code>int32 pos = 14;</code>
   */
  public int getPos() {
    return pos_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (index_ != 0) {
      output.writeInt32(2, index_);
    }
    if (lv_ != 0) {
      output.writeInt32(3, lv_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, name_);
    }
    if (type_ != 0) {
      output.writeInt32(5, type_);
    }
    if (!getPicBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, pic_);
    }
    if (ability_ != 0) {
      output.writeInt32(7, ability_);
    }
    if (cd_ != 0) {
      output.writeInt32(8, cd_);
    }
    if (maxHp_ != 0) {
      output.writeInt32(9, maxHp_);
    }
    if (hp_ != 0) {
      output.writeInt32(10, hp_);
    }
    if (troopId_ != 0) {
      output.writeInt32(11, troopId_);
    }
    if (troopType_ != 0) {
      output.writeInt32(12, troopType_);
    }
    if (reloadTime_ != 0) {
      output.writeInt32(13, reloadTime_);
    }
    if (pos_ != 0) {
      output.writeInt32(14, pos_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (index_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, index_);
    }
    if (lv_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, lv_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, name_);
    }
    if (type_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, type_);
    }
    if (!getPicBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, pic_);
    }
    if (ability_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, ability_);
    }
    if (cd_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(8, cd_);
    }
    if (maxHp_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(9, maxHp_);
    }
    if (hp_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(10, hp_);
    }
    if (troopId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(11, troopId_);
    }
    if (troopType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(12, troopType_);
    }
    if (reloadTime_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(13, reloadTime_);
    }
    if (pos_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(14, pos_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.mumu.proto.protobuf2.PlayerMessage)) {
      return super.equals(obj);
    }
    com.mumu.proto.protobuf2.PlayerMessage other = (com.mumu.proto.protobuf2.PlayerMessage) obj;

    if (getId()
        != other.getId()) return false;
    if (getIndex()
        != other.getIndex()) return false;
    if (getLv()
        != other.getLv()) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (getType()
        != other.getType()) return false;
    if (!getPic()
        .equals(other.getPic())) return false;
    if (getAbility()
        != other.getAbility()) return false;
    if (getCd()
        != other.getCd()) return false;
    if (getMaxHp()
        != other.getMaxHp()) return false;
    if (getHp()
        != other.getHp()) return false;
    if (getTroopId()
        != other.getTroopId()) return false;
    if (getTroopType()
        != other.getTroopType()) return false;
    if (getReloadTime()
        != other.getReloadTime()) return false;
    if (getPos()
        != other.getPos()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + INDEX_FIELD_NUMBER;
    hash = (53 * hash) + getIndex();
    hash = (37 * hash) + LV_FIELD_NUMBER;
    hash = (53 * hash) + getLv();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType();
    hash = (37 * hash) + PIC_FIELD_NUMBER;
    hash = (53 * hash) + getPic().hashCode();
    hash = (37 * hash) + ABILITY_FIELD_NUMBER;
    hash = (53 * hash) + getAbility();
    hash = (37 * hash) + CD_FIELD_NUMBER;
    hash = (53 * hash) + getCd();
    hash = (37 * hash) + MAXHP_FIELD_NUMBER;
    hash = (53 * hash) + getMaxHp();
    hash = (37 * hash) + HP_FIELD_NUMBER;
    hash = (53 * hash) + getHp();
    hash = (37 * hash) + TROOPID_FIELD_NUMBER;
    hash = (53 * hash) + getTroopId();
    hash = (37 * hash) + TROOPTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getTroopType();
    hash = (37 * hash) + RELOADTIME_FIELD_NUMBER;
    hash = (53 * hash) + getReloadTime();
    hash = (37 * hash) + POS_FIELD_NUMBER;
    hash = (53 * hash) + getPos();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.mumu.proto.protobuf2.PlayerMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mumu.proto.protobuf2.PlayerMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mumu.proto.protobuf2.PlayerMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mumu.proto.protobuf2.PlayerMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mumu.proto.protobuf2.PlayerMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mumu.proto.protobuf2.PlayerMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mumu.proto.protobuf2.PlayerMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mumu.proto.protobuf2.PlayerMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mumu.proto.protobuf2.PlayerMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.mumu.proto.protobuf2.PlayerMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mumu.proto.protobuf2.PlayerMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mumu.proto.protobuf2.PlayerMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.mumu.proto.protobuf2.PlayerMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * 小兵对象
   * </pre>
   *
   * Protobuf type {@code PlayerMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PlayerMessage)
      com.mumu.proto.protobuf2.PlayerMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mumu.proto.protobuf2.FightMessages.internal_static_PlayerMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mumu.proto.protobuf2.FightMessages.internal_static_PlayerMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mumu.proto.protobuf2.PlayerMessage.class, com.mumu.proto.protobuf2.PlayerMessage.Builder.class);
    }

    // Construct using com.mumu.proto.protobuf2.PlayerMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0;

      index_ = 0;

      lv_ = 0;

      name_ = "";

      type_ = 0;

      pic_ = "";

      ability_ = 0;

      cd_ = 0;

      maxHp_ = 0;

      hp_ = 0;

      troopId_ = 0;

      troopType_ = 0;

      reloadTime_ = 0;

      pos_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.mumu.proto.protobuf2.FightMessages.internal_static_PlayerMessage_descriptor;
    }

    @java.lang.Override
    public com.mumu.proto.protobuf2.PlayerMessage getDefaultInstanceForType() {
      return com.mumu.proto.protobuf2.PlayerMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.mumu.proto.protobuf2.PlayerMessage build() {
      com.mumu.proto.protobuf2.PlayerMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.mumu.proto.protobuf2.PlayerMessage buildPartial() {
      com.mumu.proto.protobuf2.PlayerMessage result = new com.mumu.proto.protobuf2.PlayerMessage(this);
      result.id_ = id_;
      result.index_ = index_;
      result.lv_ = lv_;
      result.name_ = name_;
      result.type_ = type_;
      result.pic_ = pic_;
      result.ability_ = ability_;
      result.cd_ = cd_;
      result.maxHp_ = maxHp_;
      result.hp_ = hp_;
      result.troopId_ = troopId_;
      result.troopType_ = troopType_;
      result.reloadTime_ = reloadTime_;
      result.pos_ = pos_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.mumu.proto.protobuf2.PlayerMessage) {
        return mergeFrom((com.mumu.proto.protobuf2.PlayerMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.mumu.proto.protobuf2.PlayerMessage other) {
      if (other == com.mumu.proto.protobuf2.PlayerMessage.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (other.getIndex() != 0) {
        setIndex(other.getIndex());
      }
      if (other.getLv() != 0) {
        setLv(other.getLv());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getType() != 0) {
        setType(other.getType());
      }
      if (!other.getPic().isEmpty()) {
        pic_ = other.pic_;
        onChanged();
      }
      if (other.getAbility() != 0) {
        setAbility(other.getAbility());
      }
      if (other.getCd() != 0) {
        setCd(other.getCd());
      }
      if (other.getMaxHp() != 0) {
        setMaxHp(other.getMaxHp());
      }
      if (other.getHp() != 0) {
        setHp(other.getHp());
      }
      if (other.getTroopId() != 0) {
        setTroopId(other.getTroopId());
      }
      if (other.getTroopType() != 0) {
        setTroopType(other.getTroopType());
      }
      if (other.getReloadTime() != 0) {
        setReloadTime(other.getReloadTime());
      }
      if (other.getPos() != 0) {
        setPos(other.getPos());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.mumu.proto.protobuf2.PlayerMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.mumu.proto.protobuf2.PlayerMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <pre>
     * 主体Id
     * </pre>
     *
     * <code>int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <pre>
     * 主体Id
     * </pre>
     *
     * <code>int32 id = 1;</code>
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 主体Id
     * </pre>
     *
     * <code>int32 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private int index_ ;
    /**
     * <pre>
     * 下标
     * </pre>
     *
     * <code>int32 index = 2;</code>
     */
    public int getIndex() {
      return index_;
    }
    /**
     * <pre>
     * 下标
     * </pre>
     *
     * <code>int32 index = 2;</code>
     */
    public Builder setIndex(int value) {
      
      index_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 下标
     * </pre>
     *
     * <code>int32 index = 2;</code>
     */
    public Builder clearIndex() {
      
      index_ = 0;
      onChanged();
      return this;
    }

    private int lv_ ;
    /**
     * <pre>
     * 等级
     * </pre>
     *
     * <code>int32 lv = 3;</code>
     */
    public int getLv() {
      return lv_;
    }
    /**
     * <pre>
     * 等级
     * </pre>
     *
     * <code>int32 lv = 3;</code>
     */
    public Builder setLv(int value) {
      
      lv_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 等级
     * </pre>
     *
     * <code>int32 lv = 3;</code>
     */
    public Builder clearLv() {
      
      lv_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * 名称
     * </pre>
     *
     * <code>string name = 4;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 名称
     * </pre>
     *
     * <code>string name = 4;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 名称
     * </pre>
     *
     * <code>string name = 4;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 名称
     * </pre>
     *
     * <code>string name = 4;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 名称
     * </pre>
     *
     * <code>string name = 4;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int type_ ;
    /**
     * <pre>
     * 类型
     * </pre>
     *
     * <code>int32 type = 5;</code>
     */
    public int getType() {
      return type_;
    }
    /**
     * <pre>
     * 类型
     * </pre>
     *
     * <code>int32 type = 5;</code>
     */
    public Builder setType(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 类型
     * </pre>
     *
     * <code>int32 type = 5;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object pic_ = "";
    /**
     * <pre>
     * 图片
     * </pre>
     *
     * <code>string pic = 6;</code>
     */
    public java.lang.String getPic() {
      java.lang.Object ref = pic_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pic_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 图片
     * </pre>
     *
     * <code>string pic = 6;</code>
     */
    public com.google.protobuf.ByteString
        getPicBytes() {
      java.lang.Object ref = pic_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 图片
     * </pre>
     *
     * <code>string pic = 6;</code>
     */
    public Builder setPic(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pic_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 图片
     * </pre>
     *
     * <code>string pic = 6;</code>
     */
    public Builder clearPic() {
      
      pic_ = getDefaultInstance().getPic();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 图片
     * </pre>
     *
     * <code>string pic = 6;</code>
     */
    public Builder setPicBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pic_ = value;
      onChanged();
      return this;
    }

    private int ability_ ;
    /**
     * <pre>
     * 战力
     * </pre>
     *
     * <code>int32 ability = 7;</code>
     */
    public int getAbility() {
      return ability_;
    }
    /**
     * <pre>
     * 战力
     * </pre>
     *
     * <code>int32 ability = 7;</code>
     */
    public Builder setAbility(int value) {
      
      ability_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 战力
     * </pre>
     *
     * <code>int32 ability = 7;</code>
     */
    public Builder clearAbility() {
      
      ability_ = 0;
      onChanged();
      return this;
    }

    private int cd_ ;
    /**
     * <pre>
     * cd
     * </pre>
     *
     * <code>int32 cd = 8;</code>
     */
    public int getCd() {
      return cd_;
    }
    /**
     * <pre>
     * cd
     * </pre>
     *
     * <code>int32 cd = 8;</code>
     */
    public Builder setCd(int value) {
      
      cd_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * cd
     * </pre>
     *
     * <code>int32 cd = 8;</code>
     */
    public Builder clearCd() {
      
      cd_ = 0;
      onChanged();
      return this;
    }

    private int maxHp_ ;
    /**
     * <pre>
     * 最大血量
     * </pre>
     *
     * <code>int32 maxHp = 9;</code>
     */
    public int getMaxHp() {
      return maxHp_;
    }
    /**
     * <pre>
     * 最大血量
     * </pre>
     *
     * <code>int32 maxHp = 9;</code>
     */
    public Builder setMaxHp(int value) {
      
      maxHp_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 最大血量
     * </pre>
     *
     * <code>int32 maxHp = 9;</code>
     */
    public Builder clearMaxHp() {
      
      maxHp_ = 0;
      onChanged();
      return this;
    }

    private int hp_ ;
    /**
     * <pre>
     * 当前血量
     * </pre>
     *
     * <code>int32 hp = 10;</code>
     */
    public int getHp() {
      return hp_;
    }
    /**
     * <pre>
     * 当前血量
     * </pre>
     *
     * <code>int32 hp = 10;</code>
     */
    public Builder setHp(int value) {
      
      hp_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 当前血量
     * </pre>
     *
     * <code>int32 hp = 10;</code>
     */
    public Builder clearHp() {
      
      hp_ = 0;
      onChanged();
      return this;
    }

    private int troopId_ ;
    /**
     * <pre>
     * 编队id
     * </pre>
     *
     * <code>int32 troopId = 11;</code>
     */
    public int getTroopId() {
      return troopId_;
    }
    /**
     * <pre>
     * 编队id
     * </pre>
     *
     * <code>int32 troopId = 11;</code>
     */
    public Builder setTroopId(int value) {
      
      troopId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 编队id
     * </pre>
     *
     * <code>int32 troopId = 11;</code>
     */
    public Builder clearTroopId() {
      
      troopId_ = 0;
      onChanged();
      return this;
    }

    private int troopType_ ;
    /**
     * <pre>
     * 编队类型
     * </pre>
     *
     * <code>int32 troopType = 12;</code>
     */
    public int getTroopType() {
      return troopType_;
    }
    /**
     * <pre>
     * 编队类型
     * </pre>
     *
     * <code>int32 troopType = 12;</code>
     */
    public Builder setTroopType(int value) {
      
      troopType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 编队类型
     * </pre>
     *
     * <code>int32 troopType = 12;</code>
     */
    public Builder clearTroopType() {
      
      troopType_ = 0;
      onChanged();
      return this;
    }

    private int reloadTime_ ;
    /**
     * <pre>
     * 填弹时间
     * </pre>
     *
     * <code>int32 reloadTime = 13;</code>
     */
    public int getReloadTime() {
      return reloadTime_;
    }
    /**
     * <pre>
     * 填弹时间
     * </pre>
     *
     * <code>int32 reloadTime = 13;</code>
     */
    public Builder setReloadTime(int value) {
      
      reloadTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 填弹时间
     * </pre>
     *
     * <code>int32 reloadTime = 13;</code>
     */
    public Builder clearReloadTime() {
      
      reloadTime_ = 0;
      onChanged();
      return this;
    }

    private int pos_ ;
    /**
     * <pre>
     * 子队在编队中的位置 (1开始)
     * </pre>
     *
     * <code>int32 pos = 14;</code>
     */
    public int getPos() {
      return pos_;
    }
    /**
     * <pre>
     * 子队在编队中的位置 (1开始)
     * </pre>
     *
     * <code>int32 pos = 14;</code>
     */
    public Builder setPos(int value) {
      
      pos_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 子队在编队中的位置 (1开始)
     * </pre>
     *
     * <code>int32 pos = 14;</code>
     */
    public Builder clearPos() {
      
      pos_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:PlayerMessage)
  }

  // @@protoc_insertion_point(class_scope:PlayerMessage)
  private static final com.mumu.proto.protobuf2.PlayerMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.mumu.proto.protobuf2.PlayerMessage();
  }

  public static com.mumu.proto.protobuf2.PlayerMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlayerMessage>
      PARSER = new com.google.protobuf.AbstractParser<PlayerMessage>() {
    @java.lang.Override
    public PlayerMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlayerMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlayerMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlayerMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.mumu.proto.protobuf2.PlayerMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

