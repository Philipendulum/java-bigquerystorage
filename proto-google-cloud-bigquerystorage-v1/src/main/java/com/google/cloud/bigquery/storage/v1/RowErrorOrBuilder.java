/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/storage/v1/storage.proto

package com.google.cloud.bigquery.storage.v1;

public interface RowErrorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.storage.v1.RowError)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Index of the malformed row in the request.
   * </pre>
   *
   * <code>int64 index = 1;</code>
   *
   * @return The index.
   */
  long getIndex();

  /**
   *
   *
   * <pre>
   * Structured error reason for a row error.
   * </pre>
   *
   * <code>.google.cloud.bigquery.storage.v1.RowError.RowErrorCode code = 2;</code>
   *
   * @return The enum numeric value on the wire for code.
   */
  int getCodeValue();
  /**
   *
   *
   * <pre>
   * Structured error reason for a row error.
   * </pre>
   *
   * <code>.google.cloud.bigquery.storage.v1.RowError.RowErrorCode code = 2;</code>
   *
   * @return The code.
   */
  com.google.cloud.bigquery.storage.v1.RowError.RowErrorCode getCode();

  /**
   *
   *
   * <pre>
   * Description of the issue encountered when processing the row.
   * </pre>
   *
   * <code>string message = 3;</code>
   *
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   *
   *
   * <pre>
   * Description of the issue encountered when processing the row.
   * </pre>
   *
   * <code>string message = 3;</code>
   *
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString getMessageBytes();
}